public class punto2 {
    public int MayorMatriz(int d) {
        int[][] m = new int[d][d];
        metodos M = new metodos();
        m = M.LlenarMatriz(m);
        int Mayor = M.MayorMatriz(m);
        M.MostarMatriz(m);

        return Mayor;
    }
}