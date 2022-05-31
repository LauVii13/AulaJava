package control;

import java.util.ArrayList;
import model.Prod;

public class controleProd {
    private ArrayList <Prod> conProd;
    private int auxId = 0;
    
    public controleProd(){
        conProd = new ArrayList();
    }

    public ArrayList getConProd() {
        return conProd;
    }
     
    public void addProd(String style, String autor, double sizeX, double sizeY){
        auxId++;
        
        Prod p = new Prod(auxId, style, autor, sizeX, sizeY);
        
        conProd.add(p);
    }
}
