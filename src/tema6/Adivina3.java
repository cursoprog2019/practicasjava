package tema6;

import java.util.Scanner;

/**
 * Adivina
 */
// EJERCICIO: programa que nos pida numeros
// y termine cuando lo acertemos
// MEJORA1: Da pistas de si es mayor o menor
// MEJORA2: El número SECRETO lo genera el programa
// MEJORA3: Nos diga el número de intentos que llevamos 
// MEJORA4: Limitar el número de intentos 
// PSEUDOCODIGO: 
//      SECRETO <-- 54
//      REPETIR
//          PEDIR UN NUMERO 
//      MIENTRAS NUMERO "distinto" SECRETO
//      ESCRIBIR "ENHORABUENA: HAS ACERTADO"
//

public class Adivina3 {

    public static void main(String[] args) {
        // Número de intentos máximo
        final int MAX_INTENTOS = 6;
        // Generar número aleatorio entre 1 y 100
        int SECRETO = (int) (Math.random() * 100 + 1);
        //System.out.println("SECRETO: " + SECRETO);
        int numero;
        int intentos = 1;
        Scanner entrada = new Scanner(System.in);
        do {
            // Pedir un número
            System.out.print("Dime número (1-100) intento " + intentos + ": ");
            numero = entrada.nextInt();
            if (numero > SECRETO) {
                System.out.println("FALLO: Es menor");
            }
            if (numero < SECRETO) {
                System.out.println("FALLO: Es mayor");
            }
            intentos++;

        } while (numero != SECRETO && intentos <= MAX_INTENTOS);
        // se sale del while cuando no se cumple la condición
        if (numero == SECRETO) {
            System.out.println("Enhorabuena! Has acertado");
        } else {
            System.out.println("Número de intentos agotado");
        }

    }
}