grammar simple;

s : a b | S;
a : A s C | E b F | ;
b : B a D | ;
S : 's';
A : 'a';
B : 'b';
C : 'c';
D : 'd';
E : 'e';
F : 'f';