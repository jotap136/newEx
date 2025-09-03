package noClass;

import java.util.Scanner;

public class ingressoFunc {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        String mensagem = ingressos("Informe a quantidade de ingressos:");
        double ingressos = Double.parseDouble(mensagem);
        double ingressosValor = qtdingressos(ingressos);
        System.out.println("O total a pagar é R$" + String.format("%.2f", ingressosValor));

    }

    public static String ingressos(String msg){
        System.out.println(msg);
        return leitor.nextLine();
    }

    public static double qtdingressos(double ingressos){
    double qtdIngressos = 0;
    System.out.println("Informe o tipo de ingresso: ");
    String tipoIngresso = leitor.nextLine();
    double preco;    
    switch (tipoIngresso) {
            case "meia":
                preco = ingressos * 14.25;
                break;
            case "inteira":
                preco = ingressos * 28.50;
                break;
            default:
                System.out.println("Tipo de ingresso inválido");
                return 0;
                
        }
        return preco;
    }
}
