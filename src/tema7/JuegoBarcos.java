package tema7;

import java.util.Scanner;

/**
 * JuegoBarcos
 * - Tablero de tamaño fijo, en este 5 x 5
 * - El barco se coloca en una posición fija, en este caso 2,3
 * - No controla el rango de la fila y columna
 */
public class JuegoBarcos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int fila;
        int columna;
        // crear tablero (tamaño fijo)
        boolean[][] tablero = new boolean[5][5];
        // poner barco (posición fija)
        tablero[2][3] = true;
        // hacer mientras no hundamos el barco
        do {
            // leer coordenadas
            System.out.print("Dime fila (0-4): ");
            fila = entrada.nextInt();
            System.out.print("Dime columna (0-4): ");
            columna = entrada.nextInt();
            if (tablero[fila][columna] == false) { // no hay barco
                System.out.println("AGUA! Sigue intentándolo!") ;
            } else { // hay barco
                System.out.println("HUNDIDO! Enhorabuena!") ;
            }
        } while (tablero[fila][columna] == false);
        // mientras el disparo sea agua, repetimos
        entrada.close(); // cerrar la entrada de datos
    }
}