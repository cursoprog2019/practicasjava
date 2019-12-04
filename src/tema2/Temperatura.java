package tema2;

/**
 * Temperatura
 * pag. 23
 */
public class Temperatura {

    public static void main(String[] args) {
        double centigrados, fahrenheit;
        int temperatura;
        fahrenheit = 81;
        centigrados = ((fahrenheit - 32.0) * 5.0) / 9.0;
        System.out.println("fahrenheit: " + fahrenheit);
        System.out.println("centigrados: " + centigrados);
        // Si todos los valores son enteros, la división es entera
        // Si alguno de ellos es real, la división es real
        System.out.println("Practicando división entera y real:");
        System.out.println("3/2: " + (3/2));
        System.out.println("3.0/2: " + (3.0/2));
        System.out.println("81/2: " + (81/2));
        System.out.println("fahrenheit/2: " + (fahrenheit/2));
        System.out.println("Conversión de tipos: double --> int");
        // temperatura = centigrados
        // Si asignamos directamente sin convertir, nos sale este error:
        // Type mismatch: cannot convert from double to int
        temperatura = (int)centigrados;
        System.out.println("temperatura: " + temperatura);
        // Al contrario de int a double no es necesario conversión
        centigrados = temperatura;
    }
}