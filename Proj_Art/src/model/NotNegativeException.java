package model;

public class NotNegativeException extends RuntimeException {
    @Override
    public String getMessage()
    {
        return("Valores não pode ser nulos nem negativos");
    }
}
