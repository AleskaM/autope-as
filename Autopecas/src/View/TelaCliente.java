/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* isso e um teste*/
package View;
import Model.CadastroCliente;
import Model.CadastroClienteFisica;
import Model.CadastroClienteJuridica;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
import Dao.ClienteDao;
import Dao.Conexao;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ListSelectionModel;


public class TelaCliente extends javax.swing.JInternalFrame {
   CadastroCliente cad;
   CadastroClienteFisica cadcliente;
   CadastroClienteJuridica cadjudi;
   ClienteDao  CadCli;
   List<CadastroCliente>listaCliente;
   Document doc;
    
    /**
     * Creates new form TelaCliente
     */
    public TelaCliente() {
      cadcliente = new CadastroClienteFisica();
       CadCli = new ClienteDao();
       listaCliente= new ArrayList();
       
      
        initComponents();
        Show_Clientes();
       
        BtSalvarCli.setEnabled(false);
        BtAlterarCli.setEnabled(false);
        TipodeViaCli.setEnabled(false);
        TxEstadoCli.setEnabled(false);
      
        TxTipoPessoa.setEnabled(false);
        PnlPj.setVisible(true);
        
        TxCnpj.setEditable(false);
        TxIdEstadual.setEditable(false);
        PnlPf.setVisible(true);
        BtAlterarCli.setEnabled(false);
        BtExcluir.setEnabled(false);
        centralizarComponente();

    }

   
    @SuppressWarnings("unchecked")
     public void centralizarComponente() {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        TxNomeConsulta = new javax.swing.JTextField();
        BtRelatorio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TxCepCli = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        TipodeViaCli = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        TxEndereçoCli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxComplementoCli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxBairroCli = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TxTelCli = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        TxCelCli = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        TxEmailCli = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TxCidadeCli = new javax.swing.JTextField();
        TxEstadoCli = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        TxLimiteCli = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        PnlPf = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        TxCpfCli = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        TxRGCli = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TxDataNascimento = new javax.swing.JFormattedTextField();
        jPanel7 = new javax.swing.JPanel();
        PnlPj = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        TxCnpj = new javax.swing.JFormattedTextField();
        jLabel24 = new javax.swing.JLabel();
        TxIdEstadual = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TxIdCli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxNomeCli = new javax.swing.JTextField();
        BtIncluirCli1 = new javax.swing.JButton();
        BtSalvarCli = new javax.swing.JButton();
        BtAlterarCli = new javax.swing.JButton();
        BtExcluir = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        TxTipoPessoa = new javax.swing.JComboBox<>();
        BtEditar = new javax.swing.JButton();
        BtCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jLabel12.setText("Nome");

        TxNomeConsulta.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TxNomeConsultaCaretUpdate(evt);
            }
        });

        BtRelatorio.setText("Relatorio");
        BtRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtRelatorioActionPerformed(evt);
            }
        });

        tblCliente = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }

        };
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "nome", "endereco", "bairro"
            }
        ));
        tblCliente.setEditingColumn(0);
        tblCliente.setEditingRow(0);
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(TxNomeConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtRelatorio)
                .addGap(67, 67, 67))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtRelatorio)
                    .addComponent(TxNomeConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Consulta", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTabbedPane2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel3.setText("CEP");

        TxCepCli.setEditable(false);
        try {
            TxCepCli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setText("Tipo de Via");

        TipodeViaCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Avenida", "Rua", "Fazenda" }));
        TipodeViaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipodeViaCliActionPerformed(evt);
            }
        });

        jLabel5.setText("Endereço");

        TxEndereçoCli.setEditable(false);

        jLabel6.setText("Complemento");

        TxComplementoCli.setEditable(false);

        jLabel7.setText("Bairro");

        TxBairroCli.setEditable(false);
        TxBairroCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxBairroCliActionPerformed(evt);
            }
        });

        jLabel8.setText("Telefone Fixo");

        TxTelCli.setEditable(false);
        try {
            TxTelCli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel9.setText("Telefone Celular");

        TxCelCli.setEditable(false);
        try {
            TxCelCli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel10.setText("Email");

        TxEmailCli.setEditable(false);

        jLabel15.setText("Cidade");

        jLabel16.setText("UF");

        TxCidadeCli.setEditable(false);

        TxEstadoCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel21.setText("Limite de Compra");

        TxLimiteCli.setEditable(false);
        TxLimiteCli.setText("1000");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(191, 191, 191)
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(TxCepCli, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TipodeViaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(TxEndereçoCli))))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxComplementoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(TxBairroCli, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxEstadoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addGap(133, 133, 133))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxCidadeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxLimiteCli, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxTelCli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxCelCli, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(TxEmailCli)
                                .addContainerGap())))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxCepCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipodeViaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxEndereçoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxComplementoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxBairroCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxCidadeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxEstadoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxTelCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxCelCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxLimiteCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Contato", jPanel4);

        jLabel18.setText("CPF");

        TxCpfCli.setEditable(false);
        try {
            TxCpfCli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxCpfCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxCpfCliActionPerformed(evt);
            }
        });

        jLabel19.setText("RG");

        TxRGCli.setEditable(false);

        jLabel20.setText("Data de Nascimento");

        TxDataNascimento.setEditable(false);
        try {
            TxDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout PnlPfLayout = new javax.swing.GroupLayout(PnlPf);
        PnlPf.setLayout(PnlPfLayout);
        PnlPfLayout.setHorizontalGroup(
            PnlPfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPfLayout.createSequentialGroup()
                .addGroup(PnlPfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(TxCpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(PnlPfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(TxRGCli, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(PnlPfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addContainerGap())
        );
        PnlPfLayout.setVerticalGroup(
            PnlPfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlPfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlPfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxCpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxRGCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(202, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlPf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(PnlPf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Pessoa Física", jPanel5);

        jLabel22.setText("CNPJ");

        try {
            TxCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel24.setText("Inscrição Estadual");

        javax.swing.GroupLayout PnlPjLayout = new javax.swing.GroupLayout(PnlPj);
        PnlPj.setLayout(PnlPjLayout);
        PnlPjLayout.setHorizontalGroup(
            PnlPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPjLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(TxCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(PnlPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(TxIdEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        PnlPjLayout.setVerticalGroup(
            PnlPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPjLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxIdEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlPj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlPj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Pessoa Jurídica", jPanel7);

        jPanel3.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel1.setText("Cód Cliente");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        TxIdCli.setEditable(false);
        TxIdCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxIdCliActionPerformed(evt);
            }
        });
        jPanel3.add(TxIdCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 78, -1));

        jLabel2.setText("Nome");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        TxNomeCli.setEditable(false);
        jPanel3.add(TxNomeCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 404, -1));

        BtIncluirCli1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-add-48.png"))); // NOI18N
        BtIncluirCli1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtIncluirCli1ActionPerformed(evt);
            }
        });
        jPanel3.add(BtIncluirCli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 63, 47));

        BtSalvarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-save-close-48.png"))); // NOI18N
        BtSalvarCli.setToolTipText("");
        BtSalvarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarCliActionPerformed(evt);
            }
        });
        jPanel3.add(BtSalvarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 68, 47));

        BtAlterarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-update-48.png"))); // NOI18N
        BtAlterarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAlterarCliActionPerformed(evt);
            }
        });
        jPanel3.add(BtAlterarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 69, 47));

        BtExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-delete-bin-48.png"))); // NOI18N
        BtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtExcluirActionPerformed(evt);
            }
        });
        jPanel3.add(BtExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 59, 47));

        jLabel17.setText("Tipo de Pessoa");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        TxTipoPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Física", "Jurídica" }));
        TxTipoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxTipoPessoaActionPerformed(evt);
            }
        });
        jPanel3.add(TxTipoPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        BtEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-edit-file-48 (1).png"))); // NOI18N
        BtEditar.setEnabled(false);
        BtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEditarActionPerformed(evt);
            }
        });
        jPanel3.add(BtEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 73, 47));

        BtCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-delete-48.png"))); // NOI18N
        BtCancelar.setEnabled(false);
        BtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(BtCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 50, 50));

        jTabbedPane1.addTab("Manutenção", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        private void botoesinicial()
    {
        BtAlterarCli.setEnabled(false);
        BtIncluirCli1.setEnabled(true);
        ;
        
        BtSalvarCli.setEnabled(false);
        TxBairroCli.setEditable(false);
        TxCelCli.setEditable(false);
        TxCidadeCli.setEditable(false);
        TxCnpj.setEditable(false);
        TxEmailCli.setEditable(false);
        TxComplementoCli.setEditable(true);
       
        TxCpfCli.setEditable(false);
        TxEndereçoCli.setEditable(false);
        TxDataNascimento.setEditable(false);
        TxEstadoCli.setEditable(false);
        TxIdCli.setEditable(false);
        TxIdEstadual.setEditable(false);
        
                
       
        TxBairroCli.setText("");
        TxCelCli.setText("");
        TxCidadeCli.setText("");
        TxCnpj.setText("");
        TxEmailCli.setText("");
        TxComplementoCli.setText("");
      
        TxCpfCli.setText(""); 
        TxEndereçoCli.setText("");
        TxDataNascimento.setText("");
        TxEstadoCli.setSelectedItem("");
        TxIdCli.setText("");
        TxIdEstadual.setText("");   
        TxLimiteCli.setText(""); 
        
    }
    private void TxBairroCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxBairroCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxBairroCliActionPerformed

    private void BtSalvarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarCliActionPerformed
    if(TxTipoPessoa.getSelectedItem().equals("Física")  ){
        if(TxNomeCli.getText().length()== 0 || TxTipoPessoa.getSelectedItem().equals("Selecione") || TxComplementoCli.getText().length()==0 || TxCidadeCli.getText().length()==0|| TxLimiteCli.getText().length() ==0|| TxEndereçoCli.getText().length()==0 || TxBairroCli.getText().length()==0 || TxTelCli.getText().equals("(  )    -    ")
          || TxCelCli.getText().equals("(  )    -    ") || TxEmailCli.getText().length()==0 || TipodeViaCli.getSelectedItem().equals("Selecione") || TxEstadoCli.getSelectedItem().equals("Selecione") || TxCepCli.getText().equals("     -   ")
         || TxCpfCli.getText().equals("   .   .   -  ") || TxRGCli.getText().length()==0 || TxDataNascimento.getText().equals("  /  /    "))
        {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!F");
        } 
        else{
            
            cadcliente = new CadastroClienteFisica();
            cadcliente.setNome(TxNomeCli.getText());
            cadcliente.setTipopessoa(String.valueOf(TxTipoPessoa.getSelectedItem()));
            cadcliente.setComplemento(TxComplementoCli.getText());
            cadcliente.setCidade(TxCidadeCli.getText());
            cadcliente.setLimite(Float.valueOf(TxLimiteCli.getText()));
            cadcliente.setTipodevia(String.valueOf(TipodeViaCli.getSelectedItem()));
            cadcliente.setEmail(TxEmailCli.getText());
            cadcliente.setCEP(TxCepCli.getText().replace("-",""));
            cadcliente.setEndereço(TxEndereçoCli.getText());
            cadcliente.setEstado(String.valueOf(TxEstadoCli.getSelectedItem()));
            cadcliente.setBairro(TxBairroCli.getText());
            cadcliente.setTelefone((TxTelCli.getText().replace("(","").replace(")","").replace("-","")));
            cadcliente.setCelular(TxCelCli.getText().replace("(","").replace(")","").replace("-",""));
            cadcliente.setRg(TxRGCli.getText());
            cadcliente.setCpf(TxCpfCli.getText().replace(".","").replace("-",""));
            cadcliente.setDatanascimento(TxDataNascimento.getText().replace("/",""));
            try {
                CadCli.salvar(cadcliente);
                JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!");
                limpar();
                BtIncluirCli1.setEnabled(true);
                limpaTabela();
                Show_Clientes();
              
            } catch (SQLException ex) {
                Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
           
    }
    }
    else{
        if(TxNomeCli.getText().length()== 0 || TxTipoPessoa.getSelectedItem().equals("Selecione") || TxComplementoCli.getText().length()==0 || TxCidadeCli.getText().length()==0|| TxLimiteCli.getText().length() ==0|| TxEndereçoCli.getText().length()==0 || TxBairroCli.getText().length()==0 ||  TxTelCli.getText().equals("(  )    -    ") ||  TxCelCli.getText().equals("(  )    -    ") || TxEmailCli.getText().length()==0 ||
                TipodeViaCli.getSelectedItem().equals("Selecione") || TxEstadoCli.getSelectedItem().equals("Selecione") || TxCepCli.getText().equals("     -   ") || TxCnpj.getText().equals("  .   .   /    -  ") || TxIdEstadual.getText().length()==0 ){
             JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            
        }
        else{
            
            cadjudi = new CadastroClienteJuridica();
            cadjudi.setNome(TxNomeCli.getText());
            cadjudi.setTipopessoa(String.valueOf(TxTipoPessoa.getSelectedItem()));
            cadjudi.setComplemento(TxComplementoCli.getText());
            cadjudi.setCidade(TxCidadeCli.getText());
            cadjudi.setLimite(Float.valueOf(TxLimiteCli.getText()));
            cadjudi.setTipodevia(String.valueOf(TipodeViaCli.getSelectedItem()));
            cadjudi.setEmail(TxEmailCli.getText());
            cadjudi.setCEP(TxCepCli.getText().replace("-",""));
            cadjudi.setEndereço(TxEndereçoCli.getText());
            cadjudi.setEstado(String.valueOf(TxEstadoCli.getSelectedItem()));
            cadjudi.setBairro(TxBairroCli.getText());
            cadjudi.setTelefone((TxTelCli.getText().replace("(","").replace(")","").replace("-","")));
            cadjudi.setCelular(TxCelCli.getText().replace("(","").replace(")","").replace("-",""));
            cadjudi.setCnpj(TxCnpj.getText().replace(".","").replace("/","").replace("-",""));
            cadjudi.setInscriçãoestadual(TxIdEstadual.getText());
            
            try {
                CadCli.salvarPessoaJuridica(cadjudi);
                 JOptionPane.showMessageDialog(null,"Cadstro Realizado com sucesso");
                 limpar();
                   BtIncluirCli1.setEnabled(true);
                limpaTabela();
                Show_Clientes();
            } catch (SQLException ex) {
                Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    }//GEN-LAST:event_BtSalvarCliActionPerformed

    public void limpar(){
            TxIdCli.setText("");
            TxNomeCli.setText("");
            TxEndereçoCli.setText("");
            TxComplementoCli.setText("");
            TxBairroCli.setText("");
            TxCidadeCli.setText("");
            TxTelCli.setText("");
            TxCelCli.setText("");
            TxEmailCli.setText("");
            TxCepCli.setText("");
            TxEstadoCli.setSelectedItem("Selecione");
            TipodeViaCli.setSelectedItem("Selecione");
            TxEmailCli.setText("");
            TxLimiteCli.setText("");
            TxCepCli.setText("");
            TxTipoPessoa.setSelectedItem("Selecione");
            TxCpfCli.setText("");
            TxRGCli.setText("");
            TxDataNascimento.setText("");
            TxCnpj.setText("");
            TxIdEstadual.setText("");
  
            TxLimiteCli.setEditable(false);
            TxNomeCli.setEditable(false);
            TxEndereçoCli.setEditable(false);
            TxComplementoCli.setEditable(false);
            TxBairroCli.setEditable(false);
            TxTelCli.setEditable(false);
            TxCelCli.setEditable(false);
            TxEmailCli.setEditable(false);
            TxEstadoCli.setEnabled(false);
            TipodeViaCli.setEnabled(false);
            TxCidadeCli.setEditable(false);
            TxCepCli.setEditable(false);
            TxTipoPessoa.setEnabled(false);
             TxCpfCli.setEditable(false);
            TxRGCli.setEditable(false);
            TxDataNascimento.setEditable(false);
            TxCnpj.setEditable(false);
            TxIdEstadual.setEditable(false);
            BtSalvarCli.setEnabled(false);
            BtAlterarCli.setEnabled(false);
           
            BtEditar.setEnabled(false);
            BtExcluir.setEnabled(false);
            BtCancelar.setEnabled(false);
    }
    private void BtIncluirCli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtIncluirCli1ActionPerformed
        BtCancelar.setEnabled(true);
        BtIncluirCli1.setEnabled(false);
        BtEditar.setEnabled(false);
        TxIdCli.setText("");
        TxNomeCli.setText("");
        TxEndereçoCli.setText("");
        TxComplementoCli.setText("");
        TxBairroCli.setText("");
        TxCidadeCli.setText("");
        TxTelCli.setText("");
        TxCelCli.setText("");
        TxEmailCli.setText("");
        TxCepCli.setText("");
        TxEstadoCli.setSelectedItem("Selecione");
        TipodeViaCli.setSelectedItem("Selecione");
        TxEmailCli.setText("");
        TxLimiteCli.setText("1000");
        TxCepCli.setText("");
        TxTipoPessoa.setSelectedItem("Selecione");
        TxCpfCli.setText("");
        TxRGCli.setText("");
        TxDataNascimento.setText("");
        TxCnpj.setText("");
        TxIdEstadual.setText("");
        TxNomeCli.setEditable(true);
        TxEndereçoCli.setEditable(true);
        TxComplementoCli.setEditable(true);
        TxBairroCli.setEditable(true);
        TxTelCli.setEditable(true);
        TxCelCli.setEditable(true);
        TxEmailCli.setEditable(true);
        TxEstadoCli.setEnabled(true);
        TipodeViaCli.setEnabled(true);
        TxCidadeCli.setEditable(true);
        TxCepCli.setEditable(true);
        BtSalvarCli.setEnabled(true);
       
        TxTipoPessoa.setEnabled(true);
        TxLimiteCli.setEditable(false);
        BtSalvarCli.setEnabled(true);
        TxCpfCli.setEnabled(true);
        TxCpfCli.setEditable(true);
        TxRGCli.setEnabled(true);
        TxRGCli.setEditable(true);
        TxDataNascimento.setEnabled(true);
        TxDataNascimento.setEditable(true);
        BtAlterarCli.setEnabled(false);
        BtExcluir.setEnabled(false);

        TxCnpj.setEditable(true);
        TxIdEstadual.setEditable(true);
    }//GEN-LAST:event_BtIncluirCli1ActionPerformed

    private void BtAlterarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAlterarCliActionPerformed
        
        int op = JOptionPane.showConfirmDialog(this, "Deseja realmente Alterar?", "Confirmação",JOptionPane.YES_NO_OPTION);
        if(op==0){
        if(TxTipoPessoa.getSelectedItem().equals("Física")  ){
        if(TxNomeCli.getText().length()== 0 || TxTipoPessoa.getSelectedItem().equals("Selecione") || TxComplementoCli.getText().length()==0 || TxCidadeCli.getText().length()==0|| TxLimiteCli.getText().length() ==0|| TxEndereçoCli.getText().length()==0 || TxBairroCli.getText().length()==0 || TxTelCli.getText().equals("(  )    -    ")
          || TxCelCli.getText().equals("(  )    -    ") || TxEmailCli.getText().length()==0 || TipodeViaCli.getSelectedItem().equals("Selecione") || TxEstadoCli.getSelectedItem().equals("Selecione") || TxCepCli.getText().equals("     -   ")
         || TxCpfCli.getText().equals("   .   .   -  ") || TxRGCli.getText().length()==0 || TxDataNascimento.getText().equals("  /  /    "))
        {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!F");
        } 
        else{
            
            
            cadcliente.setId(Integer.valueOf(TxIdCli.getText()));
            cadcliente.setNome(TxNomeCli.getText());
            cadcliente.setTipopessoa(String.valueOf(TxTipoPessoa.getSelectedItem()));
            cadcliente.setComplemento(TxComplementoCli.getText());
            cadcliente.setCidade(TxCidadeCli.getText());
            cadcliente.setLimite(Float.valueOf(TxLimiteCli.getText()));
            cadcliente.setEndereço(TxEndereçoCli.getText());
            cadcliente.setTipodevia(String.valueOf(TipodeViaCli.getSelectedItem()));
            cadcliente.setEmail(TxEmailCli.getText());
            cadcliente.setCEP(TxCepCli.getText().replace("-",""));
            cadcliente.setEstado(String.valueOf(TxEstadoCli.getSelectedItem()));
            cadcliente.setBairro(TxBairroCli.getText());
            cadcliente.setTelefone((TxTelCli.getText().replace("(","").replace(")","").replace("-","")));
            cadcliente.setCelular(TxCelCli.getText().replace("(","").replace(")","").replace("-",""));
            cadcliente.setRg(TxRGCli.getText());
            cadcliente.setCpf(TxCpfCli.getText().replace(".","").replace("-",""));
            cadcliente.setDatanascimento(TxDataNascimento.getText().replace("/",""));
            try {
                CadCli.Alterar(cadcliente);
                JOptionPane.showMessageDialog(null,"Cadastro Alterado com sucesso!");
                limpaTabela();
                  BtIncluirCli1.setEnabled(true);
                Show_Clientes();
                limpar();
                
               
            } catch (SQLException ex) {
                Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
           
    }
    }
         else{
        if(TxNomeCli.getText().length()== 0 || TxTipoPessoa.getSelectedItem().equals("Selecione") || TxComplementoCli.getText().length()==0 || TxCidadeCli.getText().length()==0|| TxLimiteCli.getText().length() ==0|| TxEndereçoCli.getText().length()==0 || TxBairroCli.getText().length()==0 || TxTelCli.getText().length()==0 || TxCelCli.getText().length()==0 || TxEmailCli.getText().length()==0 ||
                TipodeViaCli.getSelectedItem().equals("Selecione") || TxEstadoCli.getSelectedItem().equals("Selecione") || TxCepCli.getText().length()==0 || TxCnpj.getText().equals("  .   .   /    -  ") || TxIdEstadual.getText().length()==0 ){
             JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Cadstro Realizado com sucesso");
            cadjudi.setNome(TxNomeCli.getText());
            cadjudi.setTipopessoa(String.valueOf(TxTipoPessoa.getSelectedItem()));
            cadjudi.setComplemento(TxComplementoCli.getText());
            cadjudi.setCidade(TxCidadeCli.getText());
            cadjudi.setLimite(Float.valueOf(TxLimiteCli.getText()));
            cadjudi.setEndereço(TxEndereçoCli.getText());
            cadjudi.setBairro(TxBairroCli.getText());
            cadjudi.setTelefone((TxTelCli.getText().replace("(","").replace(")","").replace("-","")));
            cadjudi.setCelular(TxCelCli.getText().replace("(","").replace(")","").replace("-",""));
            cadjudi.setCnpj(TxCnpj.getText().replace(".","").replace("/","").replace("-",""));
            cadjudi.setInscriçãoestadual(TxIdEstadual.getText());
            
            try {
                CadCli.AlterarPessoaJuridica(cadjudi);
             limpar();
               BtIncluirCli1.setEnabled(true);
             limpaTabela();
             Show_Clientes();
                
            } catch (SQLException ex) {
                Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
        
        
        
        
        }
        
        
        
       
    }//GEN-LAST:event_BtAlterarCliActionPerformed

    private void TipodeViaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipodeViaCliActionPerformed
    }//GEN-LAST:event_TipodeViaCliActionPerformed

    private void jTabbedPane2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTabbedPane2AncestorAdded
    
    }//GEN-LAST:event_jTabbedPane2AncestorAdded

    private void TxTipoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxTipoPessoaActionPerformed

    if( TxTipoPessoa.getSelectedIndex() == 1)
    {
        PnlPj.setVisible(false);
        PnlPf.setVisible(true);
    }
    else if( TxTipoPessoa.getSelectedIndex() == 2)
    {
        PnlPf.setVisible(false);
        PnlPj.setVisible(true);
    }

    }//GEN-LAST:event_TxTipoPessoaActionPerformed

    private void TxCpfCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxCpfCliActionPerformed
     }//GEN-LAST:event_TxCpfCliActionPerformed

    private void BtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirActionPerformed
     int op = JOptionPane.showConfirmDialog(this, "Deseja realmente Excluir?", "Confirmação",JOptionPane.YES_NO_OPTION);
        if(op==0){
        if(TxTipoPessoa.getSelectedItem().equals("Física")){
         cadcliente.setId(Integer.parseInt((TxIdCli.getText())));
         try {
             CadCli.Excluir(cadcliente);
             limpar();
             limpaTabela();
             Show_Clientes();
             BtEditar.setEnabled(false);
             BtExcluir.setEnabled(false);
         } catch (SQLException ex) {
             Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
         }
         
     }
     
     
     
     else{
         System.out.println(""+TxIdCli.getText());
         cadjudi = new CadastroClienteJuridica();
         
         cadjudi.setId(Integer.parseInt((TxIdCli.getText())));
         
         
         try {
            
             CadCli.ExcluirJuridica(cadjudi);
             limpar();
             limpaTabela();
             Show_Clientes();
         } catch (SQLException ex) {
             Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
        }
        
    }//GEN-LAST:event_BtExcluirActionPerformed

    private void TxIdCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxIdCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxIdCliActionPerformed

    private void BtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEditarActionPerformed
        TxNomeCli.setEditable(true);
        TxEndereçoCli.setEditable(true);
        TxComplementoCli.setEditable(true);
        TxBairroCli.setEditable(true);
        TxTelCli.setEditable(true);
        TxCelCli.setEditable(true);
        TxEmailCli.setEditable(true);
        TxEstadoCli.setEnabled(true);
        TipodeViaCli.setEnabled(true);
        TxCidadeCli.setEditable(true);
        TxCepCli.setEditable(true);
        BtAlterarCli.setEnabled(true);
        BtExcluir.setEnabled(false);
        BtEditar.setEnabled(false);
    }//GEN-LAST:event_BtEditarActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        BtAlterarCli.setEnabled(false);
        BtEditar.setEnabled(true);
        BtSalvarCli.setEnabled(false);
        BtExcluir.setEnabled(true);
        TxNomeCli.setEditable(false);
        TxEndereçoCli.setEditable(false);
        TxComplementoCli.setEditable(false);
        TxBairroCli.setEditable(false);
        TxTelCli.setEditable(false);
        TxCelCli.setEditable(false);
        TxEmailCli.setEditable(false);
        TxEstadoCli.setEnabled(false);
        TipodeViaCli.setEnabled(false);
        TxCidadeCli.setEditable(false);
        TxCepCli.setEditable(false);
        TxTipoPessoa.setEnabled(false);
        TxCpfCli.setEditable(false);
        TxRGCli.setEditable(false);
        TxDataNascimento.setEditable(false);
        TxCnpj.setEditable(false);
        TxIdEstadual.setEditable(false);
        String id = "" + tblCliente.getValueAt(tblCliente.getSelectedRow(), 0);
        Conexao con = new Conexao();
        String sql;
        PreparedStatement pst;
        sql = "select *from Cliente where idCliente= " + id;
        try {
            pst = Conexao.getInstance().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                TxIdCli.setText(String.valueOf(rs.getInt("idCliente")));
                TxNomeCli.setText(rs.getString("nome"));
                TxEndereçoCli.setText(rs.getString("endereco"));
                TxComplementoCli.setText(rs.getString("complemento"));
                TxBairroCli.setText(rs.getString("bairro"));
                TxCidadeCli.setText(rs.getString("cidade"));
                TxTelCli.setText(rs.getString("telefone"));
                TxCelCli.setText(rs.getString("celular"));
                TxEmailCli.setText(rs.getString("email"));
                TipodeViaCli.setSelectedItem(rs.getString("tipodevia"));
                TxEstadoCli.setSelectedItem((rs.getString("estado")));
                TxCepCli.setText(rs.getString("cep"));
                TxLimiteCli.setText(rs.getString("limite"));
                TxTipoPessoa.setSelectedItem((rs.getString("tipopessoa")));
                TxCpfCli.setText(rs.getString("cpf"));
                TxRGCli.setText(rs.getString("rg"));
                TxDataNascimento.setText(rs.getString("datanascimento"));
                TxCnpj.setText(rs.getString("cnpj"));
                TxIdEstadual.setText(rs.getString("inscri"));
                
            }
              BtCancelar.setEnabled(true);
              BtIncluirCli1.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        

       
    }//GEN-LAST:event_tblClienteMouseClicked

    private void BtRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtRelatorioActionPerformed
       String nomediretorio = null;
        String nomepasta = "SRS"; // Informe o nome da pasta que armazenará o relatório
        String separador = java.io.File.separator;
        try {
            nomediretorio = "C:" + separador + nomepasta;
            if (!new File(nomediretorio).exists()) {
                (new File(nomediretorio)).mkdir();
            }
            gerarDocumento();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BtRelatorioActionPerformed

    private void BtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelarActionPerformed
    limpar();
    BtIncluirCli1.setEnabled(true);
    }//GEN-LAST:event_BtCancelarActionPerformed

    private void TxNomeConsultaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TxNomeConsultaCaretUpdate
       limpaTabela();
       Show_Clientes();
    }//GEN-LAST:event_TxNomeConsultaCaretUpdate
  
    public Connection getConnection(){
        Connection con;
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema","root","123456");
        return con;
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
      
        
    }
    public ArrayList<CadastroCliente>getLista(){
        ArrayList<CadastroCliente>Lista = new ArrayList<CadastroCliente>();
       Conexao con = new Conexao();
       String sql;
       PreparedStatement pst;
       sql="select *from Cliente ";
      
       if(TxNomeConsulta.getText().isEmpty()){ 
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
             sql="select *from Cliente where nome like '%"+TxNomeConsulta.getText()+"%'"; 
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
            row[3]=list.get(i).getBairro();
            model.addRow(row);
           
        }
      tblCliente.getTableHeader().setReorderingAllowed(false);
   
      
        }
    
    public void limpaTabela(){
        DefaultTableModel model =(DefaultTableModel)tblCliente.getModel();
        model.setNumRows(0);
    }
    private void gerarDocumento()  {
        try {
       ArrayList<CadastroCliente>list = getLista();
            
            doc = new Document(PageSize.A4, 41.5f, 41.5f, 55.2f, 55.2f);
            PdfWriter.getInstance(doc, new FileOutputStream("C:/SRS/RelatorioCliente" + ".pdf"));
            doc.open();

            Font f1 = new Font(Font.HELVETICA, 14, Font.BOLD);
            Font f2 = new Font(Font.HELVETICA, 12, Font.BOLD);
            Font f3 = new Font(Font.HELVETICA, 12, Font.NORMAL);
            Font f4 = new Font(Font.HELVETICA, 10, Font.BOLD);
            Font f5 = new Font(Font.HELVETICA, 10, Font.NORMAL);

            Paragraph titulo1 = new Paragraph("Universidade do Estado de Minas Gerais", f2);
            titulo1.setAlignment(Element.ALIGN_CENTER);
            titulo1.setSpacingAfter(10);

            Paragraph titulo2 = new Paragraph("Relatório de Clientes", f1);
            titulo2.setAlignment(Element.ALIGN_CENTER);
            titulo2.setSpacingAfter(0);

            PdfPTable tabela = new PdfPTable(new float[]{0.40f, 0.60f});
            tabela.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.setWidthPercentage(100f);

            PdfPCell cabecalho1 = new PdfPCell(new Paragraph("Nome", f3));
            //cabecalho1.setBackgroundColor(new Color(0xc0, 0xc0, 0xc0));
            cabecalho1.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            cabecalho1.setBorder(0);

            PdfPCell cabecalho2 = new PdfPCell(new Paragraph("Endereço", f3));
            //cabecalho2.setBackgroundColor(new Color(0xc0, 0xc0, 0xc0));
            cabecalho2.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            cabecalho2.setBorder(0);

            tabela.addCell(cabecalho1);
            tabela.addCell(cabecalho2);
            for (int i=0; i < list.size();i++) {
                Paragraph p1 = new Paragraph(list.get(i).getNome(), f5);
                p1.setAlignment(Element.ALIGN_JUSTIFIED);
                PdfPCell col1 = new PdfPCell(p1);
                col1.setBorder(0);
                
                Paragraph p2 = new Paragraph(list.get(i).getEndereço(), f5);
                p2.setAlignment(Element.ALIGN_JUSTIFIED);
                PdfPCell col2 = new PdfPCell(p2);
                col2.setBorder(0);
                tabela.addCell(col1);
                tabela.addCell(col2);
            }
            
            doc.add(titulo2);
            doc.add(titulo1);
            doc.add(tabela);
            doc.close();
            
            JOptionPane.showMessageDialog(null, "Relatório salvo com sucesso");
            String caminho = "C:/SRS/RelatorioCliente.pdf";
            Desktop.getDesktop().open(new File(caminho));
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException exx) {
            exx.printStackTrace();
            JOptionPane.showMessageDialog(null, "Documento de Requisitos aberto. Feche para gerar um novo.");
        }

       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAlterarCli;
    private javax.swing.JButton BtCancelar;
    private javax.swing.JButton BtEditar;
    private javax.swing.JButton BtExcluir;
    private javax.swing.JButton BtIncluirCli1;
    private javax.swing.JButton BtRelatorio;
    private javax.swing.JButton BtSalvarCli;
    private javax.swing.JPanel PnlPf;
    private javax.swing.JPanel PnlPj;
    private javax.swing.JComboBox<String> TipodeViaCli;
    private javax.swing.JTextField TxBairroCli;
    private javax.swing.JFormattedTextField TxCelCli;
    private javax.swing.JFormattedTextField TxCepCli;
    private javax.swing.JTextField TxCidadeCli;
    private javax.swing.JFormattedTextField TxCnpj;
    private javax.swing.JTextField TxComplementoCli;
    private javax.swing.JFormattedTextField TxCpfCli;
    private javax.swing.JFormattedTextField TxDataNascimento;
    private javax.swing.JTextField TxEmailCli;
    private javax.swing.JTextField TxEndereçoCli;
    public javax.swing.JComboBox<String> TxEstadoCli;
    private javax.swing.JTextField TxIdCli;
    private javax.swing.JTextField TxIdEstadual;
    private javax.swing.JTextField TxLimiteCli;
    private javax.swing.JTextField TxNomeCli;
    private javax.swing.JTextField TxNomeConsulta;
    private javax.swing.JTextField TxRGCli;
    private javax.swing.JFormattedTextField TxTelCli;
    private javax.swing.JComboBox<String> TxTipoPessoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tblCliente;
    // End of variables declaration//GEN-END:variables

 
}
