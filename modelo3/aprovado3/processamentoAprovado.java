package aprovado3;

import java.util.Scanner;

public class processamentoAprovado {
    static Scanner leitor = new Scanner(System.in);

    public Double notas(){
        double Allnotas = 0;
            for(int i = 1; i < 4; i++){
                System.out.println("Informe a " + i + "° nota: ");
                int notas = leitor.nextInt();
                Allnotas += notas;            
            }
        return Allnotas;
    }

    public static  double media(double media){
        double mediaNum = media / 3;
        return mediaNum;
    }

    public static String passou(double media){
        String msg = "";
        if (media > 8) {
            msg = ("Aprovado com sucesso");
        }
        else if (media >= 6 && media < 8) {
            msg = ("Aprovado");
        }
        else if(media >= 3 && media < 6){
            msg = ("Recuperação");
        }
        else if(media < 3){
            msg = ("Reprovado");
        }
        else if (media == 0){
            msg = ("Desistente");
        }
        return msg;
    }

    
}
