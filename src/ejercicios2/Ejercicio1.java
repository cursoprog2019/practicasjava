package ejercicios2;

import java.util.Scanner;

/**
 * Ejercicio1 Programa que lea un número entero por teclado y calcule si es par
 * o impar.
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        // Leer número por teclado (Scanner)
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime número: ");
        int numero = entrada.nextInt();
        // escribir si es par o impar (if-else, %)
        // ¿Cuando un número es par?: 
        // cuando el resto de la división entera por 2 es 0
        if (numero % 2 == 0) { // par
            System.out.println("El número introducido es par");
        } else { // si no era par, a la fuerza es impar
            System.out.println("El número introducido es impar");
        }
        // cerrar la entrada de datos
        entrada.close();
    }
}