DIRJAVA= class/
DIRSRC = src/
DIRFLEX= flex/
DIRCUP= cup/



JC= javac
JF= jflex
F =.flex
JV =.java
JA = java
CUP = cup
CP =.cup

default:
	make cflex
	make jcup
	make javac

dirs:
	mkdir -p $(DIRJAVA) $(DIRSRC) $(DIRFLEX) $(DIRCUP)
cflex:
	$(JF) $(DIRFLEX)*$(F) -inputstreamctor -d $(DIRSRC)

jcup:
	$(CUP) -destdir $(DIRSRC) $(DIRCUP)*$(CP)

javac: 
	$(JC) -d $(DIRJAVA) $(DIRSRC)*$(JV)

clean:
	rm $(DIRSRC)*
