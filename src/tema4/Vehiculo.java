package tema4;

/**
 * Vehiculo 
 * pag.59
 */
public class Vehiculo {
    // Atributos privados, que sólo son accesibles dentro de la clase
    // Desde otra clase, sólo se puede acceder a través de métodos (públicos)
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;
    
    // Método constructor
    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = false;
    }

    // Métodos getter y setter
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // resto de métodos
    // copiado de la página 66
    public String getAtributos() {
        return "Matrícula: " + this.matricula +
        " Modelo: " + this.marca + " " + this.modelo +
        " Color: " + this.color +
        " Tarifa: " + this.tarifa +
        " Disponible: " + this.disponible;
        }

}