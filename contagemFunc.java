
import java.util.Scanner;

public class contagemFunc {
    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
        int inicio = obterValor("Informe o número inicial:");
        int fim = obterValor("Informe o número final:");
        
        
        if(inicio <= fim){
                System.out.println("O número inicial deve ser maior que o final");
            }
        else{
            System.out.println("\nContagem regressiva:");
            contarRegressivamente(inicio, fim);
        }
    }

    public static int obterValor(String msg) {
        System.out.println(msg);
        int valor = leitor.nextInt();
        return valor;
    }
    
    public static void contarRegressivamente(int inicio, int fim) {
        for (int i = inicio; i >= fim; i--) {
            System.out.println(i);
        }
    }
}
