package tema7;

import java.util.Scanner;

/**
 * UtilArray MEJORA: funciona para cualquier número de asignaturas y alumnos -
 * Sustituir ASIGNATURAS por dato.length (número de filas) - Sustituir ALUMNOS
 * por dato[asignatura].length (número de columnas) ver esquema de la pag. 128
 * del libro java
 */
public class UtilArray {
    //final int ASIGNATURAS = 2;
    //final int ALUMNOS = 3;
    // escribe los valores de un array de dos dimensiones
    public static void escribirNotas(int[][] dato) {
        for(int asignatura = 0; asignatura < dato.length; asignatura++) {
            System.out.print("asignatura-" + asignatura);
            for(int alumno = 0; alumno < dato[asignatura].length; alumno++) {
                System.out.print(" alumno-" + alumno);
                // acceso al array dato, mediante fila y columna
                System.out.print("-->" + dato[asignatura][alumno]);
            }
            System.out.println(); // cambio de línea 
        }
    }

    public static int[][] pedirNotas(int numAsignaturas, int numAlumnos) {
        Scanner entrada = new Scanner(System.in);
        // declaración e inicialización a 0 del array bidimensional
        // numAsignaturas es número de filas y numAlumnos es número de columnas
        int[][] dato = new int[numAsignaturas][numAlumnos];
        // bucle anidado que pide todas las casillas del array bidimensional
        for(int asignatura = 0; asignatura < numAsignaturas; asignatura++) {  
            for(int alumno = 0; alumno < numAlumnos; alumno++) {
                System.out.print("asignatura-" + asignatura);
                System.out.print(" alumno-" + alumno + ": ");
                // pedir cada nota
                dato[asignatura][alumno] = entrada.nextInt();
            }
            System.out.println(); // cambio de línea 
        }
        //entrada.close(); // cerramos la entrada de datos
        return dato; 
        // el tipo que retorna debe coincider con el declardado
        // en nuestro caso int[][]
    }

}