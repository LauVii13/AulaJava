package pkg0503_exertratexce_1;

public class StringVaziaException extends RuntimeException{
    
    @Override
    public String getMessage()
    {
        return("null is bad >:(");
    }
}
