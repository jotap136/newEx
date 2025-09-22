package ingresso3;

import java.util.Scanner;

public class tela {
    static Scanner leitor = new Scanner(System.in);

    public static String ingressos(String msg){
        System.out.println(msg);
        return leitor.nextLine();
    }
    

}
