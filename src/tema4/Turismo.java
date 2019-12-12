package tema4;

/**
 * Turismo pag.67
 */
public class Turismo extends Vehiculo {
    private int puertas;
    private boolean marchaAutomatica;

    // A este constructor hay que pasarle los parámetros de la clase padre (superclase)
    // y también los de la clase hijo (subclase)
    public Turismo(String matricula, String marca, String modelo, String color, double tarifa, int puertas,
            boolean marchaAutomatica) {
        // llama al constructor de la clase padre
        super(matricula, marca, modelo, color, tarifa);
        // inicicilizar los atributos propios de la clase hijo
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }

    // métodos ‘get’ de la subclase Turismo
    public int getPuertas() {
        return this.puertas;
    }

    public boolean getMarchaAutomatica() {
        return this.marchaAutomatica;
    }

    // Este método al llamarse igual que el del padre, lo sobre-escribe
    public String getAtributos() {
        // Al poner super tenemos acceso a todos los metodos del padre
        return super.getAtributos() + " Puertas: " + this.puertas + " Marcha automática: " + this.marchaAutomatica;
    }
}