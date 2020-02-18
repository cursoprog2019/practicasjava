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
        int codigo = contacto.getCodigo();
        String nombre = contacto.getNombre();
        String telefono = contacto.getTelefono();
        String sql;
        try {
            // 3. Crear objeto Statement ("VAGON")
            Statement stmt = con.createStatement();
            // 4. Ejecutar la consulta SQL ("Lanzar el vagón por el tunel")
            sql = "INSERT INTO agenda (codigo,nombre,telefono) VALUES ('" + codigo + "','" + nombre + "','" + telefono
                    + "')";
            stmt.executeUpdate(sql);
            System.out.println("Contacto insertado");

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

    // baja
    public static void baja(Connection con, int codigo) {
        String sql;
        try {
            // 3. Crear objeto Statement ("VAGON")
            Statement stmt = con.createStatement();
            // 4. Ejecutar la consulta SQL ("Lanzar el vagón por el tunel")
            sql = "DELETE FROM agenda WHERE codigo = '" + codigo + "'";
            if (stmt.executeUpdate(sql) > 0) {
                System.out.println("Contacto borrado");
            } else {
                System.out.println("Contacto no encontrado");
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

    // modificacion
    public static void modificacion(Connection con, Contacto contacto) {
        int codigo = contacto.getCodigo();
        String nombre = contacto.getNombre();
        String telefono = contacto.getTelefono();
        String sql;
        try {
            // 3. Crear objeto Statement ("VAGON")
            Statement stmt = con.createStatement();
            // 4. Ejecutar la consulta SQL ("Lanzar el vagón por el tunel")
            if (!nombre.isEmpty()) {
                sql = "UPDATE agenda SET nombre = '" + nombre + "' WHERE codigo = '" + codigo + "'";
                if (stmt.executeUpdate(sql) > 0) {
                    System.out.println("Nombre modificado");
                }
            }
            if (!telefono.isEmpty()) {
                sql = "UPDATE agenda SET telefono = '" + telefono + "' WHERE codigo = '" + codigo + "'";
                if (stmt.executeUpdate(sql) > 0) {
                    System.out.println("Teléfono modificado");
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

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
                // System.out.println(rs.getString("codigo") + " - " + rs.getString("nombre") +
                // " - " + rs.getString("telefono"));
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
        // System.out.println("escribirResultados");
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
        Contacto resultado = null;
        int codigo;
        String nombre;
        String telefono;
        // pedir todos los datos
        entrada.nextLine(); // leemos el intro que va después de opcion
        System.out.print("Código: ");
        codigo = entrada.nextInt();
        entrada.nextLine(); // leemos el intro que va después de código
        System.out.print("Nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Teléfono: ");
        telefono = entrada.nextLine();
        System.out.println("---------------");
        // Crear el objeto de tipo Contacto
        resultado = new Contacto(codigo, nombre, telefono);
        return resultado;
    }

    public static int pedirCodigo(Scanner entrada) {
        int resultado = 0;
        // pedir el código
        entrada.nextLine(); // leemos el intro que va después de opcion
        System.out.println("* BAJA CONTACTO *");
        System.out.print("Código: ");
        resultado = entrada.nextInt();
        return resultado;
    }

	public static boolean existeCodigo(Connection con, int codigo) {
        boolean resultado = false;
        String sql;
        try {
            // El "TUNEL" ya lo tenemos, que es la variable "con"
            // 1. Crear objeto Statement ("VAGON")
            Statement stmt = con.createStatement();
            // 2. Ejecutar la consulta SQL ("Lanzar el vagón por el tunel")
            sql = "SELECT * FROM agenda WHERE codigo = '" + codigo + "'"; 
            ResultSet rs = stmt.executeQuery(sql);
            // 3. Recuperar los resultados ("Vagones de vuelta")
            if (rs.next()) { // devuelve al menos una fila
               resultado = true;
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }    
		return resultado;
	}

}