/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ShadowsFate
 */
public class ItensVenda {
    private int codicoitem;
    private  CadastroProduto produto;
    private int quantidade;
    private float preco;
    private  float  precototalitem;

    public int getCodicoitem() {
        return codicoitem;
    }

    public void setCodicoitem(int codicoitem) {
        this.codicoitem = codicoitem;
    }

    public CadastroProduto getProduto() {
        return produto;
    }

    public void setProduto(CadastroProduto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPrecototalitem() {
        return precototalitem;
    }

    public void setPrecototalitem(float precototalitem) {
        this.precototalitem = precototalitem;
    }

    public ItensVenda(int codicoitem, CadastroProduto produto, int quantidade, float preco, float precototalitem) {
        this.codicoitem = codicoitem;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.precototalitem = precototalitem;
    }
    
    
    
    public ItensVenda(){
        
    }
    
}
