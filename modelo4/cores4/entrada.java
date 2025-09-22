package cores4;

import java.util.Scanner;

public class entrada {
    private final Scanner leitor = new Scanner(System.in);
    private final CoresVariaveis dados;

    public entrada(CoresVariaveis dados) {
        this.dados = dados;
    }

    public void pegarCor(String msg) {
        System.out.println(msg);
        if (dados.cor1 == null) {
            dados.cor1 = leitor.nextLine();
        } else {
            dados.cor2 = leitor.nextLine();
        }
    }
}
