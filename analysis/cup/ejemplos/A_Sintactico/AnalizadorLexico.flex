//* --------------------------Seccion codigo-usuario ------------------------*/ 

import java_cup.runtime.*;

%% 

/* -----------------Seccionde opciones y declaraciones -----------------*/ 
/*--OPCIONES --*/ 
/* Nombre de la clase generada para el analizadorlexico*/ 

%class analex 

/* Indicar funcionamientoautonomo*/ 


/* Posibilitar acceso a la columna y fila actual de analisis*/ 

%line

%column

/* Habilitar la compatibilidad con el interfaz CUP para el generador sintáctico */

%cup

/*--DECLARACIONES --*/ 

%{ /* Principio Declaraciones */

/* Crear un nuevo objeto java_cup.runtime.Symbol con informacion sobre
   el token actual sin valor */


 private Symbol symbol(int type) {

   return new Symbol(type,yyline,yycolumn);
 
 }/* Fin symbol */


%} /* Fin Declaraciones */


%%
/* ------------------------Seccionde reglaslexicas----------------------*/
<YYINITIAL> {

"c" 		{return symbol(sym.c);}

"d" 		{return symbol(sym.d);}


. {System.out.println("Token No Valido <" +yytext()+ ">linea: " + (yyline+1) + " columna: " + (yycolumn+1));}


}/* fin YYinitial */
