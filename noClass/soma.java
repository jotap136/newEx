package noClass;

import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        double n1 = leitor.nextDouble();

        System.out.println("Informe o segundo valor: ");
        double n2 = leitor.nextDouble();

        double soma = n1 + n2;
        System.out.println("O resultado de " + n1 + " + " + n2 + " é " + soma);
        
    }
}
