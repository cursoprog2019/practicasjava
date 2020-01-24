package tema8;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * ficheros4leer leer objetos de un fichero (binario)
 */
public class ficheros4leer {

    public static void main(String[] args) {
        Persona jose = null;
        Persona pedro = null;
        //
        FileInputStream fichero = null;
        ObjectInputStream entrada = null;
        //
        try {
            // abrir fichero
            fichero = new FileInputStream("c:/datos/personas.dat");
            // abrir canal de entrada
            entrada = new ObjectInputStream(fichero);
            // leer objetos
            jose = (Persona) entrada.readObject();
            pedro = (Persona) entrada.readObject();
            // cerrar fichero
            fichero.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        // mostrar por pantalla los objetos leidos
        System.out.println("Objetos leidos:");
        System.out.println(jose.getAtributos());
        System.out.println(pedro.getAtributos());
    }
}