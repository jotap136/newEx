package noClass;
import java.util.Scanner;

public class semana {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o dia da semana:");
        int dia = leitor.nextInt();
        String diaStr = String.valueOf(dia);
        if (diaStr.equals("0")) {
           System.out.println("Domingo"); 
        }
        else if (diaStr.equals("1")){
            System.out.println("Segunda");
        }
        else if (diaStr.equals("2")){
            System.out.println("Terça");
        }
        else if (diaStr.equals("3")){
            System.out.println("Quarta");
        }
        else if (diaStr.equals("4")){
            System.out.println("Quinta");
        }
        else if (diaStr.equals("5")){
            System.out.println("Sexta");
        }
        else if (diaStr.equals("6")){
            System.out.println("Sábado");
        }
        else{
            System.out.println("Dia da semana inválido");
        }
    }
}
