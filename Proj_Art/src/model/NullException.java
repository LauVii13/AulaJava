package model;

public class NullException extends RuntimeException {
    @Override
    public String getMessage()
    {
        return("Preencha todo os campos");
    }
}

