package pkg0419.ex1;

public abstract class Empregado {
    private String nime;
    private String sobrenime;
    private String cpf;
    
    public abstract double vencimento();

    public String getSobrenime() {
        return sobrenime;
    }

    public void setSobrenime(String sobrenime) {
        this.sobrenime = sobrenime;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNime() {
        return nime;
    }

    public void setNime(String nime) {
        this.nime = nime;
    }

   
}
