package pkg0413.pkgabstract;

public abstract class Forma {
    private double tamnhao;
    private double area;

    public Forma(double tamnhao) {
        this.tamnhao = tamnhao;
    }

    public abstract void calcA();
    
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getTamnhao() {
        return tamnhao;
    }

    public void setTamnhao(double tamnhao) {
        this.tamnhao = tamnhao;
    }
    
}
