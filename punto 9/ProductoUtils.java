import java.util.Scanner;

// Parte 2: Métodos para manejar los productos
public class ProductoUtils {

    // Método para ingresar productos en una matriz cuadrada
    public static Producto[][] ingresarProductos(Scanner scanner, int n) {
        Producto[][] productos = new Producto[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese el nombre del producto en la posición (" + i + ", " + j + "):");
                String nombre = scanner.nextLine();

                System.out.println("¿Está en oferta? (true/false):");
                boolean enOferta = scanner.nextBoolean();
                scanner.nextLine(); // Limpiar el buffer

                productos[i][j] = new Producto(nombre, enOferta);
            }
        }

        return productos;
    }

    // Método para contar cuántos productos están en oferta
    public static int contarProductosEnOferta(Producto[][] productos) {
        int contador = 0;

        for (Producto[] fila : productos) {
            for (Producto producto : fila) {
                if (producto.isEnOferta()) {
                    contador++;
                }
            }
        }

        return contador;
    }
}