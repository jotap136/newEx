package cores3;

import java.util.Scanner;

public class tela {
    static Scanner leitor = new Scanner(System.in);
    public static void exibirResultado(String resultado) {
        if (resultado.equals("invalido")) {
            System.out.println("Combinação de cores não aceita, informe apenas cores primárias em letra minúscula");
        } else {
            System.out.println("A combinação de cores é: " + resultado);
        }

        
    }
    public static String pegarCor(String msg){
        System.out.println(msg);
        return leitor.nextLine();
    }
}
