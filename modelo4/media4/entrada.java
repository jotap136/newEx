package media4;

import java.util.Scanner;

public class entrada {
    private final Scanner leitor = new Scanner(System.in);
    private final NotasVariaveis dados;

    public entrada(NotasVariaveis dados) {
        this.dados = dados;
    }

    public void lerNotas() {
        for(int i = 1; i < 4; i++){
            System.out.println("Informe a " + i + "° nota: ");
            int nota = leitor.nextInt();
            dados.somaNotas += nota;
        }
    }
}
