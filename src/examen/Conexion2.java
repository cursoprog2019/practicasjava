// idem que Conexion.java pero usando una libreria
package examen;

import java.sql.Connection;

// Se conecta a la BD utilizando el método conectar
// de LibreriaBD
public class Conexion2 {
    public static void main(String[] args) {
        Connection conexion = null;
        conexion = LibreriaBD.conectar();
        if (conexion != null) {
            System.out.println("Conectado!");


        }
    }

}