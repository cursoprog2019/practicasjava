// Conecta a la base de datos, usando el método conectar()
// hace una consulta a la tabla agenda

package examen;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

// Se conecta a la BD utilizando el método conectar
// de LibreriaBD
public class Consulta {
    public static void main(String[] args) {
        Connection conexion = null;
        conexion = LibreriaBD.conectar();
        if (conexion != null) {
            System.out.println("Conectado!");

            try {

                // 3. Crear objeto Statement ("VAGON")
                Statement stmt = conexion.createStatement();
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
    }

}