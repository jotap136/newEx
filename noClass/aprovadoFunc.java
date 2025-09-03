package noClass;
import java.util.Scanner;

public class aprovadoFunc {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        double nota = notas();

        double media = media(nota);

        System.out.println("A média das suas notas é " + String.format("%.2f", media));
        String situacao = passou(media);
        System.out.println(situacao);
    }

    public static Double notas(){
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
