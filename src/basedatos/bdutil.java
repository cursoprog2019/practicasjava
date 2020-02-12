package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * bdutil: Librería de métodos para gestionar la base de datos
 */
public class bdutil {

    // conexion
    public static Connection conexion() {
        Connection con = null;
        // String driver = "oracle.jdbc.driver.OracleDriver" // ORACLE
        String driver = "com.mysql.cj.jdbc.Driver"; // MySQL
        // String url = "jdbc:oracle:thin:@localhost:1521:xe"; // ORACLE
        String url = "jdbc:mysql://remotemysql.com:3306/8QznhvYaIi"; // MySQL
        // estructura de la url: protocolo://servidor:puerto/basedatos
        String usuario = "8QznhvYaIi";
        String password = "";
        try {
            // 1. Registrar el Driver JDBC
            // (lo carga en tiempo real en la memoria)
            Class.forName(driver);
            // 2. Obtener una conexión
            // Necesitamos url (protocolo,servidor,puerto,base de datos),
            // usuario y contraseña
            con = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conectado");

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
        return con;
    }

    // cerrar conexion
    public static void cerrarConexion(Connection con) {
        try {
            if (con != null) {
                 con.close();
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    // menu
    public static void menu() {
        System.out.println("**************");
        System.out.println("*   AGENDA   *");
        System.out.println("**************");
        System.out.println("1.- ALTA");
        System.out.println("2.- BAJA");
        System.out.println("3.- MODIFICACION");
        System.out.println("4.- CONSULTA");
        System.out.println("9.- SALIR");
        System.out.println("------------");
    }

    // alta
    public static void alta() {

    }
    // baja
    public static void baja() {
        
    }

    // modificacion
    public static void modificacion() {
        
    }

    // consulta
    public static void consulta() {
        
    }

}