import java.util.Scanner;

public class acaiFunc {
    public static void main(String[] args) {
        int qtdP = pequeno();
        int qtdM = medio();
        int qtdG = grande();
        double somaaaa = conta(qtdP, qtdM, qtdG);
        System.out.println("O total a pagar é: " + somaaaa);
    }
    public static int pequeno(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe quantos açais pequenos você deseja: ");
        int qtd = leitor.nextInt();
        return qtd;
    }

    public static int medio(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe quantos açais medio você deseja: ");
        int qtd = leitor.nextInt();
        return qtd;
    }

    public static int grande(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe quantos açais grande você deseja: ");
        int qtd = leitor.nextInt();
        return qtd;
    }

    public static double conta(int qtdP, int qtdM, int qtdG){
        double pequeno = qtdP * 13.50;
        double medio = qtdM * 15;
        double grande = qtdG * 17.50;
        double soma = pequeno + medio + grande;
        return soma;
    }
    }
