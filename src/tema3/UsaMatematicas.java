package tema3;

/**
 * UsaMatematicas
 */
public class UsaMatematicas {

    public static void main(String[] args) {

        Matematicas mate1 = new Matematicas(5, 7);
        System.out.println("La suma de 5 y 7 es: " + mate1.sumar());
        System.out.println("Estatico-La suma de 5 y 7 es: " + mate1.sumarEstatico(5, 7));
        Matematicas mate2 = new Matematicas(10, 14);
        System.out.println("La suma de 10 y 14 es: " + mate2.sumar());
        System.out.println("La suma de 5 y 7 es: " + mate1.sumar());

        // Uso de métodos y atributos estáticos
        // No es necesario crear los objetos
        // Accedemos con el nombre de la clase
        System.out.println("Estatico-La suma de 5 y 7 es: " + Matematicas.sumarEstatico(5, 7));
        System.out.println("Estatico-PI: " + Matematicas.PI);
        // Más ejemplos de llamadas a métodos (en este caso estático)
        int n1 = 16;
        int n2 = 25;
        System.out.println("Estatico-La suma de " + n1 + " y " + n2 + " es: " + Matematicas.sumarEstatico(n1, n2));
        int num1 = 1;
        int num2 = 5;
        int num3 = 7;
        // SUMA DE 3 VALORES
        // 1.- paso intermedio
        // suma de los dos primeros
        int temp = Matematicas.sumarEstatico(num1, num2);
        // al resultado le sumamos el tercero
        int total = Matematicas.sumarEstatico(temp, num3);
        System.out.println("1.Estatico-La suma de " + num1 + ", " + num2 + " y " + num3 + " es: "
        + total);
        // 2.- una llamada dentro de otra
        total = Matematicas.sumarEstatico(Matematicas.sumarEstatico(num1, num2), num3);
        System.out.println("2.Estatico-La suma de " + num1 + ", " + num2 + " y " + num3 + " es: "
        + total);
    }
}