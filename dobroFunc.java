
import java.util.Scanner;

public class dobroFunc {
    Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
    double n1 = numero();
    double dobroo = dobro(n1);
    System.out.println("O dobro do número " + n1 + " é " + dobroo);
    }

    public static double numero(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número para ver o seu valor: ");
        double numero = leitor.nextDouble();
        return numero;
    }

    public static double dobro(double n1){
        Scanner leitor = new Scanner(System.in);
        double somar = n1 * 2;
        return somar;
    }
}
