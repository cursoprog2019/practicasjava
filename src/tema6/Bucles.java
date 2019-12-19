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

        System.out.println("- FOR otra manera -");
        // es prácticamente idéntico a un while
        int i = 1;
        for ( ; i <= 10;) {
            System.out.println(numero + " x " + i + " = " + (numero*i) );
            i++;
        }

        // 2.while
        System.out.println("- WHILE -");
        i = 1;
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero*i) );
            i++;
        }

        // 3.do-while
        System.out.println("- DO-WHILE -");
        i = 1;
        do {
            System.out.println(numero + " x " + i + " = " + (numero*i) );
            i++;
        } while (i <= 10);

        
    }
}