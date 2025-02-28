import java.util.Scanner;

// Parte 3: Clase principal que ejecuta el programa
public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de categorías
        System.out.println("Ingrese la cantidad de categorías:");
        int cantidadCategorias = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Crear un arreglo para las categorías
        String[] categorias = new String[cantidadCategorias];

        // Ingresar las categorías
        for (int i = 0; i < cantidadCategorias; i++) {
            System.out.println("Ingrese el nombre de la categoría " + (i + 1) + ":");
            categorias[i] = scanner.nextLine();
        }

        // Solicitar la cantidad de productos
        System.out.println("Ingrese la cantidad de productos:");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Obtener productos
        Producto[] productos = ProductoUtils.obtenerProductos(scanner, cantidadProductos);

        // Agrupar productos según su categoría
        Producto[][] estanterias = ProductoUtils.agruparProductos(productos, categorias);

        // Mostrar los productos en las estanterías
        ProductoUtils.mostrarEstanterias(estanterias, categorias);

        // Cerrar el scanner
        scanner.close();
    }
}