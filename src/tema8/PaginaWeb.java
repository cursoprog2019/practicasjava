package tema8;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

/**
 * PaginaWeb
 */
public class PaginaWeb {

    public static void main(String[] args) {
        FileWriter fichero = null;
        PrintWriter salida = null;
        String linea;
        try {
            /******* PREPARAR LECTURA PAGINA WEB ****************/

            // definir la URL a leer ("OPERARIO")
            URL direccion = new URL("http://www.internic.net/");
            
            // abrir la conexión a esa dirección ("EXCAVADORA")
            URLConnection conexion = direccion.openConnection();

            // abrir un canal de entrada para esa conexión ("TUNEL")
            // en este punto se conecta a internet y fallaria si
            // la dirección es incorrecta o no tenemos internet
            InputStream canalEntrada = conexion.getInputStream();

            // crear lector del canal de entrada ("RAILES")
            InputStreamReader entrada = new InputStreamReader(canalEntrada);

            // crear el buffer para esa entrada ("VIA")
            BufferedReader bufferEntrada = new BufferedReader(entrada);

            /****** FICHERO DONDE ESCRIBIMOS LA PAGINA WEB *********/

            // abrir fichero para escritura
            fichero = new FileWriter("/datos/paginaweb.html");
            // abrir canal de escritura en el fichero
            salida = new PrintWriter(fichero);

            // leer la página web
            do {
                linea = bufferEntrada.readLine();
                if (linea != null) {
                    salida.println(linea);
                }
            } while (linea != null);
            
            salida.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }
}