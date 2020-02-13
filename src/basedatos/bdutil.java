package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * bdutil: Librería de métodos para gestionar la base de datos
 */
public class bdutil {

    // conexion
    public static Connection conexion() {
        Connection con = null;
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
            // 2. Obtener una conexión
            // Necesitamos url (protocolo,servidor,puerto,base de datos),
            // usuario y contraseña
            con = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conectado");

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
        return con;
    }

    // cerrar conexion
    public static void cerrarConexion(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    // menu
    public static void menu() {
        System.out.println("**************");
        System.out.println("*   AGENDA   *");
        System.out.println("**************");
        System.out.println("1.- ALTA");
        System.out.println("2.- BAJA");
        System.out.println("3.- MODIFICACION");
        System.out.println("4.- CONSULTA");
        System.out.println("9.- SALIR");
        System.out.println("------------");
    }

    // alta
    public static void alta(Connection con, Contacto contacto) {

    }

    // baja
    public static void baja() {

    }

    // modificacion
    public static void modificacion() {

    }

    // consulta
    public static ArrayList<Contacto> consulta(Connection con) {
        // parecido a select.java pero guardando los resultados en un ArrayList
        System.out.println("** CONSULTA **");
        ArrayList<Contacto> resultado = new ArrayList<Contacto>();
        int codigo;
        String nombre;
        String telefono;
        Contacto contacto;
        try {
            // El "TUNEL" ya lo tenemos, que es la variable "con"
            // 1. Crear objeto Statement ("VAGON")
            Statement stmt = con.createStatement();
            // 2. Ejecutar la consulta SQL ("Lanzar el vagón por el tunel")
            ResultSet rs = stmt.executeQuery("SELECT * FROM agenda");
            // 3. Recuperar los resultados ("Vagones de vuelta")
            while (rs.next()) {
                // usando el nombre de la columna
                //System.out.println(rs.getString("codigo") + " - " + rs.getString("nombre") + " - " + rs.getString("telefono"));
                // crear un objeto de tipo Contacto
                codigo = rs.getInt("codigo");
                nombre = rs.getString("nombre");
                telefono = rs.getString("telefono");
                contacto = new Contacto(codigo, nombre, telefono);
                // añadir el objeto al ArrayList resultado
                resultado.add(contacto);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return resultado;
    }

    public static void escribirResultados(ArrayList<Contacto> listaContactos) {
        // recorrer el ArrayList y escribirlo por pantalla
        //System.out.println("escribirResultados");
        int codigo;
        String nombre;
        String telefono;
        Contacto contacto;
        for (int i = 0; i < listaContactos.size(); i++) {
            contacto = listaContactos.get(i);
            codigo = contacto.getCodigo();
            nombre = contacto.getNombre();
            telefono = contacto.getTelefono();
            System.out.println(codigo + ": " + nombre + " --> " + telefono);
        }
    }

	public static Contacto pedirContacto(Scanner entrada) {
		return null;
	}

}