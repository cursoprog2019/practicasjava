package tema7;

import java.util.Scanner;

/**
 * ArrayMulti Array multidimensionales
 */
public class ArrayMulti {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // declaración donde inicializamos los valores
        // el tamaño va implicito, según el número de valores
        int[][] notas = {{5, 7, 9}, {4, 6, 5}};

        // otra forma de declaración, 
        // donde definimos de tamaño y se inicializa a 0
        int [][] notas2 = new int[2][3];

        // recorrer el array notas2 y mostrarlo por pantalla
        // en filas y columnas
        final int ASIGNATURAS = 2;
        final int ALUMNOS = 3;
        // al recorrer un array el bucle debe ir
        // desde 0 hasta el TAMAÑO - 1
        System.out.println("Array notas");
        for(int asignatura = 0; asignatura < ASIGNATURAS; asignatura++) {
            System.out.print("asignatura-" + asignatura);
            for(int alumno = 0; alumno < ALUMNOS; alumno++) {
                System.out.print(" alumno-" + alumno);
                // acceso al array notas2, mediante fila y columna
                System.out.print("-->" + notas[asignatura][alumno]);
            }
            System.out.println(); // cambio de línea 
        }
        // pedir las notas de todas las asignaturas y de todos alumnos
        System.out.println("Array notas2");
        for(int asignatura = 0; asignatura < ASIGNATURAS; asignatura++) {  
            for(int alumno = 0; alumno < ALUMNOS; alumno++) {
                System.out.print("asignatura-" + asignatura);
                System.out.print(" alumno-" + alumno + ": ");
                // pedir cada nota
                notas2[asignatura][alumno] = entrada.nextInt();
            }
            System.out.println(); // cambio de línea 
        }

        // mostrar las notas2 (por asignatura y por alumno)
        System.out.println("Array notas2");
        for(int asignatura = 0; asignatura < ASIGNATURAS; asignatura++) {
            System.out.print("asignatura-" + asignatura);
            for(int alumno = 0; alumno < ALUMNOS; alumno++) {
                System.out.print(" alumno-" + alumno);
                // acceso al array notas2, mediante fila y columna
                System.out.print("-->" + notas2[asignatura][alumno]);
            }
            System.out.println(); // cambio de línea 
        }


    }

}