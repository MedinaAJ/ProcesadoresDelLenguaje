
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class MaquinaMoore {

    protected String name;
    protected String currentState;
    protected Map<String, State> states;
    protected boolean debug;

    /**
     * Create a blank MooreMachine with the given name (which is arbitrary).
     */
    public MaquinaMoore(String name) {
        this.name = name;
        this.states = new HashMap<String, State>();
        this.currentState = null;
    }
    
    public void ejecutar(){
        this.states.get(this.getState()).runEndStateCode(); 
    }

    /**
     * Turn debugging on/off.
     */
    public void setDebugMode(boolean debug) {
        this.debug = debug;
    }

    /**
     * Report the current state of the finite state machine.
     */
    public String getState() {
        return currentState;
    }

    /**
     * Adds a new state with no entry or exit code.
     */
    public void addState(String state) {
        addState(state, null, null, null);
    }

    /**
     * Establish a new state the MooreMachine is aware of. If the MooreMachine
     * does not currently have any states, this state becomes the current,
     * initial state. This is the only way to put the MooreMachine into an
     * initial state.
     *
     * The entryCode, exitCode, and alwaysRunCode are Runnables that the
     * MooreMachine executes during the course of a transition. entryCode and
     * exitCode are run only if the transition is between two distinct states
     * (i.e. A->B where A != B). alwaysRunCode is executed even if the
     * transition is re-entrant (i.e. A->B where A = B).
     *
     */
    public void addState(String state, Runnable entryCode, Runnable exitCode, Runnable endStateCode) {
        boolean isInitial = (states.size() == 0);
        if (!states.containsKey(state)) {
            states.put(state, new State(entryCode, exitCode, endStateCode));
        }
        if (isInitial) {
            setState(state);
        }
    }

    public void setStateEntryCode(String state, Runnable entryCode) {
        states.get(state).entryCode = entryCode;
    }

    public void setStateExitCode(String state, Runnable exitCode) {
        states.get(state).outputCode = exitCode;
    }

    /**
     * There are cases where a state is meant to be transitional, and the
     * MooreMachine should always immediately transition to some other state. In
     * those cases, use this method to specify the start and end states. After
     * the startState has fully transitioned (and any change events have been
     * fired) the MooreMachine will check to see if there is another state that
     * the MooreMachine should automatically transition to. If there is one,
     * addEvent(endState) is called.
     *
     * Note: this creates a special transition in the lookup table called
     * "(auto)".
     */
    public void setAutoTransition(String startState, String endState) {
        // if (debug) {
        // Debug.out("MooreMachine", "Establishing auto transition for " + startState +
        // " -> " + endState);
        // }
        states.get(startState).autoTransitionState = endState;
        addTransition("(auto)", startState, endState);
    }

    /**
     * Sets the current state without following a transition. This will cause a
     * change event to be fired.
     */
    public void setState(String state) {
        setState(state, true);
    }

    /**
     * Sets the current state without followign a transition, and optionally
     * causing a change event to be triggered. During state transitions (with
     * the 'addEvent' method), this method is used with the triggerEvent
     * parameter as false.
     *
     * The MooreMachine executes non-null runnables according to the following
     * logic, given start and end states A and B:
     *
     * <ol>
     * <li>If A and B are distinct, run A's exit code.</li>
     * <li>Record current state as B.</li>
     * <li>Run B's "alwaysRunCode".</li>
     * <li>If A and B are distinct, run B's entry code.</li>
     * </ol>
     */
    public void setState(String state, boolean triggerEvent) {
        boolean runExtraCode = !state.equals(currentState);
        if (runExtraCode && currentState != null) {
            states.get(currentState).runExitCode();
        }
        currentState = state;
        if (runExtraCode) {
            states.get(currentState).runEntryCode();
        }
        if (triggerEvent) {
        }
    }

    /**
     * Establish a new transition. You might use this method something like
     * this:
     *
     * fsm.addTransition(new MooreMachine.Transition("someEvent", "firstState",
     * "secondState") { public void doBeforeTransition() {
     * System.out.println("about to transition..."); } public void
     * doAfterTransition() { fancyOperation(); } });
     */
    public void addTransition(String evento, String starState, String endState) {
        
        Transition trans = new Transition(evento, starState, endState);
       
        State st = states.get(trans.startState);
        if (st == null) {
            throw new NoSuchElementException("Missing state: "
                    + trans.startState);
        }
        st.addTransition(trans);
    }

    /**
     * Feed the MooreMachine with the named event. If the current state has a
     * transition that responds to the given event, the MooreMachine will
     * performed the transition using the following steps, assume start and end
     * states are A and B:
     *
     * <ol>
     * <li>Execute the transition's "doBeforeTransition" method</li>
     * <li>Run fsm.setState(B) -- see docs for that method</li>
     * <li>Execute the transition's "doAfterTransition" method</li>
     * <li>Fire a change event, notifying interested observers that the
     * transition has completed.</li>
     * <li>Now firmly in state B, see if B has a third state C that we must
     * automatically transition to via addEvent(C).</li>
     * </ol>
     */
    public void addEvent(String evtName) {
        State state = states.get(currentState);
        if (state.transitions.containsKey(evtName)) {
            Transition trans = state.transitions.get(evtName);
            // if (debug) {
            // Debug.out("MooreMachine", "Event: " + evtName + ", " + trans.startState +
            // " --> " + trans.endState);
            // }
            setState(trans.endState, false);
            if (states.get(trans.endState).autoTransitionState != null) {
                // if (debug) {
                // Debug.out("MooreMachine", "Automatically transitioning from " +
                // trans.endState + " to "
                // + states.get(trans.endState).autoTransitionState);
                // }
                addEvent("(auto)");
            }
        }
    }

    private class State {

        Map<String, Transition> transitions;
        String autoTransitionState;
        Runnable entryCode;
        Runnable outputCode;
        Runnable endStateCode;

        State(Runnable entryCode, Runnable exitCode, Runnable endStateCode) {
            autoTransitionState = null;
            transitions = new HashMap<String, Transition>();
            this.outputCode = exitCode;
            this.entryCode = entryCode;
            this.endStateCode = endStateCode;
        }

        public void addTransition(Transition trans) {
            transitions.put(trans.evtName, trans);
        }

        public void runEntryCode() {
            if (entryCode != null) {
                entryCode.run();
            }
        }

        public void runExitCode() {
            if (outputCode != null) {
                outputCode.run();
            }
        }

        public void runEndStateCode() {
            endStateCode.run();
        }
    }

    private class Transition {

        String evtName;
        String startState;
        String endState;

        /**
         * Create a transition object that responds to the given event when in
         * the given startState, and puts the FSM into the endState provided.
         */
        public Transition(String evtName, String startState, String endState) {
            this.evtName = evtName;
            this.startState = startState;
            this.endState = endState;
        }

        /**
         * Override this to have FSM execute code immediately before following a
         * state transition.
         */
        public void doBeforeTransition() {
        }

        /**
         * Override this to have FSM execute code immediately after following a
         * state transition.
         */
        public void doAfterTransition() {
        }
    }
}
