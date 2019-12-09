package tema3;

/**
 * Matematicas
 */
public class Matematicas {

    int num1;
    int num2;
    // Método constructor
    public Matematicas(int valor1,int valor2) {
        num1 = valor1;
        num2 = valor2;
    }
    // Método de operación
    public int sumar() {
        return num1 + num2;
    }
}