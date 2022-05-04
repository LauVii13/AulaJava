package pkg08032022;

public class Aluno {
    private int ra;
    private String nome;
  
    public Aluno (int ra, String nome){
        this.ra = ra;
        this.nome = nome;
    }

    public Aluno (String n){
        ra = 0;
        nome = n;
    }
    
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
    
    public void validar(int ra)
    {
        if (ra > 0)
            System.out.println("RA válido");
    }
    
    public void validar(String nome)
    {
        if (nome.equals("X"))
            System.out.println("Nome inválido");
    }
    
}
