/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.whaise.javafit;

import com.whaise.javafit.processos.telaAluno;
import com.whaise.javafit.processos.telaFatura;
import com.whaise.javafit.processos.telaLocalidade;
import com.whaise.javafit.processos.telaMatricula;
import com.whaise.javafit.processos.telaModalidade;
import com.whaise.javafit.processos.telaPlanos;
import com.whaise.javafit.processos.telaTreino;
import com.whaise.javafit.processos.telaUsuarios;

public class telaPrincipal extends javax.swing.JFrame {

    public telaPrincipal() {
        initComponents();
    }
    static telaUsuarios tu = new telaUsuarios();
    static telaLocalidade tc = new telaLocalidade();
    static telaTreino tt = new telaTreino();
    static telaModalidade tm = new telaModalidade();
    static telaMatricula tma = new telaMatricula();
    static telaAluno ta = new telaAluno();
    static telaPlanos tp = new telaPlanos();
    static telaFatura tf = new telaFatura();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Planos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Cidades = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Faturas_Matr = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Alunos = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        Matricula = new javax.swing.JLabel();
        Matricula_Modal = new javax.swing.JLabel();
        Graduacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Planos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/whaise/javafit/img/planos.png"))); // NOI18N
        Planos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlanosMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        jLabel4.setText("Matrículas");

        Cidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/whaise/javafit/img/cidades.png"))); // NOI18N
        Cidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CidadesMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        jLabel5.setText("Modalidade de");

        Faturas_Matr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/whaise/javafit/img/faturas-matricula.png"))); // NOI18N
        Faturas_Matr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Faturas_MatrMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        jLabel6.setText("Matrícula");

        jLabel7.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        jLabel7.setText("Treino");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/whaise/javafit/img/logoLogin.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        jLabel8.setText("Planos");

        jLabel9.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        jLabel9.setText("Localidade");

        jLabel10.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        jLabel10.setText("Faturas");

        jLabel2.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        jLabel2.setText("Usuários");

        jLabel3.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        jLabel3.setText("Alunos");

        Alunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/whaise/javafit/img/alunos.png"))); // NOI18N
        Alunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlunosMouseClicked(evt);
            }
        });

        Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/whaise/javafit/img/usuario.png"))); // NOI18N
        Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UsuarioMousePressed(evt);
            }
        });

        Matricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/whaise/javafit/img/matricula.png"))); // NOI18N
        Matricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MatriculaMouseClicked(evt);
            }
        });

        Matricula_Modal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/whaise/javafit/img/matricula-modalidade.png"))); // NOI18N
        Matricula_Modal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Matricula_ModalMouseClicked(evt);
            }
        });

        Graduacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/whaise/javafit/img/graduacao.png"))); // NOI18N
        Graduacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GraduacaoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1)
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Usuario)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Graduacao)
                                            .addComponent(Alunos))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel7)))
                                    .addGap(47, 47, 47)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel8))
                                        .addComponent(Planos))
                                    .addGap(6, 6, 6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Matricula)
                                .addGap(73, 73, 73)
                                .addComponent(Matricula_Modal)
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cidades)
                                .addGap(73, 73, 73)
                                .addComponent(Faturas_Matr)
                                .addGap(32, 32, 32))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel4))
                                .addGap(45, 45, 45)
                                .addComponent(jLabel5))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(32, 32, 32)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Usuario, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Alunos))
                            .addGap(4, 4, 4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(2, 2, 2))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Matricula_Modal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addGap(3, 3, 3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Matricula)
                        .addGap(23, 23, 23)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Graduacao)
                                    .addComponent(Planos)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Faturas_Matr)
                                .addGap(4, 4, 4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Cidades)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioMousePressed
        tu.setLocationRelativeTo(null);
        tu.setVisible(true);
    }//GEN-LAST:event_UsuarioMousePressed

    private void CidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CidadesMouseClicked
        tc.setLocationRelativeTo(null);
        tc.setVisible(true);
    }//GEN-LAST:event_CidadesMouseClicked

    private void GraduacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraduacaoMouseClicked
        tt.setLocationRelativeTo(null);
        tt.setVisible(true);
    }//GEN-LAST:event_GraduacaoMouseClicked

    private void Matricula_ModalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Matricula_ModalMouseClicked
        tm.setLocationRelativeTo(null);
        tm.setVisible(true);
    }//GEN-LAST:event_Matricula_ModalMouseClicked

    private void MatriculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatriculaMouseClicked
        tma.setLocationRelativeTo(null);
        tma.setVisible(true);
    }//GEN-LAST:event_MatriculaMouseClicked

    private void AlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlunosMouseClicked
        ta.setLocationRelativeTo(null);
        ta.setVisible(true);
    }//GEN-LAST:event_AlunosMouseClicked

    private void PlanosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlanosMouseClicked
        tp.setLocationRelativeTo(null);
        tp.setVisible(true);
    }//GEN-LAST:event_PlanosMouseClicked

    private void Faturas_MatrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Faturas_MatrMouseClicked
        tf.setLocationRelativeTo(null);
        tf.setVisible(true);
    }//GEN-LAST:event_Faturas_MatrMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alunos;
    private javax.swing.JLabel Cidades;
    private javax.swing.JLabel Faturas_Matr;
    private javax.swing.JLabel Graduacao;
    private javax.swing.JLabel Matricula;
    private javax.swing.JLabel Matricula_Modal;
    private javax.swing.JLabel Planos;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
