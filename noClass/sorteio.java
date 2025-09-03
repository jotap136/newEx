package noClass;
import java.util.Random;
import java.util.Scanner;

public class sorteio {
   public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();

        final int TENTATIVAS_MAX = 10;
        final int NUMERO_MIN = 0;
        final int NUMERO_MAX = 1000;
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("--- Jogo do Número Premiado ---");
        System.out.println("O objetivo é adivinhar o número sorteado entre " + NUMERO_MIN + " e " + NUMERO_MAX + " em no máximo " + TENTATIVAS_MAX + " tentativas.");
        System.out.println("Vamos começar!");

        int numeroSorteado = random.nextInt(NUMERO_MAX - NUMERO_MIN + 1) + NUMERO_MIN;

        while (tentativas < TENTATIVAS_MAX && !acertou) {
            System.out.println("Sua escolha:");
            
            while (!leitor.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                leitor.next(); // Limpar a entrada
            }
            int chute = leitor.nextInt();
            tentativas++;

            if (chute == numeroSorteado) {
                System.out.println("Acertou!");
                acertou = true;
            } else if (chute > numeroSorteado) {
                System.out.println("Menor");
            } else {
                System.out.println("Maior");
            }
        }

        if (!acertou) {
            System.out.println("Perdeu. O número era " + numeroSorteado);
        }

    } 
}
