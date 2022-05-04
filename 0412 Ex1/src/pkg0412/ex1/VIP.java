package pkg0412.ex1;

public class VIP extends Ingresso{
    private static double valorAd = 50.00;
    
    @Override
    public double imprimeValor(){
       return (super.getValor() + valorAd);
    }

    public double getValorAd() {
        return valorAd;
    }

    public void setValorAd(double valorAd) {
        this.valorAd = valorAd;
    }
    
}
