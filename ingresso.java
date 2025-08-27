
import java.util.Scanner;

public class ingresso {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        System.out.println("Informe a quantidade de ingressos que deseja: ");
        double qtdingressos = leitor.nextDouble();
        
        leitor.nextLine();

        System.out.println("Informe o tipo de ingresso: ");
        String tipoIngresso = leitor.nextLine();

        switch (tipoIngresso) {
            case "meia":
                qtdingressos = qtdingressos * 14.25;
                break;
            case "inteira":
                qtdingressos = qtdingressos * 28.50;
                break;
            default:
                System.out.println("Tipo de ingresso inválido");
                break;
        }
        System.out.println("O total a pagar é R$" + String.format("%.2f", qtdingressos));
    }
}
