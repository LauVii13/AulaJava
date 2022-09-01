package pkg2303;

public class Monitor extends Aluno {
    private double bolsa;

    public Monitor(String nome, int idade, String ra, double bolsa) {
        super(nome, idade, ra);
        this.bolsa = bolsa;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
