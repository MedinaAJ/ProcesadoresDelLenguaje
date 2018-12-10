
import java.util.*;
import java.io.*;
import java_cup.runtime.Symbol;
%%
%cup


%class EssentialOils
%standalone
%16bit

%{

%}



%state TEXTO
%state POSIBLEFIN
%%


<YYINITIAL> {
"AE:" {yybegin(TEXTO); return new Symbol(sym.AE, new String(yytext()));}
"Nombre latino:" {yybegin(TEXTO); return new Symbol(sym.Nombrelatino, new String(yytext()));}
"Familia:" {yybegin(TEXTO); return new Symbol(sym.Familia, new String(yytext())); }
"Uso:" {yybegin(TEXTO); return new Symbol(sym.Uso, new String(yytext())); }
"Procedencia:" {yybegin(TEXTO); return new Symbol(sym.Procedencia, new String(yytext())); }
"Extraccion:" {yybegin(TEXTO); return new Symbol(sym.Extraccion, new String(yytext())); }
"Descripcion olfativa:" {yybegin(TEXTO); return new Symbol(sym.Descripcionolfativa, new String(yytext())); }
"Apariencia:" {yybegin(TEXTO); return new Symbol(sym.Apariencia, new String(yytext())); }
"Nota de Perfume:" {yybegin(TEXTO); return new Symbol(sym.NotadePerfume, new String(yytext())); }
"Perfume:" {yybegin(TEXTO); return new Symbol(sym.Perfume, new String(yytext())); }
"Soluble en:" {yybegin(TEXTO); return new Symbol(sym.Solubleen, new String(yytext())); }
"Insoluble en:" {yybegin(TEXTO); return new Symbol(sym.Insolubleen, new String(yytext())); }
"Descripcion:" {yybegin(TEXTO); return new Symbol(sym.Descripcion, new String(yytext())); }
"Propiedades:" {yybegin(TEXTO); return new Symbol(sym.Propiedades, new String(yytext())); }
"Precauciones:" {yybegin(TEXTO); return new Symbol(sym.Precauciones, new String(yytext())); }
"Contraindicaciones:" {yybegin(TEXTO); return new Symbol(sym.Contraindicaciones, new String(yytext())); }
"Sinergia:" {yybegin(TEXTO); return new Symbol(sym.Sinergia, new String(yytext())); }

. {}

} 

<TEXTO>{
~"\n" {
	yybegin(YYINITIAL);
	return new Symbol(sym.VALOR, new String(yytext()));
	}
}

[^] {}

