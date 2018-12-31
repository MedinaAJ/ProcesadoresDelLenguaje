# Procesadores de Lenguajes

## Descripción del proyecto

La práctica consiste en el diseño de un procesador de lenguajes cuya entrada estará formada por una o varias máquinas de Moore y su salida será código en un lenguaje de alto nivel que lo represente.


<p align="center">
  <img width="300" height="300" src="https://github.com/MedinaAJ/ProcesadoresDelLenguaje/blob/master/docs/latex_docs/img/Modelo-moore.jpg">
</p>

## Problema y tecnología empleada

El principal problema del proyecto es la construcción de dos procesadores de lenguaje:
	* Procesador de lenguajes basado en un analizador sintáctico descendente usando Antlr.
	* Procesador de lenguajes basado en un analizador sintáctico ascendente usando Jflex y cup.

Utilizaremos un conjunto de ejemplos para el lenguaje con un dominio específico, el lenguaje Mor esta ciertamente basado en Java, es de tipo verboso, y al usuario no le resultará difícil su aprendizaje.

## Estructura del proyecto

* pl_cup
  * examples
  * /class
  * /flex
  * /src
  * Makefile
* pl_antlr
   * ANTLRDescendente
* docs
  * latex_docs
    * Trabajo_PracticoE1.pdf


## Manejo en el control de versiones

1) Clonar un repositorio
```
$ git clone https://github.com/MedinaAJ/ProcesadoresDelLenguaje
```
2) Añadir los archivos antes de hacer un commit
```
$ git add .
```
3) Hacer un commit 
```
 $ git commit -m "mensaje"
```
4) hacer un push
```
 $ git push origin <rama_actual>
```
5) Realizar un pull
```
$ git pull
```
6) Para cambiar de rama y comprobar tu rama actual
```
git checkout <nombre_rama>
git branch
```
Un tutorial de git: http://rogerdudler.github.io/git-guide/index.es.html
  
## Participantes del proyecto
Equipo Yukihiro Matsumoto

* Julián García Sánchez
* Iván Illán Barraya
* Alejandro Medina Jiménez
* Javier Monescillo Buitrón

## Licencia
Este proyecto está bajo licencia MIT, lee el archivo [LICENSE.md](LICENSE.md) para mas detalles.



