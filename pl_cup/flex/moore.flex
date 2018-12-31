//* --------------------------Seccion codigo-usuario ------------------------*/
import java.util.*;
import java.io.*;
import java_cup.runtime.Symbol;

%%


/* -----------------Seccion de opciones y declaraciones -----------------*/

/*--OPCIONES --*/

%class AnalizadorAutomata
%unicode
%cup
%cupdebug

/* Posibilitar acceso a la columna y fila actual de analisis*/

%line
%column


/*--DECLARACIONES --*/

%{

%}

%init{
	System.out.println("Iniciando Analizador Lexico ... ");

%init}


%eof{

	System.out.println("Fin del Analizador Lexico ... ");

%eof}

TERLINEA = \r|\n|\r\n
CARACTERIN = [^\r\n]
ESPACIOBLANCO = {TERLINEA} | [ \t\f]
COMENTARIO = {COMENTARIOTRADICIONAL} | {FINLINEACOMENT}
COMENTARIOTRADICIONAL   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
FINLINEACOMENT     = "//" {CARACTERIN}* {TERLINEA}?
ENTEROS = 0 | [1-9][0-9]*
CMP = c{ENTEROS}
ESTADOS = "estados"
EINICIAL = "estado_in"
ALF_OUT = "alf_out"
ALF_IN = "alf_in"
TRANS = "transicion"
COMPORT = "comportamiento"
ID = [:jletter:] [:jletterdigit:]*
MOORE = "moore"


%state CODIGO

%%

/* ------------------------Seccion de reglas y acciones ----------------------*/

<YYINITIAL> {

	{CMP} { return new Symbol(sym.CMP,new String(yytext())); }
	"#" {yybegin(CODIGO); return new Symbol(sym.ALM_OP,new String(yytext())); }
	{MOORE} { return new Symbol(sym.MOORE, new String(yytext()));}
	"{" { return new Symbol(sym.LLCORCH_OP, new String(yytext()));}
	"}" { return new Symbol(sym.LLCORCH_CL, new String(yytext()));}
	{ESTADOS} { return new Symbol(sym.ESTADOS,new String(yytext()));}
	{EINICIAL} { return new Symbol(sym.ESTADO_INI,new String(yytext()));}
	{ALF_IN}  { return new Symbol(sym.ALF_IN,new String(yytext()));}
	{ALF_OUT} { return new Symbol(sym.ALF_OUT,new String(yytext()));}
	{TRANS}   {  return new Symbol(sym.TRANS,new String(yytext()));}
	{COMPORT} { return new Symbol(sym.COMPORTAMIENTO,new String(yytext()));}
	"," { return new Symbol(sym.COMA,new String(yytext()));}
	";" { return new Symbol(sym.PUNTO_COMA,new String(yytext()));}
	"(" { return new Symbol(sym.LLPARENT_OP,new String(yytext()));}
	")" { return new Symbol(sym.LLPARENT_CL,new String(yytext()));}
	{ID} {return new Symbol(sym.ID,new String(yytext()));}
	{COMENTARIO}                      {/*Se ignoran los comentario */}
	{ESPACIOBLANCO}                   {/*Se ignoran los espacios en blanco */}	
}

<CODIGO>{
	. + /"#" { return new Symbol(sym.CODIGO,new String(yytext()));}
	"#" {yybegin(YYINITIAL); return new Symbol(sym.ALM_CL,new String(yytext()));}
	. {System.out.println("Error en la declaración de código");}
}

[^]            { throw new Error("Carácter ilegal <"+yytext()+">"); }
