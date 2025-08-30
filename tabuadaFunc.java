
import java.util.Scanner;

public class tabuadaFunc {
    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
        int numero = obterNumero("Informe um número para a tabuada:");
        
        mostrarTabuada(numero);
    }
    public static int obterNumero(String mensagem) {
        System.out.println(mensagem);
        int numero = leitor.nextInt();
        leitor.close();
        return numero;
    }
    
    public static void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }
    }
}
