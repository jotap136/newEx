package contagem4;



public class contagem {
   public static void main(String[] args) {
        variaveis valores = new variaveis();
        entrada terminal = new entrada(valores);
        processamento proc = new processamento(valores);
        
        terminal.obterValores();

        if (valores.inicio <= valores.fim) {
            System.out.println("O número inicial deve ser maior que o final");
        } else {
            System.out.println("\nContagem regressiva:");
            proc.contarRegressivamente();
        }
    } 
}
