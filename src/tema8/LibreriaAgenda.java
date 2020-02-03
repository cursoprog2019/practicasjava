package tema8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * LibreriaAgenda
 */
public class LibreriaAgenda {

    private static final String NOMBRE_FICHERO = "/datos/contactos.txt";
    // Declaramos una variable "chivato" para controlar cuando hay cambios
    // Se inicializa a false y se pondría true cuando añadimos o borramos
    // Se pone otra vez a false cuando guardemos
    // La utilizamos para avisar si ha habido cambios cuando salimos
    public static boolean hayCambios = false;

    public static void menu() {
        System.out.println("**************");
        System.out.println("*   AGENDA   *");
        System.out.println("**************");
        System.out.println("1.- Añadir");
        System.out.println("2.- Listar");
        if (hayCambios) {
            System.out.println("3.- Guardar*");
        } else {
            System.out.println("3.- Guardar");
        }
        System.out.println("4.- Buscar");
        System.out.println("5.- Borrar");
        System.out.println("9.- Salir");
        System.out.println("------------");
    }

    public static void AnadirContactos(ArrayList<String> listaContactos, Scanner entrada) {
        String nombre;
        String telefono;
        // pedir todos los datos
        entrada.nextLine(); // leemos el intro que va después de opcion
        System.out.println("* AÑADIR CONTACTO *");
        System.out.print("Nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Teléfono: ");
        telefono = entrada.nextLine();
        System.out.println("---------------");
        // Añadir contacto a la lista
        listaContactos.add(nombre + ": " + telefono);
        hayCambios = true;
    }

    public static void ListarContactos(ArrayList<String> listaContactos) {
        System.out.println("* LISTADO DE CONTACTOS *");
        for (int i = 0; i < listaContactos.size(); i++) {
            // recuperar nombre y teléfono de la lista de contactos
            System.out.println( (i+1) + ".- " + listaContactos.get(i));
        }
    }

    public static void GuardarContactos(ArrayList<String> listaContactos) {
        FileWriter fichero = null;
        PrintWriter salida = null;
        System.out.println("Guardando contactos...");
        try {
            // crear el fichero
            fichero = new FileWriter(NOMBRE_FICHERO, false);
            // abrir un canal de salida al fichero
            salida = new PrintWriter(fichero);
            for (int i = 0; i < listaContactos.size(); i++) {
                // escribir contacto en el canal de salida (fichero)
                // ArrayList --> Fichero
                salida.println(listaContactos.get(i));
            }
            // cerrar fichero
            fichero.close();
            System.out.println("Contactos guardados");
            // reseteamos la variable que nos avisa de los cambios
            hayCambios = false;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static void LeerContactos(ArrayList<String> listaContactos) {
        FileReader fichero = null;
        BufferedReader entrada = null;
        String linea;
        try {
            // abrir el fichero para lectura
            fichero = new FileReader(NOMBRE_FICHERO);
            // abrir un canal de lectura para el fichero
            entrada = new BufferedReader(fichero);
            // leer lineas del canal entrada
            System.out.println("Cargando contactos...");
            do {
                linea = entrada.readLine();
                if (linea != null) {
                    // System.out.println(linea);
                    // Fichero --> ArrayList
                    listaContactos.add(linea);
                }
            } while (linea != null);
            fichero.close();
            System.out.println("Contactos cargados");
        } catch (Exception e) { // Exception es la más general de las excepciones
                                // Aqui salta cuando se produce cualquier excepción
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static void BuscarContactos(ArrayList<String> listaContactos, String filtro) {
        String contacto;
        boolean encontrado = false; // suponemos que no lo ha encontrado
        System.out.println("* CONTACTOS ENCONTRADOS *");
        for (int i = 0; i < listaContactos.size(); i++) {
            // mostrar solamente los que cumplan con el filtro
            contacto = listaContactos.get(i);
            if (contacto.toUpperCase().contains(filtro.toUpperCase())) {
                // si contacto contiene la cadena filtro
                // antes pasamos contacto y filtro a mayúsculas
                // para evitar que sea sensible a mayúsculas/minúsculas
                System.out.println(contacto);
                encontrado = true; // lo ha encontrado
            } 
        }
        if (!encontrado) { // entra si encontrado sigue a false
            System.out.println(filtro + " no encontrado");
        }
    }

    public static void BorrarContactos(ArrayList<String> listaContactos, int numero) {
        listaContactos.remove(numero-1);
        System.out.println("Contacto número " + numero + " borrado");
        hayCambios = true;
    }

}