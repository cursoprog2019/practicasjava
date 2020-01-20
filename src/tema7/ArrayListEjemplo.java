package tema7;

import java.util.ArrayList;

/**
 * ArrayListEjemplo
 */
public class ArrayListEjemplo {

    public static void main(String[] args) {
        // creear el ArrayList de tipo String
        ArrayList<String> coches = new ArrayList<String>();
        // añadir un elemento (al final)
        coches.add(new String("Seat")); // una forma
        coches.add("Ford"); // otra forma
        // insertar un elemento (en una determinada posición)
        coches.add(1,"BMW");
        // añadir un elemento (al principio --> posición 0)
        coches.add(0,"Volvo");
        // modificar un elemento (de una determinada posición)
        coches.set(2,"Mercedes");
        // eliminar un elemento (de una determinada posición)
        coches.remove(1);
        // eliminar un elemento (con valor determinado). 
        // Borra sólo le primero que encuentra
        coches.remove("Ford");
        // el método remove devuelve un booleano
        if (coches.remove("BMW")) {
            System.out.println("BMW Borrado");
        } else {
            System.out.println("BMW no se encuentra");
        }
        // eliminar todos los elementos
        //coches.clear();

        // recorrer el ArrayList y escribir los elementos
        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));
        }
    }
}