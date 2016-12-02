
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tommy
 */
public class LocacaoDao {
    private Connection conn = null;
    
    public void inserirCliente(String nome, String sobrenome, String cpf, String rg, String endereco){
        String query = "INSERT INTO cliente \n" +
            "(cpf, nome, sobrenome, rg, endereco) VALUES\n" +
            "(?, ?, ?, ?, ?)";
        try{
            conn = ConnectionFactory.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, cpf);
            ps.setString(2, nome);
            ps.setString(3, sobrenome);
            ps.setString(4, rg);
            ps.setString(5, endereco);
            
            ps.executeUpdate();
            
        } catch (Exception e) {}
        finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(LocacaoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void updateCliente(String nome, String sobrenome, String cpf, String rg, String endereco){
        String query = "UPDATE CLIENTE SET Nome = ?, Sobrenome = ?, rg = ?, endereco = ? WHERE cpf = ?";
        try{
            conn = ConnectionFactory.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nome);
            ps.setString(2, sobrenome);
            ps.setString(3, rg);
            ps.setString(4, endereco);
            ps.setString(5, cpf);
            
            ps.executeUpdate();
            
        } catch (Exception e) {}
        finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(LocacaoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public List listarClientes(){
        List<Cliente> clientes = new ArrayList();
        String query = "SELECT nome, sobrenome, cpf, rg, endereco FROM CLIENTE";
        try{
            conn = ConnectionFactory.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            while (rs.next()){
                Cliente c = new Cliente(rs.getString("nome"), rs.getString("sobrenome"), rs.getString("cpf"), rs.getString("rg"), rs.getString("endereco"));
                clientes.add(c);
            }            
        } catch (Exception e) {}
        finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(LocacaoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return clientes;
    }
    
    public void deleteCliente(String cpf){
        String query = "DELETE FROM CLIENTE WHERE cpf = ?";
        try{
            conn = ConnectionFactory.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, cpf);
            
            ps.executeUpdate();
            
        } catch (Exception e) {}
        finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(LocacaoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
