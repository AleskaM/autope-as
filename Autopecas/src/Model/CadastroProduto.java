
package Model;


public class CadastroProduto {
    
    private int codproduto;
    private String descriprod;
    private int qtdprod;
    private float precopag;
    private float precovenda;

    private String pesquisa;

    public int getCodproduto() {
        return codproduto;
    }

    public void setCodproduto(int codproduto) {
        this.codproduto = codproduto;
    }

    public String getDescriprod() {
        return descriprod;
    }

    public void setDescriprod(String descriprod) {
        this.descriprod = descriprod;
    }

    public int getQtdprod() {
        return qtdprod;
    }

    public void setQtdprod(int qtdprod) {
        this.qtdprod = qtdprod;
    }

    public float getPrecopag() {
        return precopag;
    }

    public void setPrecopag(float precopag) {
        this.precopag = precopag;
    }

    public float getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(float precovenda) {
        this.precovenda = precovenda;
    }

  

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    
    
    
    public CadastroProduto(int codproduto, String descriprod, int qtdprod, float precopag, float precovenda) {
        this.codproduto = codproduto;
        this.descriprod = descriprod;
        this.qtdprod = qtdprod;
        this.precopag = precopag;
        this.precovenda = precovenda;
      
    }
    
            
    
    public CadastroProduto(){
        
    }
}
