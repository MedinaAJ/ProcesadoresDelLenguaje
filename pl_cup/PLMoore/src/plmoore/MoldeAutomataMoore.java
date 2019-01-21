/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plmoore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MoldeAutomataMoore {

    private ArrayList<String> estados, eventos, comportamientos;
    private ArrayList<String> transiciones;
    private Map<String, Map<String, String>> codigo;
    private String estado_inicial;
    private String nombre;
    private ArrayList<String> estados_transicion;
    private ArrayList<String> eventos_transicion;
    private ArrayList<String> estados_destino_transicion;

    public MoldeAutomataMoore(String nombre) {
        this.estados = new ArrayList<>();
        this.eventos = new ArrayList<>();
        this.comportamientos = new ArrayList<>();
        this.transiciones = new ArrayList<>();
        this.codigo = new HashMap<>();
        this.nombre = nombre;
        this.estados_transicion = new ArrayList<>();
        this.estados_destino_transicion = new ArrayList<>();
        this.eventos_transicion = new ArrayList<>();

    }

    public ArrayList<String> getEventos_transicion() {
        return eventos_transicion;
    }

    public void setEventos_transicion(ArrayList<String> eventos_transicion) {
        this.eventos_transicion = eventos_transicion;
    }

    public ArrayList<String> getEstados_destino_transicion() {
        return estados_destino_transicion;
    }

    public void setEstados_destino_transicion(ArrayList<String> estados_destino_transicion) {
        this.estados_destino_transicion = estados_destino_transicion;
    }

    public ArrayList<String> getEstados_transicion() {
        return estados_transicion;
    }

    public void setEstados_transicion(ArrayList<String> estados_transicion) {
        this.estados_transicion = estados_transicion;
    }

    public String getTransicion(String estado_entrada, String evento, String estado_salida) {
        int i;
        String aux = estado_entrada + "-" + evento + "-" + estado_salida;
        String retorno = "";
        for (i = 0; i < transiciones.size(); i++) {
            if (transiciones.get(i).equals(aux)) {
                retorno = transiciones.get(i);
            }
        }
        return retorno;
    }

    public String getCodigoAsociado(String estado, String comportamiento) {
        return codigo.get(estado).get(comportamiento);
    }

    public ArrayList<String> getEstados() {
        return this.estados;
    }

    public ArrayList<String> getEventos() {
        return this.eventos;
    }

    public ArrayList<String> getComportamientos() {
        return this.comportamientos;
    }

    public boolean addEstado(String id) {
        if (!estados.contains(id)) {
            estados.add(id);
            return true;
        } else {
            return false;
        }
    }

    public boolean addEvento(String id) {
        if (!estados.contains(id)) {
            eventos.add(id);
            return true;
        } else {
            return false;
        }
    }

    public boolean addComp(String id) {
        if (!comportamientos.contains(id)) {
            comportamientos.add(id);
            return true;
        } else {
            return false;
        }
    }

    public boolean addComportamiento(String tupla) {
        String[] div = tupla.split("-");
        if (estados.contains(div[0]) && comportamientos.contains(div[1])) {
            codigo.put(div[0], new HashMap<String, String>() {
                {
                    put(div[1], div[2]);
                }
            });
            return true;
        } else {
            return false;
        }
    }

    public boolean addTransicion(String tupla) {
        boolean check = false;
        String[] div = tupla.split("-");

        if (estados.contains(div[0]) && estados.contains(div[2]) && eventos.contains(div[1])) {
            if (transiciones.contains(tupla)) {
                System.out.println("Transición repetida");
            } else {
                check = true;
                transiciones.add(tupla);
                estados_transicion.add(div[0]);
                eventos_transicion.add(div[1]);
                estados_destino_transicion.add(div[2]);
            }
        }
        return check;
    }

    public void setEstados(ArrayList<String> estados) {
        this.estados = estados;
    }

    public void setEventos(ArrayList<String> eventos) {
        this.eventos = eventos;
    }

    public String getEstado_inicial() {
        return estado_inicial;
    }

    public void setEstado_inicial(String estado_inicial) {
        this.estado_inicial = estado_inicial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getTransiciones() {
        return transiciones;
    }

    public void setTransiciones(ArrayList<String> transiciones) {
        this.transiciones = transiciones;
    }

    public Map<String, Map<String, String>> getCodigo() {
        return codigo;
    }

    public void setCodigo(Map<String, Map<String, String>> codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "MaquinaDeMoore{" + "estados=" + estados + ", eventos=" + eventos + ", transiciones=" + transiciones + ", codigo=" + codigo + ", estado_inicial=" + estado_inicial + ", nombre=" + nombre + '}';
    }

}
