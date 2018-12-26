grammar ivan;

programa
: dec_comp automata automata*
;

dec_comp
: cmp COD (cmp COD)*
;



automata
: 'moore' ID cuerpo_automata
;

cuerpo_automata
: '{' estados estado_ini alf_in alf_out transicion comportamientos '}'
;

estados
: 'estados' (ID ',')* ID ','
;

estado_ini
: 'estado_in' ID ';'
;

alf_in
: 'alf_in' (eventos ',')* eventos ','
;

alf_out
: 'alf_out' (cmp ',') cmp ';'
;

transicion
: 'transicion' '{' transicion_def transicion_def* '}'
;

transicion_def
: '(' ID ',' eventos ',' val_trans
;

val_trans
: ID ')' ',' | ID ')' ';'
;

comportamientos 
: 'comportamientos' '{' comp_def comp_def* '}'
;

comp_def
: '(' ID ',' val_comp
;

val_comp 
: cmp ')' ';' | cmp ')' ';'
;

cmp
: 'c' NUM
;

eventos
: 'e' NUM
;

COM
:
'/*' .* ? '*/'->skip
;

NUM
: ('0' .. '9')+
;

WS
: [ \r\n\t]+ -> skip
;

ID
: ('a' .. 'z')(('A' .. 'Z')|('0' .. '9'))
;

COD
:'#' .* '#'
;
