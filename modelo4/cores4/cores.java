package cores4;


public class cores {
    public static void main(String[] args) {
        CoresVariaveis dados = new CoresVariaveis();
        entrada terminal = new entrada(dados);
        processamentoCores proc = new processamentoCores(dados);

        terminal.pegarCor("Informe a primeira cor primária:");
        terminal.pegarCor("Informe a segunda cor primária:");

        proc.misturarCores();
        proc.exibirResultado();
    }
}
