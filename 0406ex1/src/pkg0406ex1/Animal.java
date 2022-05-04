package pkg0406ex1;

public class Animal {
    private String nome;
    private int idade;
    
    public void som(){
        System.out.println("som");
    }
    
    public void mov(){
        System.out.println("movendo");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
