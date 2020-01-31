package tema8;

import java.io.File;

/**
 * ficheros6
 * Clase File, para carpetas
 */
public class ficheros6 {

    public static void main(String[] args) {
        File carpeta = new File("c:/datos/carpeta1");
        carpeta.mkdir();
        System.out.println("Carpeta creada");
        // Crear 10 carpetas
        for (int i = 1; i <= 10; i++) {
            carpeta = new File("c:/datos/carpeta" + i);
            carpeta.mkdir();           
        }
        // Borrar 10 carpetas
        /*
        for (int i = 1; i <= 10; i++) {
            carpeta = new File("c:/datos/carpeta" + i);
            carpeta.delete();           
        }
        */
         
        
    }
}