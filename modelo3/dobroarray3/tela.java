package dobroarray3;

import java.util.Scanner;

public class tela {
    static Scanner leitor = new Scanner(System.in);

    public static int obterNumero(String msg) {
        System.out.println(msg);
        return leitor.nextInt();
    }
    public static void exibirArrays(int[] arrayOriginal, int[] arrayDobro) {
        System.out.println("\nArray Inicial:");
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.print(arrayOriginal[i] + " ");
        }
        
        System.out.println("\n\nArray com Dobros:");
        for (int i = 0; i < arrayDobro.length; i++) {
            System.out.print(arrayDobro[i] + " ");
        }
    }
}
