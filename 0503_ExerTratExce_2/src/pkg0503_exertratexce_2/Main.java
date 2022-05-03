package pkg0503_exertratexce_2;

public class Main {

    public static void main(String[] args) {
        
        try{
            System.out.println(CalculoMatematico.divisao(4, 0));
        }
        catch(DivZeroException e){
            System.out.println(e.getMessage());
        }        
    }
    
}
