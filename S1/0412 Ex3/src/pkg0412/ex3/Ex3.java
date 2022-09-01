package pkg0412.ex3;

import java.util.ArrayList;


public class Ex3 {


    public static void main(String[] args) {
        Forma f1 = new FormaBiDimensional();
        Forma f2 = new FormaTriDimensional();
        Forma f3 = new FormaBiDimensional();
        Forma f4 = new FormaTriDimensional();   
        
        ArrayList <Forma> lista = new ArrayList();
        
        lista.add(f1);
        lista.add(f2);
        lista.add(f3);
        lista.add(f4);
        
        for(Forma a: lista)
        {
            if(a instanceof FormaTriDimensional)
            {
                FormaTriDimensional y = (FormaTriDimensional) a;
                y.obterArea();
                y.obterVolume();
            }
            else if(a instanceof FormaBiDimensional)
            {
                FormaBiDimensional x = (FormaBiDimensional) a;
                x.obterArea();
            }
            
            System.out.println("---");
            
            
        }
        
    }
    
}
