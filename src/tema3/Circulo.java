package tema3;

/**
 * Circulo pag.26
 */
public class Circulo {
    public int x;
    public int y;
    public int radio;
    // el public permite acceder desde otros paquetes

    // pag. 44 añadimos dos métodos de operación
    public static final double PI = 3.1415926536;
    public double calcularPerimetro() {
        return 2 * PI * this.radio;
    }

    public double calcularArea() {
        return PI * this.radio * this.radio;
    }
}