package noClass;

import java.util.Scanner;

public class semanaFunc {
    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String week = Semana();
        System.out.println(week);
    }

    public static String dia (String msg){
        System.out.println(msg);
        return leitor.nextLine();
    }

    public static String Semana(){
        System.out.println("Informe o dia da semana:");
        String msg;
        int dia = leitor.nextInt();
        String diaStr = String.valueOf(dia);
        if (diaStr.equals("0")) {
           msg = ("Domingo"); 
        }
        else if (diaStr.equals("1")){
            msg = ("Segunda");
        }
        else if (diaStr.equals("2")){
            msg = ("Terça");
        }
        else if (diaStr.equals("3")){
            msg = ("Quarta");
        }
        else if (diaStr.equals("4")){
            msg = ("Quinta");
        }
        else if (diaStr.equals("5")){
            msg = ("Sexta");
        }
        else if (diaStr.equals("6")){
            msg = ("Sábado");
        }
        else{
            msg = ("Dia da semana inválido");
        }
        return msg;
    }
}
