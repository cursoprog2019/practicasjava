package tema3;

/**
 * Sobrecarga
 * pag. 53-54
 */
public class Sobrecarga {
    // atributos
    int num1;
    int num2;
    int num3;
    // métodos constructores
    public Sobrecarga(int num1, int num2) {
        // this.num1 es el atributo num1 de "este" objeto
        // num1 es el parámetro que le pasamos al constructor
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = 0;
    }
    // sobrecargamos el método Sobrecarga poniendole tres parámetros
    public Sobrecarga(int num1, int num2,int num3) {
        // this.num1 es el atributo num1 de "este" objeto
        // num1 es el parámetro que le pasamos al constructor
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    // métodos de operación
    public int sumar() {
        return num1 + num2;
    }
    // sobrecargamos el método poniendole un parámetro de tipo String
    public int sumar(String tipo) {
        if (tipo == "dos") {
            return num1 + num2;
        }
        if (tipo == "tres") {
            return num1 + num2 + num3;
        }
        return 0;
    }
    // sobrecargamos el método poniendole un parámetro de tipo int
    public int sumar(int incremento) {
        return num1 + num2 + num3 + incremento;
    }

}