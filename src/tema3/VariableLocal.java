package tema3;

/**
 * VariableLocal pag. 52
 */
public class VariableLocal {
    // variable global, accesible desde cualquier parte de la clase
    static String texto = "texto global";
    public static String saludo(String nombre) {
        // variable local, sólo es accesible dentro del método saludo
        String texto = "Buenos días";
        System.out.println("texto en saludo: " + texto);
        // al terminar el método saludo la variable local texto desaperace
        // y el valor de texto es el de la variable global
        String temp = texto + " " + nombre;
        // temp es otra variable local, sólo accesible en saludo
        System.out.println("temp en saludo: " + temp);
        System.out.println("nombre en saludo: " + nombre);
        return temp;
    }

    public static void main(String[] args) {
        String textolocal = saludo("Pepe");
        System.out.println("texto en main: " + texto);
        System.out.println("textolocal en main: " + textolocal);
        // esto daría error porque no puede acceder a temp, 
        // al ser una variable local
        //System.out.println("temp en main: " + temp);
        // también da error porque es un parámetro de saludo
        // que es analogo a una variable local
        //System.out.println("nombre en saludo: " + nombre);
        System.out.println("Prueba con Juan: " + saludo("Juan"));
    }

}