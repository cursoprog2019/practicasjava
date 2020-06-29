package examen;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static void main(String[] args) {
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
            System.out.println("Conectado!");

            // 3.- Cerrar la conexión
            conexion.close();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }

    }
}