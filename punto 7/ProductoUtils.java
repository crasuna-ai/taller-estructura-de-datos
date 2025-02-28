import java.util.Scanner;

// Parte 2: Métodos para entrada de datos y agrupación de productos
public class ProductoUtils {

    // Método para obtener productos
    public static Producto[] obtenerProductos(Scanner scanner, int cantidad) {
        Producto[] productos = new Producto[cantidad];

        // Ingresar datos de los productos
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del producto " + (i + 1) + ":");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el peso del producto " + nombre + ":");
            double peso = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            System.out.println("Ingrese el tipo de peso del producto " + nombre + " (ej. kg, g, lb):");
            String tipoPeso = scanner.nextLine();

            System.out.println("Ingrese la categoría del producto " + nombre + ":");
            String categoria = scanner.nextLine();

            productos[i] = new Producto(nombre, peso, tipoPeso, categoria);
        }

        return productos;
    }

    // Método para agrupar productos por categoría
    public static Producto[][] agruparProductos(Producto[] productos, String[] categorias) {
        // Crear una matriz para las estanterías
        Producto[][] estanterias = new Producto[categorias.length][productos.length];
        
        // Inicializar contadores para cada categoría
        int[] contadores = new int[categorias.length];

        // Agrupar productos según su categoría
        for (Producto producto : productos) {
            for (int j = 0; j < categorias.length; j++) {
                if (producto.getCategoria().equalsIgnoreCase(categorias[j])) {
                    estanterias[j][contadores[j]++] = producto;
                    break;
                }
            }
        }

        return estanterias;
    }

    // Método para mostrar los productos en las estanterías
    public static void mostrarEstanterias(Producto[][] estanterias, String[] categorias) {
        for (int i = 0; i < estanterias.length; i++) {
            System.out.println("Categoría: " + categorias[i]);
            boolean hayProductos = false; // Variable para verificar si hay productos en la categoría
            for (Producto producto : estanterias[i]) {
                if (producto != null) {
                    System.out.println(producto);
                    hayProductos = true; // Hay al menos un producto en esta categoría
                }
            }
            if (!hayProductos) {
                System.out.println("No hay productos en esta categoría.");
            }
            System.out.println();
        }
    }
}