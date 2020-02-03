package tema8;

import java.io.File;

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
    }
}