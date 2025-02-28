public class punto1 {
    public int SumaMatriz(int d) {
        int[][] m = new int[d][d];
        metodos M = new metodos();
        m = M.LlenarMatriz(m);
        int suma = 0;
        suma = M.SumaTotal(m);
        M.MostarMatriz(m);
        return suma;

    }
}
