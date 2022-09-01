package pkg0903.pkg1;

public class Funcionário {
    String nome, sobrenome;
    float sm;
   
    public int verifica(float sm){
        if (sm < 0){
            return 0;
        }
        return 1;            
    }
    
    public Funcionário(){
        this.nome = "";
        this.sobrenome = "";
        this.sm = 0;
    }
    
    public Funcionário(String nome, String sobrenome, float sm){
        this.nome = nome;
        this.sobrenome = sobrenome;
        if (verifica(sm) == 0)
        {
            this.sm = 0;
        }
        else
        {
            this.sm = sm;           
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSm() {
        return sm;
    }

    public void setSm(float sm) {
        if (verifica(sm) == 0)
        {
            this.sm = 0;
        }
        else
        {
            this.sm = sm;           
        }
    }
    
    public float sa(){
        return (this.sm*12);
    }    
    
    public void aumento(){
        this.sm = this.sm * 1.1f;
    }
}
