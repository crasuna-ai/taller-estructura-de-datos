// Parte 1: Definición de la clase del objeto Producto
class Producto {
    private String nombre;
    private double peso;
    private String tipoPeso; // Tipo de peso (kg, g, lb, etc.)
    private String categoria;

    // Constructor
    public Producto(String nombre, double peso, String tipoPeso, String categoria) {
        this.nombre = nombre;
        this.peso = peso;
        this.tipoPeso = tipoPeso;
        this.categoria = categoria;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public String getTipoPeso() {
        return tipoPeso;
    }

    public String getCategoria() {
        return categoria;
    }

    // Método para mostrar información del producto
    public String toString() {
        return "Nombre: " + nombre + ", Peso: " + peso + " " + tipoPeso + ", Categoría: " + categoria;
    }
}