package pkg0903.pkg3;

public class Pessoa {
    int idade, ano;
    String nome;
    
    public void verif (){
        if (ano < 1000)
            ano = 1000;
    }
    
    public Pessoa(int ano){
        this.ano = ano;
        verif();
        this.idade = 0;
        this.nome = "";
    }
    
    public Pessoa(int ano, String nome){
        this.ano = ano;
        verif();
        this.idade = 0;
        this.nome = nome;
    }
    
    public int informaIdade(){
        return idade;
    }
    
    public String informaNome(){
        return nome;
    }
    
    public void calculaIdade(int at){
        idade = at - ano;
    }
    
}
