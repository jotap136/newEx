package corrida3;



public class corrida {
    public static void main(String[] args) {
        processamentoCorrida codigo = new processamentoCorrida();
        tela terminal = new tela();
        
        int quantidadePilotos = terminal.obterNumero("Informe a quantidade de pilotos:");

        System.out.println("--- Posição de Largada ---");
        int[] largada = codigo.preencherPosicoes(quantidadePilotos);

        System.out.println("\n--- Posição de Chegada ---");
        int[] chegada = codigo.preencherPosicoes(quantidadePilotos);
        
        codigo.analisarPerformance(largada, chegada);
    }
}
