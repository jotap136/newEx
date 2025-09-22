package ingresso3;

public class ingresso {
    public static void main(String[] args) {
        processamentoingressos codigo = new processamentoingressos();
        tela terminal = new tela();
        
        String mensagem = terminal.ingressos("Informe a quantidade de ingressos:");
        double ingressos = Double.parseDouble(mensagem);
        double ingressosValor = codigo.qtdingressos(ingressos);
        System.out.println("O total a pagar é R$" + String.format("%.2f", ingressosValor));
    }
}
