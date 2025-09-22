package ingresso3;

import java.util.Scanner;

public class processamentoingressos {
    static Scanner leitor = new Scanner(System.in);
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
