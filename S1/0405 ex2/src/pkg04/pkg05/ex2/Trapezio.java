package pkg04.pkg05.ex2;

public class Trapezio extends Quadrilatero{
    private double base2;
    
    public Trapezio(double base2, double base, double altura) {
        super(base, altura);
        this.base2 = base2;
    }
    
    @Override
    public double calc() {
        return ((super.getBase()+base2)*super.getAltura()/2);
    }

    public double getBase2() {
        return base2;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }
}
