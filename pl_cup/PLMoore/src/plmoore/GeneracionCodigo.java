/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plmoore;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

public class GeneracionCodigo {

    public GeneracionCodigo(ArrayList<MoldeAutomataMoore> maquinas) {

        escrituraMaquinas(maquinas);

    }

    private void escrituraMaquinas(ArrayList<MoldeAutomataMoore> maquinas) {

        for (int m = 0; m < maquinas.size(); m++) {
            generarFichero(maquinas.get(m));

        }

    }

    private void escrituraCodigo(String contenido, String nombre) throws FileNotFoundException, IOException {
        String nombre_fichero = nombre + ".java";
        String ruta_fichero = "src/plmoore/";
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(ruta_fichero + nombre_fichero);
            pw = new PrintWriter(fichero);
            pw.print(contenido);
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void generarFichero(MoldeAutomataMoore autActual) {

        String contenido_fichero = "";
        String aux = "";
        java.util.Date fecha = new Date();
        String marca_agua = "//Archivo generado por equipo RUBY - " + fecha + " \n";
        for (int k = 0; k < autActual.getEventos().size(); k++) {
            aux += "\tthis.eventos.add(" + '"' + autActual.getEventos().get(k) + '"' + ");\n";
        }
        contenido_fichero += marca_agua+"package plmoore;\nimport java.util.*;\n"
                + "\n"
                + "public class " + autActual.getNombre() + " {\n"
                + "\n"
                + "    private String entrada;\n"
                + "    private ArrayList <String> eventos;\n"
                + "\n"
                + "    public " + autActual.getNombre() + " (String entrada) {\n"
                + "        this.entrada = entrada;\n\tthis.eventos = new ArrayList<String>();\n"+aux+"\n"
                + "        if (checkFallo()) {\n"
                + "            System.out.println(\"La cadena contiene elementos que no pertenecen al alfabeto de entrada\\n\");\n"
                + "        } else {\n            entrada = entrada.replace(\",\",\"\");\n"
                + "            " + autActual.getEstado_inicial() + "(entrada);\n"
                + "        }"
                
                + "\n"
                + "    }\n";

        for (String est : autActual.getEstados()) {

            contenido_fichero += "\n    public void " + est + " (String evento) {\n\n";

            for (String cmp : autActual.getComportamientos()) {

                if (autActual.getCodigo().containsKey(est) && autActual.getCodigo().get(est).containsKey(cmp)) {

                    contenido_fichero += "       " + autActual.getCodigoAsociado(est, cmp) + "\n\n";

                }
            }

            contenido_fichero += "        if (evento.length() == 0) {\n"
                    + "            System.out.println(\"Fin de la ejecución de la máquina de Moore\");\n"
                    + "            System.exit(0);\n"
                    + "        }\n\n";

            for (int j = 0; j < autActual.getEstados_transicion().size(); j++) {
                if (autActual.getEstados_transicion().get(j).equals(est)) {
                    contenido_fichero += "\n        if (Character.toString(evento.charAt(0)).equals(" + "\"" + autActual.getEventos_transicion().get(j) + "\"" + ")) {\n"
                            + "            evento = evento.substring(1, evento.length());\n"
                            + "            " + autActual.getEstados_destino_transicion().get(j) + "(evento);\n"
                            + "\n        } else {\n"
                            + "            System.exit(1);\n"
                            + "\n        }\n";
                }

            }

            contenido_fichero += "    }\n";

        }
        
        contenido_fichero += "    public boolean checkFallo() {\n"
                + "        boolean fallo = false;\n"
                + "        String[] aux = this.entrada.split(\",\");\n"
                + "        List<String> al = new ArrayList<>();\n"
                + "        al = Arrays.asList(aux);\n"
                + "        for (String s : al) {\n"
                + "            if (!this.eventos.contains(s)) {\n"
                + "                fallo = true;\n"
                + "            }\n"
                + "        }\n"
                + "        return fallo;\n"
                + "    }\n"
                + "";

        contenido_fichero += "\n}\n";

        try {
            escrituraCodigo(contenido_fichero, autActual.getNombre());
        } catch (IOException ex) {
            Logger.getLogger(GeneracionCodigo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
