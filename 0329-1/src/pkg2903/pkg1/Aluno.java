package pkg2903.pkg1;

public class Aluno extends Pessoa{
    private int ra;

    public Aluno(int ra, String nome, int idade) {
        super(nome, idade);
        this.ra = ra;
    }
    
    public void mostra(){
        super.mostra();
        System.out.println("RA: " + this.ra);
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
}
