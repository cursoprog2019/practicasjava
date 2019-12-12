package tema4;

/**
 * MisVehiculos pag.62 Clase que hace uso de la clase VehiculoAlquilado
 */
public class MisVehiculos {
    public static void main(String args[]) {

        // se crean dos instancias de la clase Vehiculo
        Vehiculo vehiculo1 = new Vehiculo("4050 ABJ", "VW", "GTI", "Blanco", 100.0);
        Vehiculo vehiculo2 = new Vehiculo("2345 JVM", "SEAT", "León", "Negro", 80.0);
        // se crea una instancia de la clase Cliente
        Cliente cliente1 = new Cliente("30435624X", "Juan", "Pérez");
        // se crea una instancia de la clase VehiculoAlquilado que
        // relaciona al cliente1 con el vehiculo1, el vehículo se
        // alquila con fecha 11/11/2011 durante 2 días

        // Creamos el objeto alquiler1, con dos objetos dentro,
        // uno de tipo Vehiculo y otro de tipo Cliente
        VehiculoAlquilado alquiler1 = new VehiculoAlquilado(cliente1, vehiculo1, 11, 11, 2011, 2);
        // Con esta accedemos con el . a todos los niveles de objetos
        // CONCEPTO de camino absoluto
        System.out.println("Vehículo alquilado");
        System.out.println("Cliente: " + alquiler1.getCliente().getNif() + " " + alquiler1.getCliente().getNombre()
                + " " + alquiler1.getCliente().getApellidos());
        System.out.println("Vehículo: " + alquiler1.getVehiculo().getMatricula());
        // Con esta accedemos primero a un nivel y después con .
        // CONCEPTO de camino relativo
        System.out.println("Vehículo alquilado (otra forma)");
        // Obtener primero el objeto de tipo Cliente
        Cliente clienteAux = alquiler1.getCliente();
        // Obtener el objeto de tipo Vehiculo
        Vehiculo vehiculoAux = alquiler1.getVehiculo();
        System.out.println("Cliente: " + clienteAux.getNif() + " " + clienteAux.getNombre() + " " + clienteAux.getApellidos());
        System.out.println("Vehiculo: " + vehiculoAux.getMatricula());
        // EJERCICIO: Cambiar el vehiculo1 por el vehiculo2
        // dentro del objeto alquiler1 y escribir de nuevo 
        // el contenido de alquiler1
        alquiler1.setVehiculo(vehiculo2);
        System.out.println("Cambio de vehiculo");
        System.out.println("Cliente: " + alquiler1.getCliente().getNif() + " " + alquiler1.getCliente().getNombre()
                + " " + alquiler1.getCliente().getApellidos());
        System.out.println("Vehículo: " + alquiler1.getVehiculo().getMatricula());
        
        System.out.println("Vehículo alquilado (otra forma)");
        vehiculoAux = alquiler1.getVehiculo();
        System.out.println("Cliente: " + clienteAux.getNif() + " " + clienteAux.getNombre() + " " + clienteAux.getApellidos());
        System.out.println("Vehiculo: " + vehiculoAux.getMatricula());


    }
}