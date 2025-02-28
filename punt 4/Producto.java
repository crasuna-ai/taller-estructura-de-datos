// Parte 1: Definición de la clase del objeto Producto
class Producto {
    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // Método para sumar stock
    public void sumarStock(int cantidad) {
        this.stock += cantidad;
    }

    // Método para mostrar información del producto
    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio + ", Stock: " + stock;
    }
}