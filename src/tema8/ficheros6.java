package tema8;

import java.io.File;
import java.util.Date;

/**
 * ficheros6
 * Clase File, para carpetas
 */
public class ficheros6 {

    public static void main(String[] args) {
        File carpeta = new File("/datos/carpeta1");
        carpeta.mkdir();
        System.out.println("Carpeta creada");
        // Crear 10 carpetas
        for (int i = 1; i <= 10; i++) {
            carpeta = new File("/datos/carpeta" + i);
            carpeta.mkdir();           
        }
        // Borrar 10 carpetas
        /*
        for (int i = 1; i <= 10; i++) {
            carpeta = new File("/datos/carpeta" + i);
            carpeta.delete();           
        }
        */
        // leer los ficheros dentro de una carpeta
        System.out.println("Ficheros en /datos");
        File carpeta2 = new File("/datos");
        String[] lista = carpeta2.list();
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }  
        // leer los ficheros dentro de una carpeta
        // Sería equivalente al comando DIR de MS-DOS
        // Este código es un ejemplo de acceso a bajo nivel con Java
        System.out.println("Ficheros en /datos - etiquetados");
        File carpeta3 = new File("/datos");
        File fichero;
        int numFicheros = 0;
        long tamano = 0;
        long tamanoTotal = 0;
        long ms;
        String[] lista3 = carpeta3.list();
        for (int i = 0; i < lista3.length; i++) {
            System.out.print(lista3[i]);
            fichero = new File("/datos/" + lista3[i]);
            if (fichero.isDirectory()) {
                System.out.print(" - DIRECTORIO");
            } else {
                System.out.print(" - FICHERO");
                tamano = fichero.length();
                System.out.print(" - " + tamano + " bytes");
                tamanoTotal += tamano; // acumulamos el tamaño de cada fichero
                numFicheros++;
            } 
            // fecha del fichero
            ms = fichero.lastModified() ;  // milisegundos desde 1/1/1970
            Date fecha = new Date(ms); 
            System.out.println(" - " + fecha);     
        }  
        System.out.println(numFicheros + " archivos - " + tamanoTotal + " bytes");

    }
}