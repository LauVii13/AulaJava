package pkg0412.ex2;

public class Novo extends Imovel {
    private double pAd;

    @Override
    public void imprimeDados(){
        System.out.println("Endereço do Imóvel: " + super.getEndereco());
        System.out.println("Valor do Imóvel novo: " + (super.getPreco() + pAd));
    }
    
    public double getpAd() {
        return pAd;
    }

    public void setpAd(double pAd) {
        this.pAd = pAd;
    }
    
}
