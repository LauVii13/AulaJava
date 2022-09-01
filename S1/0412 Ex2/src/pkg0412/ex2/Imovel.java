package pkg0412.ex2;

public class Imovel {
    private String endereco;
    private double preco;
    
    public void imprimeDados(){
        System.out.println("Endereço do Imóvel: " + endereco);
        System.out.println("Valor do Imóvel: " + preco);
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
