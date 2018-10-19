/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Bruna Leonel
 */
public class CadastroClienteFisica extends CadastroCliente{
    private String Cpf;
    private String Rg;
    private String datanascimento;


   

     

    public CadastroClienteFisica(int id, String nome, String endereço, String complemento, String bairro, String cidade, String telefone, String celular, String email, String tipodevia, String estado, String CEP, float limite, String tipopessoa ,String Cpf,String Rg, String datanascimento) {
        super(id, nome, endereço, complemento, bairro, cidade, telefone, celular, email, tipodevia, estado, CEP, limite, tipopessoa);
          this.Cpf = Cpf;
          this.Rg= Rg;
          this.datanascimento=datanascimento;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }
  
    public CadastroClienteFisica(){
        
    }
    
}
