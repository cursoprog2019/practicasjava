package tema3;

/**
 * Matematicas
 */
public class Matematicas {
    // Atributos
    int num1;
    int num2;
    // Atributo ESTATICO o de clase (común a todos los objetos)
    static double PI = 3.1416;
    // Método constructor
    public Matematicas(int valor1,int valor2) {
        num1 = valor1;
        num2 = valor2;
    }
    // Método de operación normal (NO ESTATICO)
    public int sumar() {
        return num1 + num2;
    }
    // Método de operación ESTATICO
    public static int sumarEstatico(int op1, int op2) {
        // Estamos en un ámbito estático y
        // no podemos utilizar num1 y num2 porque son no estáticos
        // return num1 + num2; (nos daría error)
        int suma = 0;
        suma = op1 + op2;
        return suma;
    }

}