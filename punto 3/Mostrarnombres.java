class Mostrarnombres {
    public static void mostrar(Libro[][] libros) {
        System.out.println("\nContenido de la matriz de libros:");
        for (int i = 0; i < libros.length; i++) {
            if (libros[i][0] != null) {
                System.out.println(libros[i][0]);
            }
        }
    }
}