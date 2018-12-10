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


 private Symbol symbol(int sym) {

   return new Symbol(sym,yyline+1,yycolumn+1);

 }/* Fin symbol */

private Symbol symbol(int sym, Object val) {
    return new Symbol(sym, yyline+1, yycolumn+1, val);
  }

%} /* Fin Declaraciones */

%eofval{
  return symbol(sym.EOF);
%eofval}



%%
/* ------------------------Seccionde reglaslexicas----------------------*/
<YYINITIAL> {

"a"		{return symbol(sym.a);}

"b"		{return symbol(sym.b);}

"c" 		{return symbol(sym.c);}

"d" 		{return symbol(sym.d);}

. {System.out.println("Token No Valido <" +yytext()+ ">linea: " + (yyline+1) + " columna: " + (yycolumn+1));}


}/* fin YYinitial */
