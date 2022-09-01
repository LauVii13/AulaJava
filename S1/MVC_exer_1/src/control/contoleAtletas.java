package control;

import java.util.ArrayList;
import model.Atleta;

public class contoleAtletas {
    private ArrayList <Atleta> conAtletas;

    public contoleAtletas() {
        conAtletas = new ArrayList();    
    }

    public ArrayList getConAtletas() {
        return conAtletas;
    }

    public void addAtletas(int codigo, String nome, double peso, double altura, int idade) {
        Atleta a = new Atleta(codigo, nome, peso, altura, idade);
        
        conAtletas.add(a);
    }
    
    public void excluir(String name)
    {
        for (Atleta a: conAtletas)
        {
            if(a.getNome().equals(name))
            {
                conAtletas.remove(a);
                break;
            }
        }
    } 
    
}
