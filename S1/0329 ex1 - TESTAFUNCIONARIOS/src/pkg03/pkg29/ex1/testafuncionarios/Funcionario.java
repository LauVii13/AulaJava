package pkg03.pkg29.ex1.testafuncionarios;

public class Funcionario {
    private String nome;
    private double salario; 

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public void test(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calculaBonificacao(){
        this.salario *= 1.1;
    }
}
