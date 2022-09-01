package pkg0412.ex2;

import java.util.ArrayList;

public class Ex2 {
    
    public static void main(String[] args) {
        Imovel i1 = new Novo();
        Imovel i2 = new Novo();
        Imovel i3 = new Imovel();
        
        ArrayList <Imovel> lista = new ArrayList();
        
        lista.add(i1);
        lista.add(i2);
        lista.add(i3);
        
        for(Imovel a: lista)
        {
            if(a instanceof Novo)
            {
                a.imprimeDados();
            }
        }
    }
    
}
