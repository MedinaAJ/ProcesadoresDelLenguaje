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
import org.antlr.v4.runtime.RecognitionException;


public class MyListener implements practicaAntlrListener{
MaquinaMoore a;
MaquinaMoore.Transicion t;
ScriptEngineManager script = new ScriptEngineManager();
ScriptEngine js;
Hashtable<String, String> comp_codigo = new Hashtable<String, String>();
private String nombreAutomata;
boolean z=true;
    @Override
    public void enterPrograma(practicaAntlrParser.ProgramaContext ctx) {
        System.out.println("************************Bienvenido al Analizador de Automatas************************");
    }

    @Override
    public void exitPrograma(practicaAntlrParser.ProgramaContext ctx) {
        System.out.println("************************Gracias por el uso de nuestro programa************************");
    }

    @Override
    public void enterDec_comp(practicaAntlrParser.Dec_compContext ctx) {


    }

    @Override
    public void exitDec_comp(practicaAntlrParser.Dec_compContext ctx) {
        for(int i=0;i<ctx.Cmp().size();i++){
            String cortar=ctx.COD(i).getText().substring(0, 1);
            comp_codigo.put(ctx.Cmp(i).getText(),ctx.COD(i).getText().replace(cortar, ""));
        }
    }

    @Override
    public void enterAutomata(practicaAntlrParser.AutomataContext ctx) {
        String cortar=ctx.ID().getText();
        a=new MaquinaMoore(cortar);
        a.compCod=comp_codigo;
        System.out.println("Para el automata "+a.getName()+":");
        System.out.println("Realizando Analisis semántico...");
        z=true;
    }

    @Override
    public void exitAutomata(practicaAntlrParser.AutomataContext ctx) {
        if(z){
            try {
                System.out.println("Analisis Semántido Correcto para: "+a.getName());
                System.out.println("Generando Fichero de Salida");
                a.escribir();
            } catch (IOException ex) {
                Logger.getLogger(MyListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("No se ha podido realizar el analisis para el automata: "+a.getName()+"\n"
                    + "Alguno de los parametros que ha introducido en el fichero son incorrectos"
                    + " o carecen de sentido para nuestro analisis.");
        }
    }

    @Override
    public void enterCuerpo_automata(practicaAntlrParser.Cuerpo_automataContext ctx) {

        
    }

    @Override
    public void exitCuerpo_automata(practicaAntlrParser.Cuerpo_automataContext ctx) {

    } 

    @Override
    public void enterEstados(practicaAntlrParser.EstadosContext ctx) {
        for(int i=0;i<ctx.ID().size();i++){
            a.estados.add(ctx.ID(i).getText());
        }
        
    }

    @Override
    public void exitEstados(practicaAntlrParser.EstadosContext ctx) {

    }

    @Override
    public void enterEstado_ini(practicaAntlrParser.Estado_iniContext ctx) {
        a.estadoInicial=ctx.ID().getText();
    }

    @Override
    public void exitEstado_ini(practicaAntlrParser.Estado_iniContext ctx) {

    }

    @Override
    public void enterAlf_in(practicaAntlrParser.Alf_inContext ctx) {
        
    }

    @Override
    public void exitAlf_in(practicaAntlrParser.Alf_inContext ctx) {
        for(int i=0;i<ctx.Eventos().size();i++){
            a.eventos.add(ctx.Eventos(i).getText());
        }
        
    }

    @Override
    public void enterAlf_out(practicaAntlrParser.Alf_outContext ctx) {
        
    }

    @Override
    public void exitAlf_out(practicaAntlrParser.Alf_outContext ctx) {
        for(int i=0;i<ctx.Cmp().size();i++){
            a.comportamientos.add(ctx.Cmp(i).getText());
            if( comp_codigo.contains(a.comportamientos.get(i))){
                System.out.println("Hay comportamientos que no se han definido correctamente, en este caso: "+ctx.Cmp(i));
            }
        }

    }

    @Override
    public void enterTransicion(practicaAntlrParser.TransicionContext ctx) {

    }

    @Override
    public void exitTransicion(practicaAntlrParser.TransicionContext ctx) {

    }

    @Override
    public void enterTransicion_def(practicaAntlrParser.Transicion_defContext ctx) {

    }

    @Override
    public void exitTransicion_def(practicaAntlrParser.Transicion_defContext ctx) {
        if(z){
            if(a.estados.contains(ctx.ID().getText())&&a.estados.contains(ctx.val_trans().ID().getText()) && a.eventos.contains(ctx.Eventos().getText())){
               t=a.new Transicion(""+ctx.ID().getText(),""+ctx.val_trans().ID().getText(),""+ctx.Eventos().getText());
                a.transiciones.add(t);
                z=true;
            }else{
                System.out.println("Se ha definido un estado o evento erroneo.");
                z=false;
            }

        }else{
                 z=false;
        }        
    }

    @Override
    public void enterVal_trans(practicaAntlrParser.Val_transContext ctx) {
       
    }

    @Override
    public void exitVal_trans(practicaAntlrParser.Val_transContext ctx) {

    }

    @Override
    public void enterComportamientos(practicaAntlrParser.ComportamientosContext ctx) {

    }

    @Override
    public void exitComportamientos(practicaAntlrParser.ComportamientosContext ctx) {
     //   a.escribirEstados();
    }

    @Override
    public void enterComp_def(practicaAntlrParser.Comp_defContext ctx) {

    }

    @Override
    public void exitComp_def(practicaAntlrParser.Comp_defContext ctx) {
        if(z){
            if(a.estados.contains(ctx.ID().getText()) && a.comportamientos.contains(ctx.val_comp().Cmp().getText())){
                a.EstComp.put(ctx.ID().getText(), ctx.val_comp().Cmp().getText());
            }else{
                System.out.println("Se ha definido un estado o comportamiento incorrecto");
                z=false;
            }
        }
        
    }

    @Override
    public void enterVal_comp(practicaAntlrParser.Val_compContext ctx) {

    }

    @Override
    public void exitVal_comp(practicaAntlrParser.Val_compContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode tn) {
    }

    @Override
    public void visitErrorNode(ErrorNode en) {
        System.out.println("Falta: "+en.getText()+"En el texto de entrada");
        z=false;
    }

    @Override
    public void enterEveryRule(ParserRuleContext prc) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext prc) {

    }
 
}