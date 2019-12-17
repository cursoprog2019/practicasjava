package tema6;

/**
 * Condicionales
 */
public class Condicionales {

    public static void main(String[] args) {
        // 1. Simple (if)
        // Dada una nota, escribir Aprobado si el mayor o igual a 5
        int nota1 = 5;
        if (nota1 >= 5) {
            System.out.println("1.Aprobado");
        }
        // 2. Doble (if-else)
        // Dada una nota, escribir Aprobado si el mayor o igual a 5
        // y Suspenso si es menor que 5
        int nota2 = 5;
        if (nota2 >= 5) {
            System.out.println("2.Aprobado");
        } else {
            System.out.println("2.Suspenso");
        }
        // 3. Anidada (if-else-if-else...)
        // Dada una nota, escribir
        // 10: Matricula de Honor
        // 9 - 10: Sobresaliente
        // 7-9: Notable
        // 6-7: Bien
        // 5-6: Suficiente
        // 0-5: Suspenso
        int nota3 = 5;
        // si nota3 es mayor que 10 o nota3 menor que 0, entra
        if (nota3 > 10 || nota3 < 0) {
            System.out.println("3.ERROR: Nota no válida");
        } else {
            if (nota3 == 10) {
                System.out.println("3.Matricula de Honor");
            } else {
                if (nota3 >= 9) {
                    System.out.println("3.Sobresaliente");
                } else {
                    if (nota3 >= 7) {
                        System.out.println("3.Notable");
                    } else {
                        if (nota3 >= 6) {
                            System.out.println("3.Bien");
                        } else {
                            if (nota3 >= 5) {
                                System.out.println("3.Suficiente");
                            } else {
                                System.out.println("3.Suspenso");
                            }
                        }
                    }
                }
            }
        }

        /*
         * ERRONEO: los if no están anidados Por ejemplo falla con nota3 a 10 que
         * escribe Matricula de Honor y Sobresaliente if (nota3 == 10) {
         * System.out.println("p.Matricula de Honor"); } if (nota3 >= 9) {
         * System.out.println("p.Sobresaliente"); }
         */

        // 4. Multiple (switch)
        // Dado un día de la semana en número de 0 a 6, escribir
        // 0: domingo, 1:lunes, 2:martes ... 6:sábado
        String texto = "";
        int diaSemana = 2;
        switch (diaSemana) {
        case 0:
            texto = "domingo";
            break;
        case 1:
            texto = "lunes";
            break;
        case 2:
            texto = "martes";
            break;
        case 3:
            texto = "miércoles";
            break;
        case 4:
            texto = "jueves";
            break;
        case 5:
            texto = "viernes";
            break;
        case 6:
            texto = "sábado";
            break;
        default:
            texto = "*ERROR* día no válido";
            break;
        }
        System.out.println("Día de la semana: " + texto);

        // 5.- EJERCICIO: Condicional con comparaciones avanzadas
        // Saludar según la hora del día
        // 0(incluido) a 8(excluido): BUENAS NOCHES
        // 8(incluido) a 14(excluido): BUENOS DIAS
        // 14(incluido) a 20(incluido): BUENAS TARDES
        // 20(excluido) a 24(excluido): BUENAS NOCHES
        // MEJORA:
        // Si hora es menor que cero o 24 o mayor
        // indicar "Hora no válida"

        int hora = 15;
        String saludo = "";
 
        System.out.println("SALUDO: " + saludo);

    }



}