package pkg0419.ex1;

public class Comissionado extends Empregado{
    private double tVenda;
    private double tComis;
    
    @Override
    public double vencimento(){
        return (tVenda/100*tComis);
    }
    
    public double getTVenda(){
        return tVenda;
    }
    
    public void setTVenda(double tVenda){
        this.tVenda = tVenda;
    }
    
    public double getTComis(){
        return tComis;
    }
    
    public void setTComis(double tComis){
        this.tComis = tComis;
    }
    
}
