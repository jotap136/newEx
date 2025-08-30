import java.util.Scanner;

public class ordemFunc {
     static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int tamanho = obterTamanho("Informe a quantidade de números:");
        int[] array = preencherArray(tamanho);
        String resultado = verificarOrdem(array);
        System.out.println("\nOrganização dos elementos:\n" + resultado);
    }

    public static int obterTamanho(String msg) {
        System.out.println(msg);
        return leitor.nextInt();
    }

    public static int[] preencherArray(int tamanho) {
        int[] array = new int[tamanho];
        System.out.println("Informe os " + tamanho + " números:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Posição " + (i + 1) + ": ");
            array[i] = leitor.nextInt();
        }
        return array;
    }

    public static String verificarOrdem(int[] array) {
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

        if (crescente == true) {
            return "Ordem crescente";
        } else if (decrescente == true) {
            return "Ordem decrescente";
        } else {
            return "Desordenados";
        }
    }
}
