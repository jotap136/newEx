package noClass;

import java.util.Scanner;

public class somaFunc {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        double n1 = valores("Informe o primeiro valor:");
        double n2 = valores("Informe o segundo valor: ");
        double funcao = soma(n1, n2);
        System.out.println("O resultado de " + n1 + " + " + n2 + " é " + funcao);
    }

    public static double valores(String msg){
        System.out.println(msg);
        return leitor.nextDouble();

    }

    public static double soma(double n1, double n2){
        double soma = n1 + n2;
        return soma;
    }
}
