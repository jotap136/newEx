package noClass;
import java.util.Scanner;

public class corrida {
     public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de pilotos:");
        int quantidadePilotos = leitor.nextInt();
        
        int[] largada = new int[quantidadePilotos];
        int[] chegada = new int[quantidadePilotos];
        
        // Posição de Largada
        System.out.println("\n--- Posição de Largada ---");
        for (int i = 0; i < quantidadePilotos; i++) {
            System.out.println("Informe a posição do piloto " + (i + 1) + ":");
            largada[i] = leitor.nextInt();
        }
        
        // Posição de Chegada
        System.out.println("\n--- Posição de Chegada ---");
        for (int i = 0; i < quantidadePilotos; i++) {
            System.out.println("Informe a posição do piloto " + (i + 1) + ":");
            chegada[i] = leitor.nextInt();
        }
        
        // Análise de Performance
        System.out.println("\n--- Análise de Performance ---");
        for (int i = 0; i < quantidadePilotos; i++) {
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
