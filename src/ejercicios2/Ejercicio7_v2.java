package ejercicios2;

import java.util.Scanner;

/**
 * Ejercicio7_v2 Programa que lea números enteros por teclado y para cada número
 * introducido indique si es positivo o negativo y si es par o impar. Se deben
 * realizar tres versiones del programa: 2. En la segunda versión se utilizará
 * un bucle do .. while. La lectura de números en esta versión también finaliza
 * cuando se introduzca un cero.
 */
public class Ejercicio7_v2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        // mientras el número sea distinto de 0
        do {
            // pedir número
            System.out.print("Dime número (0 para salir): ");
            numero = entrada.nextInt();
            if (numero != 0) {
                // ver si es positivo o negativo
                if (numero > 0) {
                    System.out.println("Positivo");
                } else {
                    System.out.println("Negativo");
                }
                // ver si es par o impar
                if (numero % 2 == 0) {
                    System.out.println("Par");
                } else {
                    System.out.println("Impar");
                }
            }
        } while (numero != 0);

    }
}