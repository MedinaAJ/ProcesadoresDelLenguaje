//* --------------------------Seccion codigo-usuario ------------------------*/
import java.util.*;
import java.io.*;
import java_cup.runtime.Symbol;

%%


/* -----------------Seccion de opciones y declaraciones -----------------*/

/*--OPCIONES --*/
/* Nombre de la clase generada para el analizadorlexico*/


%class AnalizadorAutomata
//%implements sym
%unicode
%cup
%cupdebug

/* Posibilitar acceso a la columna y fila actual de analisis*/

%line
%column


/*--DECLARACIONES --*/

%{
	StringBuffer string = new StringBuffer();

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



%eof}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment}
TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
 // Comment can be the last line of the file, without line terminator.
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
Identifier = [:jletter:] [:jletterdigit:]*
DecIntegerLiteral = 0 | [1-9][0-9]*
CMP = c[0-9][1-9]*
ESTADOS = "estados"
EINICIAL = "estado_in"
ALF_OUT = "alf_out"
ALF_IN = "alf_in"
TRANS = "transicion"
COMPORT = "comportamiento"
ID = [A-Za-z][A-Za-z0-9_]*
MOORE = "moore"


%state CODIGO, COMENTARIOS, STRING


%%
/* ------------------------Seccion de reglas y acciones ----------------------*/
<YYINITIAL> {

	{CMP} {return symbol(sym.CMP); yybegin(YYINITIAL); System.out.println("token comportamiento <"+yytext()+">");}
	"#" {yybegin(CODIGO); System.out.println("ALMOADILLA " + yytext());}
	{MOORE} {return symbol(sym.MOORE); yybegin(YYINITIAL); System.out.println("Automata Reconocido");}
	{ID} {return symbol(sym.ID); yybegin(YYINITIAL); System.out.println("Se reconoce token identificador <" + yytext() + ">");}
	"{" {return symbol(sym.LLPARENT_OP); yybegin(YYINITIAL); System.out.println("Se reconoce token identificador <" + yytext() + ">");}
	"}" {return symbol(sym.LLPARENT_CL); yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	{ESTADOS} {return symbol(sym.ESTADOS); yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	{EINICIAL} {return symbol(sym.ESTADO_INI); yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	{ALF_IN}  {return symbol(sym.ALF_INI); yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	{ALF_OUT} {return symbol(sym.ALF_OUT); yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	{TRANS}   {return symbol(sym.TRANS); yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	{COMPORT} {return symbol(sym.COMPORTAMIENTO); yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	"," {return symbol(sym.COMA); yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	";" {return symbol(sym.PUNTO_COMA); yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	"(" {return symbol(sym.LPARENT_OP); yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	")" {return symbol(sym.LLPARENT_CL); yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
	\"                             { string.setLength(0); yybegin(STRING); }
	/* comments */
	{Comment}                      { /* ignore */ }

	/* whitespace */
	{WhiteSpace}                   { /* ignore */ }	
}


<COMENTARIOS>{
	. + /"*/" { System.out.println("Se cierra comentario, texto comentario: " + yytext()); }
	"*/" { yybegin(YYINITIAL); System.out.println("Se ha reconocido el token <"+yytext()+">");}
}

<CODIGO>{
	. + /"#" {return symbol(sym.CODIGO); System.out.println("Se cierra almohadilla, se reconoce: "+ yytext());}
	"#" {yybegin(YYINITIAL);System.out.println("ALMOADILLA CIERRE " + yytext());}
	. {System.out.println("Error");}
}

<STRING> {
	\"                             { yybegin(YYINITIAL); return symbol(sym.STRING_LITERAL, string.toString()); }
	[^\n\r\"\\]+                   { string.append( yytext() ); }
	\\t                            { string.append('\t'); }
	\\n                            { string.append('\n'); }
	\\r                            { string.append('\r'); }
	\\\"                           { string.append('\"'); }
	\\                             { string.append('\\'); }
	\\.                            { throw new RuntimeException("Illegal escape sequence \""+yytext()+"\""); }
	{LineTerminator} 		{ throw new RuntimeException("Unterminated string at end of line"); }
}
 /* error fallback */
    [^]                              { throw new Error("Illegal character <"+yytext()+">"); }
