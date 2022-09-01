package pkg03.pkg30.ex4;

public class Medico {
    private boolean travalhaNoHospital;
    
    public void tratarPaciente(){
        System.out.println("tratado pelo Medico");
    }

    public boolean isTravalhaNoHospital() {
        return travalhaNoHospital;
    }

    public void setTravalhaNoHospital(boolean travalhaNoHospital) {
        this.travalhaNoHospital = travalhaNoHospital;
    }
}
