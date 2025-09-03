package noClass;
import java.util.Random;
import java.util.Scanner;

public class sorteioFunc {
    static Scanner leitor = new Scanner(System.in);
    static final int TENTATIVAS_MAX = 10;
    static final int NUMERO_MIN = 0;
    static final int NUMERO_MAX = 1000;

    public static void main(String[] args) {
        exibirMenu();
        int numeroSorteado = sortearNumero(NUMERO_MIN, NUMERO_MAX);
        jogar(numeroSorteado);
        leitor.close();
    }

    public static void exibirMenu() {
        System.out.println("--- Jogo do Número Premiado ---");
        System.out.println("O objetivo é adivinhar o número sorteado entre " + NUMERO_MIN + " e " + NUMERO_MAX + " em no máximo " + TENTATIVAS_MAX + " tentativas.");
        System.out.println("Vamos começar!");
    }

    public static int sortearNumero(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void jogar(int numeroSorteado) {
        int tentativas = 0;
        boolean acertou = false;

        while (tentativas < TENTATIVAS_MAX && !acertou) {
            int chute = obterNumero("Sua escolha:");
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

    public static int obterNumero(String mensagem) {
        System.out.println(mensagem);
        while (!leitor.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
            leitor.next(); // Limpar a entrada
        }
        return leitor.nextInt();
    }
}
