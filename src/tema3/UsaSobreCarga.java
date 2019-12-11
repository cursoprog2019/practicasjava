package tema3;

/**
 * UsaSobreCarga
 */
public class UsaSobreCarga {

    public static void main(String[] args) {
        Sobrecarga objeto1 = new Sobrecarga(5,7);
        Sobrecarga objeto2 = new Sobrecarga(5,7,10);
        System.out.println("objeto1.sumar(): " + objeto1.sumar());
        System.out.println("objeto1.sumar('dos'): " + objeto1.sumar("dos"));
        System.out.println("objeto1.sumar('tres'): " + objeto1.sumar("tres"));
        System.out.println("objeto1.sumar('otro'): " + objeto1.sumar("otro"));
        System.out.println("objeto1.sumar(100): " + objeto1.sumar(100));

        System.out.println("objeto2.sumar(): " + objeto2.sumar());
        System.out.println("objeto2.sumar('dos'): " + objeto2.sumar("dos"));
        System.out.println("objeto2.sumar('tres'): " + objeto2.sumar("tres"));
        System.out.println("objeto2.sumar('otro'): " + objeto2.sumar("otro"));
        System.out.println("objeto2.sumar(100): " + objeto2.sumar(100));

    }
}