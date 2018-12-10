//* --------------------------Seccion codigo-usuario ------------------------*/
import java.util.*;
import java.io.*;
import java_cup.runtime.Symbol;
%%
%cup

// Aquí es donde concurrirán los imports que se utilizarán o bien como clase de erroes por ejemplo
// import Errors;
// o bien los imports de 
%%

/* -----------------Seccion de opciones y declaraciones -----------------*/

/*--OPCIONES --*/
/* Nombre de la clase generada para el analizadorlexico*/

%class AnalizadorAutomata

/* Indicar funcionamiento autonomo*/

%standalone 

/* Posibilitar acceso a la columna y fila actual de analisis*/

%line
%column


/*--DECLARACIONES --*/
%{

  static int numCount =0, identCount = 0, lineCount = 0;
  static final String[] errores = {};
  int llaves_comentarios;
  int llaves_almohadillas;
  int llaves_automatas;
  int llaves_atr_automata;

%} /* Fin Declaraciones */

%init{
	System.out.println("Iniciando Analizador Sintactico...");
	llaves_comentarios = 0;
  	llaves_automatas = 0;
  	llaves_atr_automata = 0;
	llaves_almohadillas = 0;
%init}


%eof{

   System.out.println("Numeros: " + numCount + " Identificadores: " + identCount +" Lines: " +lineCount);

%eof}


/* Declaraciones de macros NL(nueva linea) BLANCO(espacio en blanco) y TAB(tabulador) */

NL  = \n | \r | \r\n | \t
BLANCO = " "
TAB =  \t
CMP = c[0-9][1-9]*
ESTADOS = "estados"
EINICIAL = "estado_in"
ALF_OUT = "alf_out"
ALF_IN = "alf_in"
TRANS = "transicion"
COMPORT = "comportamiento"
ID = [A-Za-z][A-Za-z0-9_]*
MOORE = "moore"

%state AUTOMATA
%state CODIGO
%state COMENTARIOS
%state CUERPO_AUTOMATA
%state ESTADO
%state INICIAL
%state ALF_ENTRADA
%state ALF_SALIDA
%state TRANSICION
%state COMPORTAMIENTO
%state DECCOMP
%%
/* ------------------------Seccion de reglas y acciones ----------------------*/
<YYINITIAL> {
	"/*" {yybegin(COMENTARIOS); llaves_comentarios++; System.out.println("Se abre comentario " + yytext()); return new Symbol(sym.COM_OP, new String(yytext()));}
	{MOORE} {yybegin(AUTOMATA); System.out.println("Automata Reconocido"); return new Symbol(sym.CONS_MOORE, new String(yytext()));}
	{CMP}	{yybegin(DECCOMP); System.out.println("token comportamiento <"+yytext()+">  "); return new Symbol(sym.CMP, new String(yytext()));}

}/* fin YYinitial */

<AUTOMATA>{

	{NL}	{}
	{BLANCO} {}
	{TAB} {}
	{ID} + /"{" {System.out.println("Se reconoce token identificador <" + yytext() + ">"); return new Symbol(sym.ID, new String(yytext()));}
	"{" {yybegin(CUERPO_AUTOMATA); return new Symbol(sym.CORCH_OP, new String(yytext()));}
	. {}
}

<CUERPO_AUTOMATA>{
	{ESTADOS} {yybegin(ESTADO); System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.CONS_ESTADOS, new String(yytext()));}
	{EINICIAL} {yybegin(INICIAL); System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.CONS_INICIAL, new String(yytext()));}
	{ALF_IN}  {yybegin(ALF_ENTRADA); System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.ALF_IN, new String(yytext()));}
	{ALF_OUT} {yybegin(ALF_SALIDA);System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.ALF_OUT, new String(yytext()));}
	{TRANS}   {yybegin(TRANSICION); System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.TRANS, new String(yytext()));}
	{COMPORT} {yybegin(COMPORTAMIENTO); System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.COMPORT, new String(yytext()));}
	"}" {yybegin(YYINITIAL); System.out.println("Finaliza automata"); return new Symbol(sym.CORCH_CL, new String(yytext()));}
}


<ESTADO> {
	
	"," {return new Symbol(sym.COMA, new String(yytext()));}
	{ID} {System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.ID, new String(yytext()));}
	";" {yybegin(CUERPO_AUTOMATA); return new Symbol(sym.PTO_COMA, new String(yytext()));}
}

<INICIAL> {
	{NL}	{}
	{BLANCO} {}
	{ID} {System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.ID, new String(yytext()));}
	";" {yybegin(CUERPO_AUTOMATA); return new Symbol(sym.PTO_COMA, new String(yytext()));}
	.   {System.out.println("error");}
}


<ALF_ENTRADA> {
	"," {}
	{ID} {System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.ID, new String(yytext()));}
	";" {yybegin(CUERPO_AUTOMATA); return new Symbol(sym.PTO_COMA, new String(yytext()));}

}

<ALF_SALIDA> {
	"," {return new Symbol(sym.COMA, new String(yytext()));}
	{ID} {System.out.println("Se ha reconocido el token <"+yytext()+">");return new Symbol(sym.ID, new String(yytext()));}
	";" {yybegin(CUERPO_AUTOMATA); return new Symbol(sym.PTO_COMA, new String(yytext()));}

}

<TRANSICION> {
	"{" {System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.CORCH_OP, new String(yytext()));}
	"(" {System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.PAREN_OP, new String(yytext()));}
	")" {System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.PAREN_CL, new String(yytext()));}
	"," {System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.COMA, new String(yytext()));}
	{ID} {System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.ID, new String(yytext()));}
	";" {System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.PTO_COMA, new String(yytext()));}
	. + /"}" {/* Se omiten comentarios */}
	"}" {yybegin(CUERPO_AUTOMATA); System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.CORCH_CL, new String(yytext()));}
}

<COMPORTAMIENTO> {
	"{" {System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.CORCH_OP, new String(yytext()));}
	"(" {System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.PAREN_OP, new String(yytext()));}
	")" {System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.PAREN_CL, new String(yytext()));}
	"," {System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.COMA, new String(yytext()));}
	{ID} {System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.ID, new String(yytext()));}
	";" {System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.PTO_COMA, new String(yytext()));}
	. + /"}" {/* Se omiten comentarios */}
	"}" {yybegin(CUERPO_AUTOMATA); System.out.println("Se ha reconocido el token <"+yytext()+">"); return new Symbol(sym.CORCH_CL, new String(yytext()));}
}

<DECCOMP>{
	"#" {yybegin(CODIGO); llaves_almohadillas++; System.out.println("ALMOADILLA " + yytext()); return new Symbol(sym.ALMOHADILLA, new String(yytext())); }
	. {/* Se omiten comentarios */}

}

<COMENTARIOS>{
	. + /"*/" { System.out.println("Se cierra comentario, texto comentario: " + yytext()); llaves_comentarios--; }
	"*/" {yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");  return new Symbol(sym.COM_CL, new String(yytext()));}
}

<CODIGO>{
	. + /"#" {System.out.println("Se cierra almohadilla, se reconoce: "+ yytext());}	
	"#" {yybegin(YYINITIAL); llaves_almohadillas--;System.out.println("ALMOADILLA CIERRE " + yytext());  return new Symbol(sym.ALMOHADILLA, new String(yytext()));}
	. {System.out.println("Error");}

}	
