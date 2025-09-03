package noClass;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double Allnotas = 0;
        for(int i = 1; i < 4; i++){
            System.out.println("Informe a " + i + "° nota: ");
            int notas = leitor.nextInt();
            Allnotas += notas;            
        }
        System.out.println("A média das suas notas é " + Allnotas / 3);
    }
}
