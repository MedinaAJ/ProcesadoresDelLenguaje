import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.lang.System;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class MyListener implements ejemploListener{
MaquinaMoore a;
ScriptEngineManager script = new ScriptEngineManager();
ScriptEngine js;
private String[][] Comportamientos;
private String nombreAutomata;
Hashtable<String, String> comp_codigo = new Hashtable<String, String>();
private List<String> listaEventos = new ArrayList<String>();
private List<String> listaEstados = new ArrayList<String>();
private String EstadoInicial;
static int j;
boolean z;
private String respuesta;

    @Override
    public void enterPrograma(ejemploParser.ProgramaContext ctx) {
        System.out.println("Bienvenido al Analizador de Automatas");
    }

    @Override
    public void exitPrograma(ejemploParser.ProgramaContext ctx) {
        System.out.println("Gracias por el uso de nuestro programa");
    }

    @Override
    public void enterDec_comp(ejemploParser.Dec_compContext ctx) {


    }

    @Override
    public void exitDec_comp(ejemploParser.Dec_compContext ctx) {
        for(int i=0;i<ctx.Cmp().size();i++){
            String cortar=ctx.COD(i).getText().substring(0, 1);
            comp_codigo.put(ctx.Cmp(i).getText(),ctx.COD(i).getText().replace(cortar, ""));
        }
    }

    @Override
    public void enterAutomata(ejemploParser.AutomataContext ctx) {
        String cortar=ctx.ID().getText();
        a=new MaquinaMoore(cortar);
        System.out.println(a.getName());
    }

    @Override
    public void exitAutomata(ejemploParser.AutomataContext ctx) {
       
        if(z){
            for(int i=0; i < listaEventos.size(); i++){
                a.addEvent(listaEventos.get(i));

            }

            a.ejecutar();
        }else{
            System.out.println("No se ha podido realizar el analisis para el automata: "+a.getName()+"\n"
                    + "Alguno de los parametros que ha introducido en el fichero son incorrectos"
                    + " o carecen de sentido para nuestro analisis.");
        }
    }

    @Override
    public void enterCuerpo_automata(ejemploParser.Cuerpo_automataContext ctx) {
        EstadoInicial=ctx.estado_ini().getText();
        
    }

    @Override
    public void exitCuerpo_automata(ejemploParser.Cuerpo_automataContext ctx) {

    } 

    @Override
    public void enterEstados(ejemploParser.EstadosContext ctx) {
        System.out.println("Se han definido los siguientes estados: ");
        for(int i=0;i<ctx.ID().size();i++){
            System.out.print(""+ctx.ID(i)+" ");
            listaEstados.add(ctx.ID(i).getText());
        }
//        System.out.println("¿Son Correctos? Responda con Si o No");
//        respuesta=sc.next();
//        if(respuesta.equals("si")){
//            continuar=true;
//        }else if(respuesta.equals("no")){
//            continuar=false;
//            
//        }
        System.out.println("\n");
        
    }

    @Override
    public void exitEstados(ejemploParser.EstadosContext ctx) {

    }

    @Override
    public void enterEstado_ini(ejemploParser.Estado_iniContext ctx) {

    }

    @Override
    public void exitEstado_ini(ejemploParser.Estado_iniContext ctx) {

    }

    @Override
    public void enterAlf_in(ejemploParser.Alf_inContext ctx) {
        
    }

    @Override
    public void exitAlf_in(ejemploParser.Alf_inContext ctx) {
        for(int i=0;i<ctx.Eventos().size();i++){
        listaEventos.add(ctx.Eventos(i).getText());
        }
    }

    @Override
    public void enterAlf_out(ejemploParser.Alf_outContext ctx) {

    }

    @Override
    public void exitAlf_out(ejemploParser.Alf_outContext ctx) {

    }

    @Override
    public void enterTransicion(ejemploParser.TransicionContext ctx) {

    }

    @Override
    public void exitTransicion(ejemploParser.TransicionContext ctx) {

    }

    @Override
    public void enterTransicion_def(ejemploParser.Transicion_defContext ctx) {

    }

    @Override
    public void exitTransicion_def(ejemploParser.Transicion_defContext ctx) {
        if(z){
                try{
                    if(listaEstados.contains(ctx.ID().getText())||listaEstados.contains(ctx.val_trans().ID().getText())){
                        z=true;
                    }else{
                        z=false;
                    }
                    a.addTransition(ctx.Eventos().getText(), ctx.ID().getText(), ctx.val_trans().ID().getText());
                }catch(Exception e){
                    System.out.println("No se pueden añadir transiciones con estados no definidos");
                    z=false;
                }
        }else{
                 z=false;
        }
               
    }

    @Override
    public void enterVal_trans(ejemploParser.Val_transContext ctx) {
       
    }

    @Override
    public void exitVal_trans(ejemploParser.Val_transContext ctx) {

    }

    @Override
    public void enterComportamientos(ejemploParser.ComportamientosContext ctx) {

    }

    @Override
    public void exitComportamientos(ejemploParser.ComportamientosContext ctx) {
        
    }

    @Override
    public void enterComp_def(ejemploParser.Comp_defContext ctx) {

    }

    @Override
    public void exitComp_def(ejemploParser.Comp_defContext ctx) {
        if(z){
            if(listaEstados.contains(ctx.ID().getText())){
                try{
                    js=script.getEngineByName("JavaScript");
                    Runnable s1 = () -> {
                        System.out.println("Entro al estado : "+ctx.ID().getText());

                    };
                    Runnable s2 = () -> {
                        System.out.println("Estoy en el estado: "+ctx.ID().getText());
        //            try {
        //                js.eval(comp_codigo.get(ctx.val_comp().Cmp().getText()));
        //            } catch (ScriptException ex) {
        //                Logger.getLogger(MyListener.class.getName()).log(Level.SEVERE, null, ex);
        //            }
                    };
                    Runnable s3 = () -> {
                        System.out.println("Estoy en el ultimo estado : "+ctx.ID().getText());
                    };
                    a.addState(ctx.ID().getText(), s1, s2, s3);
                    
                }catch(Exception e){
                    System.out.println("ERROR: Hay estados que no se pueden añadir al automata, pues no existen ");
                    z=false;
                }
            }else{
                z=false;
            }

        }
        
    }

    @Override
    public void enterVal_comp(ejemploParser.Val_compContext ctx) {

    }

    @Override
    public void exitVal_comp(ejemploParser.Val_compContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode tn) {
    }

    @Override
    public void visitErrorNode(ErrorNode en) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext prc) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext prc) {

    }
  
}