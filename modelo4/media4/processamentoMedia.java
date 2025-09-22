package media4;

public class processamentoMedia {
    private final NotasVariaveis dados;

    public processamentoMedia(NotasVariaveis dados) {
        this.dados = dados;
    }

    public void calcularMedia() {
        dados.media = dados.somaNotas / 3;
    }
}
