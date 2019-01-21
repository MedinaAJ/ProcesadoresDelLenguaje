
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;


public class MaquinaMoore {

    protected String name;
    protected String estadoInicial;
    protected Hashtable<String, String> EstComp;
    protected Hashtable<String, String> compCod;
    protected boolean debug;
    protected ArrayList<String> estados;
    protected ArrayList<String> eventos;
    protected ArrayList<String> comportamientos;
    protected ArrayList<Transicion> transiciones;
    

    /**
     * Create a blank MooreMachine with the given name (which is arbitrary).
     */
    public MaquinaMoore(String name) {
        this.name = name;
        estadoInicial=null;
        this.EstComp = new Hashtable<String, String>();
	this.estados = new ArrayList<String>();
	this.eventos = new ArrayList<String>();
        this.comportamientos = new ArrayList<String>();
        this.transiciones=new ArrayList<Transicion>();
        this.compCod=new Hashtable<String,String>();
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEstadoInicial(String estadoInicial) {
        this.estadoInicial = estadoInicial;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public void setEstados(ArrayList<String> estados) {
        this.estados = estados;
    }

    public void setEventos(ArrayList<String> eventos) {
        this.eventos = eventos;
    }

    public void setComportamientos(ArrayList<String> comportamientos) {
        this.comportamientos = comportamientos;
    }

    public String getName() {
        return name;
    }

    public String getEstadoInicial() {
        return estadoInicial;
    }

    public Map<String, String> getEstComp() {
        return EstComp;
    }

    public boolean isDebug() {
        return debug;
    }

    public ArrayList<String> getEstados() {
        return estados;
    }

    public ArrayList<String> getEventos() {
        return eventos;
    }

    public ArrayList<String> getComportamientos() {
        return comportamientos;
    }

    public void escribir() throws IOException {
        String[] encabezado={"package examples;",
                            "import jade.core.behaviours.*;" ,
                            "import jade.core.Agent;" ,
                            "import java.util.Scanner;",
                            "public class "+this.getName()+" extends Agent{"};
        FileWriter fichero =null;
        try {

                fichero =  new FileWriter(""+this.getName()+".java");
                for (String linea : encabezado) {
			fichero.write(linea + "\n");
		}
                for (String linea : escribirEstados()) {
			fichero.write(linea + "\n");
		}
                for (String linea : escribirSetup()) {
                    fichero.write(linea + "\n");
		}
                for (String linea : escribirEstComp()) {
                    fichero.write(linea + "\n");
		}
                for (String linea : escribirEventos()) {
                    fichero.write(linea + "\n");
		}
                for (String linea : escribirTransiciones()) {
                    fichero.write(linea + "\n");
		}
                for (String linea : escribirComportamiento()){
                    fichero.write(linea + "\n");
		}
                for (String linea : escribirEstC()){
                    fichero.write(linea + "\n");
		}   
                for (String linea : escribirMenu()){
                    fichero.write(linea + "\n");
		}    
                for (String linea : escribirFin()){
                    fichero.write(linea + "\n");
		}   
                fichero.flush();
                fichero.close();
	    } catch (Exception ex) {
		System.out.println("Mensaje de la excepción: " + ex.getMessage());
            }
    }

    public ArrayList<String> escribirEstComp() {
       ArrayList<String> estad =new ArrayList<String>();
       for(int i=0;i<this.estados.size();i++){
            if(estados.get(i).equals(this.estadoInicial)){
                estad.add("        fb.registerFirstState(new Comportamiento("+this.estados.get(i)+"),"+this.estados.get(i)+");");   
                estad.add("        fb.registerDefaultTransition("+this.estados.get(i)+","+this.estados.get(i)+");");
            }else{
                estad.add("        fb.registerState(new Comportamiento("+this.estados.get(i)+"),"+this.estados.get(i)+");");
                estad.add("        fb.registerDefaultTransition("+this.estados.get(i)+","+this.estados.get(i)+");");
            }
       }
    return estad;
    }

    public ArrayList<String> escribirEstados() {
       ArrayList<String> estados =new ArrayList<String>();
       estados.add("    private FSMBehaviour fb;");
       for(int i=0;i<this.estados.size();i++){
           estados.add("    private String "+this.estados.get(i)+"=\""+this.estados.get(i)+"\";");
       }
    return estados;
    }
    
    public ArrayList<String>escribirEventos(){
       ArrayList<String> eventos =new ArrayList<String>();
       for(int i=0;i<this.eventos.size();i++){
           eventos.add("        int "+this.eventos.get(i)+"="+i+";");
       }
    return eventos;       
    }
    
    public ArrayList<String> escribirTransiciones(){
       ArrayList<String> trans =new ArrayList<String>();
       for(int i=0;i<this.transiciones.size();i++){
           trans.add("        fb.registerTransition("+this.transiciones.get(i).getEstado1()+","+this.transiciones.get(i).getEstado2()+","+""+this.transiciones.get(i).getEvento()+");");
        }
        trans.add("        addBehaviour(fb);");
        trans.add("    }");
        return trans;
    }
    
    public String[] escribirSetup(){
        String[] setup= {"    protected void setup(){",
                        "        fb=new FSMBehaviour(this){",
                        "            public int onEnd(){",
                        "                reset();",
                        "                return super.onEnd();",
                        "            }",
                        "        };"
        };
        return setup;
    }
    
    public String[] escribirComportamiento(){
        String[] a={"    public class Comportamiento extends Behaviour{",
                "        private String nombre;" ,
                "        private int x;" ,
                "        private Scanner sc;" ,
                "        public Comportamiento(String nombre){" ,
                "            this.nombre=nombre;" ,
                "        }" ,
                "        public void action(){" ,
                "            sc = new Scanner(System.in);" ,
                "            System.out.println(\"Estoy en el estado: \"+nombre);" ,
                "            switch(nombre){"};
    return a;
    }
    
    public ArrayList<String> escribirEstC(){
       ArrayList<String> estc =new ArrayList<String>();
       String x="";
       for(int i=0;i<this.estados.size();i++){
           x=this.EstComp.get(""+this.estados.get(i));
           estc.add("                case \""+this.estados.get(i)+"\":");
           this.compCod.get(x);
           estc.add("                   "+this.compCod.get(x));
           estc.add("                    break;");

       }
        estc.add("            }");
    return estc;
    }
  
    public ArrayList<String> escribirMenu(){
       ArrayList<String> menu =new ArrayList<String>();
       menu.add("            System.out.println(\"Introduce el evento que ocurre: \");");
       menu.add("            switch(sc.next()){");
       for(int i=0;i<this.eventos.size();i++){
           menu.add("                case \""+this.eventos.get(i)+"\":");
           menu.add("                    x = "+i+";");
           menu.add("                    break;");
       }
       menu.add("                default:");
       menu.add("                    x = -1;");
       menu.add("                    break;");
       menu.add("            }");
       menu.add("        }");

    return menu;        
    }
   
    public String[] escribirFin(){
        String[] a={"       public boolean done(){",
                "           return true;" ,
                "           }" ,
                "       public int onEnd(){" ,
                "           return x;" ,
                "        }" ,
                "    }" ,
                "}"};
    return a;  
}
    
    public class Transicion{
    protected String estado1;
    protected String estado2;
    protected String evento;

    public Transicion(String estado1,String estado2,String evento){
        this.estado1=estado1;
        this.estado2=estado2;
        this.evento=evento;
    }

    public void setEstado1(String estado1) {
        this.estado1 = estado1;
    }

    public void setEstado2(String estado2) {
        this.estado2 = estado2;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getEstado1() {
        return estado1;
    }

    public String getEstado2() {
        return estado2;
    }

    public String getEvento() {
        return evento;
    }
    }
}
