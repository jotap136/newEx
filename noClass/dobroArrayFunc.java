package noClass;
import java.util.Scanner;

public class dobroArrayFunc {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int tamanho = obterNumero("Informe a quantidade de números:");
        
        int[] arrayOriginal = criarArray(tamanho);
        int[] arrayDobro = dobrarValores(arrayOriginal);
        
        exibirArrays(arrayOriginal, arrayDobro);
    }

    public static int obterNumero(String msg) {
        System.out.println(msg);
        return leitor.nextInt();
    }

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