package ejercicios2;

import java.util.Scanner;

/**
 * Ejercicio3 Programa que lea por teclado tres números enteros y calcule el
 * mayor de los tres
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // leer número 1
        System.out.print("Dime número 1: ");
        int num1 = entrada.nextInt();
        // leer número 2
        System.out.print("Dime número 2: ");
        int num2 = entrada.nextInt();
        // leer número 3
        System.out.print("Dime número 3: ");
        int num3 = entrada.nextInt();
        // comprobar cual es el mayor (if-else anidado)
        // PSEUDOCODIGO
        // si num1 > num2
            // si num1 > num3
                // el mayor es num1
            // sino
                // el mayor es num3
        // sino
            // si num2 > num3
                // el mayor es num2
            // sino
                // el mayor es num3

        if (num1 > num2 ) {
            if (num1 > num3) {
                System.out.println("El mayor es " + num1);
            } else {
                System.out.println("El mayor es " + num3);
            }    
        } else {
            if (num2 > num3) {
                System.out.println("El mayor es " + num2);
            } else {
                System.out.println("El mayor es " + num3);
            }             
        }
        entrada.close();
    }
}