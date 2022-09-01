package pkg2203.pkg1;

public class Main {

    public static void main(String[] args) {
        System.out.println("C: " + ConversaoDeTemperatura.CpF(0.0));
        System.out.println("F: " + ConversaoDeTemperatura.FpC(32.0));
        
        System.out.println("\n---------------\n");
        
        System.out.println("Com: " + MaiorMenor.Comp5(1, -2, 6, 4, 0));
    }
    
}
