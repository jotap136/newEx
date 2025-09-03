package noClass;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorFunc {
    static Scanner leitor = new Scanner(System.in);
    static GerenciadorTarefas gerenciador = new GerenciadorTarefas();

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
        System.out.println("1. Nova tarefa");
        System.out.println("2. Listar tarefas");
        System.out.println("3. Remover tarefa");
        System.out.println("4. Alterar tarefa");
        System.out.println("5. Marcar como concluída");
        System.out.println("0. Sair");
        System.out.print("Eleitorolha uma opção: ");
    }

    public static void executarOpcao(int opcao) {
        switch (opcao) {
            case 1 -> novaTarefa();
            case 2 -> gerenciador.listar();
            case 3 -> removerTarefa();
            case 4 -> alterarTarefa();
            case 5 -> concluirTarefa();
            case 0 -> System.out.println("Saindo...");
            default -> System.out.println("Opção inválida!");
        }
    }

    public static void novaTarefa() {
        System.out.print("Informe o código da tarefa: ");
        String codigo = leitor.nextLine();
        System.out.print("Informe a descrição da tarefa: ");
        String descricao = leitor.nextLine();
        gerenciador.novaTarefa(new Tarefa(codigo, descricao));
        System.out.println("Tarefa adicionada!");
    }

    public static void removerTarefa() {
        gerenciador.listar();
        System.out.print("Informe o número da tarefa para remover: ");
        int posicao = leitor.nextInt();
        leitor.nextLine();
        gerenciador.remover(posicao);
    }

    public static void alterarTarefa() {
        gerenciador.listar();
        System.out.print("Informe o número da tarefa para alterar: ");
        int posicao = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Novo código: ");
        String codigo = leitor.nextLine();
        System.out.print("Nova descrição: ");
        String descricao = leitor.nextLine();
        gerenciador.alterar(posicao, codigo, descricao);
    }

    public static void concluirTarefa() {
        gerenciador.listar();
        System.out.print("Informe o número da tarefa para concluir: ");
        int posicao = leitor.nextInt();
        leitor.nextLine();
        gerenciador.concluir(posicao);
    }
}

class GerenciadorTarefas {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void novaTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void listar() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa t = tarefas.get(i);
            String status = t.concluida ? "x" : " ";
            System.out.println((i) + ". (" + status + ") " + t.codigo + " - " + t.descricao);
        }
    }

    public void remover(int posicao) {
        if (posicao >= 0 && posicao < tarefas.size()) {
            tarefas.remove(posicao);
            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("Posição inválida!");
        }
    }

    public void alterar(int posicao, String codigo, String descricao) {
        if (posicao >= 0 && posicao < tarefas.size()) {
            Tarefa t = tarefas.get(posicao);
            t.codigo = codigo;
            t.descricao = descricao;
            System.out.println("Tarefa alterada com sucesso!");
        } else {
            System.out.println("Posição inválida!");
        }
    }

    public void concluir(int posicao) {
        if (posicao >= 0 && posicao < tarefas.size()) {
            tarefas.get(posicao).concluida = true;
            System.out.println("Tarefa marcada como concluída!");
        } else {
            System.out.println("Posição inválida!");
        }
    }
}

class Tarefa {
    String codigo;
    String descricao;
    boolean concluida;

    public Tarefa(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.concluida = false;
    }
}
