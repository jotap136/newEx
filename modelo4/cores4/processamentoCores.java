package cores4;

public class processamentoCores {
    private final CoresVariaveis dados;

    public processamentoCores(CoresVariaveis dados) {
        this.dados = dados;
    }

    public void misturarCores() {
        if (dados.cor1.equals(dados.cor2)) {
            dados.corFinal = dados.cor1;
        } else if ((dados.cor1.equals("azul") && dados.cor2.equals("amarelo")) || (dados.cor1.equals("amarelo") && dados.cor2.equals("azul"))) {
            dados.corFinal = "Verde";
        } else if ((dados.cor1.equals("vermelho") && dados.cor2.equals("amarelo")) || (dados.cor1.equals("amarelo") && dados.cor2.equals("vermelho"))) {
            dados.corFinal = "Laranja";
        } else if ((dados.cor1.equals("vermelho") && dados.cor2.equals("azul")) || (dados.cor1.equals("azul") && dados.cor2.equals("vermelho"))) {
            dados.corFinal = "Roxo";
        } else {
            dados.corFinal = "invalido";
        }
    }

    public void exibirResultado() {
        if (dados.corFinal.equals("invalido")) {
            System.out.println("Combinação de cores não aceita, informe apenas cores primárias em letra minúscula");
        } else {
            System.out.println("A combinação de cores é: " + dados.corFinal);
        }
    }
}