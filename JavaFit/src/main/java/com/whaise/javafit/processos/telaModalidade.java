/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.whaise.javafit.processos;

import com.whaise.javafit.Banco;
import com.whaise.javafit.Get.GetModalidade;
import com.whaise.javafit.Get.GetUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Isaqu
 */
public class telaModalidade extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public telaModalidade() {
        initComponents();
        con = Banco.ConectarDB();
        mostra_lista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        btnExc = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        edtModalidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcbDias = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jFTvalorfinal = new javax.swing.JFormattedTextField();
        jtfDesconto = new javax.swing.JTextField();
        jfdtPagamento = new javax.swing.JTextField();

        setResizable(false);

        btnAdd.setBackground(new java.awt.Color(51, 204, 0));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/whaise/javafit/img/check.png"))); // NOI18N
        btnAdd.setText("Adicionar");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIÇÃO", "DIAS", "PAGAMENTO", "DESCONTO", "VALOR FINAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela.setFocusable(false);
        jScrollPane2.setViewportView(Tabela);

        btnExc.setBackground(new java.awt.Color(204, 0, 0));
        btnExc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExc.setForeground(new java.awt.Color(255, 255, 255));
        btnExc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/whaise/javafit/img/cross.png"))); // NOI18N
        btnExc.setText("Excluir");
        btnExc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Comfortaa", 1, 24)); // NOI18N
        jLabel1.setText("MODALIDADE");

        jLabel2.setFont(new java.awt.Font("Comfortaa", 1, 24)); // NOI18N
        jLabel2.setText("CADASTRO");

        edtModalidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        edtModalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtModalidadeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Modalidade:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Dias:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Desconto:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Pagamento:");

        jcbDias.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jcbDias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        jcbDias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbDiasItemStateChanged(evt);
            }
        });
        jcbDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDiasActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("%");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Semanais");

        jFTvalorfinal.setEditable(false);
        jFTvalorfinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        jFTvalorfinal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jFTvalorfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTvalorfinalActionPerformed(evt);
            }
        });

        jtfDesconto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jfdtPagamento.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jfdtPagamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jfdtPagamentoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jfdtPagamento, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(75, 75, 75)
                                .addComponent(jFTvalorfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtModalidade)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnAdd)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jcbDias, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jtfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(26, 26, 26)
                                        .addComponent(btnExc))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbDias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFTvalorfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jfdtPagamento)
                                .addGap(4, 4, 4)))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfDesconto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jLabel5.getAccessibleContext().setAccessibleName("desconto:");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        int dias = jcbDias.getSelectedIndex()+ 1;
        String fPagamento = jfdtPagamento.getText();
        float fVal = Float.valueOf(fPagamento);
        
        if (jtfDesconto.getText().isEmpty() ) {
            jFTvalorfinal.setText(String.valueOf(fVal * dias));
        }
        else{
             float desc = Float.valueOf(jtfDesconto.getText());
            if (desc >0 || desc < 100) { 
                float valor = fVal * dias;
                jFTvalorfinal.setText(String.valueOf(valor - (valor / 100) * desc));
            }
        }
        
        if (edtModalidade.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Descricao vazia");
        }
        else if (jfdtPagamento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pagamento vazio");
        }
        else{
            try{
                String sql_gerador = "select * from MODALIDADE";
                String sql_inserir = "insert into MODALIDADE values(?,?,?,?,?,?)";
                int gen=1;
                pst = con.prepareStatement(sql_gerador);
                rs = pst.executeQuery();
                if(rs.next()){
                    while(rs.next()){
                        gen = Integer.valueOf(rs.getString("id_modalidade"));
                    }
                    gen++;
                }
                else {
                    gen = 1;
                }
                pst = con.prepareStatement(sql_inserir);
                pst.setString(1, edtModalidade.getText());
                pst.setString(2, String.valueOf(gen));
                pst.setString(3, jfdtPagamento.getText());
                pst.setString(4, jtfDesconto.getText());
                pst.setString(5, jFTvalorfinal.getText());
                pst.setString(6, String.valueOf(jcbDias.getSelectedIndex()+1));
                pst.executeUpdate();
                mostra_lista();
                edtModalidade.setText("");
                jfdtPagamento.setText("");
                jtfDesconto.setText("");
                jFTvalorfinal.setText("");
                jcbDias.setSelectedIndex(0);
            }
            catch(Exception e){
              System.out.println("Erro: " + e.getMessage());
            }
        }
           
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnExcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcMouseClicked
        String id = Tabela.getModel().getValueAt(Tabela.getSelectedRow(), 0).toString();
        String sql_delete = "delete from MODALIDADE where ID_MODALIDADE = ?";
        try{
            pst = con.prepareStatement(sql_delete);
            pst.setString(1, id);
            pst.executeUpdate();
            mostra_lista();
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnExcMouseClicked

    private void edtModalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtModalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtModalidadeActionPerformed

    private void jcbDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbDiasActionPerformed

    private void jFTvalorfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTvalorfinalActionPerformed
        
    }//GEN-LAST:event_jFTvalorfinalActionPerformed

    private void jcbDiasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbDiasItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbDiasItemStateChanged

    private void jfdtPagamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jfdtPagamentoFocusLost
        int dias = jcbDias.getSelectedIndex()+ 1;
        String fPagamento = jfdtPagamento.getText();
        float fVal = Float.valueOf(fPagamento);
        
        if (jtfDesconto.getText().isEmpty() ) {
            jFTvalorfinal.setText(String.valueOf(fVal * dias));
        }
        else{
             float desc = Float.valueOf(jtfDesconto.getText());
            if (desc >0 || desc < 100) { 
                float valor = fVal * dias;
                jFTvalorfinal.setText(String.valueOf(valor - (valor / 100) * desc));
            }
        }
    }//GEN-LAST:event_jfdtPagamentoFocusLost

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaModalidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaModalidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaModalidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaModalidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaModalidade().setVisible(true);
            }
        });
    }
    
    public ArrayList<GetModalidade> ListaModalidade(){
        ArrayList<GetModalidade> ListaModalidade = new ArrayList<>();
        String sql = "select * from modalidade";
        try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            GetModalidade modalidade;
            while(rs.next()){
                modalidade = new GetModalidade(rs.getString("id_modalidade"),rs.getString("ds_modalidade"),rs.getString("nr_dias"),rs.getString("vl_pagamento"),rs.getString("vl_desconto"),rs.getString("vl_final"));
                ListaModalidade.add(modalidade);
            }
        }
        catch(Exception e){
            
        }
        return ListaModalidade;
    }
    
    public void mostra_lista(){
        ArrayList<GetModalidade> lista = ListaModalidade();
        DefaultTableModel modelo = (DefaultTableModel)Tabela.getModel();
        Object[] campos = new Object[6];
        modelo.setRowCount(0);
        for(int i=0;i<lista.size();i++){
            campos[0] = lista.get(i).GetId();
            campos[1] = lista.get(i).GetDescricao();
            campos[2] = lista.get(i).GetDias();
            campos[3] = lista.get(i).GetPagamento();
            campos[4] = lista.get(i).GetDesconto();
            campos[5] = lista.get(i).getVlFinal();
            modelo.addRow(campos);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExc;
    private javax.swing.JTextField edtModalidade;
    private javax.swing.JFormattedTextField jFTvalorfinal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcbDias;
    private javax.swing.JTextField jfdtPagamento;
    private javax.swing.JTextField jtfDesconto;
    // End of variables declaration//GEN-END:variables
}
