package ejercicios2;

import java.util.Scanner;

/**
 * Ejercicio4 Programa que lea por teclado tres números enteros H, M, S
 * correspondientes a hora, minutos y segundos respectivamente, y comprueba si
 * la hora que indican es una hora válida.
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // leer Hora
        System.out.print("Dime Hora: ");
        int hora = entrada.nextInt();
        // leer Minutos
        System.out.print("Dime Minutos: ");
        int minutos = entrada.nextInt();
        // leer Segundos
        System.out.print("Dime Segundos: ");
        int segundos = entrada.nextInt();
        // comprobar que la hora, minutos y segundos son válidos 
        // hora debe estar entre 0 (incluido) y 24 (excluido)
        // minutos debe estar entre 0 (incluido) y 60 (excluido)
        // segundos debe estar entre 0 (incluido) y 60 (excluido)
        // PSEUDOCODIGO
        // si ( hora está entre 0 y 24 y los minutos entre 0 y 60,
        //      y los segundos entre 0 y 60  )
        //  escribir "Hora válida"
        // sino
        //  escribir "Hora no válida"
        if (hora >= 0 && hora < 24 && 
            minutos >= 0 && minutos < 60 && 
            segundos >= 0 && segundos < 60) {

            System.out.print("Hora válida");  
        } else {
            System.out.print("Hora no válida");  
        }
    }
}