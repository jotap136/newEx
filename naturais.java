import java.util.Scanner;

public class naturais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int total = 0;

        System.out.println("Informe um número inteiro para a soma:");
        int limite = leitor.nextInt();

        for (int i = 1; i <= limite; i++) {
            total += i;
        }

        System.out.printf("A soma dos números de 1 a %d é %d.%n", limite, total);
        
    }
}
