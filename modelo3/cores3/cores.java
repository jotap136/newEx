package cores3;



public class cores {
    public static void main(String[] args) {
        processamentoCores cor = new processamentoCores();
        tela terminal = new tela();

        String cor1 = terminal.pegarCor("informe a primeira cor primária:");
        String cor2 = terminal.pegarCor("informe a segunda cor primária: ");

        String corFinal = cor.misturarCores(cor1, cor2);
        cor.exibirResultado(corFinal);
        
    }
}
