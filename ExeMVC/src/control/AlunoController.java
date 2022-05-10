package control;

import java.util.ArrayList;
import model.Aluno;

public class AlunoController {
    private ArrayList <Aluno> lista;

    public AlunoController() {
        lista = new ArrayList();
    }

    public ArrayList<Aluno> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Aluno> lista) {
        this.lista = lista;
    }
    
    public void cadastrar(String nome, int idade){
        Aluno al = new Aluno(nome, idade);
        lista.add(al);        
    }
}
