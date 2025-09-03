package noClass;
import java.util.Scanner;

public class ordem {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a quantidade de números:");
        int tamanho = leitor.nextInt();

        int[] array = new int[tamanho];
        System.out.println("Informe os " + tamanho + " números:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Posição " + (i + 1) + ": ");
            array[i] = leitor.nextInt();
        }

        boolean crescente = true;
        boolean decrescente = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                crescente = false;
            }
            if (array[i] < array[i + 1]) {
                decrescente = false;
            }
        }

        String resultado;
        if (crescente == true) {
            resultado = "Ordem crescente";
        } else if (decrescente == true) {
            resultado = "Ordem decrescente";
        } else {
            resultado = "Desordenados";
        }

        System.out.println("\nOrganização dos elementos:\n" + resultado);
        
    }
}
