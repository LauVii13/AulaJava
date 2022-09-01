package control;

import java.util.ArrayList;
import model.Pintura;

public class controlePintura {
    static private ArrayList <Pintura> conPintura = new ArrayList();;
    static private int auxId = 0;

    static public ArrayList getConPintura() {
        return conPintura;
    }
     
    static public void addPintura(String name, String style, String autor, String desc, double sizeX, double sizeY, double value){
        auxId++;
        
        Pintura p = new Pintura(auxId, name, style, autor, desc, sizeX, sizeY, value);
        
        conPintura.add(p);
    }
    
        static public void excluir(String id)
    {
        for (Pintura a: conPintura)
        {
            String aux = String.valueOf(a.getId());
            if(aux.equals(id))
            {
                conPintura.remove(a);
                break;
            }
        }
    } 
}
