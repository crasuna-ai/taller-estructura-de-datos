// Parte 1: Definición de la clase Producto
class Producto {
    private String nombre;
    private boolean enOferta; // Indica si el producto está en oferta

    // Constructor
    public Producto(String nombre, boolean enOferta) {
        this.nombre = nombre;
        this.enOferta = enOferta;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public boolean isEnOferta() {
        return enOferta;
    }
}