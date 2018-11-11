# Procesadores de Lenguajes

## Descripción del proyecto

La práctica consiste en el diseño de un procesador de lenguajes cuya entrada estará formada por una o varias máquinas de Moore y su salida será código en un lenguaje de alto nivel que lo represente.


<p align="center">
  <img width="300" height="300" src="https://github.com/MedinaAJ/ProcesadoresDelLenguaje/blob/master/docs/latex_docs/img/Modelo-moore.jpg">
</p>

## Estructura del proyecto

* docs
  * latex_docs
    * Trabajo_PracticoE1.pdf
  * EBNF_moore.docx
  * automata_de_prueba.txt
  
* lexical analysis
  * automaton_example
  * /class
    * AnalizadorAutomata.class
    * entrada.txt
  * /flex
    * moore.flex
  * /src
    * AnalizadorAutomata.java
  * Makefile
  
## Participantes del proyecto
Equipo Yukihiro Matsumoto

* Julián García Sánchez
* Iván Illán Barraya
* Alejandro Medina Jiménez
* Javier Monescillo Buitrón

## Tecnologías utilizadas

Actualmente para el análisis léxico estamos utilizando la herramienta Jflex, también utilizamos el lenguaje de programación Java.
No obstante, para el futuro del desarrollo del proyecto, se utilizara ANTRL y CUP.

## Instalación git en Ubuntu
$ sudo apt-get install git

Para usar git de forma sencilla, esta es la secuencia
1) Clonar un repositorio
$ git clone https://github.com/MedinaAJ/ProcesadoresDelLenguaje
2) Añadir los archivos antes de hacer un commit
$ git add .
3) Hacer un commit
$ git commit -m "mensaje"
4) hacer un push
$ git push origin master
5) Cuando haya que hacer un pull
$ git pull

Un video más explicativo: https://www.youtube.com/watch?v=3XlZWpLwvvo

Un tutorial de git: http://rogerdudler.github.io/git-guide/index.es.html


## ¿Cómo ejecutar?

Abre una terminal dentro de la carpeta /lexical_analysis y haz $ make

Después entra en la carpeta class/ con y ejecuta $ java AnalizadorAutomata entrada.txt 


