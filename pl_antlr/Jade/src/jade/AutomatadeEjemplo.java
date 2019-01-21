package examples;
import jade.core.behaviours.*;
import jade.core.Agent;
import java.util.Scanner;
public class AutomatadeEjemplo extends Agent{
    private FSMBehaviour fb;
    private String q0="q0";
    private String q1="q1";
    private String q2="q2";
    private String q3="q3";
    protected void setup(){
        fb=new FSMBehaviour(this){
            public int onEnd(){
                reset();
                return super.onEnd();
            }
        };
        fb.registerFirstState(new Comportamiento(q0),q0);
        fb.registerDefaultTransition(q0,q0);
        fb.registerState(new Comportamiento(q1),q1);
        fb.registerDefaultTransition(q1,q1);
        fb.registerState(new Comportamiento(q2),q2);
        fb.registerDefaultTransition(q2,q2);
        fb.registerState(new Comportamiento(q3),q3);
        fb.registerDefaultTransition(q3,q3);
        int e1=0;
        int e2=1;
        int e3=2;
        int e4=3;
        fb.registerTransition(q0,q1,e1);
        fb.registerTransition(q1,q1,e2);
        fb.registerTransition(q2,q3,e4);
        fb.registerTransition(q1,q2,e3);
        addBehaviour(fb);
    }
    public class Comportamiento extends Behaviour{
        private String nombre;
        private int x;
        private Scanner sc;
        public Comportamiento(String nombre){
            this.nombre=nombre;
        }
        public void action(){
            sc = new Scanner(System.in);
            System.out.println("Estoy en el estado: "+nombre);
            switch(nombre){
                case "q0":
                    System.out.println("Activado sensor 1"); 
                    break;
                case "q1":
                    System.out.println("Activado sensor 2"); 
                    break;
                case "q2":
                    System.out.println("Activado sensor 3"); 
                    break;
                case "q3":
                    System.out.println("Activado sensor 4"); 
                    break;
            }
            System.out.println("Introduce el evento que ocurre: ");
            switch(sc.next()){
                case "e1":
                    x = 0;
                    break;
                case "e2":
                    x = 1;
                    break;
                case "e3":
                    x = 2;
                    break;
                case "e4":
                    x = 3;
                    break;
                default:
                    x = -1;
                    break;
            }
        }
       public boolean done(){
           return true;
           }
       public int onEnd(){
           return x;
        }
    }
}
