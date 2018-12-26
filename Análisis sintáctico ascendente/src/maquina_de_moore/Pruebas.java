package maquina_de_moore;

import java.util.*;

public class Pruebas {
	
	static Scanner scaner_global = new Scanner(System.in);
	
	public static void main(String [] args) {
		
		//Estados
		System.out.println("Inserte número de estados");
		int n_estados = scaner_global.nextInt();
		System.out.println("Los estados serán nombrados desde q0 hasta q"+(n_estados-1));
		ArrayList <Estado> lista_estados = creaEstados(n_estados);
		
		//Estado Inicial
		System.out.println("Se asumirá que el estado inicial es q0");
		Estado inicial = lista_estados.get(0);
		
		//Alfabeto de entrada
		System.out.println("Inserte número de símbolos del alfabeto de entrada");
		int n_alfE = scaner_global.nextInt();
		ArrayList <String> alf_ent = crearAlfabeto(n_alfE);
		
		//Alfabeto de salida
		System.out.println("Inserte número de símbolos del alfabeto de salida");
		int n_alfS = scaner_global.nextInt();
		ArrayList <String> alf_sal = crearAlfabeto(n_alfS);
		
		//Funcion de transición
		ArrayList <Evento> eventos = crearEventos(lista_estados); //Primero sacar los eventos
		Hashtable <Evento,Estado> transiciones = creaTransiciones(eventos);//Luego construir la hashtable de transiciones
		
		//Función de salida
		Hashtable <Estado, String> fcn_salida = creaSalida(lista_estados);
		
		//Creación del autómata
		MooreMachine maquinademoore = new MooreMachine(inicial,lista_estados,alf_ent,alf_sal,transiciones,fcn_salida);
		System.out.println("Máquina de Moore creada, mostrando datos:");
		System.out.println(maquinademoore.toString());
		System.out.println(maquinademoore.getTransiciones());
		System.out.println(maquinademoore.getFuncion_salida());
	}
	
	private static Hashtable<Estado, String> creaSalida(ArrayList<Estado> lista_estados) {
		Hashtable <Estado, String> fcn_salida = new Hashtable <Estado, String>();
		int n = 0;
		String aux = "";
		for(int i = 0; i<lista_estados.size();i++) {
			System.out.println("Indique cuantas salidas tiene el estado "+lista_estados.get(i).getId()
					+" ó 0 en caso de no tener");
			if(n!=0) {
				for(int j = 0;j<n;j++) {
					System.out.println("Introduzca la salida "+(j+1)+" para este estado");
					aux = scaner_global.next();
					fcn_salida.put(lista_estados.get(i), aux);
				}
			}
		}
		return fcn_salida;
	}

	private static Hashtable<Evento, Estado> creaTransiciones(ArrayList<Evento> eventos) {
		Hashtable <Evento,Estado> transiciones = new Hashtable <Evento,Estado>();
		Estado aux;
		
		for(int i = 0;i<eventos.size();i++) {
			System.out.println("Para el estado "+eventos.get(i).getEstado_actual().getId()
					+" y la entrada "+eventos.get(i).getEntrada()+" indique el siguiente estado qn");
			aux = new Estado(scaner_global.next());
			transiciones.put(eventos.get(i),aux);
		}
		return transiciones;
	}

	private static ArrayList <Evento> crearEventos(ArrayList <Estado> lista_estados) {
		int n = 0;
		String aux = "";
		ArrayList <Evento> eventos = new ArrayList <Evento>();
		for(int i = 0;i<lista_estados.size();i++) {
			System.out.println("¿Cuántas posibles entradas tiene el estado "+lista_estados.get(i).getId()+" ?");
			n = scaner_global.nextInt();
			for(int j = 0;j<n;j++) {
				System.out.println("Introduzca la entrada"+ (j+1) +"[pertenciente al alfabeto de entrada]");
				aux = scaner_global.next();
				eventos.add(new Evento(lista_estados.get(i),aux));
			}
		}
		return eventos;
	}

	private static ArrayList<String> crearAlfabeto(int n) {
		
		ArrayList <String> alfentrada = new ArrayList <String>();
		String aux = "";
		
		for(int i=0;i<n;i++) {
			System.out.println("Introduce el símbolo "+(i+1));
			aux = scaner_global.next();
			alfentrada.add(aux);
		}
		return alfentrada;
	}

	private static ArrayList<Estado> creaEstados(int n) {
		
		ArrayList <Estado> estados = new ArrayList <Estado>();
		String aux = "";
		
		for(int i = 0; i<n; i++) {
			aux = "q"+i;
			estados.add(new Estado(aux));
		}
		return estados;
	}
}
