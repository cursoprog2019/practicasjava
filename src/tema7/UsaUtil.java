package tema7;

import java.util.Scanner;

/**
 * UsaUtil
 */
public class UsaUtil {

    public static void main(String[] args) {
        // pedir número
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime número (0-6): ");
        int numero = entrada.nextInt();
        // llamar al método diaSemana
        String dia = Util.diaSemana(numero);
        // Escribir lo que ha devuelto el método
        if (dia == "") {  // error
            System.out.println("El número debe estar entre 0 y 6");
        } else { // correcto
            System.out.println(numero + ": " + dia);
        }

        // llamar al método diaSemana2
        String dia2 = Util.diaSemana2(numero);
        if (dia2 == "") {  // error
            System.out.println("2.- El número debe estar entre 0 y 6");
        } else { // correcto
            System.out.println("2.- " + numero + ": " + dia2);
        }

        // escribir todos los días de la semana
        // en número y en letra

        // recorrer con un bucle desde 0 a 6
        // y llamar a diaSemana con cada valor
        String dia3;
        System.out.println("Todos los días de la semana:");
        for (int i = 0; i <= 6; i++) {
            dia3 = Util.diaSemana2(i);
            System.out.println(i + ": " + dia3);
        }

    }
}