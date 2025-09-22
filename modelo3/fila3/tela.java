package fila3;

import java.util.Arrays;
import java.util.Scanner;

public class tela {
        static Scanner leitor = new Scanner(System.in);

    public static int obterNumeroInteiro(String mensagem) {
        System.out.println(mensagem);
        return leitor.nextInt();
    }
    public static void ExibirFila(double[] alturas) {
        Arrays.sort(alturas);
        
        System.out.println("\nFila indiana:");
        for (double altura : alturas) {
            System.out.println(altura);
        }
    }
    
}
