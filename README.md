import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0, d = 0;
        System.out.println("ingrese la dimensión de la matriz");
        d = sc.nextInt();
        System.out.println("ingrese el punto a visualizar de 1 a 11");
        opt = sc.nextInt();
        switch (opt) {
            case 1:
                punto1 p1 = new punto1();
                int suma = p1.SumaMatriz(d);
                System.out.println("la suma de la matriz es: " + suma);
                break;
            case 2:
                punto2 p2 = new punto2();
                int Mayor = p2.MayorMatriz(d);
                System.out.println("el valor mayor en la matriz es: " + Mayor);
                break;

            default:
                System.out.println("pagina en mantenimiento");
                break;
        }

    }
}
