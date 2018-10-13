DIRJAVA= class/
DIRSRC = src/
DIRFLEX= flex/
DIRCUP= cup/


A= autMoore
B= AutMoore
X= parser
Y= Yylex
S= sym
CA= Calculadora
JC= javac
JF= jflex
F=.lex
JV=.java
JA= java
CP =.cup
CUP= cup


default:
	make cflex2
	make jcup2
	make javac

aut: 
	make cflex
	make jcup
	make javac

dirs:
	mkdir -p $(DIRJAVA) $(DIRSRC) $(DIRFLEX) $(DIRCUP)
cflex:
	$(JF) $(DIRFLEX)$(A)$(F) -inputstreamctor -d $(DIRSRC)
cflex2:
	$(JF) $(DIRFLEX)$(CA)$(F) -inputstreamctor -d $(DIRSRC)
jcup:
	$(CUP) -destdir $(DIRSRC) $(DIRCUP)$(A)$(CP)
jcup2:
	$(CUP) -destdir $(DIRSRC) $(DIRCUP)$(CA)$(CP)

javac: 
	$(JC) -d $(DIRJAVA) $(DIRSRC)*$(JV)

clean:
	rm $(DIRSRC)* $(DIRJAVA)*
