package tema7;

import java.util.Scanner;

/**
 * JuegoBarcos
 */
public class JuegoBarcos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int fila;
        int columna;
        // crear tablero (pedir filas y columnas al usuario)
        boolean[][] tablero = new boolean[5][5];
        // poner barco (aleatorio)
        tablero[2][3] = true;
        // hacer mientras no hundamos el barco
        do {
            // leer coordenadas
            System.out.print("Dime fila (0-4): ");
            fila = entrada.nextInt();
            System.out.print("Dime columna (0-4): ");
            columna = entrada.nextInt();
 

        } while ();
    }
}