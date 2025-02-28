import java.util.Scanner;

// Parte 2: Métodos para entrada de datos y agrupación de estudiantes
public class EstudianteUtils {

    // Método para obtener estudiantes
    public static Estudiante[] obtenerEstudiantes(Scanner scanner, int cantidad) {
        Estudiante[] estudiantes = new Estudiante[cantidad];

        // Ingresar datos de los estudiantes
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la calificación del estudiante " + nombre + " (A, B, C, etc.):");
            String calificacion = scanner.nextLine();

            estudiantes[i] = new Estudiante(nombre, calificacion);
        }

        return estudiantes;
    }

    // Método para agrupar estudiantes según su calificación
    public static Estudiante[][] agruparEstudiantes(Estudiante[] estudiantes) {
        // Definir un tamaño máximo para cada grupo
        final int MAX_ESTUDIANTES = 100; // Cambia este valor según sea necesario
        Estudiante[][] grupos = new Estudiante[5][MAX_ESTUDIANTES];
        int[] contadores = new int[5]; // Contadores para cada grupo

        // Agrupar estudiantes según su calificación
        for (Estudiante estudiante : estudiantes) {
            switch (estudiante.getCalificacion().toUpperCase()) {
                case "A":
                    grupos[0][contadores[0]++] = estudiante;
                    break;
                case "B":
                    grupos[1][contadores[1]++] = estudiante;
                    break;
                case "C":
                    grupos[2][contadores[2]++] = estudiante;
                    break;
                case "D":
                    grupos[3][contadores[3]++] = estudiante;
                    break;
                case "F":
                    grupos[4][contadores[4]++] = estudiante;
                    break;
                default:
                    System.out.println("Calificación no válida para el estudiante: " + estudiante.getNombre());
                    break;
            }
        }

        return grupos;
    }

    // Método para mostrar los grupos de estudiantes
    public static void mostrarGrupos(Estudiante[][] grupos) {
        char[] calificaciones = {'A', 'B', 'C', 'D', 'F'};
        for (int i = 0; i < grupos.length; i++) {
            System.out.println("Estudiantes con calificación " + calificaciones[i] + ":");
            for (int j = 0; j < grupos[i].length; j++) {
                if (grupos[i][j] != null) {
                    System.out.println(grupos[i][j]);
                }
            }
            System.out.println();
        }
    }
}