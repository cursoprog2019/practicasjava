package tema8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * LibreriaAgenda
 */
public class LibreriaAgenda {
    public static void menu() {
        System.out.println("**************");
        System.out.println("*   AGENDA   *");
        System.out.println("**************");
        System.out.println("1.- Añadir");
        System.out.println("2.- Listar");
        System.out.println("3.- Guardar");
        System.out.println("9.- Salir");
        System.out.println("------------");
    }
    
    public static void AnadirContactos(ArrayList<String> listaContactos, Scanner entrada) {
        String nombre;
        String telefono;
        // pedir todos los datos
        entrada.nextLine();  // leemos el intro que va después de opcion
        System.out.println("* AÑADIR CONTACTO *");
        System.out.print("Nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Teléfono: ");
        telefono = entrada.nextLine();
        System.out.println("---------------");
        // Añadir contacto a la lista
        listaContactos.add(nombre + ": " + telefono);
    }

    public static void ListarContactos(ArrayList<String> listaContactos) {
        System.out.println("* LISTADO DE CONTACTOS *");
        for (int i = 0; i < listaContactos.size(); i++) {
            // recuperar nombre y teléfono de la lista de contactos
            System.out.println(listaContactos.get(i));
        }

    }

	public static void GuardarContactos(ArrayList<String> listaContactos) {
	}

	public static void LeerContactos(ArrayList<String> listaContactos) {
	}


}