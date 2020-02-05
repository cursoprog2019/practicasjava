package tema8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 * crearDirectorios_v2 Crear una estructura de carpetas variable que se lee de
 * un fichero estructura.txt Comprobamos si existe el fichero o no
 */
public class crearDirectorios_v2 {

    public static void main(String[] args) {
        // PLANTEAMIENTO DEL PROBLEMA. Pasos a seguir:
        // 1º leer el fichero estructura.txt y escribir por pantalla cada línea
        // 2º por cada línea leida crear una carpeta
        // Hay que tener en cuenta que si los métodos provocan excepciones
        // debemos utilizar un try-catch
        final String CARPETA_DATOS = "/datos";
        final String FICHERO_CONFIGURACION = CARPETA_DATOS + "/estructura.txt";
        Scanner entradaTeclado = new Scanner(System.in);
        FileReader fichero = null;
        BufferedReader entrada = null;
        String linea;
        File carpeta;
        String anno;
        try {
            fichero = new FileReader(FICHERO_CONFIGURACION);
            entrada = new BufferedReader(fichero);
            System.out.print("Dime año: ");
            anno = entradaTeclado.nextLine();
            // crear carpeta del año
            carpeta = new File(CARPETA_DATOS + "/" + anno);
            carpeta.mkdir();         
            do {
                linea = entrada.readLine();
                if (linea != null) {
                    System.out.print("Creando carpeta " + linea);
                    // crear una carpeta por cada linea (2º paso)
                    carpeta = new File(CARPETA_DATOS + "/" + anno + "/" + linea);
                    // comprobando si la carpeta se crea correctamente
                    // daría error si el camino no es correcto o ya exista
                    if (carpeta.mkdir()) {
                        System.out.println(" - OK");
                    } else {
                        System.out.println(" - ERROR");
                    }
                }
            } while (linea != null);
            
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        entradaTeclado.close();

    }
}