package tema3;
/**
 * usaCirculo
 * pag.26
 */
public class UsaCirculo {
    public static void main(String[] args) {
        Circulo circulo1;
        Circulo circulo2 = new Circulo();
        //System.out.println("circulo1: " + circulo1);
        System.out.println("circulo2: " + circulo2);
        
        // pag.44 llamada a métodos de operación
        Circulo circulo3 = new Circulo();
        circulo3.radio = 6;
        System.out.println("Radio: " + circulo3.radio);
        System.out.println("Perímetro: " + circulo3.calcularPerimetro());
        System.out.println("Area: " + circulo3.calcularArea());
        Circulo circulo4 = circulo3;
        System.out.println("Radio: " + circulo4.radio);
        System.out.println("Perímetro: " + circulo4.calcularPerimetro());
        System.out.println("Area: " + circulo4.calcularArea());
    }
    
}