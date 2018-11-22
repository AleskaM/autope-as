/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author ShadowsFate
 */
public class Venda {
    private int codicovenda;
    private CadastroCliente cliente;
    private CadastroUsuário vendedor;
    private List<ItensVenda>itensvenda;
    private float totalVenda;

    public int getCodicovenda() {
        return codicovenda;
    }

    public void setCodicovenda(int codicovenda) {
        this.codicovenda = codicovenda;
    }

    public CadastroCliente getCliente() {
        return cliente;
    }

    public void setCliente(CadastroCliente cliente) {
        this.cliente = cliente;
    }

    public CadastroUsuário getVendedor() {
        return vendedor;
    }

    public void setVendedor(CadastroUsuário vendedor) {
        this.vendedor = vendedor;
    }

    public List<ItensVenda> getItensvenda() {
        return itensvenda;
    }

    public void setItensvenda(List<ItensVenda> itensvenda) {
        this.itensvenda = itensvenda;
    }

    public float getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(float totalVenda) {
        this.totalVenda = totalVenda;
    }

    public Venda(int codicovenda, CadastroCliente cliente, CadastroUsuário vendedor, List<ItensVenda> itensvenda, float totalVenda) {
        this.codicovenda = codicovenda;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.itensvenda = itensvenda;
        this.totalVenda = totalVenda;
    }
    
    
    public Venda(){
        
    }
    
    
}
