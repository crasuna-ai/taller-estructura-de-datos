// Parte 1: Definición de la clase Vendedor
class Vendedor {
    private String nombre;
    private double[] ventas;

    // Constructor
    public Vendedor(String nombre) {
        this.nombre = nombre;
        this.ventas = new double[12]; // 12 meses
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public double[] getVentas() {
        return ventas;
    }

    // Método para establecer las ventas
    public void setVentas(double[] ventas) {
        this.ventas = ventas;
    }

    // Método para calcular el total de ventas
    public double calcularTotalVentas() {
        double total = 0;
        for (double venta : ventas) {
            total += venta;
        }
        return total;
    }
}