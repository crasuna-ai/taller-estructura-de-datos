import java.util.Scanner;

// Parte 3: Clase principal que ejecuta el programa
public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de tiendas
        System.out.println("Ingrese la cantidad de tiendas:");
        int cantidadTiendas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Crear un array de matrices de productos
        Producto[][] tiendas = new Producto[cantidadTiendas][];

        // Obtener productos de cada tienda
        for (int i = 0; i < cantidadTiendas; i++) {
            System.out.println("Ingrese el nombre de la tienda " + (i + 1) + ":");
            String nombreTienda = scanner.nextLine();
            tiendas[i] = nombreproducto.obtenerProductos(scanner, nombreTienda);
        }

        // Cerrar el scanner
        scanner.close();

        // Llamar al método para fusionar las matrices
        Producto[] productosFusionados = nombreproducto.fusionarProductos(tiendas);

        // Mostrar los productos fusionados
        nombreproducto.mostrarProductos(productosFusionados);
    }
}