package pkg03.pkg29.ex1.testafuncionarios;

public class Ex1TESTAFUNCIONARIOS {

    public static void space(){
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Gerentes g1 = new Gerentes("Jo", "123456", "Jorge", 100);
        Telefonistas t1 = new Telefonistas(2, "Jobscréia", 512);
        Secretarias s1 = new Secretarias(10, "Josuane", 1000);
        
        g1.test();
        space();
        t1.test();
        space();
        s1.test();
        space();
        
        System.out.println("--------------\n ");
        
        g1.calculaBonificacao();
        t1.calculaBonificacao();
        s1.calculaBonificacao();
        
        g1.test();
        space();
        t1.test();
        space();
        s1.test();
        space();
    }
    
}
