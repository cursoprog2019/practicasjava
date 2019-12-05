package tema3;
/**
 * Vehiculo
 * pag. 28
 */

public class Vehiculo {
    // ATRIBUTOS (definen caracteristicas de los objetos)
    String matricula;
    String marca;
    String modelo;
    String color;
    double tarifa;
    boolean disponible;

    // METODOS (definir comportamiento de los objetos)
    // - Constructores (Instanciar el objeto. Se llama cuando se hace un new)
    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = false;
    }

    // - getter (obtener los valores de los atributos)
    public String getMatricula() {
        return this.matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getColor() {
        return this.color;
    }

    public double getTarifa() {
        return this.tarifa;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    // - setter (poner valores a los atributos)
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    // - otros métodos

}
