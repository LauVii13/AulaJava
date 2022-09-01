package pkg03.pkg30.ex2;

public class ContaBancaria {
    private String cliente;
    private int numConta;
    private double saldo;
    
    public void sacar(double v){
        double conta;
        conta = saldo - v;
        
        if (conta > 0 )
            saldo = conta;
        else
            System.out.println("Não pode sacar");
    }
    
    public void depositar(double v){
        saldo += v;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}


