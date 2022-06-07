/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.controleClient;
import control.controleProd;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author aluno
 */
public class formArt extends javax.swing.JFrame {

    public formArt() {       
        initComponents();
        this.setLocationRelativeTo(null);
        
        if(!controleClient.getConClient().isEmpty() || !controleProd.getConProd().isEmpty())
        {
            btnDDS.setEnabled(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCadUser = new javax.swing.JButton();
        btnCadPixArt = new javax.swing.JButton();
        btnDDS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("not digital art");

        btnCadUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCadUser.setText("Cadastrar Usuário");
        btnCadUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadUserActionPerformed(evt);
            }
        });

        btnCadPixArt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCadPixArt.setText("Cadastrar Art");
        btnCadPixArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadPixArtActionPerformed(evt);
            }
        });

        btnDDS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDDS.setText("Dados do Sistema");
        btnDDS.setEnabled(false);
        btnDDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDDSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadUser, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnCadPixArt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDDS, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(btnCadUser)
                .addGap(18, 18, 18)
                .addComponent(btnCadPixArt)
                .addGap(18, 18, 18)
                .addComponent(btnDDS)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadUserActionPerformed
        JFrame j = new formCadUser();
        j.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCadUserActionPerformed

    private void btnCadPixArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadPixArtActionPerformed
        JFrame j = new formCadPixArt();
        j.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCadPixArtActionPerformed

    private void btnDDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDDSActionPerformed
        JFrame j = new formDDS();
        j.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDDSActionPerformed

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
            java.util.logging.Logger.getLogger(formArt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formArt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formArt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formArt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formArt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadPixArt;
    private javax.swing.JButton btnCadUser;
    private javax.swing.JButton btnDDS;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
