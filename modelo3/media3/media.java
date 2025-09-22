package media3;



public class media {
    public static void main(String[] args) {
       processamentoMedia codigo = new processamentoMedia();
       tela terminal = new tela();
       
       double n1 = terminal.notas();
        double mediaa = codigo.media(n1);

        System.out.println("A média das suas notas é: " + mediaa);
        
    }
}
