package mercado3;

import java.util.Scanner;



public class mercado {
    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
        processamentoMercado codigo = new processamentoMercado();
        int opcao;
        do {
            codigo.menu();
            opcao = leitor.nextInt();
            leitor.nextLine(); 
            codigo.executarOpcao(opcao);
            
        } while (opcao != 0);
    }
}
