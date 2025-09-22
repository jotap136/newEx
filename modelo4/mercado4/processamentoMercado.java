package mercado4;

import java.util.Scanner;

public class processamentoMercado {
    private final MercadoVariaveis dados;
    private final Scanner leitor;

    public processamentoMercado(MercadoVariaveis dados, Scanner leitor) {
        this.dados = dados;
        this.leitor = leitor;
    }
    
    public void menu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Adicionar produto");
        System.out.println("2. Exibir subtotal");
        System.out.println("3. Finalizar compra");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    public void executarOpcao(int opcao) {
        switch (opcao) {
            case 1 -> adicionarProduto();
            case 2 -> exibirSubtotal();
            case 3 -> finalizarCompra();
            case 0 -> System.out.println("Saindo...");
            default -> System.out.println("Opção inválida!");
        }
    }
    
    private void adicionarProduto() {
        System.out.print("Informe o nome do Produto: ");
        leitor.nextLine(); // Consumir a nova linha pendente
        String nome = leitor.nextLine();
        System.out.print("Informe a Quantidade: ");
        int qtd = leitor.nextInt();
        System.out.print("Informe o preço da Unidade: ");
        double preco = leitor.nextDouble();
        leitor.nextLine(); // Consumir a nova linha pendente

        dados.totalItens += qtd;
        dados.subtotal += qtd * preco;

        System.out.println("Produto adicionado.");
    }
    
    private void exibirSubtotal() {
        System.out.printf("(%d itens) - Subtotal R$ %.2f%n", dados.totalItens, dados.subtotal);
        System.out.println("Continue comprando.");
    }
    
    private void finalizarCompra() {
        System.out.printf("(%d itens) - Total R$ %.2f%n", dados.totalItens, dados.subtotal);
        System.out.println("Compra finalizada.");
        System.out.println("Iniciando nova compra.");

        dados.totalItens = 0;
        dados.subtotal = 0.0;
    }
}
