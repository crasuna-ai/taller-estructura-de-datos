// Parte 1: Definición de la clase del objeto Asiento
class Asiento {
    private int numero;
    private int fila;
    private double precio;

    // Constructor
    public Asiento(int numero, int fila, double precio) {
        this.numero = numero;
        this.fila = fila;
        this.precio = precio;
    }

    // Métodos getter
    public int getNumero() {
        return numero;
    }

    public int getFila() {
        return fila;
    }

    public double getPrecio() {
        return precio;
    }

    // Método para mostrar información del asiento
    public String toString() {
        return "Fila: " + fila + ", Número: " + numero + ", Precio: " + precio;
    }
}