package pkg0413.pkgabstract;

public class Quadrado extends Forma{

    public Quadrado(double tamnhao) {
        super(tamnhao);
    }
    
    @Override
    public void calcA(){
        super.setArea(getTamnhao()*getTamnhao()); 
    }
}
