package acai3;
import java.util.Scanner;

public class entradaAcai {
    static Scanner leitor = new Scanner(System.in);

    public  int pequeno(){
        System.out.println("Informe quantos açais pequenos você deseja: ");
        int qtd = leitor.nextInt();
        return qtd;
    }

    public int medio(){
        System.out.println("Informe quantos açais medio você deseja: ");
        int qtd = leitor.nextInt();
        return qtd;
    }

    public int grande(){
        System.out.println("Informe quantos açais grande você deseja: ");
        int qtd = leitor.nextInt();
        return qtd;
    }
}
