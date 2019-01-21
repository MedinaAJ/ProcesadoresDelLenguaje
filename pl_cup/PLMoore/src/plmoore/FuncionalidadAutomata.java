/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plmoore;
// Esta es la clase que incorporará funcionalidad al autómata es decir a los comportamientos asociados al estado
public class FuncionalidadAutomata {

    public static void activarSensor(String R, String X) {
        System.out.println("Activado sensor " + R + X);
    }

    public static void desactivarSensor(int sensor) {
        System.out.println("Desactivado sensor " + sensor);
    }

}
