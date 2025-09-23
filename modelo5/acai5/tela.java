package acai5;

import java.util.Scanner;

public class tela {
    static Scanner leitor = new Scanner(System.in);
    public int obterQuantidade(String msg){
        System.out.println(msg);
        return leitor.nextInt();
    }
    public Double obterDesconto(String msg){
        System.out.println(msg);
        return leitor.nextDouble();
    }

    public void exibir(double desconto, double total){
        System.out.printf("O valor total do açai com %.2f%% de desconto ficou: R$%.2f", desconto, total);
    }
}
