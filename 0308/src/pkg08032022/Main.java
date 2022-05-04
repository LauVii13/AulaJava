package pkg08032022;

public class Main {

    public static void main(String[] args) {
        /*
        Aluno a1 = new Aluno(200001, "Zero Um");
        System.out.println("RA - " + a1.getRa());
        System.out.println("Nome - " + a1.getNome());
        
        Aluno a0 = new Aluno("Zero Zero");
        System.out.println("RA - " + a0.getRa());
        System.out.println("Nome - " + a0.getNome());
    
        Aluno ai = new Aluno(-1, "X");
        ai.validar("X");
        ai.validar(2);
        */
        
        Rectangle r1 = new Rectangle();
        System.out.println(r1.calcA());
        System.out.println(r1.calcP());
        
        Rectangle r2 = new Rectangle(4,5);
        System.out.println(r2.calcA());
        System.out.println(r2.calcP());
    
        Rectangle r3 = new Rectangle();
        r3.setAltura(25);
        r3.setBase(2);      
        System.out.println(r3.calcA());
        System.out.println(r3.calcP());
    }
    
}
