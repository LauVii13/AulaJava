package pkg03.pkg30.ex3;

public class Usado extends Imovel {
    private double desconto;

    public Usado(double desconto, int codigo, String endereco, double preco) {
        super(codigo, endereco, preco);
        this.desconto = desconto;
    }
    
    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
}
