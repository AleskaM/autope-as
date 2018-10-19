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
public class CadastroClienteJuridica extends CadastroCliente{
    private String Cnpj;
    private String inscriçãoestadual;

 
    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String Cnpj) {
        this.Cnpj = Cnpj;
    }

    public String getInscriçãoestadual() {
        return inscriçãoestadual;
    }

    public void setInscriçãoestadual(String inscriçãoestadual) {
        this.inscriçãoestadual = inscriçãoestadual;
    }
       public CadastroClienteJuridica(int id, String nome, String endereço, String complemento, String bairro, String cidade, String telefone, String celular, String email, String tipodevia, String estado, String CEP, float limite, String tipopessoa, String Cnpj,String inscriçãoestadual) {
        super(id, nome, endereço, complemento, bairro, cidade, telefone, celular, email, tipodevia, estado, CEP, limite, tipopessoa);
        this.Cnpj=Cnpj;
        this.inscriçãoestadual=inscriçãoestadual;
    }

     public CadastroClienteJuridica(){
         
     }
}
