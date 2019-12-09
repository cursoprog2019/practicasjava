package tema3;

/**
 * UsaVehiculo pag.33
 */
public class UsaVehiculo {

    public static void main(String[] args) {
        // Instanciar un objeto de tipo Vehiculo, que le llamamos vehiculo1
        Vehiculo vehiculo1 = new Vehiculo("4050 ABJ", "VW", "GTI", "Blanco", 100.0);
        // Mostrar los atributos del objeto vehiculo1
        System.out.println("Matricula : " + vehiculo1.matricula);
        System.out.println("Marca y modelo: " + vehiculo1.marca + " " + vehiculo1.modelo);
        System.out.println("Color : " + vehiculo1.color);
        System.out.println("Tarifa : " + vehiculo1.tarifa);
        // System.out.println("Disponible : " + vehiculo1.disponible);
        System.out.print("Disponible : ");
        if (vehiculo1.disponible == true) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        // Cambiar la tarifa
        vehiculo1.setTarifa(90.0);
        System.out.println("Cambiamos la tarifa de 100 a 90 €");
        // Mostramos los atributos a través de métodos getter
        System.out.println("Matricula : " + vehiculo1.getMatricula());
        System.out.println("Tarifa : " + vehiculo1.getTarifa());
        // CONCEPTO: null
        // Declaramos un objeto, lo inicializamos a null
        // pero no lo instanciamos
        // pag.36
        Vehiculo vehiculo2 = null;
        if (vehiculo2 == null) {
            System.out.println("vehiculo2 es una referencia null");
            // si es null se instancia
            vehiculo2 = new Vehiculo("2345 JVM", "SEAT", "León", "Negro", 80.0);
        } else {
            System.out.println("vehiculo2 está instanciado");
        }
        System.out.println("Matricula : " + vehiculo2.getMatricula());
        // Comprobamos de nuevo si es null
        if (vehiculo2 == null) {
            System.out.println("vehiculo2 es una referencia null");
        } else {
            System.out.println("vehiculo2 está instanciado");
        }
        System.out.println("Matricula : " + vehiculo2.getMatricula());

        // CONCEPTO: Acceso por referencia
        // Pag. 36 al final
        // Vehiculo vehiculo1; ya está declarado
        Vehiculo vehiculo3;

        vehiculo1 = new Vehiculo("4050 ABJ", "VW", "GTI", "Blanco", 100.0);

        // el objeto vehiculo1 se instancia, vehiculo3 solo
        // está declarado y es una referencia null
        System.out.println("Asignamos vehiculo1 a vehiculo3");
        vehiculo3 = vehiculo1;

        // al asignar la referencia de vehiculo1 a vehiculo3,
        // éste se convierte en alias de vehiculo1 y referencia
        // el mismo espacio de memoria

        System.out.println("Matricula1 : " + vehiculo1.getMatricula());
        System.out.println("Tarifa1 : " + vehiculo1.getTarifa());

        // se muestra la matricula y la tarifa de vehiculo1

        System.out.println("Matricula3 : " + vehiculo3.getMatricula());
        System.out.println("Tarifa3 : " + vehiculo3.getTarifa());

        // pag.38 Al modificar vehiculo3 también modificamos vehiculo1

        vehiculo3.setTarifa(90.0);
        System.out.println("Cambiamos tarifa en vehiculo3");
        // al modificar la tarifa de vehiculo3 en realidad se
        // modifica la tarifa de vehiculo1

        System.out.println("Matricula1 : " + vehiculo1.getMatricula());
        System.out.println("Tarifa1 : " + vehiculo1.getTarifa());

        System.out.println("Matricula3 : " + vehiculo3.getMatricula());
        System.out.println("Tarifa3 : " + vehiculo3.getTarifa());

        // pag.43 uso del método getAtributos()
        System.out.println("Atributos de vehiculo3: " + vehiculo3.getAtributos());
        
    }
}