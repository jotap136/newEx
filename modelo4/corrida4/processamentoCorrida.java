package corrida4;

public class processamentoCorrida {
    private final CorridaVariaveis dados;

    public processamentoCorrida(CorridaVariaveis dados) {
        this.dados = dados;
    }

    public void analisarPerformance() {
        System.out.println("\n--- Análise de Performance ---");
        for (int i = 0; i < dados.largada.length; i++) {
            int largadaPos = dados.largada[i];
            int chegadaPos = dados.chegada[i];
            int diferenca = largadaPos - chegadaPos;
            
            if (diferenca > 0) {
                System.out.println("O piloto " + (i + 1) + " avançou " + diferenca + " posições");
            } else if (diferenca < 0) {
                System.out.println("O piloto " + (i + 1) + " retrocedeu " + Math.abs(diferenca) + " posições");
            } else {
                System.out.println("O piloto " + (i + 1) + " manteve a posição");
            }
        }
    }
}
