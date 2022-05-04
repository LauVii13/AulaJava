package pkg08032022;

public class Rectangle {
    private float base, altura;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        if(base<20 && base>1)
            this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(altura<20 && altura>1)
            this.altura = altura;
    }
    
    public Rectangle(float b, float a){
        this.altura = a;
        this.base = b;
    }
    
    public Rectangle(){
        this.altura = 1;
        this.base = 1;
    }
    
    public float calcA(){
        float aREA = this.altura * this.base;
        return aREA;
    }
    
    public float calcP(){
        float pERIMETRo = 2*this.altura + 2*this.base;
        return pERIMETRo;
    }
}
