package pkg0419.ex1;

import java.util.ArrayList;

public class Ex1 {

    public static void main(String[] args) {
        Empregado e1 = new Assalariado(10000);
        Empregado e2 = new Comissionado();
        Empregado e3 = new Horista();

        ArrayList <Empregado> lista = new ArrayList();
        
        lista.add(e1);
        lista.add(e2);
        lista.add(e3);
        
        for(Empregado a: lista)
        {
            System.out.println(a.vencimento() + "\n----");
            //if(a instanceof Assalariado){}
        }
    }
    
}
