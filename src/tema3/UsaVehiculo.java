package tema3;

/**
 * UsaVehiculo
 * pag.33
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
        //System.out.println("Disponible : " + vehiculo1.disponible);
        System.out.print("Disponible : ");
        if (vehiculo1.disponible == true) {
            System.out.println("SI"); 
        } else {
            System.out.println("NO"); 
        }
    }
}