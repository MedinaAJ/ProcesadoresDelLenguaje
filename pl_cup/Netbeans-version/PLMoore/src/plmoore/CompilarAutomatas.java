/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plmoore;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;

public class CompilarAutomatas {

    private String rutaFichero = "src/test/automata_de_prueba.txt";
    private String rutaCompilar = "src/plmoore/";
    private static boolean do_debug_parse = false;

    public CompilarAutomatas() {
        try {
            compilar(rutaCompilar);
            correrParser(rutaFichero);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void compilar(String ruta) throws java.io.IOException {
        try {

            String opcFlex[] = {ruta + "moore.flex", "-d", ruta};
            String opcCUP[] = {"-destdir", ruta, "-parser", "parser", ruta + "moore.cup"};
            jflex.Main.generate(opcFlex);
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void correrParser(String ruta) throws FileNotFoundException {

        parser parser_obj = new parser(new AnalizadorAutomata(new FileReader(ruta)));

        Symbol parse_tree = null;

        try {
            if (do_debug_parse) {
                parse_tree = parser_obj.debug_parse();
            } else {
                parse_tree = parser_obj.parse();
            }
        } catch (Exception e) {

        }
    }
}
