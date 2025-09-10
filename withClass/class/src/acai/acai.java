package acai;
import java.util.Scanner;

public class acai {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        entradaAcai entrada = new entradaAcai();
        processamento procAcai = new processamento();

        int qtdP = entrada.pequeno();
        int qtdM = entrada.medio();
        int qtdG = entrada.grande();
        double somaaaa = procAcai.conta(qtdP, qtdM, qtdG);
        System.out.println("O total a pagar é: " + somaaaa);
        
    }
    
}

