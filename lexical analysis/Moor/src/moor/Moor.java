/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moor;

/**
 *
 */
public class Moor{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MooreMachine moor1 = new MooreMachine("moor1");
        Runnable entr_state_a = () -> {
            System.out.println("Entro al estado A");
        };
        Runnable sal_state_a = () -> {
            System.out.println("Salgo del estado A");
        };
        Runnable entr_state_b = () -> {
            System.out.println("Entro al estado B");
        };
        Runnable sal_state_b = () -> {
            System.out.println("Salgo del estado B");
        };
        
        Runnable final_state_b = () -> {
            System.out.println("(FINAL) estado B");
        };
        Runnable final_state_a = () -> {
            System.out.println("(FINAL) estado A");
        };
        
        
        Transition a_to_b = new Transition("go to b", "A", "B");
        Transition b_to_b = new Transition("go to b", "B", "B");
        Transition b_to_a = new Transition("go to a", "B", "A");
        
        moor1.addState("A", entr_state_a, sal_state_a, final_state_a);
        moor1.addState("B", entr_state_b, sal_state_b, final_state_b);
        
        moor1.addTransition(a_to_b);
        moor1.addTransition(b_to_a);
        moor1.addTransition(b_to_b);
        
        String entrada[] = {"go to b","go to b","go to b","go to a","go to b" };
        
        for(int i=0; i < entrada.length; i++){
            moor1.addEvent(entrada[i]);
        
        }
        
        moor1.states.get(moor1.getState()).runEndStateCode(); 
    
    }
    
}
