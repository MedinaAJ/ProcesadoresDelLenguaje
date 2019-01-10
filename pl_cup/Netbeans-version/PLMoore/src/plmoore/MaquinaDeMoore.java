/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plmoore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 9alej
 */
public class MaquinaDeMoore {
    private ArrayList<String> estados, eventos, comportamientos;
    private Map<String, Map<String, String>> transiciones; //doubleKeyMap.get("key1A").get("key2A");
    private Map<String, Map<String, String>> codigo;
    private String estado_inicial;
    private String nombre;
    
    public MaquinaDeMoore(String nombre){
        estados = new ArrayList<>();
        eventos = new ArrayList<>();
        comportamientos = new ArrayList<>();
        transiciones = new HashMap<>();
        codigo = new HashMap<>();
        this.nombre = nombre;
        
        
    }
    
    public boolean addEstado(String id){
        if(!estados.contains(id)){
            estados.add(id);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean addEvento(String id){
        if(!estados.contains(id)){
            eventos.add(id);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean addComp(String id){
        if(!comportamientos.contains(id)){
            comportamientos.add(id);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean addComportamiento(String tupla){
        String[] div = tupla.split("-");
        if(estados.contains(div[0]) && comportamientos.contains(div[1])){
            codigo.put(div[0], new HashMap<String, String>(){{put(div[1], div[2]);}});
            return true;
        }else{
            return false;
        }
    }

    public boolean addTransicion(String tupla){
        String[] div = tupla.split("-");
        if(estados.contains(div[0]) && estados.contains(div[2]) && eventos.contains(div[1])){
            transiciones.put(div[0],  new HashMap<String, String>(){{put(div[1], div[2]);}});
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<String> getEstados() {
        return estados;
    }

    public void setEstados(ArrayList<String> estados) {
        this.estados = estados;
    }

    public ArrayList<String> getEventos() {
        return eventos;
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
    
    @Override
    public String toString() {
        return "MaquinaDeMoore{" + "estados=" + estados + ", eventos=" + eventos + ", transiciones=" + transiciones + ", codigo=" + codigo + ", estado_inicial=" + estado_inicial + ", nombre=" + nombre + '}';
    }   
    
}
