import java.util.Scanner;

// Parte 2: Creación de la matriz y entrada de datos
public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de filas y asientos por fila
        System.out.println("Ingrese la cantidad de filas en el teatro:");
        int filas = scanner.nextInt();
        System.out.println("Ingrese la cantidad de asientos por fila:");
        int asientosPorFila = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Crear una matriz de objetos Asiento
        Asiento[][] asientos = new Asiento[filas][asientosPorFila];

        // Ingresar datos de los asientos
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < asientosPorFila; j++) {
                System.out.println("Ingrese el número del asiento en la fila " + (i + 1) + ", posición " + (j + 1) + ":");
                int numero = scanner.nextInt();

                System.out.println("Ingrese el precio del asiento " + numero + ":");
                double precio = scanner.nextDouble();

                asientos[i][j] = new Asiento(numero, i + 1, precio);
            }
            scanner.nextLine(); // Limpiar el buffer
        }

        // Cerrar el scanner
        scanner.close();

        // Llamar al método para ordenar los asientos por precio
        ordenarAsientosPorPrecio(asientos);

        // Mostrar los asientos ordenados
        MostrarAsientos.mostrar(asientos);
    }

    // Método para ordenar los asientos por precio en cada fila
    public static void ordenarAsientosPorPrecio(Asiento[][] asientos) {
        for (int i = 0; i < asientos.length; i++) {
            // Usamos un algoritmo de ordenamiento simple (burbuja) para ordenar los asientos en la fila
            for (int j = 0; j < asientos[i].length - 1; j++) {
                for (int k = 0; k < asientos[i].length - 1 - j; k++) {
                    if (asientos[i][k].getPrecio() > asientos[i][k + 1].getPrecio()) {
                        // Intercambiar asientos
                        Asiento temp = asientos[i][k];
                        asientos[i][k] = asientos[i][k + 1];
                        asientos[i][k + 1] = temp;
                    }
                }
            }
        }
    }
}