
import java.util.Scanner;

public class acai {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe quantos acais pequenos você deseja: ");
        int qtdpequeno = leitor.nextInt();
        
        System.out.println("Informe quantos acais medios você deseja: ");
        int qtdmedio = leitor.nextInt();

        System.out.println("Informe quantos acais grandes você deseja: ");
        int qtdgrande = leitor.nextInt();

        double valores = (qtdpequeno * 13.50) + (qtdmedio * 15) + (qtdgrande * 17.50);

        System.out.println("O total à pagar é R$" + valores);

    }
    
}
