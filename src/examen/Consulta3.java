// Conecta a la base de datos, usando el método conectar()
// hace una consulta a la tabla agenda
// La consulta es un método de LibreriaBD
// - Inserta datos antes de hacer la consulta
// - Dice el número de contactos al final

package examen;

import java.sql.Connection;

public class Consulta3 {
    public static void main(String[] args) {
        Connection conexion = null;
        conexion = LibreriaBD.conectar();
        if (conexion != null) {
            System.out.println("Conectado!");
            LibreriaBD.insertarAgenda(conexion);
            LibreriaBD.consultarAgenda(conexion);
            System.out.println("Total contactos: " + 
                                LibreriaBD.totalContactos(conexion));
        }
    }

}