/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import classes.Contas;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import servicos.ServicoContas;

/**
 *
 * @author Pichau
 */
public class FCadContas extends javax.swing.JFrame {

    /**
     * Creates new form FCadContas
     */
    public FCadContas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSaldo = new javax.swing.JTextField();
        jInstituicaoFinanceira = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboTipoContas = new javax.swing.JComboBox<>();
        jEnviarContas = new javax.swing.JButton();
        jSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaldoActionPerformed(evt);
            }
        });

        jInstituicaoFinanceira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInstituicaoFinanceiraActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo Contas");

        jLabel3.setText("Instituicao Financeira");

        jLabel4.setText("Saldo");

        jComboTipoContas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carteira", "Conta Corrente", "Poupanca" }));
        jComboTipoContas.setSelectedIndex(-1);
        jComboTipoContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTipoContasActionPerformed(evt);
            }
        });

        jEnviarContas.setText("Enviar");
        jEnviarContas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEnviarContasMouseClicked(evt);
            }
        });

        jSair.setText("Sair");
        jSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSairMouseClicked(evt);
            }
        });
        jSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jInstituicaoFinanceira, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jSaldo)
                    .addComponent(jComboTipoContas, 0, 1, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addComponent(jEnviarContas)
                .addGap(22, 22, 22)
                .addComponent(jSair))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboTipoContas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInstituicaoFinanceira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEnviarContas)
                    .addComponent(jSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jEnviarContasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEnviarContasMouseClicked
       Contas contas = new Contas();
       contas.setSaldo(Float.parseFloat(jSaldo.getText()));
       contas.setTipoContas(jComboTipoContas.getSelectedItem().toString());
       contas.setInstituicaoFinanceira(jInstituicaoFinanceira.getText());
      ServicoContas servicocontas = new ServicoContas();
        
       try {
            servicocontas.insert(contas);
            JOptionPane.showMessageDialog(rootPane, "Contas Cadastradas");
            this.limparTela();
        } catch (SQLException ex) {
            Logger.getLogger(FCadContas.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_jEnviarContasMouseClicked

    private void jSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseClicked
           dispose();
    }//GEN-LAST:event_jSairMouseClicked

    private void jSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSairActionPerformed

    private void jSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSaldoActionPerformed

    private void jComboTipoContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTipoContasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboTipoContasActionPerformed

    private void jInstituicaoFinanceiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInstituicaoFinanceiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jInstituicaoFinanceiraActionPerformed

    public void limparTela(){
        jSaldo.setText("");
        jComboTipoContas.setSelectedIndex(-1);
        jInstituicaoFinanceira.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(FCadContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCadContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCadContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCadContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FCadContas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboTipoContas;
    private javax.swing.JButton jEnviarContas;
    private javax.swing.JTextField jInstituicaoFinanceira;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jSair;
    private javax.swing.JTextField jSaldo;
    // End of variables declaration//GEN-END:variables
}
