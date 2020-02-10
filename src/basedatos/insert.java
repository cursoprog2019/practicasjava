package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * insert: realiza un alta en la bases de datos
 */
public class insert {

    public static void main(String[] args) {
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
            // 2. Obtener una conexión ("TUNEL")
            // Necesitamos url (protocolo,servidor,puerto,base de datos),
            // usuario y contraseña
            Connection con = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conectado");
            // 3. Crear objeto Statement ("VAGON")
            Statement stmt = con.createStatement();
            // 4. Ejecutar la consulta SQL ("Lanzar el vagón por el tunel")
            stmt.executeUpdate("INSERT INTO agenda (codigo,nombre,telefono) VALUES ('5','Lorenzo Alfaro','666996677')");
            System.out.println("Insertado");
            // 5. Cerrar la conexión
            con.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
    }
}