package pkg0406arraylist;

public class Livro extends Produto{
    private String editora;
    
    @Override
    public void a(){
        System.out.println("LIVRO");
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
