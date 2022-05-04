package pkg03.pkg29.ex1.testafuncionarios;

public class Telefonistas extends Funcionario{
    private int codigo;

    public Telefonistas(int codigo, String nome, double salario) {
        super(nome, salario);
        this.codigo = codigo;
    }
    
    public void test(){
        System.out.println("Telefone:");
        super.test();
        System.out.println("Godigo: " + codigo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
