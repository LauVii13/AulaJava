package model;

public class Atleta {
    private int codigo;
    private String nome;
    private double peso;
    private double altura;
    private int idade;

    public Atleta(int codigo, String nome, double peso, double altura, int idade) {
        this.idade = idade;
        this.codigo = codigo;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
