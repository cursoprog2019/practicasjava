package ejercicios2;

import java.util.Scanner;

/**
 * Ejercicio2 Programa que lea un carácter por teclado y compruebe si es una
 * letra mayúscula
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        // leer caracter de teclado (Scanner)
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime letra: ");
        String cadena = entrada.nextLine();
        // Guardar en letra el primer caracter de cadena
        char letra = cadena.charAt(0);
        // comprobar si es una mayúscula (if-else)
        // mediante el método isUpperCase de la clase Character
        if (Character.isUpperCase(letra)) {
            System.out.println("La letra introducida es mayúscula"); 
        } else {
            System.out.println("La letra introducida no es mayúscula"); 
        }
        // otra forma: mirando si está entre la 'A' y la 'Z'
        if (letra >= 'A' && letra <= 'Z') {
            System.out.println("2.La letra introducida es mayúscula");
        } else {
            System.out.println("2.La letra introducida no es mayúscula");
        }
        // NOTA: no funciona con la Ñ porque no está dentro del ASCII estandar
        entrada.close();
    }
}