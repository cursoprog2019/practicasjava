package tema6;

/**
 * UsaMatematicas2
 */
public class UsaMatematicas2 {

    public static void main(String[] args) {
        // declaramos un array de int sin inicializar (lo rellena con 0)
        int notas2[] = new int[8];
        System.out.println("Tamaño del array notas2: " + notas2.length);
        System.out.println("Contenido de la primera casilla, notas2[0]: " + notas2[0]);
        // Modificar una de las casillas
        notas2[3] = 7;

        // declaramos un array de int y lo inicializamos con valores
        int notas[] = { 8, 9, 7, 5, 10, 4 };
        // Tamaño del array
        System.out.println("Tamaño del array notas: " + notas.length);
        System.out.println("Contenido de la primera casilla, notas[0]: " + notas[0]);
        // Si accedemos a una posición que no existe
        // se produce una Excepcion (ArrayIndexOutOfBoundsException)
        // System.out.println("Contenido de la casilla 10, notas[9]: " + notas[9]);
    
        // Modificar una de las casillas
        notas[3] = 6;
        System.out.println("Contenido de la cuarta casilla, notas[3] : " + notas[3]);
        System.out.println("Array notas");
        // Recorrer el array notas
        for (int i = 0; i < notas.length; i++ ){
            System.out.println("casilla-" + i + ": " + notas[i]);
        }
        System.out.println("Array notas2");
        // Recorrer el array notas2
        for (int i = 0; i < notas2.length; i++ ){
            System.out.println("casilla-" + i + ": " + notas2[i]);
        }
        // Calcular la media de notas
        double resultado = Matematicas.calcularMedia(notas);
        System.out.println("La media de notas es: " + resultado);
        // Calcular el mínimo y el máximo
        System.out.println("Mínimo: " + Matematicas.calcularMinimo(notas));
        System.out.println("Máximo: " + Matematicas.calcularMaximo(notas));
        // buscar el numero 4
        if (Matematicas.buscar(notas,4) == true) {
            System.out.println("He encontrado el 4");
        } else {
            System.out.println("No he encontrado el 4");
        }
        // buscar el numero 1
        if (Matematicas.buscar(notas,1) == true) {
            System.out.println("He encontrado el 1");
        } else {
            System.out.println("No he encontrado el 1");
        }
        // buscar el numero 7
        if (Matematicas.buscar(notas,7) == true) {
            System.out.println("He encontrado el 7");
        } else {
            System.out.println("No he encontrado el 7");
        }
        // buscar la posición del numero 7
        int posicion = Matematicas.buscar2(notas,7);
        if (posicion >= 0) {
            System.out.println("He encontrado el 7 en la posición " + posicion);
        } else {
            System.out.println("No he encontrado el 7");
        }
        // buscar la posición del numero 1
        posicion = Matematicas.buscar2(notas,1);
        if (posicion >= 0) {
            System.out.println("He encontrado el 1 en la posición " + posicion);
        } else {
            System.out.println("No he encontrado el 1");
        }


    }
}