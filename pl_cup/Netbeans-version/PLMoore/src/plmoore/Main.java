package plmoore;

import java_cup.runtime.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    static boolean do_debug_parse = false;

    public static void main(String[] args) {
        String rutaFichero = "src/test/automata_de_prueba.txt";
        String rutaCompilar = "src/plmoore/";

        try {
            compilar(rutaCompilar);
            correrParser(rutaFichero);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param ruta
     * @throws java.io.IOException
     */
    public static void compilar(String ruta) throws java.io.IOException{
         try {
            
            String opcFlex[] = {ruta + "moore.flex", "-d", ruta};
            jflex.Main.generate(opcFlex);
            String opcCUP[] = {"-destdir", ruta, "-parser", "parser", ruta + "moore.cup"};
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void correrParser(String ruta) throws FileNotFoundException{
        
        parser parser_obj = new parser(new AnalizadorAutomata(new FileReader(ruta)));

        Symbol parse_tree = null;

        try {
            if (do_debug_parse) {
                parse_tree = parser_obj.debug_parse();
            } else {
                parse_tree = parser_obj.parse();
            }
        } catch (Exception e) {
            
        } finally {
            
        }
    }
}
