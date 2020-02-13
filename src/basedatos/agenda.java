package basedatos;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * agenda: gestión de una agenda de contactos
 * alta, baja, modificación y consulta
 * - Hace uso de la libreria bdutil.java
 * - Vamos a separar la presentación de datos de la lógica del programa
 * - Aprovechamos la POO para encapsular los datos y pasarlos como parámetros
 *   Creamos una clase llamada Contacto
 * - No implementamos el tema de internacionalización (i18n)
 */
public class agenda {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in,"UTF-8");
        int opcion;
        //
        ArrayList<Contacto> listaContactos;
        Contacto contacto;
        // abrir conexión a la base de datos
        Connection con = bdutil.conexion();
        if (con != null) {
            System.out.println("Todo correcto");
            do {
                bdutil.menu();
                // pedir opción
                System.out.print("Dime opción: ");
                opcion = entrada.nextInt();
                //
                switch (opcion) {
                    case 1:
                        contacto = bdutil.pedirContacto(entrada);
                        bdutil.alta(con,contacto);   
                        break;
                    case 2:
                        bdutil.baja();
                        break;
                    case 3:
                        bdutil.modificacion();
                        break;
                    case 4:
                        listaContactos = bdutil.consulta(con); // LOGICA
                        bdutil.escribirResultados(listaContactos); // PRESENTACIÓN
                        break;
                    default:
                        break;
                }
    
            } while (opcion != 9);
            
         

        } else {
            System.out.println("Error al conectar a la base de datos");
        }
        // cerramos la conexión a la BD
        bdutil.cerrarConexion(con);
    }
}