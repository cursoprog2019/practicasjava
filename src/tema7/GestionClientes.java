package tema7;

import java.util.ArrayList;
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

    private static void AnadirCliente(ArrayList<Cliente> listaClientes, Scanner entrada) {
        String nif;
        String nombre;
        String apellidos;
        int edad;
        int posicion;
        Cliente cliente;  // Cliente es la clase y cliente es el objeto
        // pedir todos los datos
        entrada.nextLine();  // leemos el intro que va después de opcion
        System.out.println("* AÑADIR CLIENTE *");
        System.out.print("NIF: ");
        nif = entrada.nextLine();
        System.out.print("Nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Apellidos: ");
        apellidos = entrada.nextLine();
        System.out.print("Edad: ");
        edad = entrada.nextInt();
        System.out.println("---------------");
        System.out.print("Posición (0 para insertar al principio): ");
        posicion = entrada.nextInt();
        // crear el objeto de tipo cliente
        cliente = new Cliente(nif,nombre,apellidos,edad);
        // Añadir cliente a la lista
        listaClientes.add(posicion,cliente);
    }
  
    private static void BorrarCliente(ArrayList<Cliente> listaClientes, Scanner entrada) {
        int posicion;
        System.out.println("* BORRAR CLIENTE *");
        // pedir posición
        System.out.print("Posición a borrar: ");
        posicion = entrada.nextInt();
        // borrar
        listaClientes.remove(posicion);
    }

    private static void ListarClientes(ArrayList<Cliente> listaClientes) {
        Cliente cliente;
        System.out.println("* LISTADO DE CLIENTES *");
        for (int i = 0; i < listaClientes.size(); i++) {
            // recuperar un objeto de la lista de clientes
            cliente = listaClientes.get(i);
            System.out.print(i + ".- ");
            System.out.println(cliente.getAtributos());
        }

    }

    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            menu();
            // pedir opción
            System.out.print("Dime opción: ");
            opcion = entrada.nextInt();
            //
            switch (opcion) {
                case 1:
                    AnadirCliente(listaClientes,entrada);   
                    ListarClientes(listaClientes);
                    break;
                case 2:
                    BorrarCliente(listaClientes,entrada);
                    ListarClientes(listaClientes);
                    break;
                case 3:
                    ListarClientes(listaClientes);
                    break;
                default:
                    break;
            }

        } while (opcion != 4);
        entrada.close();
    }

 
}