/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Model.CadastroCliente;
import Model.CadastroUsuário;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ShadowsFate
 */
public class FuncionarioDao {
    PreparedStatement pst;
    String sql;
    
    
    
        
   public void salvar(CadastroUsuário cl) throws SQLException {

        
                                    
        sql = "INSERT INTO Funcionario values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);  
        pst.setString(2,cl.getNome());
        pst.setString(3,cl.getEndereço());
        pst.setString(4,cl.getComplemento());
        pst.setString(5,cl.getBairro());
        pst.setString(6,cl.getCidade());
        pst.setString(7,String.valueOf(cl.getTelefone()));
        pst.setString(8,String.valueOf(cl.getCelular()));
        pst.setString(9,cl.getEmail());
        pst.setString(10,cl.getFunção());
        pst.setString(11,cl.getUsuario());
        pst.setString(12,cl.getSenha());
        pst.setString(13,cl.getTipodevia());
        pst.setString(14,cl.getEstado());
        pst.setString(15,cl.getCep());
        pst.setString(16,cl.getCidade());
        pst.execute();
        pst.close();

    }
   public void Alterar(CadastroUsuário cl) throws SQLException {

      
                                    
        sql = "update Funcionario set nome=? ,endereco=?,complemento=?,bairro=?,telefone=?"
              + ",celular=?,email=?,funcao=?,usuario=?,senha=?,tipodevia=?,estado=? cep=? where id= "+cl.getId();
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);  
        pst.setString(2,cl.getNome());
        pst.setString(3,cl.getEndereço());
        pst.setString(4,cl.getComplemento());
        pst.setString(5,cl.getBairro());
        pst.setString(6,cl.getCidade());
        pst.setString(7,String.valueOf(cl.getTelefone()));
        pst.setString(8,String.valueOf(cl.getCelular()));
        pst.setString(9,cl.getEmail());
        pst.setString(10,cl.getFunção());
        pst.setString(11,cl.getUsuario());
        pst.setString(12,cl.getSenha());
        pst.setString(13,cl.getTipodevia());
        pst.setString(14,cl.getEstado());
        pst.setString(15,cl.getCep());
        pst.execute();
        pst.close();

    }
    public void Excluir(CadastroUsuário cl)throws SQLException{
    
      sql="delete from Funcionario where idFuncionario= "+cl.getId();
      pst = Conexao.getInstance().prepareStatement(sql);
      pst.execute();
      pst.close();
      
  }
    
        public List<CadastroUsuário> ListaCliente() throws SQLException {
     List<CadastroUsuário> listaCliente;
     listaCliente= new ArrayList<>();
     sql="select *from Funcionario order by nome";
     pst=Conexao.getInstance().prepareStatement(sql);
     ResultSet rs= pst.executeQuery();
     while(rs.next()){
         listaCliente.add(new CadastroUsuário(rs.getInt("idFuncionario") , rs.getString("nome") , 
         rs.getString("endereco") ,rs.getString("complemento")
        ,rs.getString("bairro"),rs.getString("cidade"),
         rs.getString("telefone"),rs.getString("celular"),
         rs.getString("email"),rs.getString("funcao")
        ,rs.getString("usuario"),rs.getString("senha"),rs.getString("tipovia")
        ,rs.getString("estado"),rs.getString("cep")));
     }
     pst.close();
     return listaCliente;
     }
    
}
