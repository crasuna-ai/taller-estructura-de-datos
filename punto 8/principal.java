import java.util.Scanner;

// Parte 3: Clase principal que ejecuta el programa
public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir la cantidad de vendedores
        int cantidadVendedores = 5;

        // Ingresar los vendedores
        Vendedor[] vendedores = Ventas.ingresarVendedores(scanner, cantidadVendedores);

        // Ingresar las ventas de cada vendedor
        Ventas.ingresarVentas(scanner, vendedores);

        // Encontrar el vendedor con más ventas
        Vendedor vendedorConMasVentas = Ventas.encontrarVendedorConMasVentas(vendedores);

        // Mostrar el vendedor con más ventas
        System.out.println("El vendedor que más vendió es: " + vendedorConMasVentas.getNombre() +
                " con un total de: " + vendedorConMasVentas.calcularTotalVentas());

        // Cerrar el scanner
        scanner.close();
    }
}