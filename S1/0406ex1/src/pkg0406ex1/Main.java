package pkg0406ex1;

public class Main {

    public static void main(String[] args) {
        
        Animal a1 = new Cachorro();
        a1.som();
        
        Animal a2 = new Cavalo();
        a2.som();
        
        Preguica p = new Preguica();
        Animal a3 = (Animal) p; 
        a3.som();
    }
    
}
