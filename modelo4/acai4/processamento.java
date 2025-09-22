package acai4;

public class processamento {
     private final AcaiVariaveis dados;

    public processamento(AcaiVariaveis dados) {
        this.dados = dados;
    }

    public double conta() {
        double pequeno = dados.qtdP * 13.50;
        double medio = dados.qtdM * 15;
        double grande = dados.qtdG * 17.50;
        double soma = pequeno + medio + grande;
        return soma;
    }
}
