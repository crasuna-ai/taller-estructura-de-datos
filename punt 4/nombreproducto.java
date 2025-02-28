import java.util.ArrayList;
import java.util.Scanner;

public class nombreproducto {

    // Método para obtener productos de una tienda
    public static Producto[] obtenerProductos(Scanner scanner, String nombreTienda) {
        System.out.println("Ingrese la cantidad de productos en la tienda " + nombreTienda + ":");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Producto[] productos = new Producto[cantidad];

        // Ingresar datos de los productos
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del producto " + (i + 1) + ":");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el precio del producto " + nombre + ":");
            double precio = scanner.nextDouble();

            System.out.println("Ingrese el stock del producto " + nombre + ":");
            int stock = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            productos[i] = new Producto(nombre, precio, stock);
        }

        return productos;
    }

    // Método para fusionar las matrices de productos
    public static Producto[] fusionarProductos(Producto[][] tiendas) {
        ArrayList<Producto> listaFusionada = new ArrayList<>();

        // Agregar productos de todas las tiendas a la lista fusionada
        for (Producto[] tienda : tiendas) {
            for (Producto p1 : tienda) {
                boolean encontrado = false;
                for (Producto p2 : listaFusionada) {
                    if (p1.getNombre().equalsIgnoreCase(p2.getNombre())) {
                        // Si el producto ya existe, sumamos el stock
                        p2.sumarStock(p1.getStock());
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    listaFusionada.add(new Producto(p1.getNombre(), p1.getPrecio(), p1.getStock()));
                }
            }
        }

        // Convertir la lista a un array
        return listaFusionada.toArray(new Producto[0]);
    }

    // Método para mostrar los productos
    public static void mostrarProductos(Producto[] productos) {
        System.out.println("\nProductos fusionados:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public static Producto[] fusionarProductos(Producto[] tienda1, Producto[] tienda2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fusionarProductos'");
    }
}