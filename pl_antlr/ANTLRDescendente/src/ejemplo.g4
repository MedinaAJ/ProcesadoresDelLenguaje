grammar ejemplo;

programa
: dec_comp automata automata*
;

dec_comp
: Cmp COD (Cmp COD)*
;

Cmp
: 'c'[0-9]+
;

Eventos
: 'e'[0-9]+
;

automata
: 'moore' ID  cuerpo_automata
;

cuerpo_automata
: Llaves_ab estados estado_ini alf_in alf_out transicion comportamientos Llaves_ce
;
estados
: 'estados' (ID ',')* ID ';'
;

estado_ini
: 'estado_in' ID ';'
;

alf_in
: 'alf_in' (Eventos ',')* Eventos ';'
;

alf_out
: 'alf_out' (Cmp ',')* Cmp ';'
;

transicion
: 'transicion' Llaves_ab transicion_def transicion_def* Llaves_ce
;

transicion_def
: '(' ID ',' Eventos ',' val_trans
;

val_trans
: ID ')' ',' | ID ')' ';'
;

comportamientos 
: 'comportamiento' Llaves_ab comp_def comp_def* Llaves_ce
;

comp_def
: '(' ID ',' val_comp
;

val_comp 
: Cmp ')' ',' | Cmp ')' ';'
;
ID
: [a-zA-Z0-9]+
;

COD
: ALM (.)*? ALM
;

ALM
: '#'
;

WS  :  [ \t\r\n\u000C]+ -> skip
;

COMMENT
:   '/*' .*? '*/' -> skip
;

NUM
: 'c'[0-9]+
;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
;

Llaves_ab
: '{'
;
Llaves_ce
: '}'
;
