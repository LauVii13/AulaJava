package pkg0406arraylist;

public class Revista extends Produto {
    private String mes;
    private int ano;
    
    @Override
    public void a(){
        System.out.println("REV");
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
