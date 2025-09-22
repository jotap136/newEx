package media3;

import java.util.Scanner;

public class tela {
    static Scanner leitor = new Scanner(System.in);
    public static double notas(){
        double Allnotas = 0;
        for(int i = 1; i < 4; i++){
            System.out.println("Informe a " + i + "° nota: ");
            int notas = leitor.nextInt();
            Allnotas += notas;            
        }
        return Allnotas;
    }
}
