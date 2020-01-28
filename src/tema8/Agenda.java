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
                default:
                    break;
            }

        } while (opcion != 9);
        entrada.close();
    }

}