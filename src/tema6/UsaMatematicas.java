package tema6;

/**
 * UsaMatematicas
 */
public class UsaMatematicas {

    public static void main(String[] args) {
        // pedir el número
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime número: ");
        int numero = entrada.nextInt();

        System.out.println("Factorial de " + numero + ": " + Matematicas.factorial(numero));
    }
}