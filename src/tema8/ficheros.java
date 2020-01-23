package tema8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * ficheros
 * escribir en un fichero de texto, leer el contenido
 * y escribirlo por pantalla
 */
public class ficheros {

    public static void main(String[] args) {
        escribir();
        leer();
    }

    private static void leer() {
        FileReader fichero = null;
        BufferedReader entrada = null;
        String linea;
        try {
            // abrir el fichero para lectura
            fichero = new FileReader("c:/datos/fichero.txt");
            // abrir un canal de lectura para el fichero
            entrada = new BufferedReader(fichero);
            // leer lineas del canal entrada
            System.out.println("LEYENDO EL FICHERO:");
            do {
                linea = entrada.readLine();
                if (linea != null) {
                    System.out.println(linea);
                }
            } while (linea != null);
            fichero.close();
        }
        catch (Exception e) { // Exception es la más general de las excepciones
                              // Aqui salta cuando se produce cualquier excepción
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private static void escribir() {
        FileWriter fichero = null;
        PrintWriter salida = null;
        try {
            // para separar los nombres del camino se puede utilizar / o \\
            // si ponemos true al final indica que se abra para añadir (no sobreescribe)
            fichero = new FileWriter("c:/datos/fichero.txt",false);
            // crear un canal de salida para el fichero
            salida = new PrintWriter(fichero);
            // escribir en el canal de salida (analogo al out, que sale por pantalla)
            salida.println("primera escritura, con salto de linea");
            salida.print("segunda escritura, sin salto de linea");
            salida.print(" tercera escritura, sin salto de linea");
            // escribir dos saltos de linea
            salida.println();
            salida.println();
            salida.println("cuarta escritura, más abajo");
            // escribir con un bucle
            for (int i = 1; i <= 10; i++) {
                salida.println("linea-" + i);
            }
            fichero.close();
        } 
        catch (IOException e) {
            System.out.println("ERROR de fichero");
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println("Error puntero nulo");
        }
        finally {
            System.out.println("El finally se ejecuta siempre, haya error o no");
        }
    }


}