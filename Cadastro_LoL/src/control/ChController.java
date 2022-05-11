package control;

import java.util.ArrayList;
import model.Champion;

public class ChController {
    private ArrayList <Champion> lista;

    public ChController() {
        lista = new ArrayList();
    }
    
    public void cadastrar(String nome, String funcao){
        Champion c = new Champion(nome, funcao);
        
        lista.add(c);
    }

    public ArrayList <Champion> getLista() {
        return lista;
    }

    public void setLista(ArrayList <Champion> lista) {
        this.lista = lista;
    }
}
