package pkg0406arraylist;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        Livro liv1 = new Livro();
        liv1.setCodigo(123);
        liv1.setNome("1984");
        liv1.setEditora("Buzz");
        
        Revista r1 = new Revista();
        r1.setNome("Veja");
        r1.setAno(2022);
        r1.setMes("Abril");
        r1.setCodigo(456);
        
        
        ArrayList <Produto> lista = new ArrayList();
        
        lista.add(r1);
        lista.add(liv1);
        
        
        for(Produto p: lista){
            p.a();
            
            if(p instanceof Livro){
                Livro v = (Livro) p;
                System.out.println(v.getEditora());
            }
            else if(p instanceof Revista){
                Revista r = (Revista) p;
                System.out.println(r.getAno());
            }
        }
        
    }
    
}
