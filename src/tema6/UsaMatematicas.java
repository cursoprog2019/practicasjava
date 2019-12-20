package tema6;

import java.util.Scanner;

/**
 * UsaMatematicas
 * EJEMPLO DE BUCLE FIJO (FOR)
 */
public class UsaMatematicas {

    public static void main(String[] args) {
        // pedir el número
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime número: ");
        int numero = entrada.nextInt();
        // calcular el factorial
        double resultado = Matematicas.factorial(numero);
        System.out.println("Factorial de " + numero + ": " + resultado);

        // EJERCICIO: Escribir los factoriales desde 1 hasta 175
        for (int i = 1; i <= 175; i++) {
            resultado = Matematicas.factorial(i);
            System.out.println("Factorial de " + i + ": " + resultado);            
        }

    }
}