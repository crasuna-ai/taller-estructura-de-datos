import java.util.Scanner;

// Parte 3: Clase principal que ejecuta el programa
public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el tamaño de la matriz
        System.out.println("Ingrese el tamaño de la matriz (n):");
        int n = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Ingresar los productos
        Producto[][] productos = ProductoUtils.ingresarProductos(scanner, n);

        // Contar cuántos productos están en oferta
        int totalEnOferta = ProductoUtils.contarProductosEnOferta(productos);

        // Mostrar el total de productos en oferta
        System.out.println("Total de productos en oferta: " + totalEnOferta);

        // Cerrar el scanner
        scanner.close();
    }
}