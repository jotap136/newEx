
import java.util.Scanner;

public class mediafunc {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double n1 = notas();
        double mediaa = media(n1);

        System.out.println("A média das suas notas é: " + mediaa);
        
    }

    public static double notas(){
        Scanner leitor = new Scanner(System.in);
        double Allnotas = 0;
        for(int i = 1; i < 4; i++){
            System.out.println("Informe a " + i + "° nota: ");
            int notas = leitor.nextInt();
            Allnotas += notas;            
        }
        return Allnotas;
    }

    public static double media(double n1){
        double media = n1 / 3;
        return media;
    }
}
