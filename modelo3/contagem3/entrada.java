package contagem3;

import java.util.Scanner;

public class entrada {
    static Scanner leitor = new Scanner(System.in);

   public int obterValor(String msg) {
        System.out.println(msg);
        int valor = leitor.nextInt();
        return valor;
    }

}
