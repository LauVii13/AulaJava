/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import connection.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Champions;

/**
 *
 * @author aluno
 */
public class ChampionsDAO {
    Connection con;
        
        public void insert(Champions a) throws SQLException {
            con = new conexao().getConnection();
            String sql = "Insert into Champions (NAME,LANE,FUNCTION) values (?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, a.getName());
            stmt.setString(2, a.getLane());
            stmt.setString(3, a.getFunction());
            stmt.execute();
            stmt.close();
            con.close();
        }
        
        public void excluir(String name) throws SQLException {
            con = new conexao().getConnection();
            String sql = "DELETE FROM Champions WHERE NAME = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.execute();
            stmt.close();
            con.close();
        }
        
        public ArrayList<Champions> search() throws SQLException{
            ResultSet rs;
            ArrayList<Champions> lista = new ArrayList();
            con = new conexao().getConnection();
            String sql = "SELECT * FROM Champions";
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                String name = rs.getString("NAME");
                String lane = rs.getString("LANE");
                String function = rs.getString("FUNCTION");
                Champions ch = new Champions(name, lane, function);
                lista.add(ch);
            }
            stmt.close();
            con.close();
            return lista;
        }
}
