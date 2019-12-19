package tema6;

import java.util.Scanner;

/**
 * Bucles
 */
public class Bucles {

    public static void main(String[] args) {
        // EJERCICIO: Programa que nos pida un número
        // y escriba la tabla de multiplicar de ese número

        // pedir el número
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime número: ");
        int numero = entrada.nextInt();
        // 1.for 
        System.out.println("Tabla de multiplicar del " + numero);
        System.out.println("- FOR -");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero*i) );
        }

        // 2.while
        System.out.println("- WHILE -");



        // 3.do-while
        System.out.println("- DO-WHILE -");

        
    }
}