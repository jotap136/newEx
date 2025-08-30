import java.util.Scanner;

public class DobroArray {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de números:");
        int tamanho = leitor.nextInt();
        
        int[] arrayOriginal = new int[tamanho];
        int[] arrayDobro = new int[tamanho];
        
        System.out.println("Informe os " + tamanho + " números:");
        for (int i = 0; i < tamanho; i++) {
            arrayOriginal[i] = leitor.nextInt();
            arrayDobro[i] = arrayOriginal[i] * 2;
        }
        
        System.out.println("\nArray Inicial:");
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.print(arrayOriginal[i] + " ");
        }
        
        System.out.println("\n\nArray com Dobros:");
        for (int i = 0; i < arrayDobro.length; i++) {
            System.out.print(arrayDobro[i] + " ");
        }
        System.out.println();
        
    }
}