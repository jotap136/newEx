package dobroarray3;

import java.util.Scanner;

public class processamentoDobro {
    static Scanner leitor = new Scanner(System.in);

    public static int[] criarArray(int tamanho) {
        int[] array = new int[tamanho];
        System.out.println("Informe os " + tamanho + " números:");
        for (int i = 0; i < tamanho; i++) {
            array[i] = leitor.nextInt();
        }
        return array;
    }
    public static int[] dobrarValores(int[] arrayOriginal) {
        int[] arrayDobro = new int[arrayOriginal.length];
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayDobro[i] = arrayOriginal[i] * 2;
        }
        return arrayDobro;
    }
}
