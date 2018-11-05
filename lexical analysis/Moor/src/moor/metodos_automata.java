/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moor;

/**
 *
 * @author alf
 */
public class metodos_automata implements Runnable{
    public static void entro_estado(String state){
        System.out.println("Entro al estado -> "+state);
    }
    
    public static void salgo_estado(String state){
        System.out.println("Salgo del estado -> "+state);
    }
    
    public void run(){
        
        System.out.println("Dentro de una Maquina de moore");
    }
}
