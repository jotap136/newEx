import java.util.Arrays;
import java.util.Scanner;

public class filaFunc {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int quantidadeAlunos = obterNumeroInteiro("Informe a quantidade de alunos:");
        
        double[] alturas = preencherAlturas(quantidadeAlunos);
        
        ExibirFila(alturas);
    }
    
    public static int obterNumeroInteiro(String mensagem) {
        System.out.println(mensagem);
        return leitor.nextInt();
    }

    public static double[] preencherAlturas(int quantidade) {
        double[] alturas = new double[quantidade];
        System.out.println("Informe a altura de cada um dos " + quantidade + " alunos:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            alturas[i] = leitor.nextDouble();
        }
        return alturas;
    }

    public static void ExibirFila(double[] alturas) {
        Arrays.sort(alturas);
        
        System.out.println("\nFila indiana:");
        for (double altura : alturas) {
            System.out.println(altura);
        }
    }
}
