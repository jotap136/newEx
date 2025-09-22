package contagem3;



public class contagem{
    public static void main(String[] args) {
        
    
    entrada terminal = new entrada();
    processamentoContagem valor = new processamentoContagem();

    int inicio = terminal.obterValor("Informe o número inicial: ");
    int fim = terminal.obterValor("informe o número final: ");
    if (inicio <= fim) {
            System.out.println("O número inicial deve ser maior que o final");
        } else {
            System.out.println("\nContagem regressiva:");
            valor.contarRegressivamente(inicio, fim);
        }
    }
}