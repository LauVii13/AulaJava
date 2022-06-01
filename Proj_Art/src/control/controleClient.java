package control;

import java.util.ArrayList;
import model.Client;

public class controleClient {
    static private ArrayList <Client> conClient;
    static private int auxId = 0;
    
    public controleClient(){
        conClient = new ArrayList();
    }

    public ArrayList getConProd() {
        return conClient;
    }
     
    public void addClient(String name, String user, String email, String pass, int age){
        auxId++;
        
        Client c = new Client(auxId, name, user, email, pass, age);
        
        conClient.add(c);
    }
}
