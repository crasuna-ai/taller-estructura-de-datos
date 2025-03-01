import java.util.Scanner;

// Parte 2: Métodos para manejar las ventas
public class Ventas {

    // Método para ingresar los vendedores
    public static Vendedor[] ingresarVendedores(Scanner scanner, int cantidad) {
        Vendedor[] vendedores = new Vendedor[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del vendedor " + (i + 1) + ":");
            String nombre = scanner.nextLine();
            vendedores[i] = new Vendedor(nombre);
        }

        return vendedores;
    }

    // Método para ingresar las ventas de cada vendedor
    public static void ingresarVentas(Scanner scanner, Vendedor[] vendedores) {
        for (Vendedor vendedor : vendedores) {
            System.out.println("Ingrese las ventas de " + vendedor.getNombre() + " para cada mes:");
            double[] ventas = new double[12];
            for (int j = 0; j < 12; j++) {
                System.out.print("Mes " + (j + 1) + ": ");
                ventas[j] = scanner.nextDouble();
            }
            scanner.nextLine(); // Limpiar el buffer
            vendedor.setVentas(ventas);
        }
    }

    // Método para encontrar el vendedor con más ventas
    public static Vendedor encontrarVendedorConMasVentas(Vendedor[] vendedores) {
        Vendedor vendedorConMasVentas = null;
        double maxVentas = 0;

        for (Vendedor vendedor : vendedores) {
            double totalVentas = vendedor.calcularTotalVentas();
            System.out.println("Total de ventas de " + vendedor.getNombre() + ": " + totalVentas);

            if (totalVentas > maxVentas) {
                maxVentas = totalVentas;
                vendedorConMasVentas = vendedor;
            }
        }

        return vendedorConMasVentas;
    }
}