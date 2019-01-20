/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plmoore;

/**
 *
 * @author lajotadeladerrota
 */

//Esto es lo que llevo diciendo durante todo el curso, 
//La funciones que se escriben en el txt y se ejecutan en los autómatas
//prefiero hacer la clase estática para no liarlo mas
public class FuncionalidadAutomata {
    public static void activarSensor(String R, String X){
       System.out.println("Activado sensor "+R+X); 
    }
    public static void desactivarSensor(int sensor){
        System.out.println("Desactivado sensor " +sensor);
    }
    
}
