package corrida3;

import java.util.Scanner;

public class tela {
    static Scanner leitor = new Scanner(System.in);
    public static int obterNumero(String msg) {
        System.out.println(msg);
        return leitor.nextInt();
    }
    

}
