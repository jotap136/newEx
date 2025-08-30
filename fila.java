import java.util.Arrays;
import java.util.Scanner;

public class fila {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a quantidade de alunos:");
        int quantidadeAlunos = leitor.nextInt();
        
        double[] alturas = new double[quantidadeAlunos];
        System.out.println("Informe a altura de cada um dos " + quantidadeAlunos + " alunos:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            alturas[i] = leitor.nextDouble();
        }
        
        Arrays.sort(alturas);
        
        System.out.println("\nFila indiana:");
        for (double altura : alturas) {
            System.out.println(altura);
        }
        
    }
}
