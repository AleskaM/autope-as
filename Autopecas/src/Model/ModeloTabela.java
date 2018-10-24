/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ShadowsFate
 */
public class ModeloTabela extends AbstractTableModel{
    private ArrayList dados=null;
    private String[]colunas=null;
    
    
    public ModeloTabela(ArrayList dados, String[] colunas){
    setLinhas(dados);
    setColunas(colunas);
    }
    public ArrayList getLinhas(){
        return dados;
    }
    public void setLinhas(ArrayList dados){
        dados=dados;
    }
    public String[] getColunas(){
        return colunas;
    }
    public void  setColunas(String[]nomes){
        colunas=nomes;
    }
    public int getColumnCount(){
        return colunas.length;
    }
    public int getRowCount(){
        return dados.size();
    }
    public String getColumnName(int numCol){
        return colunas[numCol];
    }
    public Object getValueAt(int numlin , int numCol){
        Object[] Linhas=(Object[])getLinhas().get(numlin);
        return Linhas[numCol];
    }
    
    
    
}
