package tema8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Agenda
 */
public class Agenda {

    public static void main(String[] args) {
        ArrayList<String> listaContactos = new ArrayList<String>();
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String filtro;
        int numero;
        char respuesta;
        // leer los contactos del fichero contactos.txt
        LibreriaAgenda.LeerContactos(listaContactos);
        do {
            LibreriaAgenda.menu();
            // pedir opción
            System.out.print("Dime opción: ");
            opcion = entrada.nextInt();
            //
            switch (opcion) {
                case 1:
                    LibreriaAgenda.AnadirContactos(listaContactos,entrada);   
                    break;
                case 2:
                    LibreriaAgenda.ListarContactos(listaContactos);
                    break;
                case 3:
                    LibreriaAgenda.GuardarContactos(listaContactos);
                    break;
                case 4:
                    filtro = entrada.nextLine(); // lee el intro 
                    System.out.print("Contacto a buscar: ");
                    filtro = entrada.nextLine();
                    LibreriaAgenda.BuscarContactos(listaContactos, filtro);
                    break;
                case 5:
                    LibreriaAgenda.ListarContactos(listaContactos);
                    System.out.print("Número de contacto a borrar: ");
                    numero = entrada.nextInt(); 
                    LibreriaAgenda.BorrarContactos(listaContactos, numero);
                    break;
                default:
                    break;
            }

        } while (opcion != 9);
        if (LibreriaAgenda.hayCambios) {
            entrada.nextLine(); // lee el intro que se ha quedado en la entrada
            System.out.println("Hay cambios pendientes de guardar");
            System.out.print("Guardar (S/N): ");
            // utilizamos next() porque hasta que no escribimos algo
            // no acepta el intro y recupera la primera palabra
            // lo pasamos a mayúsculas para comparar sólo con 'S'
            // y recuperamos el primer caracter del String con charAt(0)
            respuesta = entrada.next().toUpperCase().charAt(0);
            if (respuesta == 'S') { // comillas simples, porque es un caracter
                LibreriaAgenda.GuardarContactos(listaContactos);
            }
        }
        entrada.close();
    }

}