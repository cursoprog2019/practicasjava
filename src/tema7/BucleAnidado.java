package tema7;

/**
 * BucleAnidado
 */
public class BucleAnidado {

    public static void main(String[] args) {
        final int FILAS = 15;
        final int COLUMNAS = 7;
        for(int fila = 1; fila <= FILAS; fila++) {
            System.out.print("fila-" + fila);
            for(int columna = 1; columna <= COLUMNAS; columna++) {
                System.out.print(" columna-" + columna);
            }
            System.out.println(); // cambio de línea 
        }
    }
}