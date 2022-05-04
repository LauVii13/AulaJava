package pkg03.pkg29.ex1.testafuncionarios;

public class Gerentes extends Funcionario {
    private String nomeUsuario;
    private String senha;

    public Gerentes(String nomeUsuario, String senha, String nome, double salario) {
        super(nome, salario);
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }
    
    public void test(){
        System.out.println("Gerente:");
        super.test();
        System.out.println("Nome de Usuário: " + nomeUsuario);
        System.out.println("senha: ******");
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void calculaBonificacao(){
        double i = super.getSalario();
        i *= 1.2;
        super.setSalario(i);
    }
    
}
