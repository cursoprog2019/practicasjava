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
        int codigo;
        // abrir conexión a la base de datos
        Connection con = bdutil.conexion();
        if (con != null) {
            System.out.println("Todo correcto");
            do {
                bdutil.menu();
                // pedir opción
                System.out.print("Dime opción: ");
                opcion = entrada.nextInt();
                // por si acaso se desconecta por timeout
                if (con == null) {
                    con = bdutil.conexion(); 
                }
                //
                switch (opcion) {
                    case 1: // ALTA
                        contacto = bdutil.pedirContacto(entrada); // PRESENTACION
                        bdutil.alta(con,contacto);                // LOGICA 
                        break;
                    case 2: // BAJA
                        codigo = bdutil.pedirCodigo(entrada);   // PRESENTACION
                        bdutil.baja(con,codigo);                // LOGICA
                        break;
                    case 3: // MODIFICACION
                        contacto = bdutil.pedirContacto(entrada); // PRESENTACION
                        bdutil.modificacion(con,contacto);
                        break;
                    case 4: // CONSULTA
                        listaContactos = bdutil.consulta(con);      // LOGICA
                        bdutil.escribirResultados(listaContactos);  // PRESENTACIÓN
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