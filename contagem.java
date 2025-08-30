import java.util.Scanner;

public class contagem {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o número inicial:");
        int inicio = leitor.nextInt();
        
        System.out.println("Informe o número final:");
        int fim = leitor.nextInt();
        
        if (inicio <= fim) {
            System.out.println("O número inicial deve ser maior que o final");
        } else {
            System.out.println("\nContagem regressiva:");
            for (int i = inicio; i >= fim; i--) {
                System.out.println(i);
            }
        }
        
    }
}