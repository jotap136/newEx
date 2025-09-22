package media4;


public class media {
    public static void main(String[] args) {
        NotasVariaveis dados = new NotasVariaveis();
        entrada terminal = new entrada(dados);
        processamentoMedia codigo = new processamentoMedia(dados);
        
        terminal.lerNotas();
        codigo.calcularMedia();

        System.out.println("A média das suas notas é: " + String.format("%.2f", dados.media));
    }
}
