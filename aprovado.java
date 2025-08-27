import java.util.Scanner;

public class aprovado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double Allnotas = 0;
        for(int i = 1; i < 4; i++){
            System.out.println("Informe a " + i + "° nota: ");
            int notas = leitor.nextInt();
            Allnotas += notas;            
        }
        double media = Allnotas / 3;
        System.out.println("A média das suas notas é " + String.format("%.2f", media));

        if (Allnotas > 8) {
            System.out.println("Aprovado com sucesso");
        }
        else if (Allnotas >= 6 && Allnotas < 8) {
            System.out.println("Aprovado");
        }
        else if(Allnotas >= 3 && Allnotas < 6){
            System.out.println("Recuperação");
        }
        else if(Allnotas < 3){
            System.out.println("Reprovado");
        }
        else if (Allnotas == 0){
            System.out.println("Desistente");
        }
    }
}
