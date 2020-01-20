package tema8;

import java.io.FileWriter;

/**
 * ficheros
 */
public class ficheros {

    public static void main(String[] args) {
        escribir();
        leer();
    }

    private static void leer() {
    }

    private static void escribir() {
        FileWriter fichero;
        fichero = new FileWriter("c:\\datos\\fichero.txt");
        fichero.close();
    }
}