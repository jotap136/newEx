package noClass;

import java.util.Scanner;

public class vestibular {
        static Scanner leitor = new Scanner(System.in);

    
    public static void main(String[] args) {
        
        System.out.println("--- Sistema de Aprovação do Vestibular ---");
        
        System.out.println("Informe a nota do candidato:");
        double notaCandidato = leitor.nextDouble();

        System.out.println("Informe a nota de corte:");
        double notaCorte = leitor.nextDouble();

        System.out.println("Informe a nota mínima para aprovação:");
        double notaMinimaAprovacao = leitor.nextDouble();

        String situacao = "";
        if (notaCandidato < notaCorte) {
            situacao = "Candidato não passou";
        } else if (notaCandidato >= notaMinimaAprovacao) {
            situacao = "Candidato aprovado";
        } else if (notaCandidato >= notaCorte && notaCandidato < notaMinimaAprovacao) {
            situacao = "Candidato está na lista de espera";
        }

        System.out.println("\nResultado:");
        System.out.println("A situação do candidato é: " + situacao);

        leitor.close();
    }
}
