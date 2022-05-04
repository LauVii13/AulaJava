package pkg0412.ex1;

import java.util.ArrayList;

public class Ex1 {


    public static void main(String[] args) {

        double total = 0;
        
        Ingresso i1 = new VIP();
        Ingresso i2 = new VIP();
        Ingresso i3 = new Comum();
        Ingresso i4 = new Comum();

        ArrayList <Ingresso> lista = new ArrayList();
        
        lista.add(i1);
        lista.add(i2);
        lista.add(i3);
        lista.add(i4);
        
        for(Ingresso a: lista){
            System.out.println(a.imprimeValor());
            total += a.imprimeValor();          
        }    
        
        System.out.println("---------");
        System.out.println(total);
    
    }
    
}
