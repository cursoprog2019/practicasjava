package tema7;

import java.util.Scanner;

/**
 * GestionClientes
 */
public class GestionClientes {

    public static void menu() {
        System.out.println("********************");
        System.out.println("* GESTION CLIENTES *");
        System.out.println("********************");
        System.out.println("1.- Añadir");
        System.out.println("2.- Borrar");
        System.out.println("3.- Listar");
        System.out.println("4.- Salir");
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            menu();
            // pedir opción
            System.out.println("Dime opción: ");
            opcion = entrada.nextInt();
            
        } while (    );
        entrada.close();
    }
}