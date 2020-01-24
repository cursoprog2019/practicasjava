package tema8;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * ficheros4escribir escribir objetos en un fichero (binario)
 */
public class ficheros4escribir {

    public static void main(String[] args) {
        // Creamos un par de objetos de tipo Persona
        Persona jose = new Persona("123454678A", "José", "García García");
        Persona pedro = new Persona("123454699A", "Pedro", "López Marín");
        //
        FileOutputStream fichero = null;
        ObjectOutputStream salida = null;
        //
        try {
            // abrir fichero
            fichero = new FileOutputStream("c:/datos/personas.dat");
            // abrir canal de salida
            salida = new ObjectOutputStream(fichero);
            // escribir los objetos
            salida.writeObject(jose);
            salida.writeObject(pedro);
            // cerrar fichero
            fichero.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        System.out.println("Objetos escritos en el fichero");
    }
}