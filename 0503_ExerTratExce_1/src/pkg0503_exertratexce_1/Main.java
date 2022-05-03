package pkg0503_exertratexce_1;

public class Main {
    
    public static void a()
    {
        throw new StringVaziaException();
    }
    
    public static void main(String[] args) {
        
        try
        {
            //Object o = null;
            //o.toString();
            a();
        }
        catch(StringVaziaException e)
        {
            System.out.println(e.getMessage());
        }
        
    }
    
}
