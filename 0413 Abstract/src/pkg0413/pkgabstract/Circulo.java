package pkg0413.pkgabstract;

public class Circulo extends Forma{

    public Circulo(double tamnhao) {
        super(tamnhao);
    }
    
    @Override
    public void calcA(){
        super.setArea(3.14*getTamnhao()*getTamnhao()); 
    }
}
