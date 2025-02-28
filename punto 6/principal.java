import java.util.Scanner;

// Parte 3: Clase principal que ejecuta el programa
public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de estudiantes
        System.out.println("Ingrese la cantidad de estudiantes:");
        int cantidadEstudiantes = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Obtener estudiantes
        Estudiante[] estudiantes = EstudianteUtils.obtenerEstudiantes(scanner, cantidadEstudiantes);

        // Agrupar estudiantes según su calificación
        Estudiante[][] grupos = EstudianteUtils.agruparEstudiantes(estudiantes);

        // Mostrar los grupos de estudiantes
        EstudianteUtils.mostrarGrupos(grupos);

        // Cerrar el scanner
        scanner.close();
    }
}