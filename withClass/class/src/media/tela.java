package media;

import java.util.Scanner;

public class tela {
    public class notas {
    static Scanner leitor = new Scanner(System.in);
    public double receberNota(){
        double Allnotas = 0;
        for(int i = 1; i < 4; i++){
            System.out.println("Informe a " + i + "° nota: ");
            int notas = leitor.nextInt();
            Allnotas += notas;            
        }
        return Allnotas;
    }
}

}
