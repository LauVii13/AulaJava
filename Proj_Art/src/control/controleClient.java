package control;

import java.util.ArrayList;
import model.Client;

public class controleClient {
    static private ArrayList <Client> conClient =  new ArrayList();
    static private int auxId = 0;

    static public ArrayList getConClient() {
        return conClient;
    }
     
    static public void addClient(String name, String user, String email, String pass, int age){
        auxId++;
        
        Client c = new Client(auxId, name, user, email, pass, age);
        
        conClient.add(c);
    }
    
    static public void excluir(String id)
    {
        for (Client a: conClient)
        {
            String aux = String.valueOf(a.getId());
            if(aux.equals(id))
            {
                conClient.remove(a);
                break;
            }
        }
    } 
}
