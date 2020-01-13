package ejercicios2;

import java.util.Scanner;

/**
 * Ejercicio10 
 * Programa que guarda en un array 10 números enteros 
 * que se leen por teclado. A continuación se recorre el array 
 * y calcula cuántos números son positivos, cuantos negativos 
 * y cuantos ceros
*/
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        // lectura de datos y rellenar el array
        for (int i = 0; i < 10; i++) {
            System.out.print("Dime número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        // recorrer el array contando los positivos,
        // los negativos y los ceros
        for (int i = 0; i < 10; i++) {
            if (numeros[i] > 0) {
                positivos++;
            } else {
                if (numeros[i] < 0) {
                    negativos++;
                } else {
                    ceros++;
                }
            }
        }
        // mostrar el número de positivos, negativos y ceros
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}