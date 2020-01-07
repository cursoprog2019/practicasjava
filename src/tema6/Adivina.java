package tema6;

import java.util.Scanner;

/**
 * Adivina
 */
// EJERCICIO: programa que nos pida numeros
// y termine cuando lo acertemos
// PSEUDOCODIGO: 
//      SECRETO <-- 54
//      REPETIR
//          PEDIR UN NUMERO 
//      MIENTRAS NUMERO "distinto" SECRETO
//      ESCRIBIR "ENHORABUENA: HAS ACERTADO"
//

public class Adivina {

    public static void main(String[] args) {
        final int SECRETO = 54;
        int numero;
        Scanner entrada = new Scanner(System.in);
        do {
            // Pedir un número
            System.out.print("Dime número(1-100): ");
            numero = entrada.nextInt();
        } while (numero != SECRETO);
        // se sale del while cuando no se cumple la condición
        System.out.println("Enhorabuena! Has acertado");

    }
}