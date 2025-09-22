package media;

public class boletim {
    public double media(notas notas){
        double calculo = (notas.nota1 + notas.nota2 + notas.nota3) / 3;
        return calculo;
    }
}
