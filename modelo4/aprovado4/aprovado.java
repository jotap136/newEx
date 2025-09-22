package aprovado4;


public class aprovado {
    public static void main(String[] args) {
       Notas dados = new Notas();
        processamentoAprovado processamento = new processamentoAprovado(dados);
        
        processamento.lerNotas();
        processamento.calcularMedia();
        String situacao = processamento.verificarSituacao();
        
        System.out.println("A média das suas notas é " + String.format("%.2f", dados.media));
        System.out.println(situacao); 
    }
}
