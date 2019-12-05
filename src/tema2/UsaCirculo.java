
package tema2;

// La clase Circulo no está en el paquete tema2
// y es necesario importarla para que la reconozca
/* 
Vemos el concepto de acceso por REFERENCIA a variables
- A los tipos primitivos se accede por valor
- Pero a los tipos avanzados (Objetos) se accede por referencia
*/
import tema3.Circulo;

/**
 * usaCirculo
 */
public class UsaCirculo {

    public static void main(String[] args) {
        // Creamos los dos objetos de tipo Circulo
        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo();
        Circulo circuloCopia;

        // Al imprimir el objeto sale nombre de clase@dirección de memoria
        System.out.println("circulo1: " + circulo1);
        System.out.println("circulo2: " + circulo2);
        // Rellenamos el contenido del objeto circulo1
        circulo1.x = 2;
        circulo1.y = 5;
        circulo1.radio = 1;
        // Rellenamos el contenido del objeto circulo2
        circulo2.x = 2;
        circulo2.y = 5;
        circulo2.radio = 1;
        // Comprobar si el objeto circulo1 es igual al objeto circulo2
        if (circulo1 == circulo2) {
            System.out.println("circulo1 es igual a circulo2");
        } else {
            System.out.println("circulo1 es distinto a circulo2 !!!");
        }
        // Comprobar si la x de circulo1 es igual a la x de circulo2
        if (circulo1.x == circulo2.x) {
            System.out.println("la x de circulo1 es igual a la x de circulo2");
        } else {
            System.out.println("la x de circulo1 es distinta a la x de circulo2");
        }
        // Si queremos guardar circulo1 hay que hacerlo en una variable auxiliar
        circuloCopia = circulo1;
        // ¿Cómo hacemos que circulo1 sea igual a circulo2?
        circulo1 = circulo2;
        System.out.println("Asignamos circulo2 a circulo1");
        System.out.println("circulo1: " + circulo1);
        System.out.println("circulo2: " + circulo2);
        System.out.println("circuloCopia: " + circuloCopia);
        // Comprobar si el objeto circulo1 es igual al objeto circulo2
        if (circulo1 == circulo2) {
            System.out.println("circulo1 es igual a circulo2");
        } else {
            System.out.println("circulo1 es distinto a circulo2");
        }
        // cambiar el contenido de la x en circulo2 
        circulo2.x = 4;
        System.out.println("Asignamos un 4 a circulo2.x");
        System.out.println("circulo2.x: " + circulo2.x);
        System.out.println("circulo1.x: " + circulo1.x);
        System.out.println("También ha cambiado el valor de circulo1.x !!!");
        System.out.println("EXPLICACION: circulo1 y circulo2 apuntan al mismo sitio");
        System.out.println("circuloCopia.x: " + circuloCopia.x);
    }
}