// Conecta a la base de datos, usando el método conectar()
// hace una consulta a la tabla agenda
// La consulta es un método de LibreriaBD

package examen;

import java.sql.Connection;

// Se conecta a la BD utilizando el método conectar
// de LibreriaBD
public class Consulta2 {
    public static void main(String[] args) {
        Connection conexion = null;
        conexion = LibreriaBD.conectar();
        if (conexion != null) {
            System.out.println("Conectado!");
            LibreriaBD.consultarAgenda(conexion);
        }
    }

}