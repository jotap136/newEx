package acai4;



public class acai {
    public static void main(String[] args) {
        AcaiVariaveis dados = new AcaiVariaveis();
        entradaAcai entrada = new entradaAcai(dados);
        processamento procAcai = new processamento(dados);

        entrada.pequeno();
        entrada.medio();
        entrada.grande();
        double somaaaa = procAcai.conta();
        
        System.out.println("O total a pagar é: " + somaaaa);
    }
}
