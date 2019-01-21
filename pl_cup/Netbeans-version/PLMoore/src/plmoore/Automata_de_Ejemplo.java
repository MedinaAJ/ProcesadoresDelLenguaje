//Archivo generado por equipo RUBY - Sun Jan 20 21:21:58 CET 2019 
package plmoore;
import java.util.*;

public class Automata_de_Ejemplo {

    private String entrada;
    private ArrayList <String> eventos;

    public Automata_de_Ejemplo (String entrada) {
        this.entrada = entrada;
	this.eventos = new ArrayList<String>();
	this.eventos.add("a");
	this.eventos.add("b");
	this.eventos.add("c");

        if (checkFallo()) {
            System.out.println("La cadena contiene elementos que no pertenecen al alfabeto de entrada\n");
        } else {
            entrada = entrada.replace(",","");
            q0(entrada);
        }
    }

    public void q0 (String evento) {

        FuncionalidadAutomata.activarSensor("V","R"); 

        if (evento.length() == 0) {
            System.out.println("Fin de la ejecución de la máquina de Moore");
            System.exit(0);
        }


        if (Character.toString(evento.charAt(0)).equals("a")) {
            evento = evento.substring(1, evento.length());
            q1(evento);

        } else {
            System.exit(1);

        }
    }

    public void q1 (String evento) {

        FuncionalidadAutomata.activarSensor("R","V"); 

        if (evento.length() == 0) {
            System.out.println("Fin de la ejecución de la máquina de Moore");
            System.exit(0);
        }


        if (Character.toString(evento.charAt(0)).equals("b")) {
            evento = evento.substring(1, evento.length());
            q2(evento);

        } else {
            System.exit(1);

        }
    }

    public void q2 (String evento) {

        FuncionalidadAutomata.desactivarSensor(1); 

        if (evento.length() == 0) {
            System.out.println("Fin de la ejecución de la máquina de Moore");
            System.exit(0);
        }


        if (Character.toString(evento.charAt(0)).equals("c")) {
            evento = evento.substring(1, evento.length());
            q3(evento);

        } else {
            System.exit(1);

        }
    }

    public void q3 (String evento) {

        FuncionalidadAutomata.desactivarSensor(1); 

        if (evento.length() == 0) {
            System.out.println("Fin de la ejecución de la máquina de Moore");
            System.exit(0);
        }

    }
    public boolean checkFallo() {
        boolean fallo = false;
        String[] aux = this.entrada.split(",");
        List<String> al = new ArrayList<>();
        al = Arrays.asList(aux);
        for (String s : al) {
            if (!this.eventos.contains(s)) {
                fallo = true;
            }
        }
        return fallo;
    }

}
