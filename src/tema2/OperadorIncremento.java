package tema2;

/**
 * OperadorIncremento
 * pag. 179
 */
public class OperadorIncremento {

    public static void main(String[] args) {
        // El resultado final de a es el mismo en ambos casos, pero
        // Si el incremento va detrás, primero usa a y después incrementa
        // Si el incrimento va delante, primero incrementa y después usa a
        int a = 1;
        System.out.println("Valor inicial de a: " + a);
        System.out.println("Incremento detrás: " + (a++) );
        System.out.println("Valor a: " + a);
        // Volver al estado inicial de a
        a = 1;
        System.out.println("Valor inicial de a: " + a);
        System.out.println("Incremento delante: " + (++a) );
        System.out.println("Valor a: " + a);
    }
}