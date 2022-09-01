package pkg0903.pkg1;

public class Main {

    public static void saida(Funcionário fx){
        System.out.println("-------------/");
        System.out.println("Salário: " + fx.sa());
        fx.aumento(); 
        System.out.println("Salário Novo: " + fx.sa());
        System.out.println("-------------/");
    }
    
    public static void main(String[] args) {
        Funcionário f1 = new Funcionário();
        Funcionário f2 = new Funcionário("AAAA", "BBBB", 20);
        Funcionário f3 = new Funcionário("AAAA", "addaw", -89);

        saida(f1);
        saida(f2); 
        saida(f3);
    }
    
}
