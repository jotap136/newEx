package noClass;
import java.util.Scanner;

public class quadradoFunc {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int lado = obterLado("Informe o tamanho do lado do quadrado:");
        desenharQuadrado(lado);
    }

    public static int obterLado(String msg) {
        System.out.println(msg);
        return leitor.nextInt();
    }

    public static void desenharQuadrado(int lado) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
