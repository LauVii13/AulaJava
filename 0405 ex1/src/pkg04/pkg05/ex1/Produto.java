package pkg04.pkg05.ex1;

public class Produto {
    private int codigo;
    private String nome;

    public void mostra(){
        System.out.println("É um produto");
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
