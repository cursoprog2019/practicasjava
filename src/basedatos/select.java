package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * select realiza una consulta a la bases de datos
 */
public class select {

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
            ResultSet rs = stmt.executeQuery("SELECT * FROM agenda");
            // 5. Recuperar los resultados ("Vagón de vuelta") 
            while (rs.next()) {
                // usando el indice de columna
                //System.out.println(rs.getString(1) + " - " + rs.getString(2) + " - " + rs.getString(3));
                // usando el nombre de la columna
                System.out.println(rs.getString("codigo") + " - " + rs.getString("nombre") + " - " + rs.getString("telefono"));
            }
            // 6. Cerrar la conexión
            con.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
    }
}