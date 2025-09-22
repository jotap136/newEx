package fila4;


public class fila {
    public static void main(String[] args) {
        FilaVariaveis dados = new FilaVariaveis();
        entrada terminal = new entrada(dados);
        processamentofila codigo = new processamentofila(dados);
        
        terminal.obterQuantidadeAlunos();
        codigo.preencherAlturas();
        
        codigo.ordenarFila();
        terminal.exibirFila();
    }
}
