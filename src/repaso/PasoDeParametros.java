package repaso;

/**
 * PasoDeParametros
 */
public class PasoDeParametros {

    /*
    public static Cliente ClienteMayor(Cliente[] clientes ) {


    }
    */

    public static void main(String[] args) {
        // Definir un array de 5 clientes, con valores

        // UNA FORMA DE CREAR EL ARRAY DE OBJETOS
        // Definiendo un array de tamaño 5
        // que inicializa los valores a null
        Cliente[] clientes = new Cliente[5];
        // Rellenamos cada una de las casillas 
        // con objetos de tipo Cliente
        clientes[0] = new Cliente("Pepe",40);
        clientes[1] = new Cliente("Juan",30);
        clientes[2] = new Cliente("Luis",35);
        clientes[3] = new Cliente("Pedro",50);
        clientes[4] = new Cliente("Pablo",45);

        // OTRA FORMA
        // Definiendo el array e inicializando los valores
        Cliente[] clientes2 = { 
                                new Cliente("Pepe",40), 
                                new Cliente("Juan",30),
                                new Cliente("Luis",35),
                                new Cliente("Pedro",50),
                                new Cliente("Pablo",45)
                              }

        // OTRA FORMA "HIBRIDA"
        // Definimos el array e inicializamos los valores, usando variables auxiliares
        Cliente cliente0 = new Cliente("Pepe",40);
        Cliente cliente1 = new Cliente("Juan",30);
        Cliente cliente2 = new Cliente("Luis",35);
        Cliente cliente3 = new Cliente("Pedro",50);
        Cliente cliente4 = new Cliente("Pablo",45);
        Cliente[] clientes3 = {cliente0,cliente1,cliente2,cliente3,cliente4}

        //String[] clientes = {"cliente1","cliente2","cliente3","cliente4","cliente5"}
        // llamar al método ClienteMayor

        // Escribir el nombre y edad del cliente mayor

    }
}