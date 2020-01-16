package tema7;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numerosDesordenados = { 5, 4, 6, 7, 5, 6, 4, 8, 7, 10 };
        // numerosOrdenados es una copia de numerosDesordenados
        // el método clone() copia del objeto al que se aplica
        int[] numerosOrdenados = numerosDesordenados.clone();
        // si hiciesemos una asgnación sin .clone() 
        // los dos objetos apuntarian donde mismo
        // y al ordenar odena los dos
        // int[] numerosOrdenados = numerosDesordenados;
        System.out.println("\nEl array de números desordenados\n");
        for (int numero : numerosDesordenados)
            System.out.println(numero);
        // el método sort(array-de-datos) de la clase Array ordena
        // ascendentemente todos los elementos de numerosOrdenados
        Arrays.sort(numerosOrdenados);
        System.out.println("\nEl array de números ordenados\n");
        for (int numero : numerosOrdenados)
            System.out.println(numero);
    }
}