package pkg04.pkg05.ex2;

public class Ex2 {

    public static void main(String[] args) {
        Quadrilatero q1 = new Retangulo(2,4);
        System.out.println(q1.calc());
        
        Quadrilatero q2 = new Trapezio(2,5,10);
        System.out.println(q2.calc());
    }
    
}
