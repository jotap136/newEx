package aprovado4;
import java.util.Scanner;


public class processamentoAprovado {
    static Scanner leitor = new Scanner(System.in);
    private final Notas dados;

    public processamentoAprovado(Notas dados) {
        this.dados = dados;
    }

    public void lerNotas() {
        for(int i = 1; i < 4; i++){
            System.out.println("Informe a " + i + "° nota: ");
            int nota = leitor.nextInt();
            dados.somaNotas += nota;
        }
    }

    public void calcularMedia() {
        dados.media = dados.somaNotas / 3;
    }

    public String verificarSituacao(){
        String msg = "";
        if (dados.media > 8) {
            msg = ("Aprovado com sucesso");
        }
        else if (dados.media >= 6 && dados.media < 8) {
            msg = ("Aprovado");
        }
        else if(dados.media >= 3 && dados.media < 6){
            msg = ("Recuperação");
        }
        else if(dados.media < 3){
            msg = ("Reprovado");
        }
        else if (dados.media == 0){
            msg = ("Desistente");
        }
        return msg;
    }
}