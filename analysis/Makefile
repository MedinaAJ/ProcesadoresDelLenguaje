DIRJAVA= class/
DIRSRC = src/
DIRFLEX= flex/
DIRCUP= cup/


A= moore
B= moore
JC= javac
JF= jflex
F=.flex
JV=.java
JA= java


default:
	make cflex
	make javac



dirs:
	mkdir -p $(DIRJAVA) $(DIRSRC) $(DIRFLEX) $(DIRCUP)
cflex:
	$(JF) $(DIRFLEX)$(A)$(F) -inputstreamctor -d $(DIRSRC)

jcup:
	$(CUP) -destdir $(DIRSRC) $(DIRCUP)$(A)$(CP)
jcup2:
	$(CUP) -destdir $(DIRSRC) $(DIRCUP)$(CA)$(CP)

javac: 
	$(JC) -d $(DIRJAVA) $(DIRSRC)*$(JV)

clean:
	rm $(DIRSRC)* $(DIRJAVA)*
