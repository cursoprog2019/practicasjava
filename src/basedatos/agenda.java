package basedatos;

import java.sql.Connection;
import java.util.Scanner;

/**
 * agenda
 */
public class agenda {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in,"UTF-8");
        int opcion;
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
                    
                        bdutil.alta();   
                        break;
                    case 2:
                        bdutil.baja();
                        break;
                    case 3:
                        bdutil.modificacion();
                        break;
                    case 4:
                        bdutil.consulta();
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