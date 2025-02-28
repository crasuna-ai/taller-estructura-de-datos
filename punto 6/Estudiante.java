// Parte 1: Definición de la clase del objeto Estudiante
class Estudiante {
    private String nombre;
    private String calificacion;

    // Constructor
    public Estudiante(String nombre, String calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public String getCalificacion() {
        return calificacion;
    }

    // Método para mostrar información del estudiante
    public String toString() {
        return "Nombre: " + nombre + ", Calificación: " + calificacion;
    }
}