package pkg03.pkg29.ex1.testafuncionarios;

public class Secretarias extends Funcionario {
    private int numeroRamal;

    public Secretarias(int numeroRamal, String nome, double salario) {
        super(nome, salario);
        this.numeroRamal = numeroRamal;
    }
    
    public void test(){
        System.out.println("secretar:");
        super.test();
        System.out.println("Ramal: " + numeroRamal);
    }

    public int getNumeroRamal() {
        return numeroRamal;
    }

    public void setNumeroRamal(int numeroRamal) {
        this.numeroRamal = numeroRamal;
    }
}
