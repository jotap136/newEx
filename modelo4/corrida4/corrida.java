package corrida4;

public class corrida {
    public static void main(String[] args) {
        CorridaVariaveis dados = new CorridaVariaveis();
        entrada terminal = new entrada(dados);
        processamentoCorrida codigo = new processamentoCorrida(dados);
        
        terminal.obterNumero();
        
        System.out.println("--- Posição de Largada ---");
        terminal.preencherPosicoesLargada();
        
        System.out.println("\n--- Posição de Chegada ---");
        terminal.preencherPosicoesChegada();
        
        codigo.analisarPerformance();
    }
}

