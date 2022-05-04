package pkg0419.ex1;

public class Assalariado extends Empregado{
    private double salario;
    
    public Assalariado(double salario){
        this.salario = salario;
    }
    
    @Override
    public double vencimento(){
        return salario;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
}
