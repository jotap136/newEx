package fila3;


public class fila {
    public static void main(String[] args) {
        processamentofila codigo = new processamentofila();
        tela terminal = new tela();

        int quantidadeAlunos = terminal.obterNumeroInteiro("Informe a quantidade de alunos:");
        
        double[] alturas = codigo.preencherAlturas(quantidadeAlunos);
        
        terminal.ExibirFila(alturas);
    }
}
