package acai5;

import java.util.Scanner;

public class processamento {
    static Scanner leitor = new Scanner(System.in);

    public int qtdP;
    public int qtdM;
    public int qtdG;

    private double pequeno;
    private double medio;
    private double grande;
    private double soma;
    public double desconto;
    public double total;
    public double valorDesconto;
    public double DescontoReais;

    public double lerTotal(){
        return this.total;
    }

    public double lerDesconto(){
        return this.desconto;
    }
    public void mostrarTotal(){
        this.soma = this.calcularAcai();
        this.desconto = this.calcularDesconto();
    }

    private double calcularAcai(){
        this.pequeno = this.qtdP * 13.50;
        this.medio = this.qtdM * 15;
        this.grande = this.qtdG * 17.50;
        this.soma = (pequeno + medio + grande);
        return soma;
    }

    private double calcularDesconto(){
        DescontoReais = (soma * desconto) / 100;
        total = soma - DescontoReais;
        return desconto;
    }
}
