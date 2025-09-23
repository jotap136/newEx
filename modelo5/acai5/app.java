package acai5;

import java.util.Scanner;

public class app {
    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
        processamento codigo = new processamento();
        tela terminal = new tela();

        
        codigo.qtdP = terminal.obterQuantidade("Informe a quantidade de acai pequenos: ");
        codigo.qtdM = terminal.obterQuantidade("informe a quantidade de acai medio: ");
        codigo.qtdG = terminal.obterQuantidade("informe a quantidade de acai grande: ");

        codigo.desconto = terminal.obterDesconto("informe o porcentagem do desconto");

        codigo.mostrarTotal();
        terminal.exibir(codigo.lerDesconto(), codigo.lerTotal());

    }
}
