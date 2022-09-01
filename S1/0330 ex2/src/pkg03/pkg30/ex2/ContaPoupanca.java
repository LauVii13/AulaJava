package pkg03.pkg30.ex2;

public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;
    
    public void calcularNovoSaldo(double p){
        p /= 100;
        p++;
        super.setSaldo(super.getSaldo() * p);
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
}
