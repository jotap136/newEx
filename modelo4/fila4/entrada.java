package fila4;

import java.util.Scanner;

public class entrada {
    private final Scanner leitor = new Scanner(System.in);
    private final FilaVariaveis dados;

    public entrada(FilaVariaveis dados) {
        this.dados = dados;
    }

    public void obterQuantidadeAlunos() {
        System.out.println("Informe a quantidade de alunos:");
        dados.quantidadeAlunos = leitor.nextInt();
    }
    
    public void exibirFila() {
        System.out.println("\nFila indiana:");
        for (double altura : dados.alturas) {
            System.out.println(altura);
        }
    }
}
