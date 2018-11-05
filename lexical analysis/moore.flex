//* --------------------------Seccion codigo-usuario ------------------------*/
import java.util.*;
import java.io.*;

%%

/* -----------------Seccion de opciones y declaraciones -----------------*/

/*--OPCIONES --*/
/* Nombre de la clase generada para el analizadorlexico*/
%class analizadorAutomata
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
CMP = c[1-9][0-9]*
EST = q[1-9][0-9]*
PROPIEDAD = "estados" | "estado_in" | "alf_in" | "alf_out" | "transicion" | "comportamiento"
ID = [A-Za-z][A-Za-z0-9_]*
%state AUTOMATA
%state CODIGO
%state COMENTARIOS
%state CUERPO_AUTOMATA
%state PROP_AUTOMATA
%%
/* ------------------------Seccion de reglas y acciones ----------------------*/
<YYINITIAL> {
	"/*" {yybegin(COMENTARIOS); llaves_comentarios++; System.out.println("Se abre declaracion de comportamientos --> " + yytext());}
	"moore" {yybegin(AUTOMATA); System.out.println("Automata Reconocido");}

}/* fin YYinitial */

<AUTOMATA>{
	{NL}	{}
	{BLANCO} {}
	{ID} + /"{" {System.out.println("Se reconoce token identificador <" + yytext() + ">");}
	"{" {yybegin(CUERPO_AUTOMATA);}
	. {}
}

<CUERPO_AUTOMATA>{
	{NL}	{}
	{BLANCO} {}
	{PROPIEDAD} {yybegin(PROP_AUTOMATA); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	"}" {yybegin(YYINITIAL);}
}

<PROP_AUTOMATA>{
	. + ";" {yybegin(CUERPO_AUTOMATA); System.out.println("token propiedad automata <"+yytext()+">  ");}
}

<COMENTARIOS>{
	{NL}	{}
	{BLANCO} {}
	{CMP}	{System.out.println("token comportamiento <"+yytext()+">  ");}
	"#" {yybegin(CODIGO); llaves_almohadillas++; System.out.println("ALMOADILLA " + yytext());}
	"*/"	{yybegin(YYINITIAL); llaves_comentarios--; System.out.println("Se cierra declaracion de comportamientos --> " + yytext());}
	. 	{/* Se omiten comentarios */}
}
<CODIGO>
{
	. + /"#" {System.out.println("Se cierra almohadilla, se reconoce: "+ yytext());}	
	"#" {yybegin(COMENTARIOS);llaves_almohadillas--;System.out.println("ALMOADILLA CIERRE " + yytext());}
	. {System.out.println("Error");}
}	
