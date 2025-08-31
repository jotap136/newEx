import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciador {
   public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> codigos = new ArrayList<>();
        ArrayList<String> descricoes = new ArrayList<>();
        ArrayList<Boolean> concluidas = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Adicionar nova tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Remover tarefa");
            System.out.println("4. Alterar tarefa");
            System.out.println("5. Marcar como concluída");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leitor.nextInt();
            leitor.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Informe o código da tarefa: ");
                    String codigo = leitor.nextLine();
                    System.out.print("Informe a descrição da tarefa: ");
                    String descricao = leitor.nextLine();
                    codigos.add(codigo);
                    descricoes.add(descricao);
                    concluidas.add(false);
                    System.out.println("Tarefa adicionada!");
                    break;

                case 2:
                    if (codigos.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        for (int i = 0; i < codigos.size(); i++) {
                            String status = concluidas.get(i) ? "x" : " ";
                            System.out.printf("%d. (%s) %s - %s%n", i, status, codigos.get(i), descricoes.get(i));
                        }
                    }
                    break;

                case 3:
                    if (codigos.isEmpty()) {
                        System.out.println("Nenhuma tarefa para remover.");
                        break;
                    }
                    System.out.print("Informe o número da tarefa para remover: ");
                    int posicaoRemover = leitor.nextInt();
                    leitor.nextLine();

                    if (posicaoRemover >= 0 && posicaoRemover < codigos.size()) {
                        codigos.remove(posicaoRemover);
                        descricoes.remove(posicaoRemover);
                        concluidas.remove(posicaoRemover);
                        System.out.println("Tarefa removida com sucesso!");
                    } else {
                        System.out.println("Posição inválida!");
                    }
                    break;

                case 4:
                    if (codigos.isEmpty()) {
                        System.out.println("Nenhuma tarefa para alterar.");
                        break;
                    }
                    System.out.print("Informe o número da tarefa para alterar: ");
                    int posicaoAlterar = leitor.nextInt();
                    leitor.nextLine();

                    if (posicaoAlterar >= 0 && posicaoAlterar < codigos.size()) {
                        System.out.print("Novo código: ");
                        String novoCodigo = leitor.nextLine();
                        System.out.print("Nova descrição: ");
                        String novaDescricao = leitor.nextLine();
                        codigos.set(posicaoAlterar, novoCodigo);
                        descricoes.set(posicaoAlterar, novaDescricao);
                        System.out.println("Tarefa alterada com sucesso!");
                    } else {
                        System.out.println("Posição inválida!");
                    }
                    break;

                case 5:
                    if (codigos.isEmpty()) {
                        System.out.println("Nenhuma tarefa para concluir.");
                        break;
                    }
                    System.out.print("Informe o número da tarefa para concluir: ");
                    int posicaoConcluir = leitor.nextInt();
                    leitor.nextLine();

                    if (posicaoConcluir >= 0 && posicaoConcluir < codigos.size()) {
                        concluidas.set(posicaoConcluir, true);
                        System.out.println("Tarefa marcada como concluída!");
                    } else {
                        System.out.println("Posição inválida!");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
        leitor.close();
    } 
}
