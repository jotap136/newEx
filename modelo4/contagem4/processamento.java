package contagem4;

public class processamento {
    private final variaveis dados;

    public processamento(variaveis dados) {
        this.dados = dados;
    }

    public void contarRegressivamente() {
        for (int i = dados.inicio; i >= dados.fim; i--) {
            System.out.println(i);
        }
    }
}
