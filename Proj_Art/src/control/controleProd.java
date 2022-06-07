package control;

import java.util.ArrayList;
import model.Prod;

public class controleProd {
    static private ArrayList <Prod> conProd = new ArrayList();;
    static private int auxId = 0;

    static public ArrayList getConProd() {
        return conProd;
    }
     
    static public void addProd(String name, String style, String autor, double sizeX, double sizeY, double value){
        auxId++;
        
        Prod p = new Prod(auxId, name, style, autor, sizeX, sizeY, value);
        
        conProd.add(p);
    }
}
