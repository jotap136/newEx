package acai4;

import java.util.Scanner;

public class entradaAcai {
    private final Scanner leitor = new Scanner(System.in);
    private final AcaiVariaveis dados;

    public entradaAcai(AcaiVariaveis dados) {
        this.dados = dados;
    }

    public void pequeno() {
        System.out.println("Informe quantos açaís pequenos você deseja: ");
        dados.qtdP = leitor.nextInt();
    }

    public void medio() {
        System.out.println("Informe quantos açaís médio você deseja: ");
        dados.qtdM = leitor.nextInt();
    }

    public void grande() {
        System.out.println("Informe quantos açaís grande você deseja: ");
        dados.qtdG = leitor.nextInt();
    }
}
