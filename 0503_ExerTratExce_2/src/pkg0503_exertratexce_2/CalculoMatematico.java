package pkg0503_exertratexce_2;

public class CalculoMatematico {
    
    static public double divisao(double dividendo, double divisor){
        if (divisor == 0)
        {
            throw new DivZeroException();
        }
        else
        {
            return (dividendo / divisor);
        }
    }
}
