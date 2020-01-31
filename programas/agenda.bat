@echo off
rem -- el echo off es para que no se vean los comandos
rem -- la llamada al programa se hace con java, que es la maquina virtual
rem -- despues se pone -cp que el indica el classpath (entre comillas dobles)
rem -- es decir, la carpeta donde esta´n los ficheros .class
rem -- por último el nombre de la clase a ejecutar, con el camino completo
rem -- java  -cp "C:\Users\Amalia\Desktop\visual studio code\practicasjava\programas" "tema8.Agenda"
rem -- si el fichero bat está en la misma carpeta que las clases java
rem -- no es necesario poner -cp
java tema8.Agenda