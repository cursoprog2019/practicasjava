package tema6;

import java.util.Scanner;

/**
 * Adivina
 */
// EJERCICIO: programa que nos pida numeros
// y termine cuando lo acertemos
// MEJORA: Da pistas de si es mayor o menor
// PSEUDOCODIGO: 
//      SECRETO <-- 54
//      REPETIR
//          PEDIR UN NUMERO 
//      MIENTRAS NUMERO "distinto" SECRETO
//      ESCRIBIR "ENHORABUENA: HAS ACERTADO"
//

public class Adivina2 {

    public static void main(String[] args) {
        final int SECRETO = 54;
        int numero;
        Scanner entrada = new Scanner(System.in);
        do {
            // Pedir un número
            System.out.print("Dime número (1-100): ");
            numero = entrada.nextInt();
            if (numero > SECRETO) {
                System.out.println("FALLO: Es menor");
            }
            if (numero < SECRETO) {
                System.out.println("FALLO: Es mayor");
            }
            

        } while (numero != SECRETO);
        // se sale del while cuando no se cumple la condición
        System.out.println("Enhorabuena! Has acertado");

    }
}