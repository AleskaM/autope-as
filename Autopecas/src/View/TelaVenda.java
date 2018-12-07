/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.Conexao;
import Dao.VendaDao;
import Model.CadastroCliente;
import Model.CadastroProduto;
import Model.CadastroUsuário;
import Model.ItensVenda;
import Model.Venda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ShadowsFate
 */
public class TelaVenda extends javax.swing.JInternalFrame {
    VendaDao venda1;
    Venda venda;
    ItensVenda itensVenda;
    CadastroProduto produto; 
    CadastroUsuário vendedor;
    CadastroCliente cliente;
    public TelaVenda() {
        
        initComponents();
        venda1 = new VendaDao();
        itensVenda = new ItensVenda();
        produto = new CadastroProduto();
        vendedor = new CadastroUsuário();
        venda = new Venda();
        PreencherCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        BtSelecionar = new javax.swing.JButton();
        TXNomeBusc = new javax.swing.JTextField();
        jDialog2 = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        TxDescricaoSele = new javax.swing.JTextField();
        BtSelecionarProd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        VendedorCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        TxIdcliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txNomecliente = new javax.swing.JTextField();
        BtBuscarN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxIdProd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxNomeProd = new javax.swing.JTextField();
        BtBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        TxQTD = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxUnit = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtAdicionar = new javax.swing.JButton();
        BtRemover = new javax.swing.JButton();
        BtFinalizar = new javax.swing.JButton();
        lblTotalVenda = new javax.swing.JLabel();

        jDialog1.setAlwaysOnTop(true);
        jDialog1.setMinimumSize(new java.awt.Dimension(600, 431));
        jDialog1.setResizable(false);

        tblCliente = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }

        };
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Endereço"
            }
        ));
        tblCliente.setToolTipText("");
        tblCliente.setEditingColumn(0);
        tblCliente.setEditingRow(0);
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCliente);

        jLabel11.setText("Nome");

        BtSelecionar.setText("Selecionar");
        BtSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSelecionarActionPerformed(evt);
            }
        });

        TXNomeBusc.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TXNomeBuscCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(TXNomeBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtSelecionar)
                .addGap(57, 57, 57))
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(BtSelecionar)
                    .addComponent(TXNomeBusc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jDialog2.setMinimumSize(new java.awt.Dimension(570, 380));

        tblProduto = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }

        };
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descriçao", "Quantidade", "Preço Unit"
            }
        ));
        jScrollPane3.setViewportView(tblProduto);

        jLabel12.setText("Descriçao");

        TxDescricaoSele.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TxDescricaoSeleCaretUpdate(evt);
            }
        });

        BtSelecionarProd.setText("Selecionar");
        BtSelecionarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSelecionarProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxDescricaoSele, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtSelecionarProd)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TxDescricaoSele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtSelecionarProd))
                .addGap(69, 69, 69)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        setClosable(true);
        setResizable(true);
        setMinimumSize(new java.awt.Dimension(40, 34));
        setPreferredSize(new java.awt.Dimension(544, 631));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Vendedor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        VendedorCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        VendedorCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendedorComboActionPerformed(evt);
            }
        });
        getContentPane().add(VendedorCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 267, -1));

        jLabel2.setText("Cliente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        TxIdcliente.setEditable(false);
        getContentPane().add(TxIdcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 40, -1));

        jLabel3.setText("ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setText("Nome");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        txNomecliente.setEditable(false);
        getContentPane().add(txNomecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 210, -1));

        BtBuscarN.setText("Buscar");
        BtBuscarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarNActionPerformed(evt);
            }
        });
        getContentPane().add(BtBuscarN, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 80, -1));

        jLabel5.setText("Produto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel6.setText("ID");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        TxIdProd.setEditable(false);
        getContentPane().add(TxIdProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 40, -1));

        jLabel7.setText("Descriçao");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        TxNomeProd.setEditable(false);
        getContentPane().add(TxNomeProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 200, 20));

        BtBuscar.setText("Buscar");
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 80, -1));

        jLabel8.setText("QTD");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        TxQTD.setEditable(false);
        TxQTD.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TxQTDCaretUpdate(evt);
            }
        });
        getContentPane().add(TxQTD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 50, -1));

        jLabel9.setText("Preço Unitario");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        TxUnit.setEditable(false);
        getContentPane().add(TxUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 100, -1));

        jLabel10.setText("Preço Total");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        TxTotal.setEditable(false);
        getContentPane().add(TxTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 110, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "QTD", "Preço Unit", "Preço Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 460, 210));

        BtAdicionar.setText("+");
        BtAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(BtAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 50, -1));

        BtRemover.setText("-");
        BtRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(BtRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 50, -1));

        BtFinalizar.setText("Finalizar Venda");
        BtFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtFinalizarActionPerformed(evt);
            }
        });
        getContentPane().add(BtFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, -1, -1));
        getContentPane().add(lblTotalVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtBuscarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarNActionPerformed
      jDialog1.setVisible(true);
      jDialog1.setLocationRelativeTo(null);
      jDialog1.setFocusable(true);
      Show_Clientes();
      
      
    }//GEN-LAST:event_BtBuscarNActionPerformed

    private void TXNomeBuscCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TXNomeBuscCaretUpdate
        limpaTabela();
        Show_Clientes();
    }//GEN-LAST:event_TXNomeBuscCaretUpdate

    private void BtSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSelecionarActionPerformed
     String id = "" + tblCliente.getValueAt(tblCliente.getSelectedRow(), 0);
     String nome =""+ tblCliente.getValueAt(tblCliente.getSelectedRow(), 1);
     TxIdcliente.setText(id);
     txNomecliente.setText(nome);
   
     TxIdcliente.setEditable(false);
     txNomecliente.setEditable(false);
     jDialog1.setVisible(false);
     limpaTabela();
     TXNomeBusc.setText("");
    
    }//GEN-LAST:event_BtSelecionarActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked

        
        
    }//GEN-LAST:event_tblClienteMouseClicked

    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
      jDialog2.setVisible(true);
      jDialog1.setLocationRelativeTo(null);
      jDialog1.setFocusable(true);
      Show_Produtos();
      TxQTD.setText("");
    }//GEN-LAST:event_BtBuscarActionPerformed

    private void TxDescricaoSeleCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TxDescricaoSeleCaretUpdate
        limpaTabela2();
        Show_Produtos();
        
    }//GEN-LAST:event_TxDescricaoSeleCaretUpdate

    private void BtSelecionarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSelecionarProdActionPerformed
     String id = "" + tblProduto.getValueAt(tblProduto.getSelectedRow(), 0);
     String descricao =""+ tblProduto.getValueAt(tblProduto.getSelectedRow(), 1);
     String unit =""+ tblProduto.getValueAt(tblProduto.getSelectedRow(), 3);
     String qtd=""+tblProduto.getValueAt(tblProduto.getSelectedRow(),2); 
     TxQTD.setEditable(true);
     TxIdProd.setText(id);
     TxNomeProd.setText(descricao);
     TxUnit.setText(unit);
     produto = new CadastroProduto();
     produto.setCodproduto(Integer.valueOf(id));
     produto.setDescriprod(descricao);
     produto.setPrecovenda(Float.valueOf(unit));
     produto.setQtdprod(Integer.valueOf(qtd));
     TxIdProd.setEditable(false);
     TxNomeProd.setEditable(false);
     TxUnit.setEditable(false);
     jDialog2.setVisible(false);
     TxDescricaoSele.setText("");
     TxQTD.setText("1");
     limpaTabela2();
     
    }//GEN-LAST:event_BtSelecionarProdActionPerformed

    private void TxQTDCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TxQTDCaretUpdate
     if(TxUnit.getText().length()>0 && TxQTD.getText().length()>0){
      float qtd =Float.valueOf(TxQTD.getText());
      float unit=Float.valueOf(TxUnit.getText());
      float op=qtd*unit;
        
        TxTotal.setText(String.valueOf(op));
     }
    }//GEN-LAST:event_TxQTDCaretUpdate

    private void BtAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAdicionarActionPerformed
      if(TxNomeProd.getText().equals("")  || TxQTD.getText().equals("") ){
          JOptionPane.showMessageDialog(null,"Por favor seleciona um produto ou verifique se todos os campos entao preenchidos");
      }
      else{
      itensVenda = new ItensVenda();
      itensVenda.setProduto(produto);
      itensVenda.setPreco(Float.valueOf(TxUnit.getText()));
      itensVenda.setQuantidade(Integer.valueOf(TxQTD.getText()));
      itensVenda.setPrecototalitem(Float.valueOf(TxTotal.getText()));
      venda.getItensvenda().add(itensVenda);
      lblTotalVenda.setText(String.valueOf(Totalvenda()));
      Show_Produto();
      limparproduto();  
      }
      
      
    }//GEN-LAST:event_BtAdicionarActionPerformed
