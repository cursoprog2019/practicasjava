package tema8;

import java.io.File;

/**
 * ficheros5 Uso de la File, 
 * que nos permite métodos de gestión de ficheros y carpetas
 * a nivel de sistema operativo
 */
public class ficheros5 {

    public static void main(String[] args) {
        File fichero = new File("c:/datos/prueba.txt");
        // crear fichero
        try {
            fichero.createNewFile();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        //
        if (fichero.canRead()) {
            System.out.println("Se puede leer");
        } else {
            System.out.println("No se puede leer");
        }
        if (fichero.canWrite()) {
            System.out.println("Se puede escribir");
        } else {
            System.out.println("No se puede escribir");
        }        
        if (fichero.exists()) {
            System.out.println("Existe");
        } else {
            System.out.println("No existe");
        }
        System.out.println("Nombre: " + fichero.getName());
        System.out.println("Camino completo: " + fichero.getAbsolutePath());
        System.out.println("Longitud: " + fichero.length() + " bytes");
        fichero.delete(); // borra ficheros, pero también carpetas !!
        System.out.println("Fichero borrado");
    }
}