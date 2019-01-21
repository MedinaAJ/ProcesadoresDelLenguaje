package plmoore;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("------------Procesador de lenguajes para la generación de Autómatas de Moore-------");
        System.out.println("Introduzca una cadena de entrada que recibirá el autómata"
                + " separando cada elemento con una coma ->,\n"
                + " [Ej: evento1,envento2,...,eventoN] "
                + "\n[Recuerde que deberá de introducir eventos que pertenezcan al dominio del alfabeto de entrada]\n");
        Scanner sc = new Scanner(System.in);
        String cadena = sc.next();
        CompilarAutomatas ca = new CompilarAutomatas();
        //Por ejemplo se ha probado el autómata 1 perteneciente al fichero automata_de_prueba.txt
        Automata_de_Ejemplo aej = new Automata_de_Ejemplo(cadena);

    }

}
