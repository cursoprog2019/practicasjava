package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * select2 realiza una consulta a la bases de datos LOCAL
 */
public class select2 {

    public static void main(String[] args) {
        // String driver = "oracle.jdbc.driver.OracleDriver" // ORACLE
        String driver = "com.mysql.cj.jdbc.Driver"; // MySQL
        // String url = "jdbc:oracle:thin:@localhost:1521:xe"; // ORACLE
        //String url = "jdbc:mysql://remotemysql.com:3306/8QznhvYaIi"; // MySQL
        String url = "jdbc:mysql://localhost:3306/practicas"; // MySQL
        // en vez de localhost se puede poner 127.0.0.1
        // NOTA: Para que funcione correctamente hay que añadir ?serverTimezone=UTC 
        // para definir la zona horaria (sólo funciona para esta conexión)
        // si queremos que funcione para el servidor hay que añadir la linea
        // default-time-zone = +00:00
        // en el fichero C:\ProgramData\MySQL\MySQL Server 8.0\my.ini
        // se para el servidor y se vuelve a arrancar
        // estructura de la url: protocolo://servidor:puerto/basedatos
        String usuario = "root";
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