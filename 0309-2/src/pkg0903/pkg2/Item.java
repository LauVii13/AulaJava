package pkg0903.pkg2;

public class Item {
    String cd, desc;
    int qt;
    float pi;
    
    public void verifica(int i){
        if (i == 1)
        {
            if (this.qt < 0)
            {
                this.qt = 0;
            }
        }
        else
        {
            if (this.pi < 0)
            {
                this.pi = 0;
            }
        }
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQt() {
        return qt;
    }

    public void setQt(int qt) {
        verifica(1);
        this.qt = qt;
    }

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        verifica(0);
        this.pi = pi;
    }
    
    public Item(){
        this.cd = "";
        this.desc = "";
        this.pi = 0;
        this.qt = 0;
    }
    
    public Item(String cd, String desc, int qt, float pi){
        this.cd = cd;
        this.desc = desc;
        this.pi = pi;
        this.qt = qt;
    }
    
    public float getTotal(){
        return (this.pi * this.qt);
    }
}
