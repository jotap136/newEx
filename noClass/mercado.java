package noClass;
import java.util.Scanner;

public class mercado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int totalItens = 0;
        double subtotal = 0.0;
        int opcao;
        
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Exibir subtotal");
            System.out.println("3. Finalizar compra");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = leitor.nextInt();
            leitor.nextLine(); // Limpar o buffer
            
            switch (opcao) {
                case 1:
                    System.out.print("Informe o nome do Produto: ");
                    String nome = leitor.nextLine();
                    System.out.print("Informe a Quantidade: ");
                    int qtd = leitor.nextInt();
                    System.out.print("Informe o preço da Unidade: ");
                    double preco = leitor.nextDouble();
                    leitor.nextLine(); // Limpar o buffer
                    
                    totalItens += qtd;
                    subtotal += qtd * preco;
                    
                    System.out.println("Produto adicionado.");
                    break;
                    
                case 2:
                    System.out.printf("(%d itens) - Subtotal R$ %.2f%n", totalItens, subtotal);
                    System.out.println("Continue comprando.");
                    break;
                    
                case 3:
                    System.out.printf("(%d itens) - Total R$ %.2f%n", totalItens, subtotal);
                    System.out.println("Compra finalizada.");
                    System.out.println("Iniciando nova compra.");
                    
                    // Resetar os valores para uma nova compra
                    totalItens = 0;
                    subtotal = 0.0;
                    break;
                    
                case 0:
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
        
    }
}
