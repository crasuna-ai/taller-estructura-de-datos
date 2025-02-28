// Parte 3: Mostrar el contenido de la matriz
class MostrarAsientos {
    public static void mostrar(Asiento[][] asientos) {
        System.out.println("\nContenido de la matriz de asientos ordenados por precio:");
        for (int i = 0; i < asientos.length; i++) {
            System.out.println("Fila " + (i + 1) + ":");
            for (int j = 0; j < asientos[i].length; j++) {
                if (asientos[i][j] != null) {
                    System.out.println(asientos[i][j]);
                }
            }
        }
    }
}