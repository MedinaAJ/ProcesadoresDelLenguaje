//* --------------------------Seccion codigo-usuario ------------------------*/

import java.io.*;

%%

/* -----------------Seccion de opciones y declaraciones -----------------*/
/*--OPCIONES --*/
/* Nombre de la clase generada para el analizadorlexico*/
%class analex
/* Indicar funcionamiento autonomo
%standalone */

/* Posibilitar acceso a la columna y fila actual de analisis*/

%line

%column

/* Habilitar la compatibilidad con el interfaz CUP para el generador sintáctico

%cup */

/*--DECLARACIONES --*/

%{

  static int numCount =0, identCount = 0, lineCount = 0;

%} /* Fin Declaraciones */

%eof{

   System.out.println("Numeros: " + numCount + " Identificadores: " + identCount +" Lines: " +lineCount);

%eof}

%type Object

/* Declaraciones de macros NL(nueva linea) BLANCO(espacio en blanco) y TAB(tabulador) */

NL  = \n | \r | \r\n
BLANCO = " "
TAB =  \t


%%
/* ------------------------Seccion de reglas y acciones ----------------------*/
<YYINITIAL> {

[1-9][:digit:]* 		{System.out.println("Token Num <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); numCount++;}
[:jletter:][:jletterdigit:]* 	{System.out.println("Token Ident <" +yytext()+ "> encontrado en linea: " + (yyline+1) + " columna: " + (yycolumn+1)); identCount++;}
{NL}				{lineCount = lineCount+1;}
{TAB}				{ /* ignora los tabuladores */ }
{BLANCO}			{ /* ignora los espacios en blanco */ }
. 				{System.out.println("Token No Valido <" +yytext()+ ">linea: " + (yyline+1) + " columna: " + (yycolumn+1));}


}/* fin YYinitial */
