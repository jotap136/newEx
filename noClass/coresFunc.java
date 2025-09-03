package noClass;
import java.util.Scanner;

public class coresFunc {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Informe a primeira cor primária: ");
        String cor1 = leitor.nextLine();

        System.out.println("Informe a segunda cor primária: ");
        String cor2 = leitor.nextLine();

        String corFinal = misturarCores(cor1, cor2);

        exibirResultado(corFinal);
    }

    public static String misturarCores(String cor1, String cor2) {
        if(cor1.equals(cor2)){
            return cor1;
        }
        else if(cor1.equals("azul") && cor2.equals("amarelo") || cor1.equals("amarelo") && cor2.equals("azul")){
            return "Verde";
        }
        else if(cor1.equals("vermelho") && cor2.equals("amarelo") || cor1.equals("amarelo") && cor2.equals("vermelho")){
            return "Laranja";
        }
        else if(cor1.equals("vermelho") && cor2.equals("azul") || cor1.equals("azul") && cor2.equals("vermelho")){
            return "Roxo";
        }
        else {
            return "invalido";
        }
    }

    public static void exibirResultado(String resultado) {
        if (resultado.equals("invalido")) {
            System.out.println("Combinação de cores não aceita, informe apenas cores primárias em letra minúscula");
        } else {
            System.out.println("A combinação de cores é: " + resultado);
        }
    }
}