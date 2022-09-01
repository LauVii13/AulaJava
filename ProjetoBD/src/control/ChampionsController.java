package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Champions;
import model.DAO.ChampionsDAO;

public class ChampionsController {
    ChampionsDAO cDAO;
    
    public ChampionsController(){
        cDAO = new ChampionsDAO();
    }
    
    public void CAdd(String name, String lane, String function) throws SQLException{
        Champions c = new Champions(name, lane, function);
        cDAO.insert(c);
    }
    
    public void CDel(String name) throws SQLException{
        cDAO.excluir(name);
    }
}


