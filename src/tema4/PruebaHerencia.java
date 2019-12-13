package tema4;

/**
 * PruebaHerencia pag.71-74
 */
public class PruebaHerencia {

    public static void main(String[] args) {
        // creación de instancias de la superclase Vehiculo y
        // de las subclases Turismo, Deportivo y Furgoneta
        // Hay que tener en cuenta que el constructor de cada objeto va a ser distinto
        // Tendrá los parámetros del padre, más los nuevos del hijo.

        Vehiculo miVehiculo = new Vehiculo("4050 ABJ", "VW", "GTI", "Blanco", 100.0);
        Turismo miTurismo = new Turismo("4060 TUR", "Skoda", "Fabia", "Blanco", 90.0, 2, false);
        Deportivo miDeportivo = new Deportivo("4070 DEP", "Ford", "Mustang", "Rojo", 150.0, 2000);
        Furgoneta miFurgoneta = new Furgoneta("4080 FUR", "Fiat", "Ducato", "Azul", 80.0, 1200, 8);

        // invocación del método getAtributos() de cada objeto
        // Vemos el concepto de POLIMORFISMO:
        // el método se llama igual, pero la funcionalidad es distinta
        // para cada tipo de objeto

        System.out.println("- Vehículo : " + miVehiculo.getAtributos());

        // miVehiculo es una instancia de la clase Vehiculo, se
        // invoca el método getAtributos() de Vehiculo

        System.out.println("- Turismo: " + miTurismo.getAtributos());

        // miTurismo es una instancia de la clase Turismo, se
        // invoca el método getAtributos() de Turismo

        System.out.println("- Deportivo: " + miDeportivo.getAtributos());

        // miDeportivo es una instancia de la clase Deportivo,
        // se invoca el método getAtributos() de Deportivo

        System.out.println("- Furgoneta: " + miFurgoneta.getAtributos());

        // miFurgoneta es una instancia de la clase Furgoneta,
        // se invoca el método getAtributos() de Furgoneta

        // el objeto miTurismo pertenece a la subclase Turismo,
        // es un vehículo y puede invocar a los métodos de la
        // superclase Vehiculo: getMatricula(),
        // getMarca() y getModelo()
        // Vemos el concepto de HERENCIA
        // El objeto de tipo Turismo hereda los métodos del objeto de tipo Vehiculo
        // y los podemos utilizar sin declarar nada, simplemente ponemos extends.

        System.out.println(
                "- Turismo: " + miTurismo.getMatricula() + " " + miTurismo.getMarca() + " " + miTurismo.getModelo());

        // Compatibilidad de tipos (pag. 74)
        // - Conversión ascendente: Vehiculo <-- Turismo
        System.out.println("Asignamos un objeto de tipo Turismo a uno de tipo Vehiculo");
        Vehiculo miVehiculo2 = new Turismo("4090 TUR", "Skoda", "Fabia", "Negro", 90.0, 2, true);
        // Como hay polimorfismo ¿Qué getAtributos() va a utilizar, el de Vehiculo o el
        // Turismo?
        // El new crea el objeto de tipo Turismo y ese es el getAtributos que va a usar
        // aunque luego se guarda en un objeto de tipo Vehiculo
        System.out.println("- Vehículo: " + miVehiculo2.getAtributos());
        // - Conversión ascendente (paso intermedio)
        Turismo miTurismo2 = new Turismo("4100 TUR", "VW", "Polo", "Rojo", 80.0, 2, false);
        Vehiculo miVehiculo3 = miTurismo2;
        System.out.println("- Vehículo: " + miVehiculo3.getAtributos());

        // - Conversión descendente: Turismo <-- Vehiculo
        // Vehiculo miVehiculo4 = new Vehiculo("4090 TUR", "Skoda", "Fabia", "Negro",
        // 90.0);
        // Si lo hacemos asi el casting no va a funcionar
        // y nos salta una excepción (error) de que no puede hacer el casting

        Vehiculo miVehiculo4 = new Turismo("4090 TUR", "Skoda", "Fabia", "Negro", 90.0, 2, true);
        // Turismo miNuevoTurismo = miVehiculo4; NO FUNCIONA
        // porque no permite asignar un tipo Vehiculo a un tipo Turismo
        // para que funcione hay que hacer el casting con (Turismo)
        Turismo miNuevoTurismo = (Turismo) miVehiculo4;
        System.out.println("- Turismo: " + miNuevoTurismo.getAtributos());

    }
}