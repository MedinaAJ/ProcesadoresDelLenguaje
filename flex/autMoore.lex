package Analizador;

import java.util.*;
import java.io.*;
import java_cup.runtime.Symbol;
import Analizador.sym;

%%
%cup
%unicode
%class AutMoore
%standalone
%16bit

%{

%}



%state DECLARACIONCOMPORTAMIENTOS
%state JAVACODE
%state AUTOMATA
%state ESTADOS
%state LISTAESTADOS
%state ESTADOINICIAL
%state ESTADOFINAL
%state ALFABETOINICIAL
%state ALFABETOFINAL
%state TRANSICIONES
%state COMPORTAMIENTOS
%state FINAUTOMATA
%%

<YYINITIAL> {
	"/*" {yybegin(DECLARACIONCOMPORTAMIENTOS); return new Symbol(sym.COM_O, new String(yytext()));}
	.{}
}

<DECLARACIONCOMPORTAMIENTOS> {
	"c"[1-9][0-9]*" = {" {yybegin(JAVACODE); return new Symbol(sys.COMPORTAMIENTO, new String(yytext()));}
	"*/" {yybegin(AUTOMATA); return new Symbol(sym.COM_C, new String(yytext()));}
	.{}
}

<JAVACODE> {
	~"}" {yybegin(COMPORTAMIENTOS); return new Symbol(sym.JAVACODE, new String(yytext()));}
}	

<AUTOMATA> {
	"new mooreAut "[A-Za-z][A-Za-z0-9_]*"{" {yybegin(ESTADOS); return new Symbol(sym.DECLARACION, new String(yytext()));}
	.{}
}

<ESTADOS> {
	"estados = {" {yybegin(LISTAESTADOS); return new Symbol(sym.ESTADOS, new String(yytext()));}
}

<LISTAESTADOS> {
	"q"[1-9][0-9]*"," {yybegin(LISTAESTADOS); return new Symbol(sym.ESTADOLI, new String(yytext()));}
	"q"[1-9][0-9]*"};" {yybegin(ESTADOINICIAL); return new Symbol(sym.ESTADOLF, new String(yytext()));}
}

<ESTADOINICIAL> {
	"estado_in = q"[1-9][0-9]*";" {yybegin(ESTADOFINAL); return new Symbol(sym.ESTADOINICIAL, new String(yytext()));}
}

<ESTADOFINAL> {
	"estado_fi = q"[1-9][0-9]*";" {yybegin(ALFABETOINICIAL); return new Symbol(sym.ESTADOFINAL, new String(yytext()));}
}

<ALFABETOINICIAL> {
	"alf_in = {" {yybegin(ALFABETOINICIAL); return new Symbol(sym.ALFABETOINICIAL, new String(yytext()));}
	"e"[1-9][0-9]*"," {yybegin(ALFABETOINICIAL); return new Symbol(sym.EVENTOI, new String(yytext()));}
	"e"[1-9][0-9]*"};" {yybegin(ALFABETOFINAL); return new Symbol(sym.EVENTOF, new String(yytext()));}
}

<ALFABETOFINAL> {
	"alf_out = {" {yybegin(ALFABETOFINAL); return new Symbol(sym.ALFABETOFINAL, new String(yytext()));}
	"c"[1-9][0-9]*"," {yybegin(ALFABETOFINAL); return new Symbol(sym.COMPORTAMIENTOI, new String(yytext()));}
	"c"[1-9][0-9]*"};" {yybegin(TRANSICIONES); return new Symbol(sym.COMPORTAMIENTOF, new String(yytext()));}
}

<TRANSICIONES> {

}

<COMPORTAMIENTOS> {

}

<FINAUTOMATA> {
	"}" {yybegin(AUTOMATA); return new Symbol(sym.FINDECLARACION, new String(yytext()));}
}


[^] {}

