import java.util.Scanner;

public class processamento {
    static Scanner leitor = new Scanner(System.in);
    public double conta(int qtdP, int qtdM, int qtdG){
        double pequeno = qtdP * 13.50;
        double medio = qtdM * 15;
        double grande = qtdG * 17.50;
        double soma = pequeno + medio + grande;
        return soma;
    }
}
