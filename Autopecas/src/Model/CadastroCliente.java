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
public class CadastroCliente {
    private int id;
    private String nome;
    private String endereço;
    private String complemento;
    private String bairro;
    private String cidade;
    private String telefone;
    private String celular;
    private String email;
    private String tipodevia;
    private String estado;
    private String CEP;
    private float limite;
    private String tipopessoa;
    private String pesquisa;

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipodevia() {
        return tipodevia;
    }

    public void setTipodevia(String tipodevia) {
        this.tipodevia = tipodevia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getTipopessoa() {
        return tipopessoa;
    }

    public void setTipopessoa(String tipopessoa) {
        this.tipopessoa = tipopessoa;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    

    public CadastroCliente(int id, String nome, String endereço, String complemento, String bairro, String cidade, String telefone, String celular, String email, String tipodevia, String estado, String CEP, float limite, String tipopessoa) {
        this.id = id;
        this.nome = nome;
        this.endereço = endereço;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.tipodevia = tipodevia;
        this.estado = estado;
        this.CEP = CEP;
        this.limite = limite;
        this.tipopessoa = tipopessoa;
    }

    public CadastroCliente(){
        
    }
    
    

    
}
