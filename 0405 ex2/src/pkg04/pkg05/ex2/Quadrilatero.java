package pkg04.pkg05.ex2;

public class Quadrilatero {
    private double base;
    private double altura;

    public Quadrilatero(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double calc() {
        return (base*altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
