package dobroArray4;

import java.util.Scanner;

public class entrada {
    private final Scanner leitor = new Scanner(System.in);
    private final ArrayVariaveis dados;

    public entrada(ArrayVariaveis dados) {
        this.dados = dados;
    }

    public void obterNumero() {
        System.out.println("Informe a quantidade de números:");
        dados.tamanho = leitor.nextInt();
    }
    
    public void preencherArray() {
        dados.arrayOriginal = new int[dados.tamanho];
        System.out.println("Informe os " + dados.tamanho + " números:");
        for (int i = 0; i < dados.tamanho; i++) {
            dados.arrayOriginal[i] = leitor.nextInt();
        }
    }
    
    public void exibirArrays() {
        System.out.println("\nArray Inicial:");
        for (int i = 0; i < dados.arrayOriginal.length; i++) {
            System.out.print(dados.arrayOriginal[i] + " ");
        }
        
        System.out.println("\n\nArray com Dobros:");
        for (int i = 0; i < dados.arrayDobro.length; i++) {
            System.out.print(dados.arrayDobro[i] + " ");
        }
    }
}
