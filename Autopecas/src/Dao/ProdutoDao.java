/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.CadastroProduto;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ShadowsFate
 */
public class ProdutoDao {
    PreparedStatement pst;
    String sql;
    
    public void salvar(CadastroProduto cl) throws SQLException {

        
                                    
        sql = "INSERT INTO Produto values (?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);  
        pst.setString(2,cl.getDescriprod());
        pst.setInt(3,(cl.getQtdprod()));
        pst.setFloat(4,(cl.getPrecopag()));
        pst.setFloat(5,cl.getPrecovenda());
        pst.execute();
        pst.close();

    }

       public void Alterar(CadastroProduto cl) throws SQLException {

      
                                    
        sql = "update Produto set descricao=? ,qtdprod=?,precopag=?,precovenda=? where id= "+cl.getCodproduto();
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);  
        pst.setString(2,cl.getDescriprod());
        pst.setInt(3,(cl.getQtdprod()));
        pst.setFloat(4,(cl.getPrecopag()));
        pst.setFloat(5,cl.getPrecovenda());
        pst.execute();
        pst.close();

    }
   public void Excluir(CadastroProduto cl)throws SQLException{
      
      sql="delete from Produto where idproduto= "+cl.getCodproduto();
      pst = Conexao.getInstance().prepareStatement(sql);
      pst.execute();
      pst.close();
      
  }
    
}
