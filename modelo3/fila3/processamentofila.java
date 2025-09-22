package fila3;

import java.util.Scanner;

public class processamentofila {
        static Scanner leitor = new Scanner(System.in);

   public static double[] preencherAlturas(int quantidade) {
        double[] alturas = new double[quantidade];
        System.out.println("Informe a altura de cada um dos " + quantidade + " alunos:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            alturas[i] = leitor.nextDouble();
        }
        return alturas;
    } 
}
