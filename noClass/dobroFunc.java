package noClass;

import java.util.Scanner;

public class dobroFunc {
    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
    double n1 = numero();
    double dobroo = dobro(n1);
    System.out.println("O dobro do número " + n1 + " é " + dobroo);
    }

    public static double numero(){

        System.out.println("Informe um número para ver o seu valor: ");
        double numero = leitor.nextDouble();
        return numero;
    }

    public static double dobro(double n1){
        double somar = n1 * 2;
        return somar;
    }
}
