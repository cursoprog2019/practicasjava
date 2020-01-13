package tema7;

/**
 * UtilArray
 */
public class UtilArray {
    final int ASIGNATURAS = 2;
    final int ALUMNOS = 3;
    public static void escribirNotas(int[][] dato) {
        for(int asignatura = 0; asignatura < ASIGNATURAS; asignatura++) {
            System.out.print("asignatura-" + asignatura);
            for(int alumno = 0; alumno < ALUMNOS; alumno++) {
                System.out.print(" alumno-" + alumno);
                // acceso al array notas2, mediante fila y columna
                System.out.print("-->" + dato[asignatura][alumno]);
            }
            System.out.println(); // cambio de línea 
        }
    }
}