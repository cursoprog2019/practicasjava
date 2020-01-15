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
        int [][] notas3 = new int[3][5];
        int numAsignaturas;
        int numAlumnos ;
        //
        System.out.println("Array notas");
        UtilArray.escribirNotas(notas);
        //
        /*
        System.out.println("Array notas2");
        notas2 = UtilArray.pedirNotas(2,3);
        UtilArray.escribirNotas(notas2);
        */
        //
        /*
        System.out.println("Array notas3");
        notas3 = UtilArray.pedirNotas(3,5);
        UtilArray.escribirNotas(notas3);
        */
        //
        System.out.println("Array notas4");
        System.out.print("Dime número de asignaturas: ");
        numAsignaturas = entrada.nextInt();
        System.out.print("Dime número de alumnos: "); 
        numAlumnos = entrada.nextInt();
        int[][] notas4 = new int[numAsignaturas][numAlumnos];
        notas4 = UtilArray.pedirNotas(numAsignaturas,numAlumnos);
        UtilArray.escribirNotas(notas4);
    }

}