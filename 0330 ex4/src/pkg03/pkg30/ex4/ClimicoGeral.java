package pkg03.pkg30.ex4;

public class ClimicoGeral extends Medico{
    private boolean atendeEmCasa;
    
    public void receitar()
    {
        System.out.println("receitado!");
    }

    public boolean isAtendeEmCasa() {
        return atendeEmCasa;
    }

    public void setAtendeEmCasa(boolean atendeEmCasa) {
        this.atendeEmCasa = atendeEmCasa;
    }
}
