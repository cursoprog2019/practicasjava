package tema8;

import java.io.File;
import java.util.Scanner;

/**
 * crearDirectorios
 * crea una estructura de carper
 */
public class crearDirectorios {

    public static void main(String[] args) {
        final String CARPETA_DATOS = "/datos";
        Scanner entrada = new Scanner(System.in);
        String anno;
        File carpeta;
        // pedir año
        System.out.print("Dime año: ");
        anno = entrada.nextLine();
        System.out.println("Creando carpetas ...");
        // crear carpeta para el año
        carpeta = new File(CARPETA_DATOS + "/" + anno);
        carpeta.mkdir();
        // crear carpetas dentro de la del año
        // clientes, proveedores, albaranes, facturas
        carpeta = new File(CARPETA_DATOS + "/" + anno + "/clientes");
        carpeta.mkdir();
        carpeta = new File(CARPETA_DATOS + "/" + anno + "/proveedores");
        carpeta.mkdir();
        carpeta = new File(CARPETA_DATOS + "/" + anno + "/albaranes");
        carpeta.mkdir();
        carpeta = new File(CARPETA_DATOS + "/" + anno + "/facturas");
        carpeta.mkdir();
        //
        System.out.println("Carpetas creadas.");
    }
}