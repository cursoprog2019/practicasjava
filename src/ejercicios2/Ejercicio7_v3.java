package ejercicios2;

import java.util.Scanner;

/**
 * Ejercicio7_v3 Programa que lea números enteros por teclado y para cada número
 * introducido indique si es positivo o negativo y si es par o impar. Se deben
 * realizar tres versiones del programa: 3. En la tercera versión también se
 * utilizará un bucle do .. while pero en este caso la lectura de números
 * finaliza cuando se responda ‘N’ ó ‘n’ a la pregunta “Desea introducir más
 * números? (S/N):”
 * MEJORA1: Tiene en cuenta el 0
 * MEJORA2: Funciona pulsado solo Intro en la pregunta 
 * de Introducir más números (pone la opción por defecto 'S')
 */
public class Ejercicio7_v3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        String cadena;
        char respuesta;
        // mientras el número sea distinto de 0
        do {
            // pedir número
            System.out.print("Dime número: ");
            numero = entrada.nextInt();

            // ver si es positivo o negativo
            if (numero > 0) {
                System.out.println("Positivo");
            } else {
                if (numero == 0) {
                    System.out.println("Sin signo");
                } else {
                    System.out.println("Negativo");
                }
            }
            // ver si es par o impar
            if (numero % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }

            System.out.print("Desea introducir más números? (S/N): ");
            cadena = entrada.nextLine(); // para lea el Intro que hay despues del nextInt
            cadena = entrada.nextLine();
            if (cadena.length() == 0) { // para que funcione si sólo se pulsa Intro
                respuesta = 'S';
            } else {
                respuesta = cadena.charAt(0);
            }
        } while (respuesta != 'N' && respuesta != 'n');

    }
}