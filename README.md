# Procesadores de Lenguajes

Estructura del proyecto
* docs
  * latex_docs
  * EBNF_moore.docx
  * automata_de_prueba.txt
* lexical analysis
  * moore.lex
  * moore.cup
* optional
  * /cup 
  * /flex
  * /java
  * /src
  * Makefile
* README.md


# Para poder instalar git en Ubuntu:
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


# ¿Cómo ejecutar?

Entra en una terminal y haz $ make

Después entra en la carpeta class/ con  $ cd class/ y ejecuta $ java parser Prueba.txt

