package dobroArray4;


public class dobroarray {
    public static void main(String[] args) {
        ArrayVariaveis dados = new ArrayVariaveis();
        entrada terminal = new entrada(dados);
        processamentoDobro codigo = new processamentoDobro(dados);
        
        terminal.obterNumero();
        terminal.preencherArray();
        codigo.dobrarValores();
        
        terminal.exibirArrays();
    }
}
