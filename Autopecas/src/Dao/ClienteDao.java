
package Dao;

import Model.CadastroCliente;
import Model.CadastroClienteFisica;
import Model.CadastroClienteJuridica;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ShadowsFate
 */
public class ClienteDao {
    
    PreparedStatement pst;
    String sql;
    CadastroCliente cp = new CadastroCliente();
   public void salvar(CadastroClienteFisica cl) throws SQLException {
        sql = "insert into Cliente values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareCall(sql);
        pst.setInt(1,0);  
        pst.setString(2,cl.getNome());
        pst.setString(3,cl.getEndereço());
        pst.setString(4,cl.getComplemento());
        pst.setString(5,cl.getBairro());
        pst.setString(6,String.valueOf(cl.getTelefone()));
        pst.setString(7,String.valueOf(cl.getCelular()));
        pst.setString(8,cl.getEmail());
        pst.setString(9,cl.getTipodevia());
        pst.setString(10,cl.getEstado());
        pst.setString(11,String.valueOf( cl.getCEP()));
        pst.setString(12,String.valueOf(cl.getLimite()));
        pst.setString(13,cl.getRg());
        pst.setString(14,String.valueOf(cl.getCpf()));
        pst.setString(15,(cl.getDatanascimento()));
        pst.setString(16,"");
        pst.setString(17,"");
        pst.execute();
        pst.close();

    }
      public void salvarPessoaJuridica(CadastroClienteJuridica cl) throws SQLException {
        
        sql = "INSERT INTO Cliente values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);  
        pst.setString(2,cl.getNome());
        pst.setString(3,cl.getEndereço());
        pst.setString(4,cl.getComplemento());
        pst.setString(5,cl.getBairro());
        pst.setString(6,String.valueOf(cl.getTelefone()));
        pst.setString(7,String.valueOf(cl.getCelular()));
        pst.setString(8,cl.getEmail());
        pst.setString(9,cl.getTipodevia());
        pst.setString(10,cl.getEstado());
        pst.setString(11,String.valueOf( cl.getCEP()));
        pst.setString(12,String.valueOf(cl.getLimite()));
        pst.setString(13,"");
        pst.setString(14,"");
        pst.setString(15,"");
        pst.setString(12,String.valueOf(cl.getCnpj()));
        pst.setString(14,String.valueOf(cl.getInscriçãoestadual()));
        pst.execute();
        pst.close();

    }
       public void Alterar(CadastroClienteFisica cl) throws SQLException {

       
                                    
        sql = "update Cliente set nome=? ,endereco=?,complemento=?,bairro=?,telefone=?,celular=?,email=?,tipodevia=?,estado=?,cep=?,limite=?,rg=?,cpf=?,datanascimento=? where id= "+cl.getId();
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);  
        pst.setString(2,cl.getNome());
        pst.setString(3,cl.getEndereço());
        pst.setString(4,cl.getComplemento());
        pst.setString(5,cl.getBairro());
        pst.setString(6,String.valueOf(cl.getTelefone()));
        pst.setString(7,String.valueOf(cl.getCelular()));
        pst.setString(8,cl.getEmail());
        pst.setString(9,cl.getTipodevia());
        pst.setString(10,cl.getEstado());
        pst.setString(11,String.valueOf( cl.getCEP()));
        pst.setString(12,String.valueOf(cl.getLimite()));
        pst.setString(13,cl.getRg());
        pst.setString(14,String.valueOf(cl.getCpf()));
        pst.setString(15,(cl.getDatanascimento()));
        pst.execute();
        pst.close();

    }
  public void AlterarPessoaJuridica(CadastroClienteJuridica cl) throws SQLException {
       
        sql = "update Cliente set nome=? ,endereco=?,complemento=?,bairro=?,telefone=?,celular=?,email=?,cep=?,limite=?,cnpj=?,inscri=? where id= "+cl.getId();
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);  
        pst.setString(2,cl.getNome());
        pst.setString(3,cl.getEndereço());
        pst.setString(4,cl.getComplemento());
        pst.setString(5,cl.getBairro());
        pst.setString(6,String.valueOf(cl.getTelefone()));
        pst.setString(7,String.valueOf(cl.getCelular()));
        pst.setString(8,cl.getEmail());
        pst.setString(9,cl.getTipodevia());
        pst.setString(10,cl.getEstado());
        pst.setString(11,String.valueOf( cl.getCEP()));
        pst.setString(12,String.valueOf(cl.getLimite()));
        pst.setString(12,String.valueOf(cl.getCnpj()));
        pst.setString(14,String.valueOf(cl.getInscriçãoestadual()));
        pst.execute();
        pst.close();

    }
  public void Excluir(CadastroClienteFisica cl)throws SQLException{
     
      sql="delete from Cliente where idCliente= "+cl.getId();
      pst = Conexao.getInstance().prepareStatement(sql);
      pst.execute();
      pst.close();
      
  }
  
     public List<CadastroCliente> ListaCliente() throws SQLException {
     List<CadastroCliente> listaCliente;
     listaCliente= new ArrayList<>();
     sql="select *from Cliente order by nome";
     pst=Conexao.getInstance().prepareStatement(sql);
     ResultSet rs= pst.executeQuery();
     while(rs.next()){
         listaCliente.add(new CadastroCliente(rs.getInt("idClient") , rs.getString("nome") , 
         rs.getString("endereco") ,rs.getString("complemento")
        ,rs.getString("bairro"),rs.getString("cidade"),
         rs.getString("telefone"),rs.getString("celular"),
         rs.getString("email"),rs.getString("tipodevia")
        ,rs.getString("estado"),rs.getString("cep"),rs.getFloat("limite"),rs.getString("tipopessoa")));
     }
     pst.close();
     return listaCliente;
     }
        

   
   
  }
