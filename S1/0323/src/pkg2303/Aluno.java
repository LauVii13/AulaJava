package pkg2303;

public class Aluno extends Pessoa {
    private String ra;

    public Aluno(String nome, int idade, String ra) {
        super(nome, idade);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
}
