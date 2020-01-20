package tema7;

/**
 * Cliente
 */
public class Cliente {
    // atributos
    private String nif;
    private String nombre;
    private String apellidos;
    private int edad;
    // método constructor
    public Cliente(String nif, String nombre, String apellidos, int edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    // métodos setter y getter
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellidos;
    }

    public void setApellido(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    // resto de métodos
    public String getAtributos() {
        return nif + " - " + nombre + " " + apellidos + " - " + edad;
    }
    

}