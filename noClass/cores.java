package noClass;

import java.util.Scanner;

public class cores {
    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a primeira cor primária: ");
        String cor1 = leitor.nextLine();

        System.out.println("Informe a segunda cor primária: ");
        String cor2 = leitor.nextLine();
        String mistura;
        if(cor1.equals(cor2)){
            mistura = cor1;
            System.out.println("A combinação de cores é: " + mistura);
        }
        else if(cor1.equals("azul") && cor2.equals("amarelo" ) || cor1.equals("amarelo") && cor2.equals("azul")){
            System.out.println("A combinação de cores é: Verde");
        }
        else if(cor1.equals("vermelho") && cor2.equals("amarelo") || cor1.equals("amarelo") && cor2.equals("vermelho")){
            System.out.println("A combinação de cores é: Laranja");
        }
        else if(cor1.equals("vermelho") && cor2.equals("azul") || cor1.equals("azul") && cor2.equals("vermelho")){
            System.out.println("A combinação de cores é: Roxo");
        }
        else{
            System.out.println("Combinação de cores não aceita, informe apenas cores primárias em letra minuscula");
        }
    }
}
