package corrida4;

import java.util.Scanner;

public class entrada {
    private final Scanner leitor = new Scanner(System.in);
    private final CorridaVariaveis dados;

    public entrada(CorridaVariaveis dados) {
        this.dados = dados;
    }

    public void obterNumero() {
        System.out.println("Informe a quantidade de pilotos:");
        dados.quantidadePilotos = leitor.nextInt();
    }
    
    public void preencherPosicoesLargada() {
        dados.largada = new int[dados.quantidadePilotos];
        for (int i = 0; i < dados.quantidadePilotos; i++) {
            System.out.println("Informe a posição de largada do piloto " + (i + 1) + ":");
            dados.largada[i] = leitor.nextInt();
        }
    }
    
    public void preencherPosicoesChegada() {
        dados.chegada = new int[dados.quantidadePilotos];
        for (int i = 0; i < dados.quantidadePilotos; i++) {
            System.out.println("Informe a posição de chegada do piloto " + (i + 1) + ":");
            dados.chegada[i] = leitor.nextInt();
        }
    }
}

