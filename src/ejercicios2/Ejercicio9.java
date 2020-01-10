package ejercicios2;

/**
 * Ejercicio9
 * Programa que crea un array de 20 elementos llamado pares
 * y guarde los 20 primeros números pares. 
 * Mostrar por pantalla el contenido del array creado. 
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        int[] pares = new int[20];
        int contador = 2;
        // rellenar con números pares
        for (int i = 0; i < pares.length; i++) {
            pares[i] = contador;
            contador += 2;
        }
        // mostrar el array
        System.out.println("Primeros 20 números pares:");
        for (int i = 0; i < pares.length; i++) {
            System.out.println(pares[i]);
        }
    }
}