package ingresso4;

public class processamentoingressos {
    private final IngressoVariaveis dados;

    public processamentoingressos(IngressoVariaveis dados) {
        this.dados = dados;
    }

    public void calcularValor() {
        switch (dados.tipoIngresso.toLowerCase()) {
            case "meia":
                dados.valorTotal = dados.quantidade * 14.25;
                break;
            case "inteira":
                dados.valorTotal = dados.quantidade * 28.50;
                break;
            default:
                dados.valorTotal = 0; // Valor para indicar que o cálculo não foi possível
                break;
        }
    }
}
