package noClass;
import java.util.Scanner;

public class naturaisFunc {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = obterNumero("Informe um número inteiro para a soma:");
        int soma = calcularSoma(numero);

        System.out.printf("A soma dos números de 1 a %d é %d.%n", numero, soma);
    }

    public static int obterNumero(String msg) {
        System.out.println(msg);
        return leitor.nextInt();
    }

    public static int calcularSoma(int limite) {
        int total = 0;
        for (int i = 1; i <= limite; i++) {
            total += i;
        }
        return total;
    }
}
