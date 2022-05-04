package pkg0419.ex1;

public class Horista extends Empregado{
    private double precoHora;
    private double horasTrabalhadas;

    public double vencimento(){
        return (precoHora*horasTrabalhadas);
    }
    
    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }    
}
