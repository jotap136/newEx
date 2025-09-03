package noClass;
import java.util.Scanner;

public class vestibularFunc {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        double notaCandidato = obterNota("Informe a nota do candidato:");
        double notaCorte = obterNota("Informe a nota de corte:");
        double notaMinimaAprovacao = obterNota("Informe a nota mínima para aprovação:");

        String situacao = verificarSituacao(notaCandidato, notaCorte, notaMinimaAprovacao);

        System.out.println("Resultado:");
        System.out.println("A situação do candidato é: " + situacao);
    }

    public static double obterNota(String msg) {
        System.out.println(msg);
        return leitor.nextDouble();
    }

    public static String verificarSituacao(double notaCandidato, double notaCorte, double notaMinimaAprovacao) {
        if (notaCandidato < notaCorte) {
            return "Candidato não passou";
        } else if (notaCandidato >= notaMinimaAprovacao) {
            return "Candidato aprovado";
        } else if (notaCandidato >= notaCorte && notaCandidato < notaMinimaAprovacao) {
            return "Candidato está na lista de espera";
        }
        return "Situação indefinida";
    }
}