package tema6;

/**
 * Matematicas
 */
public class Matematicas {

    // método factorial
    // 1. permiso de acceso: normalmente será public
    // 2. ver si es static o no
    // 3. ver si hay que retornar algún valor y de que tipo
    // si no retorna nada hay que poner void
    // 4. nombre que le damos
    // 5. ver que parámetro/s hay que que pasar, su tipo y su nombre
    // puede ser que no necesite parámetros

    public static double factorial(int num) {
        // si el método se declara con void no necesita return
        // pero si le ponemos que retorna algún tipo (int, double,String... )
        // hay que poner una instrucción de return
        // una buena táctica de programación sería:
        // declarar una variable del tipo que retornamos
        // y hacer return de esta variable al final
        double retorno = 1;
        for (int i = 1; i <= num; i++) {
            retorno = retorno * i;
        }
        return retorno;
    }

    // Método calcularMedia
    public static double calcularMedia(int[] lista) {
        double retorno = 0;
        // 1.sumar todos los valores de la lista
        int suma = 0;
        for (int i = 0; i < lista.length; i++) {
            suma = suma + lista[i];
        }
        // 2.dividir el total de la suma por número de elementos
        retorno = (double) suma / lista.length;
        // NOTA: pasamos a double porque sino hace la división entera
        return retorno;
    }

    // Método calcularMinimo
    public static int calcularMinimo(int[] lista) {
        int retorno = 0;
        // suponemos que el mínimo el el primer número de la lista
        int min = lista[0];
        for (int i = 1; i < lista.length; i++) {
            // si el valor de la casilla es menor que el mínimo actual
            // ese valor pasa a ser el nuevo mínimo
            if (lista[i] < min) {
                min = lista[i];
            }
        }
        retorno = min;
        return retorno;
    }

    // Método calcularMáximo
    public static int calcularMaximo(int[] lista) {
        int retorno = 0;
        // suponemos que el máximo el el primer número de la lista
        int max = lista[0];
        for (int i = 1; i < lista.length; i++) {
            // si el valor de la casilla es mayor que el máximo actual
            // ese valor pasa a ser el nuevo máximo
            if (lista[i] > max) {
                max = lista[i];
            }
        }
        retorno = max;
        return retorno;
    }

    // Método buscar
    // devuelve true si lo ha encontrado
    // y false en caso contrario
    public static boolean buscar(int[] lista, int numero) {
        boolean retorno = false;
        // recorrer el array buscando el numero
        // y salirse del bucle cuando lo haya encontrado
        int i = 0;
        do {
            if (lista[i] == numero) {
                // hemos encontrado el numero en la lista
                retorno = true;
            }
            i++;
        } while ( (i < lista.length) && (retorno == false) );

        return retorno;
    }
    // Método buscar
    // Devuelve la posición donde lo ha encontrado
    // y -1 sino lo encuentra
    public static int buscar2(int[] lista, int numero) {
        int retorno = -1;
        // recorrer el array buscando el numero
        // y salirse del bucle cuando lo haya encontrado
        int i = 0;
        do {
            if (lista[i] == numero) {
                // hemos encontrado el numero en la lista
                retorno = i;
            }
            i++;
        } while ( (i < lista.length) && (retorno == -1) );

        return retorno;
    }


}