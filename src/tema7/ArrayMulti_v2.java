package tema7;

import java.util.Scanner;

/**
 * ArrayMulti Array multidimensionales
 */
public class ArrayMulti_v2 {

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
        // al recorrer un array el bucle debe ir
        // desde 0 hasta el TAMAÑO - 1
        System.out.println("Array notas");
        UtilArray.escribirNotas(notas);
        // pedir las notas de todas las asignaturas y de todos alumnos
        System.out.println("Array notas2");
        UtilArray.pedirNotas(notas2);
        // mostrar las notas2 (por asignatura y por alumno)
        UtilArray.escribirNotas(notas2);
    }

}