// Parte 1: Definición de la clase del objeto Libro
class Libro {
    private String titulo;
    private String autor;
    private double precio;

    // Constructor
    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    // Métodos getter
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    // Método para mostrar información del libro
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Precio: " + precio;
    }
}