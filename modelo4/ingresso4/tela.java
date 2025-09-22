package ingresso4;

import java.util.Scanner;

public class tela {
    private final Scanner leitor = new Scanner(System.in);
    private final IngressoVariaveis dados;

    public tela(IngressoVariaveis dados) {
        this.dados = dados;
    }

    public void obterQuantidade() {
        System.out.println("Informe a quantidade de ingressos:");
        dados.quantidade = leitor.nextInt();
    }
    
    public void obterTipo() {
        leitor.nextLine(); // Consome a linha pendente
        System.out.println("Informe o tipo de ingresso (meia ou inteira):");
        dados.tipoIngresso = leitor.nextLine();
    }
    
    public void exibirResultado() {
        if (dados.valorTotal == 0) {
            System.out.println("Tipo de ingresso inválido. O cálculo não foi realizado.");
        } else {
            System.out.println("O total a pagar é R$" + String.format("%.2f", dados.valorTotal));
        }
    }
}
