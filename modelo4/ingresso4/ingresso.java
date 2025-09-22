package ingresso4;


public class ingresso {
    public static void main(String[] args) {
        IngressoVariaveis dados = new IngressoVariaveis();
        tela terminal = new tela(dados);
        processamentoingressos codigo = new processamentoingressos(dados);
        
        terminal.obterQuantidade();
        terminal.obterTipo();
        
        codigo.calcularValor();
        
        terminal.exibirResultado();
    }
}
