//* --------------------------Seccion codigo-usuario ------------------------*/
import java.util.*;
import java.io.*;


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

 
  static final String[] errores = {};


%} /* Fin Declaraciones */

%init{
	System.out.println("Iniciando Analizador Lexico ... ");

%init}


%eof{



%eof}



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



%state CODIGO
%state COMENTARIOS

%%
/* ------------------------Seccion de reglas y acciones ----------------------*/
<YYINITIAL> {
	{NL}	{}
	{BLANCO} {}
	{TAB} {}
	"/*" {yybegin(COMENTARIOS); System.out.println("Se abre comentario " + yytext());}
	{CMP} {yybegin(YYINITIAL); System.out.println("token comportamiento <"+yytext()+">");}
	"#" {yybegin(CODIGO); System.out.println("ALMOADILLA " + yytext());}
	{MOORE} {yybegin(YYINITIAL); System.out.println("Automata Reconocido");}
	{ID} {yybegin(YYINITIAL); System.out.println("Se reconoce token identificador <" + yytext() + ">");}
	"{" {yybegin(YYINITIAL); System.out.println("Se reconoce token identificador <" + yytext() + ">");}
	"}" {yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	{ESTADOS} {yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	{EINICIAL} {yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	{ALF_IN}  {yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	{ALF_OUT} {yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	{TRANS}   {yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	{COMPORT} {yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	"," {yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	";" {yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	"(" {yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	")" {yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	
}


<COMENTARIOS>{
	. + /"*/" { System.out.println("Se cierra comentario, texto comentario: " + yytext()); }
	"*/" {yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
}

<CODIGO>{
	. + /"#" {System.out.println("Se cierra almohadilla, se reconoce: "+ yytext());}
	"#" {yybegin(YYINITIAL);System.out.println("ALMOADILLA CIERRE " + yytext());}
	. {System.out.println("Error");}

}

