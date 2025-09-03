package noClass;
import java.util.Scanner;

public class quadrado {
     public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o tamanho do lado do quadrado:");
        int lado = leitor.nextInt();

        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
