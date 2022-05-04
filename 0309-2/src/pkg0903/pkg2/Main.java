package pkg0903.pkg2;

public class Main {

    public static void saida(Item ix){
        System.out.println("-------------/");
        System.out.println("Valor: " + ix.getTotal());
        System.out.println("-------------/");
    }
    
    public static void main(String[] args) {
        Item i1 = new Item();
        Item i2 = new Item("12345", "mt bao", 2010,  5);
        
        saida(i1);
        saida(i2);
    }
    
}
