package cores3;

public class processamentoCores {
    public static String misturarCores(String cor1, String cor2) {
        if(cor1.equals(cor2)){
            return cor1;
        }
        else if(cor1.equals("azul") && cor2.equals("amarelo") || cor1.equals("amarelo") && cor2.equals("azul")){
            return "Verde";
        }
        else if(cor1.equals("vermelho") && cor2.equals("amarelo") || cor1.equals("amarelo") && cor2.equals("vermelho")){
            return "Laranja";
        }
        else if(cor1.equals("vermelho") && cor2.equals("azul") || cor1.equals("azul") && cor2.equals("vermelho")){
            return "Roxo";
        }
        else {
            return "invalido";
        }
    }

    public static void exibirResultado(String resultado) {
        if (resultado.equals("invalido")) {
            System.out.println("Combinação de cores não aceita, informe apenas cores primárias em letra minúscula");
        } else {
            System.out.println("A combinação de cores é: " + resultado);
        }
    }
}
