package pkg03.pkg30.ex2;

public class ContaEspecial extends ContaBancaria{
    private float limite;
    
    public void sacar(double v){
        double conta;
        conta = super.getSaldo() - v;
        
        if (conta > -limite)
            super.setSaldo(conta);
        else
            System.out.println("Limite alcançado");
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
}
