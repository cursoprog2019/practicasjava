package tema7;

/**
 * Util
 */
public class Util {

    public static String diaSemana(int num) {
        String retorno = "";
        // switch que según sea el parámetro num
        // nos devuelva el día de la semana asociado
        // 0 --> "domingo", 1 --> "lunes" ... 6 --> "sábado"
        // Si el número no esta entre 0 y 6 devuelve ""
        switch (num) {
        case 0:
            retorno = "domingo";
            break;
        case 1:
            retorno = "lunes";
            break;
        case 2:
            retorno = "martes";
            break;
        case 3:
            retorno = "miércoles";
            break;
        case 4:
            retorno = "jueves";
            break;
        case 5:
            retorno = "viernes";
            break;
        case 6:
            retorno = "sábado";
            break;
        default:
            break;
        }
        return retorno;
    }

    public static String diaSemana2(int num) {
        // devuelve el día de la semana
        // pero utilizando un array

        // declarar un array con los días de la semana 
        String[] dias = {"domingo","lunes","martes","miércoles",
                         "jueves","viernes","sábado"};
        String retorno = "";
        // ? como obtenemos el valor en letra a partir del número
        if (num >= 0 && num <= 6) { // controlar que el número esté entre 0 y 6
            retorno = dias[num];
        }
        return retorno;

    }


}