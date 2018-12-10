package maquina_de_moore;

import java.util.*;

public class MooreMachine {

	private Estado estado_inicial;
	private ArrayList <Estado> lista_estados;
	private ArrayList <String> alf_entrada;
	private ArrayList <String> alf_salida;
	private Hashtable <Evento, Estado> transiciones;
	private Hashtable <Estado,String> funcion_salida;
	
	public MooreMachine(Estado estado_inicial, ArrayList <Estado> lista_estados, ArrayList <String> alf_entrada,
			ArrayList <String> alf_salida, Hashtable <Evento, Estado> transiciones, Hashtable <Estado, String> funcion) {
		this.estado_inicial = estado_inicial;
		this.lista_estados = lista_estados;
		this.alf_entrada = alf_entrada;
		this.alf_salida = alf_salida;
		this.transiciones = transiciones;
		this.funcion_salida = funcion_salida;
	}

	public Estado getEstado_inicial() {
		return estado_inicial;
	}

	public void setEstado_inicial(Estado estado_inicial) {
		this.estado_inicial = estado_inicial;
	}

	public ArrayList<Estado> getLista_estados() {
		return lista_estados;
	}

	public void setLista_estados(ArrayList<Estado> lista_estados) {
		this.lista_estados = lista_estados;
	}

	public ArrayList<String> getAlf_entrada() {
		return alf_entrada;
	}

	public void setAlf_entrada(ArrayList<String> alf_entrada) {
		this.alf_entrada = alf_entrada;
	}

	public ArrayList<String> getAlf_salida() {
		return alf_salida;
	}

	public void setAlf_salida(ArrayList<String> alf_salida) {
		this.alf_salida = alf_salida;
	}

	public Hashtable<Evento, Estado> getTransiciones() {
		return transiciones;
	}

	public void setTransiciones(Hashtable<Evento, Estado> transiciones) {
		this.transiciones = transiciones;
	}

	public Hashtable<Estado, String> getFuncion_salida() {
		return funcion_salida;
	}

	public void setFuncion_salida(Hashtable<Estado, String> funcion_salida) {
		this.funcion_salida = funcion_salida;
	}

	@Override
	public String toString() {
		String aux = "";
		aux+=(estado_inicial.getId()+"\n");
		aux+=imprimirLista(lista_estados)+"\n";
		aux+=imprimirLista2(alf_entrada)+"\n";
		aux+=imprimirLista2(alf_salida)+"\n";
		
		return aux;
	}
	
	public static String imprimirLista(ArrayList<Estado>l) {
		String aux = "[";
		for(int i = 0;i<l.size();i++) {
			aux+=l.get(i).getId()+", ";
		}
		return aux+"]";
	}
	
	public static String imprimirLista2(ArrayList<String>l) {
		String aux = "[";
		for(int i = 0;i<l.size();i++) {
			aux+=l.get(i)+", ";
		}
		return aux+"]";
	}
	
}
