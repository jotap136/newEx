package dobroarray3;


public class dobroarray {
    public static void main(String[] args) {
        processamentoDobro codigo = new processamentoDobro();
        tela terminal = new tela();

        int tamanho = terminal.obterNumero("Informe a quantidade de números:");
        
        int[] arrayOriginal = codigo.criarArray(tamanho);
        int[] arrayDobro = codigo.dobrarValores(arrayOriginal);
        
        terminal.exibirArrays(arrayOriginal, arrayDobro);
    }
}
