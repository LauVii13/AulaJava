package model;

public class NegativeExceptiobn extends RuntimeException {
    @Override
    public String getMessage(){
        return ("Menor que zero não ");
    }
}
