package pkg03.pkg30.ex3;

public class Novo extends Imovel{
    private double pAd;

    public Novo(int codigo, String endereco, double preco, double pAd) {
        super(codigo, endereco, preco);
        this.pAd = pAd;
    }

    public double getpAd() {
        return pAd;
    }

    public void setpAd(double pAd) {
        this.pAd = pAd;
    }
    
    
}