public void limparproduto(){
    TxNomeProd.setText("");
    TxIdProd.setText("");
    TxQTD.setText("");
    TxUnit.setText("");
    TxTotal.setText("");
 
}
    private void BtRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtRemoverActionPerformed
    venda.getItensvenda().remove(jTable1.getSelectedRow());
    ((DefaultTableModel) jTable1.getModel()).removeRow(jTable1.getSelectedRow());

    limparproduto();
  
    lblTotalVenda.setText(String.valueOf(Totalvenda()));
    }//GEN-LAST:event_BtRemoverActionPerformed

    private void BtFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtFinalizarActionPerformed
     
       if(lblTotalVenda.getText().equals("") ||TxIdcliente.getText().equals("") || TxIdcliente.getText().equals("") || VendedorCombo.getSelectedItem().equals("Selecione")){
           JOptionPane.showMessageDialog(null,"Por favor preencha todos os campos ou adicione produtos para finalizar a venda");
       } 
        else{   
     CadastroCliente cliente= new CadastroCliente();
     cliente.setId(Integer.valueOf(TxIdcliente.getText()));
      venda.setCliente(cliente);
      venda.setVendedor(vendedor);
      venda.setTotalVenda(Float.valueOf(lblTotalVenda.getText()));
 try{
     
     venda1.salvar(venda);
     limpaTabela3();
     TxIdcliente.setText("");
     txNomecliente.setText("");
     TxQTD.setEnabled(false);
     VendedorCombo.setSelectedItem("Selecione");
     lblTotalVenda.setText("");
     JOptionPane.showMessageDialog(null, "Venda realizada com susesso");
 }catch(SQLException ex){
     
 }
                }  
    }//GEN-LAST:event_BtFinalizarActionPerformed

    private void VendedorComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendedorComboActionPerformed
       String nome=""+VendedorCombo.getSelectedItem();
       Conexao con = new Conexao();
       String sql;
        int id=0;
       PreparedStatement pst;
       sql="select idFuncionario from Funcionario where nome='"+nome+"'";
        try {
            pst=Conexao.getInstance().prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
           while(rs.next()){
             
              id=rs.getInt("idFuncionario");

           }
            vendedor.setId(id);
           venda.setVendedor(vendedor);
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_VendedorComboActionPerformed
private float Totalvenda(){
    float total=0;
    for(ItensVenda iv : venda.getItensvenda()){
        total +=iv.getPrecototalitem();
    }
    return total;
}
 public ArrayList<CadastroCliente>getLista(){
        ArrayList<CadastroCliente>Lista = new ArrayList<CadastroCliente>();
       Conexao con = new Conexao();
       String sql;
       PreparedStatement pst;
       sql="select *from Cliente ";
      
        
        
         if(TXNomeBusc.getText().isEmpty()){  
        try{
         pst=Conexao.getInstance().prepareStatement(sql);
         ResultSet rs= pst.executeQuery();
         CadastroCliente cadc;
            while(rs.next()){
                cadc= new  CadastroCliente(rs.getInt("idCliente") , rs.getString("nome") , 
                rs.getString("endereco") ,rs.getString("complemento")
               ,rs.getString("bairro"),rs.getString("cidade"),
                rs.getString("telefone"),rs.getString("celular"),
                rs.getString("email"),rs.getString("tipodevia")
               ,rs.getString("estado"),rs.getString("cep"),rs.getFloat("limite")
               ,rs.getString("tipopessoa"));
              
                Lista.add(cadc);
               
            }
        }catch(Exception e){
              e.printStackTrace();
              
        }
       
        }else{
       sql="select *from Cliente where nome like '%"+TXNomeBusc.getText()+"%'"; 
            try {
                pst=Conexao.getInstance().prepareStatement(sql);
                ResultSet rs= pst.executeQuery();
             CadastroCliente cadc;
             while(rs.next()){
                cadc= new  CadastroCliente(rs.getInt("idCliente") , rs.getString("nome") , 
                rs.getString("endereco") ,rs.getString("complemento")
               ,rs.getString("bairro"),rs.getString("cidade"),
                rs.getString("telefone"),rs.getString("celular"),
                rs.getString("email"),rs.getString("tipodevia")
               ,rs.getString("estado"),rs.getString("cep"),rs.getFloat("limite")
               ,rs.getString("tipopessoa"));
              
                Lista.add(cadc);
               
            }
            
            } catch (SQLException ex) {
                Logger.getLogger(TelaVenda.class.getName()).log(Level.SEVERE, null, ex);
            }
        
             
                }
       return Lista;
    }
public void Show_Clientes(){
        ArrayList<CadastroCliente>list = getLista();
        DefaultTableModel model = (DefaultTableModel)tblCliente.getModel();
        Object[]row= new Object[4];
        for(int i=0; i < list.size();i++){
            row[0]=list.get(i).getId();
            row[1]=list.get(i).getNome();
            row[2]=list.get(i).getEndereço();
           
            model.addRow(row);
           
        }
      tblCliente.getTableHeader().setReorderingAllowed(false);
   
      
        }
public void Show_Produto(){
     
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[]row= new Object[4];
     
            row[0]=TxNomeProd.getText();
            row[1]=TxQTD.getText();
            row[2]=TxUnit.getText();
            row[3]=TxTotal.getText();
           
            model.addRow(row);
           
      
      jTable1.getTableHeader().setReorderingAllowed(false);
   
      
        }
   public void limpaTabela(){
        DefaultTableModel model =(DefaultTableModel)tblCliente.getModel();
        model.setNumRows(0);
    }
  public void limpaTabela2(){
        DefaultTableModel model =(DefaultTableModel)tblProduto.getModel();
        model.setNumRows(0);
    }
    public void limpaTabela3(){
        DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
        model.setNumRows(0);
    }
    public void PreencherCombo(){
          
       Conexao con = new Conexao();
        String sql;
       PreparedStatement pst;
         sql="select *from Funcionario where funcao='Vendedor'";
      
        
        try{
            
         pst=Conexao.getInstance().prepareStatement(sql);
         ResultSet rs= pst.executeQuery();
        
            while(rs.next()){
               VendedorCombo.addItem(""+rs.getString("nome"));
                
             }
        }catch(Exception e){
              e.printStackTrace();
              
        }
   }
     public ArrayList<CadastroProduto>getLista2(){
        ArrayList<CadastroProduto>Lista = new ArrayList<CadastroProduto>();
         Conexao con = new Conexao();
        String sql;
       PreparedStatement pst;
         sql="select *from Produto ";
      
        if(TxDescricaoSele.getText().isEmpty()){
        try{
            
         pst=Conexao.getInstance().prepareStatement(sql);
         ResultSet rs= pst.executeQuery();
         CadastroProduto cadc;
            while(rs.next()){
                cadc= new  CadastroProduto(rs.getInt("idproduto") , rs.getString("descricao") , 
                rs.getInt("qtdprod") ,rs.getFloat("precopag")
               ,rs.getFloat("precovenda"));

               
                Lista.add(cadc);
               
            }
        }catch(Exception e){
              e.printStackTrace();
              
        }
        }else{
             sql="select *from Produto where descricao like '%"+TxDescricaoSele.getText()+"%'"; 
            try {
                pst=Conexao.getInstance().prepareStatement(sql);
                ResultSet rs= pst.executeQuery();
            CadastroProduto cadc;
            while(rs.next()){
                cadc= new  CadastroProduto(rs.getInt("idproduto") , rs.getString("descricao") , 
                rs.getInt("qtdprod") ,rs.getFloat("precopag")
               ,rs.getFloat("precovenda"));

               
                Lista.add(cadc);
               
            }
            
            } catch (SQLException ex) {
                Logger.getLogger(TelaVenda.class.getName()).log(Level.SEVERE, null, ex);
            }
        
             
        }
        return Lista;
    }
     public void Show_Produtos(){
        ArrayList<CadastroProduto>list = getLista2();
        DefaultTableModel model = (DefaultTableModel)tblProduto.getModel();
        Object[]row= new Object[4];
        for(int i=0; i < list.size();i++){
            row[0]=list.get(i).getCodproduto();
            row[1]=list.get(i).getDescriprod();
            row[2]=list.get(i).getQtdprod();
            row[3]=list.get(i).getPrecovenda();
            model.addRow(row);
           
        }
      tblProduto.getTableHeader().setReorderingAllowed(false);
   
      
        }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAdicionar;
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtBuscarN;
    private javax.swing.JButton BtFinalizar;
    private javax.swing.JButton BtRemover;
    private javax.swing.JButton BtSelecionar;
    private javax.swing.JButton BtSelecionarProd;
    private javax.swing.JTextField TXNomeBusc;
    private javax.swing.JTextField TxDescricaoSele;
    private javax.swing.JTextField TxIdProd;
    private javax.swing.JTextField TxIdcliente;
    private javax.swing.JTextField TxNomeProd;
    private javax.swing.JTextField TxQTD;
    private javax.swing.JTextField TxTotal;
    private javax.swing.JTextField TxUnit;
    private javax.swing.JComboBox<String> VendedorCombo;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblTotalVenda;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txNomecliente;
    // End of variables declaration//GEN-END:variables
}
