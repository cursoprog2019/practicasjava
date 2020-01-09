package ejercicios2;

import java.util.Scanner;

/**
 * Ejercicio5 FASE 1: ESPECIFICACION DE REQUISITOS (REUNIONES CON CLIENTE)
 * Programa que lea una variable entera mes y compruebe si el valor corresponde
 * a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene 28 días. Se
 * mostrará además el nombre del mes. Se debe comprobar que el valor introducido
 * esté comprendido entre 1 y 12.
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        // FASE 2: DISEÑO (PSEUDOCODIGO)
        // FASE 3: IMPLEMENTACION (LENGUAJE DE PROGRAMACION)
        // pedir el número de mes (Scanner)
        String mesTexto = "";
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime mes: ");
        int mes = entrada.nextInt();
        // comprobar que sea correcto, que esté entre 1-12
        // (if-else)
        if (mes < 1 || mes > 12) {
            System.out.print("Mes incorrecto");
        } else { // mes correcto
            // Mostrar el nombre del mes (switch)
            switch (mes) {
            case 1:
                mesTexto = "Enero";
                break;
            case 2:
                mesTexto = "Febrero";
                break;
            case 3:
                mesTexto = "Marzo";
                break;
            case 4:
                mesTexto = "Abril";
                break;
            case 5:
                mesTexto = "Mayo";
                break;
            case 6:
                mesTexto = "Junio";
                break;
            case 7:
                mesTexto = "Julio";
                break;
            case 8:
                mesTexto = "Agosto";
                break;
            case 9:
                mesTexto = "Septiembre";
                break;
            case 10:
                mesTexto = "Octubre";
                break;
            case 11:
                mesTexto = "Noviembre";
                break;
            case 12:
                mesTexto = "Diciembre";
                break;
            default:
                break;
            }
            System.out.print(mesTexto);
            // Mostrar el número de días que tiene, 28, 30 o 31
            // (if-else anidado)
            // meses con 30 dias: abril, junio, septiembre y noviembre
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                System.out.println(" es un mes con 30 días");
            } else {
                if (mes == 2) {
                    System.out.println(" es un mes con 28 días");
                } else {
                    System.out.println(" es un mes con 31 días");
                }
            }
        }
    }
}