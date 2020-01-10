package ejercicios2;

import java.util.Scanner;

/**
 * Ejercicio8 Programa que lea por teclado 10 números enteros y los guarde en un
 * array. A continuación calcula y muestra por separado la media de los valores
 * positivos y la de los valores negativos.
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int positivos = 0;
        int negativos = 0;
        // lectura de datos y rellenar el array
        for (int i = 0; i < 10; i++) {
            System.out.print("Dime número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        // recorrer el array sumando por separado
        // los positivos y los negativos
        for (int i = 0; i < 10; i++) {
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                positivos++;
            } else {
                if (numeros[i] < 0) {
                    sumaNegativos += numeros[i];
                    negativos++;
                }
            }
        }
        // calcular las medias y mostrarlas
        if (positivos != 0) {
            System.out.println("Media de positivos: " + (double)sumaPositivos / positivos);
        } else {
            System.out.println("No hay positivos");
        }
        if (negativos != 0) {
            System.out.println("Media de negativos: " + (double)sumaNegativos / negativos);
        } else {
            System.out.println("No hay negativos");
        }

    }
}