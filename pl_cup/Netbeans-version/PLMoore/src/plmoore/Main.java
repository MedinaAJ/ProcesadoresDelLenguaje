package plmoore;

import java.util.*;
public class Main {

    static boolean do_debug_parse = false;

    public static void main(String[] args) {
        System.out.println("Introduzca cadena de entrada separando cada elemento con una coma: ,\n");
        Scanner sc = new Scanner(System.in);
        String cadena = sc.next();
        EjecutarAutomata a = new EjecutarAutomata();
        Automata_de_Ejemplo aej = new Automata_de_Ejemplo(cadena);
            
        
        }

}
