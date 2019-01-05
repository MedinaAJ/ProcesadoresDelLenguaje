import java.util.ArrayList;
import java.util.Hashtable;

public class MaquinaMolde {

    private ArrayList<String> estados;
    private ArrayList<String> eventos;
    private ArrayList<String> comps;
    private String estado_inicial;
    private Hashtable<String, String> estados_cmp;
    private Hashtable<String, String> transiciones;
    private MaquinaMoore maquina;

    public MaquinaMolde(ArrayList<String> estados, ArrayList<String> eventos, ArrayList<String> comps, String inicial,
            Hashtable<String, String> estados_cmp, Hashtable<String, String> transiciones, MaquinaMoore maquina) {
        this.estados = estados;
        this.eventos = eventos;
        this.comps = comps;
        this.estado_inicial = inicial;
        this.estados_cmp = estados_cmp;
        this.transiciones = transiciones;
        this.maquina = maquina;
    }
    public MaquinaMolde(String nombre){
        this.estado_inicial = nombre;
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

    public ArrayList<String> getComps() {
        return comps;
    }

    public void setComps(ArrayList<String> comps) {
        this.comps = comps;
    }

    public String getEstado_inicial() {
        return estado_inicial;
    }

    public void setEstado_inicial(String estado_inicial) {
        this.estado_inicial = estado_inicial;
    }

    public Hashtable<String, String> getEstados_cmp() {
        return estados_cmp;
    }

    public void setEstados_cmp(Hashtable<String, String> estados_cmp) {
        this.estados_cmp = estados_cmp;
    }

    public Hashtable<String, String> getTransiciones() {
        return transiciones;
    }

    public void setTransiciones(Hashtable<String, String> transiciones) {
        this.transiciones = transiciones;
    }

    public MaquinaMoore getMaquina() {
        return maquina;
    }

    public void setMaquina(MaquinaMoore maquina) {
        this.maquina = maquina;
    }

}
