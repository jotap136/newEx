
import java.util.Scanner;

public class dobro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um valor para saber seu dobro: ");
        double n1 = leitor.nextDouble();

        double dobro = n1 * 2;
        System.out.println("O dobro do valor informado é: " + dobro);
        
    }
}
