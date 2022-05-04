package pkg04.pkg05.ex1;

public class Livro extends Produto{
    private String editora;
    
    @Override
    public void mostra(){
        System.out.println("É um livro");
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
}
