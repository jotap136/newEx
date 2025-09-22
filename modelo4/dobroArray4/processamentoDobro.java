package dobroArray4;

public class processamentoDobro {
     private final ArrayVariaveis dados;

    public processamentoDobro(ArrayVariaveis dados) {
        this.dados = dados;
    }

    public void dobrarValores() {
        dados.arrayDobro = new int[dados.arrayOriginal.length];
        for (int i = 0; i < dados.arrayOriginal.length; i++) {
            dados.arrayDobro[i] = dados.arrayOriginal[i] * 2;
        }
    }
}
