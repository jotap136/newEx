import java.util.Scanner;

public class mercadoFunc {
   static Scanner leitor = new Scanner(System.in);

    static int totalItens = 0;
    static double subtotal = 0.0;

    public static void main(String[] args) {
        int opcao;
        do {
            menu();
            opcao = leitor.nextInt();
            leitor.nextLine(); 
            executarOpcao(opcao);
        } while (opcao != 0);
    }


    public static void menu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Adicionar produto");
        System.out.println("2. Exibir subtotal");
        System.out.println("3. Finalizar compra");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void executarOpcao(int opcao) {
        switch (opcao) {
            case 1 -> adicionarProduto();
            case 2 -> exibirSubtotal();
            case 3 -> finalizarCompra();
            case 0 -> System.out.println("Saindo...");
            default -> System.out.println("Opção inválida!");
        }
    }

    public static void adicionarProduto() {
        System.out.print("Informe o nome do Produto: ");
        String nome = leitor.nextLine();
        System.out.print("Informe a Quantidade: ");
        int qtd = leitor.nextInt();
        System.out.print("Informe o preço da Unidade: ");
        double preco = leitor.nextDouble();
        leitor.nextLine(); 

        totalItens += qtd;
        subtotal += qtd * preco;

        System.out.println("Produto adicionado.");
    }

    public static void exibirSubtotal() {
        System.out.printf("(%d itens) - Subtotal R$ %.2f%n", totalItens, subtotal);
        System.out.println("Continue comprando.");
    }

    public static void finalizarCompra() {
        System.out.printf("(%d itens) - Total R$ %.2f%n", totalItens, subtotal);
        System.out.println("Compra finalizada.");
        System.out.println("Iniciando nova compra.");

        totalItens = 0;
        subtotal = 0.0;
    } 
}
