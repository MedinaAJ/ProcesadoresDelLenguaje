#!/usr/bin/make -f
# -*- mode:makefile -*-

# Windows Makefile

DEFAULT_EXAMPLE := calculator

	
DIRBIN := bin/
DIRGEN := generated/
DIRLIB := lib/
DIRSRC := src/

ifeq ($(PROJ),)
    PROJ = $(DEFAULT_EXAMPLE)
endif

DIRBIN := $(PROJ)/$(DIRBIN)
DIRGEN := $(PROJ)/$(DIRGEN)
DIRLIB := $(PROJ)/$(DIRLIB)
DIRSRC := $(PROJ)/$(DIRSRC)


JC := javac
JVM := java
ANTLR := $(JVM) -jar $(DIRLIB)antlr-4.7.1-complete.jar -Dlanguage=Java

ifeq ($(OS),Windows_NT)
    PATH_SEPARATOR := ;
else
    PATH_SEPARATOR := :
endif
CLASSPATH := -cp "$(DIRBIN)$(PATH_SEPARATOR)$(DIRLIB)*"

.PHONY: all
all: folders compile run

.PHONY: run
run:
	$(JVM) $(CLASSPATH) Main

.PHONY: compile
compile: gen-antlr copy-src program

.PHONY: gen-antlr
gen-antlr: $(DIRSRC)$(PROJ).g4
	$(ANTLR) -o $(DIRGEN) $<
		
.PHONY: copy-src
copy-src:
	cp $(DIRSRC)*.java $(DIRGEN)

.PHONY: program
program: $(DIRGEN)$(PROJ)Lexer.java $(DIRGEN)$(PROJ)Parser.java $(DIRGEN)$(PROJ)BaseListener.java $(DIRGEN)$(PROJ)Listener.java $(DIRGEN)MyListener.java $(DIRGEN)Main.java
	javac $(CLASSPATH) $^ -d $(DIRBIN) -Xdiags:verbose

.PHONY: folders
folders:
	mkdir -p $(DIRBIN)

.PHONY: folders
clean: 	
	rm -rf $(DIRBIN) $(DIRGEN)
