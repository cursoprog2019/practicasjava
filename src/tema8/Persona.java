package tema8;

import java.io.Serializable;

/**
 * Persona
 */
public class Persona implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 4230743118341064624L;
    /**
     * Persona
     */
    private String dni;
    private String nombre;
    private String apellidos;

    public Persona(String dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getAtributos() {
        return nombre + " " + apellidos + " - " + dni;
    }

}