package pkg04.pkg05.ex1;

public class Ex1 {

    public static void main(String[] args) {
        Produto p = new Livro();
        p.mostra();
        
        Produto p2 = new Revista();
        p2.mostra();
        
        Livro l = new Livro();
        //Produto p3 = (Produto)l;
        l.mostra();
        l.setEditora("Buzz");
        
        if (p2 instanceof Revista)
            System.out.println("é instância");
        else
            System.out.println("não é instância");
        
    }
    
}
