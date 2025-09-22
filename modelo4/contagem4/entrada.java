package contagem4;

import java.util.Scanner;

public class entrada {
    private final Scanner leitor = new Scanner(System.in);
    private final variaveis dados;

    public entrada(variaveis dados) {
        this.dados = dados;
    }

    public void obterValores() {
        System.out.println("Informe o número inicial: ");
        dados.inicio = leitor.nextInt();
        
        System.out.println("Informe o número final: ");
        dados.fim = leitor.nextInt();
    }
}
