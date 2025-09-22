package aprovado3;

import java.util.Scanner;


public class aprovado {
    Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
        processamentoAprovado processamento = new processamentoAprovado();
        double notas = processamento.notas();
        double media = processamento.media(notas);
        System.out.println("A média das suas notas é " + String.format("%.2f", media));
        String situacao = processamento.passou(media);
        System.out.println(situacao);
    }
}
