package tema7;

import java.util.Scanner;

/**
 * JuegoBarcos_v2 MEJORAS: 1.- Tablero de tamaño variable. Se pide al usuario.
 * 2.- El barco se coloca en una posición aleatoria 3.- Se controla el rango de
 * la fila y columna 4.- Llevar control del número de intentos NUEVAS MEJORAS
 * 5.- Dibujar el tablero al final (- agua, B barco) 6.- Dibujar el tablero al
 * final (- agua, x disparo, B barco)
 */
public class JuegoBarcos_v3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamano;
        int aleatorio1;
        int aleatorio2;
        int fila;
        int columna;
        int intentos = 0;
        //
        System.out.println("* JUEGO DE BARCOS *");
        // pedir tamaño al usuario
        System.out.print("Dime tamaño del tablero: ");
        tamano = entrada.nextInt();
        // crear tablero cuadrado con ese tamaño
        boolean[][] tablero = new boolean[tamano][tamano];
        // crear tablero cuadrado donde guardamos los disparos
        boolean[][] disparos = new boolean[tamano][tamano];

        // poner barco (aleatorio)
        // El método random() devuelve un número con decimales
        // entre 0 y 1 (sin llegar al 1)
        // Cada vez que se llama daría un número distinto
        // si lo multiplicamos por tamano, dará números entre 0 y tamano
        // Le quitamos los decimales con el casting (int)
        aleatorio1 = (int) (Math.random() * tamano);
        aleatorio2 = (int) (Math.random() * tamano);
        tablero[aleatorio1][aleatorio2] = true;
        // hacer mientras no hundamos el barco
        do {
            // leer coordenadas
            // mientras no sea correcto, dar un mensaje de error
            // y leer nuevo
            do {
                System.out.print("Dime fila (0-" + (tamano - 1) + "): ");
                fila = entrada.nextInt();
                if (fila < 0 || fila >= tamano) {
                    System.out.println("ERROR: fila incorrecta");
                }
            } while (fila < 0 || fila >= tamano);

            do {
                System.out.print("Dime columna (0-" + (tamano - 1) + "): ");
                columna = entrada.nextInt();
                if (columna < 0 || columna >= tamano) {
                    System.out.println("ERROR: columna incorrecta");
                }
            } while (columna < 0 || columna >= tamano);
            // incrementamos el número de intentos
            intentos++;
            if (tablero[fila][columna] == false) { // no hay barco
                System.out.println("AGUA! Sigue intentándolo!");
            } else { // hay barco
                System.out.println("ENHORABUENA!");
                System.out.println("HUNDIDO en " + intentos + " intentos");
            }
        } while (tablero[fila][columna] == false);
        // mientras el disparo sea agua, repetimos

        // mientras el disparo sea agua, repetimos

        // Dibujar el tablero al final (- agua, B barco)
        // primera fila
        System.out.println("TABLERO SIN DISPAROS");
        System.out.print(" ");
        for (int c = 0; c < tamano; c++) {
            System.out.print(" ");
            System.out.print(c);
        }
        System.out.println(); // cambio de línea
        // resto de filas
        for (int f = 0; f < tamano; f++) {
            System.out.print(f);
            for (int c = 0; c < tamano; c++) {
                System.out.print(" ");
                if (tablero[f][c] == false) {
                    System.out.print("-");
                } else {
                    System.out.print("B");
                }

            }
            System.out.println(); // cambio de línea
        }

        // Dibujar el tablero al final (- agua, x disparo, B barco)
        // primera fila
        System.out.println("TABLERO CON DISPAROS");
        System.out.print(" ");
        for (int c = 0; c < tamano; c++) {
            System.out.print(" ");
            System.out.print(c);
        }
        System.out.println(); // cambio de línea
        // resto de filas
        for (int f = 0; f < tamano; f++) {
            System.out.print(f);
            for (int c = 0; c < tamano; c++) {
                System.out.print(" ");
                if (tablero[f][c] == false) {
                    System.out.print("-");
                } else {
                    System.out.print("B");
                }

            }
            System.out.println(); // cambio de línea
        }

        entrada.close(); // cerrar la entrada de datos
    }
}