package tema8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * ficheros3 escribir un array en un fichero CSV (Valores Separados por Comas)
 * leer el fichero CSV y escribirlo por pantalla
 */
public class ficheros3 {

    public static void main(String[] args) {
        // datos que tenemos en memoria principal (RAM)
        int[][] numeros = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };
        FileWriter fichero = null; // fichero para escritura
        PrintWriter salida = null; // canal de salida
        FileReader fichero2 = null; // fichero para lectura
        BufferedReader entrada = null; // canal de entrada
        String linea;
        String elemento;
        StringTokenizer numerosFichero;
        // escribir estos datos en memoria externa (Disco Duro)
        // este proceso lo realizan los programas cuando exportan datos
        // ej. GMail al exportar los contactos
        try {
            // crear fichero
            fichero = new FileWriter("c:/datos/numeros.txt", false);
            // abrir canal de escritura
            salida = new PrintWriter(fichero);
            // ESCRIBIR sobre el canal de escribir
            for (int fila = 0; fila < numeros.length; fila++) {
                for (int columna = 0; columna < numeros[fila].length; columna++) {
                    // dentro de cada linea separamos los numeros por coma
                    salida.print(numeros[fila][columna] + ",");
                }
                // al terminar cada linea insertamos un retorno de carro (return)
                salida.println();
            }
            // cerrar fichero
            fichero.close();

            // LEER (IMPORTAR DATOS)
            // abrir el fichero para lectura
            fichero2 = new FileReader("c:/datos/numeros.txt");
            // abrir un canal de lectura para el fichero
            entrada = new BufferedReader(fichero2);
            // leer lineas del canal entrada
            System.out.println("LEYENDO EL FICHERO:");
            do {
                linea = entrada.readLine();
                if (linea != null) {
                    // proceso de pasar un String con números separados por comas
                    // a una lista de elementos independientes.
                    numerosFichero = new StringTokenizer(linea, ",");
                    // recorrer la lista elementos
                    while (numerosFichero.hasMoreTokens()) {
                        elemento = numerosFichero.nextToken();
                        System.out.print(elemento + "\t");
                    }
                    System.out.println();
                }
            } while (linea != null);
            fichero.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }
}