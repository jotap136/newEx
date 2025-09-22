package mercado4;

import java.util.Scanner;


public class mercado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        MercadoVariaveis dados = new MercadoVariaveis();
        processamentoMercado codigo = new processamentoMercado(dados, leitor);
        
        int opcao;
        do {
            codigo.menu();
            opcao = leitor.nextInt();
            leitor.nextLine(); // Consome a linha pendente
            codigo.executarOpcao(opcao);
            
        } while (opcao != 0);
        leitor.close();
    }
}
