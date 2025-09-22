package fila4;

import java.util.Arrays;
import java.util.Scanner;

public class processamentofila {
    private final Scanner leitor = new Scanner(System.in);
    private final FilaVariaveis dados;

    public processamentofila(FilaVariaveis dados) {
        this.dados = dados;
    }

    public void preencherAlturas() {
        dados.alturas = new double[dados.quantidadeAlunos];
        System.out.println("Informe a altura de cada um dos " + dados.quantidadeAlunos + " alunos:");
        for (int i = 0; i < dados.quantidadeAlunos; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            dados.alturas[i] = leitor.nextDouble();
        }
    }

    public void ordenarFila() {
        Arrays.sort(dados.alturas);
    }
}
