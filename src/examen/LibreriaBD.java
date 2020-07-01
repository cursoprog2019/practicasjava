package examen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LibreriaBD {

    public static Connection conectar() {

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://cursosporinternet.es:3306/practicas";
        String usuario = "practicas";
        String password = "";
        Connection conexion = null;
        try {
            // 1.- Registrar el Driver JDBC
            Class.forName(driver);

            // 2.- Obtener una conexión
            conexion = DriverManager.getConnection(url, usuario, password);

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }

        return conexion;

    }

    public static void consultarAgenda(Connection con) {
        try {

            // 3. Crear objeto Statement ("VAGON")
            Statement stmt = con.createStatement();
            // 4. Ejecutar la consulta SQL ("Lanzar vagón")
            String sql = "SELECT * FROM agenda";
            ResultSet rs = stmt.executeQuery(sql);
            // 5. Recuperar los resultados ("Vagón de vuelta")
            while (rs.next()) {
                // usando el índice de columna
                // System.out.println(rs.getString(1) + " - " + rs.getString(2) + " - " +
                // rs.getString(3));
                // usando el nombre de la columna
                System.out.println(
                        rs.getString("codigo") + " - " + rs.getString("nombre") + " - " + rs.getString("telefono"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int siguienteCodigo(Connection con) {
        int siguiente = 0;
        try {
            Statement stmt = con.createStatement();
            String sql = "SELECT MAX(codigo) AS maximo FROM agenda";
            ResultSet rs = stmt.executeQuery(sql);
            rs.next(); // situarse en el primer resultado
            siguiente = rs.getInt("maximo") + 1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return siguiente;
    }

    public static void insertarAgenda(Connection con) {
        try {
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO agenda (codigo,nombre,telefono) " +
                         "VALUES ('" + siguienteCodigo(con) + "','Lorenzo Alfaro','666996677')";
            stmt.executeUpdate(sql);
            System.out.println("Insertado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    public static int totalContactos(Connection con) {
        int total = 0;
        try {
            Statement stmt = con.createStatement();
            String sql = "SELECT COUNT(codigo) AS total FROM agenda";
            ResultSet rs = stmt.executeQuery(sql);
            rs.next(); // situarse en el primer resultado
            total = rs.getInt("total");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return total;
    }


}