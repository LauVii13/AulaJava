package control;

import java.util.ArrayList;
import model.Prod;

public class controleProd {
    static private ArrayList <Prod> conProd;
    static private int auxId = 0;
    
    public controleProd(){
        conProd = new ArrayList();
    }

    public ArrayList getConProd() {
        return conProd;
    }
     
    public void addProd(String name, String style, String autor, double sizeX, double sizeY){
        auxId++;
        
        Prod p = new Prod(auxId, name, style, autor, sizeX, sizeY);
        
        conProd.add(p);
    }
}
