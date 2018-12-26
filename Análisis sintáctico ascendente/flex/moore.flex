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

	private Symbol symbol(int type) {
		return new Symbol(type, yyline, yycolumn);
	}

	private Symbol symbol(int type, Object value) {
		return new Symbol(type, yyline, yycolumn, value);
	}
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

	{CMP} { System.out.println("token comportamiento <"+yytext()+">"); return symbol(sym.CMP);}
	"#" {yybegin(CODIGO); System.out.println("ALMOADILLA " + yytext()); return symbol(sym.ALM_OP);}
	{MOORE} { System.out.println("Automata Reconocido"); return symbol(sym.MOORE);}
	"{" { System.out.println("Se reconoce token identificador <" + yytext() + ">"); return symbol(sym.LLCORCH_OP);}
	"}" { System.out.println("Se ha reconocido el token <"+yytext()+">"); return symbol(sym.LLCORCH_CL);}
	{ESTADOS} { System.out.println("Se ha reconocido el token <"+yytext()+">"); return symbol(sym.ESTADOS);}
	{EINICIAL} { System.out.println("Se ha reconocido el token <"+yytext()+">"); return symbol(sym.ESTADO_INI);}
	{ALF_IN}  { System.out.println("Se ha reconocido el token <"+yytext()+">"); return symbol(sym.ALF_IN);}
	{ALF_OUT} { System.out.println("Se ha reconocido el token <"+yytext()+">"); return symbol(sym.ALF_OUT);}
	{TRANS}   { System.out.println("Se ha reconocido el token <"+yytext()+">"); return symbol(sym.TRANS);}
	{COMPORT} { System.out.println("Se ha reconocido el token <"+yytext()+">"); return symbol(sym.COMPORTAMIENTO);}
	"," { System.out.println("Se ha reconocido el token <"+yytext()+">"); return symbol(sym.COMA);}
	";" { System.out.println("Se ha reconocido el token <"+yytext()+">"); return symbol(sym.PUNTO_COMA);}
	"(" { System.out.println("Se ha reconocido el token <"+yytext()+">"); return symbol(sym.LLPARENT_OP);}
	")" { System.out.println("Se ha reconocido el token <"+yytext()+">"); return symbol(sym.LLPARENT_CL);}
	{ID} { System.out.println("Se reconoce token identificador <" + yytext() + ">"); return symbol(sym.ID);}
	{COMENTARIO}                      {/*Se ignoran los comentario */}
	{ESPACIOBLANCO}                   {/*Se ignoran los espacios en blanco */}	
}

<CODIGO>{
	. + /"#" {System.out.println("Se cierra almohadilla, se reconoce: "+ yytext()); return symbol(sym.CODIGO);}
	"#" {yybegin(YYINITIAL);System.out.println("ALMOADILLA CIERRE " + yytext()); return symbol(sym.ALM_CL);}
	. {System.out.println("Error");}
}

[^]            { throw new Error("Carácter ilegal <"+yytext()+">"); }
