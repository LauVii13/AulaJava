package model;

public class NullExceptiobn extends RuntimeException{
    
    @Override
    public String getMessage()
    {
        return("null is bad >:(");
    }
}
