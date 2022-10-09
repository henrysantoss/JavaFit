/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.whaise.javafit.processos;

import com.whaise.javafit.Banco;
import com.whaise.javafit.Get.GetMatricula;
import com.whaise.javafit.Get.GetModalidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thiago
 */
public class telaMatricula extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public telaMatricula() {
        initComponents();
        con = Banco.ConectarDB();
        mostra_lista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        edtDesc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        edtTurma = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnExc = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        edtAluno = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        edtModalidade = new javax.swing.JComboBox<>();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("CADASTRO");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("MATRICULA");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Descrição");

        edtDesc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        edtDesc.setMinimumSize(new java.awt.Dimension(64, 30));
        edtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtDescActionPerformed(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIÇÃO", "ALUNO", "TURMA", "MODALIDADE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabela);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Turma");

        edtTurma.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        edtTurma.setMinimumSize(new java.awt.Dimension(64, 30));
        edtTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtTurmaActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(51, 204, 0));
        btnAdd.setFont(new java.awt.Font("Hack", 0, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/whaise/javafit/img/check.png"))); // NOI18N
        btnAdd.setText("Adicionar");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        btnExc.setBackground(new java.awt.Color(204, 0, 0));
        btnExc.setFont(new java.awt.Font("Hack", 0, 18)); // NOI18N
        btnExc.setForeground(new java.awt.Color(255, 255, 255));
        btnExc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/whaise/javafit/img/cross.png"))); // NOI18N
        btnExc.setText("Excluir");
        btnExc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel5.setText("Aluno");

        edtAluno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        edtAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtAlunoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel6.setText("Modalidade");

        edtModalidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edtAluno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnAdd)
                                .addGap(18, 18, 18)
                                .addComponent(btnExc))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(edtModalidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtModalidade))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtTurmaActionPerformed

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");

        if (edtDesc.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(rootPane, "Por favor, preencha a descrição");
        } else if (edtAluno.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor, selecione o aluno");
        } else if (edtTurma.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(rootPane, "Por favor, preencha a turma");
        } else if (edtModalidade.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor, selecione a modalidade");
        } else {
            try{
                String sql_gerador = "select * from MATRICULA";
                String sql_inserir = "insert into MATRICULA values(?,?,?,?,?)";
                int gen=1;
                pst = con.prepareStatement(sql_gerador);
                rs = pst.executeQuery();
                if(rs.next()){
                    while(rs.next()){
                        gen = Integer.valueOf(rs.getString("id_matricula"));
                    }
                    gen++;
                }
                else {
                    gen = 1;
                }
                pst = con.prepareStatement(sql_inserir);
                pst.setString(1, String.valueOf(gen));
                pst.setString(2, edtDesc.getText());
                pst.setString(3, edtAluno.getSelectedItem().toString());
                pst.setString(4, edtTurma.getText());
                pst.setString(5, edtModalidade.getSelectedItem().toString());
                pst.executeUpdate();
                mostra_lista();
                edtDesc.setText("");
                edtTurma.setText("");
                edtAluno.setSelectedIndex(-1);
                edtModalidade.setSelectedIndex(-1);
            }
            catch(Exception e){
                
            }
            
            
            JOptionPane.showMessageDialog(rootPane, "Matrícula cadastrada com sucesso!\n" + dtf.format(LocalDateTime.now()));
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnExcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcMouseClicked
        String id = Tabela.getModel().getValueAt(Tabela.getSelectedRow(), 0).toString();
        String sql_delete = "delete from MATRICULA where ID_MATRICULA = ?";
        try{
            pst = con.prepareStatement(sql_delete);
            pst.setString(1, id);
            pst.executeUpdate();
            mostra_lista();
        }
        catch(Exception e){

        }
    }//GEN-LAST:event_btnExcMouseClicked

    private void edtDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtDescActionPerformed

    private void edtAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtAlunoActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        lista_aluno();
        lista_modalidade();
    }//GEN-LAST:event_formComponentShown

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        lista_aluno();
        lista_modalidade();
    }//GEN-LAST:event_formWindowGainedFocus

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(telaMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaMatricula().setVisible(true);
            }
        });

    }
    
    public ArrayList<GetMatricula> ListaMatricula(){
        ArrayList<GetMatricula> ListaMatricula = new ArrayList<>();
        String sql = "select * from matricula";
        try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            GetMatricula matricula;
            while(rs.next()){
                matricula = new GetMatricula(rs.getString("id_matricula"),rs.getString("ds_matricula"),rs.getString("ds_aluno"),rs.getString("ds_turma"),rs.getString("ds_modalidade"));
                ListaMatricula.add(matricula);
            }
        }
        catch(Exception e){
            
        }
        return ListaMatricula;
    }
    
    public void mostra_lista(){
        ArrayList<GetMatricula> lista = ListaMatricula();
        DefaultTableModel modelo = (DefaultTableModel)Tabela.getModel();
        Object[] campos = new Object[5];
        modelo.setRowCount(0);
        for(int i=0;i<lista.size();i++){
            campos[0] = lista.get(i).GetId();
            campos[1] = lista.get(i).GetDesc();
            campos[2] = lista.get(i).GetAluno();
            campos[3] = lista.get(i).GetTurma();
            campos[4] = lista.get(i).GetModalidade();
            modelo.addRow(campos);
        }
    }
    
    public void lista_aluno(){
        String sql = "select * from aluno";
        edtAluno.removeAllItems();
        try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                edtAluno.addItem(rs.getString("ds_aluno"));
            }
        }
        catch(Exception e){
            
        }
    }
    
    public void lista_modalidade(){
        String sql = "select * from modalidade";
        edtModalidade.removeAllItems();
        try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                edtModalidade.addItem(rs.getString("ds_modalidade"));
            }
        }
        catch(Exception e){
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExc;
    private javax.swing.JComboBox<String> edtAluno;
    private javax.swing.JTextField edtDesc;
    private javax.swing.JComboBox<String> edtModalidade;
    private javax.swing.JTextField edtTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
