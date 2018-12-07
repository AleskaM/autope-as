/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.ItensVenda;
import Model.Venda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ShadowsFate
 */
public class VendaDao {
     PreparedStatement pst;
    String sql;
     int idVenda=0;
    public void salvar(Venda ve) throws SQLException{
        sql ="insert into venda values(?,?,?,?)";
        pst= Conexao.getInstance().prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
        pst.setInt(1,0);
        pst.setInt(2,ve.getCliente().getId());
        pst.setInt(3, ve.getVendedor().getId());
        pst.setFloat(4,ve.getTotalVenda());
        pst.executeUpdate();
       ResultSet rs= pst.getGeneratedKeys();
        
       while(rs.next()){
           idVenda= rs.getInt(1);
            
        }
      pst.close();
        salvarItensVenda(ve.getItensvenda());
       
        }
    public void salvarItensVenda (List<ItensVenda> itensVenda ) throws SQLException{
        for(ItensVenda itens :itensVenda){
           sql="insert into itemvenda values (?,?,?,?,?,?)";
           pst= Conexao.getInstance().prepareStatement(sql);
           pst.setInt(1,0);
           pst.setInt(2,idVenda);
           pst.setInt(3, itens.getProduto().getCodproduto());
           pst.setFloat(4,itens.getQuantidade());
           pst.setFloat(5,itens.getPreco());
           pst.setFloat(6,itens.getPrecototalitem());
           pst.execute();
           pst.close();
        } 
    
}
    
}
