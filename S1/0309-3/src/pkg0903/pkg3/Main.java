package pkg0903.pkg3;

public class Main {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa(1879, "Einstein");
        Pessoa p2 = new Pessoa(1643, "Novoton");
        
        p1.calculaIdade(2022);
        p2.calculaIdade(2022);
        
        System.out.println(p1.idade);
        System.out.println(p2.idade);
    }
    
}
