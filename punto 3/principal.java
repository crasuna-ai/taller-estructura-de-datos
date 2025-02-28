import java.util.Scanner;

// Parte 2: Creación de la matriz y entrada de datos
public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de libros
        System.out.println("Ingrese la cantidad de libros que desea almacenar:");
        int filas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Crear una matriz de objetos Libro
        Libro[][] libros = new Libro[filas][1]; // Matriz de 'filas' x 1

        // Ingresar datos de los libros
        for (int i = 0; i < filas; i++) {
            System.out.println("Ingrese el título del libro en la posición [" + i + "]:");
            String titulo = scanner.nextLine();

            System.out.println("Ingrese el autor de " + titulo + ":");
            String autor = scanner.nextLine();

            System.out.println("Ingrese el precio de " + titulo + ":");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            libros[i][0] = new Libro(titulo, autor, precio);
        }

        // Cerrar el scanner
        scanner.close();

        // Llamar al método para mostrar el contenido de la matriz
        Mostrarnombres.mostrar(libros);

        // Encontrar y mostrar el libro más caro
        Libro libroMasCaro = encontrarLibroMasCaro(libros);
        System.out.println("\nEl libro más caro es: " + libroMasCaro);
    }

    // Método para encontrar el libro más caro
    public static Libro encontrarLibroMasCaro(Libro[][] libros) {
        Libro libroMasCaro = libros[0][0]; // Inicializar con el primer libro

        for (int i = 0; i < libros.length; i++) {
            if (libros[i][0].getPrecio() > libroMasCaro.getPrecio()) {
                libroMasCaro = libros[i][0]; // Actualizar si se encuentra un libro más caro
            }
        }

        return libroMasCaro;
    }
}