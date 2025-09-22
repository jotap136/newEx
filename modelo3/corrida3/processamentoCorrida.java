package corrida3;

import java.util.Scanner;

public class processamentoCorrida {
    static Scanner leitor = new Scanner(System.in);
    public static int[] preencherPosicoes(int quantidade) {
        int[] posicoes = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Informe a posição do piloto " + (i + 1) + ":");
            posicoes[i] = leitor.nextInt();
        }
        return posicoes;
    }
    public static void analisarPerformance(int[] largada, int[] chegada) {
        System.out.println("\n--- Análise de Performance ---");
        for (int i = 0; i < largada.length; i++) {
            int largadaPos = largada[i];
            int chegadaPos = chegada[i];
            int diferenca = largadaPos - chegadaPos;
            
            if (diferenca > 0) {
                System.out.println("O piloto " + (i + 1) + " avançou " + diferenca + " posições");
            } else if (diferenca < 0) {
                System.out.println("O piloto " + (i + 1) + " retrocedeu " + Math.abs(diferenca) + " posições");
            } else {
                System.out.println("O piloto " + (i + 1) + " manteve a posição");
            }
        }
    }
}
