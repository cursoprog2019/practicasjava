package ejercicios2;

import java.util.Scanner;

/**
 * Ejercicio6 
 * Programa que pida que se introduzcan dos números enteros por
 * teclado y muestre todos los números que van desde el menor hasta el mayor
 * de los números introducidos. 
 * Los dos números introducidos deben ser distintos. 
 * Si son iguales se mostrará un mensaje indicandolo
 * y se vuelven a introducir.
 */
public class Ejercicio6 {

    public static void main(String[] args) {

        // leer dos números mientras sean distintos (bucle variable, do-while)
        // ver cual es el menor y el mayor (condicional, if-else)
        // mostrar los números desde el menor al mayor (bucle fijo, for)
        
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        int mayor;
        int menor;
        // leer dos números mientras sean distintos (bucle variable, do-while)
        do {
            System.out.print("Dime un número: ");
            num1 = entrada.nextInt();
            System.out.print("Dime otro número, distinto al anterior: ");
            num2 = entrada.nextInt();
            if (num1 == num2) {
                System.out.println("ERROR: Los números deben ser distintos"); 
            }
        } while (num1 == num2);
        // ver cual es el menor y el mayor (condicional, if-else)
        if (num1 > num2) {
            mayor = num1;
            menor = num2;
        } else {
            mayor = num2;
            menor = num1;
        }
        // mostrar los números desde el menor al mayor (bucle fijo, for)
        System.out.println("Listado de números desde el " + menor 
                            + " hasta el " + mayor);
        for (int i = menor; i <= mayor; i++){
            System.out.println(i);
        }
    }
}