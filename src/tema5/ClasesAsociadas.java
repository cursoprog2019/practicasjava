package tema5;

/**
 * ClasesAsociadas pag 86
 */
public class ClasesAsociadas {

    public static void saludo(String nombre) {
        System.out.println("Hola " + nombre);
    }

    public static void main(String[] args) {
        
        Character letra = new Character('A');
        // usando clase asociada Character
        // llamada al método saludo, pero transformando
        // la letra de tipo Character a String
        saludo(letra.toString());
        // pasamos a minúscula
        saludo(letra.toString().toLowerCase());
        // usando el tipo primitivo char
        // NO PODEMOS USAR METODOS
        char letra2 = 'A';
        //saludo(letra2.toString()); NO FUNCIONA

        // usando clase asociada Interger
        Integer numero = new Integer(100);
        saludo(numero.toString());

        // COMPARACION DE NUMEROS
        // tipo primitivo int
        int num1 = 100;
        int num2 = 100;
        if (num1 == num2) {
            System.out.println("int: Son iguales");
        }
        // clase asociada Integer
        Integer numero1 = new Integer(100);
        Integer numero2 = new Integer(100);
        // comparación con == 
        if (numero1 == numero2) {
            System.out.println("Integer: Son iguales");
        } else {
            System.out.println("Integer: Son distintos !!!");
        }
        // Nos sale distintos porque son objetos y los objetos
        // en realidad son direcciones de memoria (punteros)
        
        // comparacion con el método equals
        // compara el contenido de los objetos
        if (numero1.equals(numero2)) {
            System.out.println("Integer-equals: Son iguales");
        } else {
            System.out.println("Integer-equals: Son distintos !!!");
        }



    }
}