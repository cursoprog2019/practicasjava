package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * conexion Pasos a seguir para conectarnos a un SGBD
 */
public class conexion {

    public static void main(String[] args) {
        // String driver = "oracle.jdbc.driver.OracleDriver" // ORACLE
        String driver = "com.mysql.jdbc.Driver"; // MySQL
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
            Connection con = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conectado");
            // 3. Cerrar la conexión
            con.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
    }
}