/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import classes.Despesas;
import servicos.ServicoDespesas;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import servicos.ServicoContas;

/**
 *
 * @author Pichau
 */
public class FEditDespesas extends javax.swing.JFrame {

    
    ServicoDespesas servicodespesas = new ServicoDespesas();
    ServicoContas servicocontas = new ServicoContas();
    
    public FEditDespesas() {
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

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jComboDespesas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDataPagamento = new javax.swing.JTextField();
        jDataPagamentoEsperado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jValor = new javax.swing.JTextField();
        jTipoComboDespesa = new javax.swing.JComboBox<>();
        jAtualizar = new javax.swing.JButton();
        jDelet = new javax.swing.JButton();
        jSair = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("                         Selecione a despesa que você gostaria de editar");

        jComboDespesas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboDespesasItemStateChanged(evt);
            }
        });

        jLabel2.setText("Data  Pagamento");

        jLabel3.setText("Data  Pagamento Esperado");

        jLabel5.setText("Tipo Despesa");

        jDataPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDataPagamentoActionPerformed(evt);
            }
        });

        jDataPagamentoEsperado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDataPagamentoEsperadoActionPerformed(evt);
            }
        });

        jLabel6.setText("Valor");

        jValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jValorActionPerformed(evt);
            }
        });

        jTipoComboDespesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimentacao", "Educacao", "Lazer", "Moradia", "Roupa", "Saude" }));
        jTipoComboDespesa.setSelectedIndex(-1);
        jTipoComboDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTipoComboDespesaActionPerformed(evt);
            }
        });

        jAtualizar.setText("Atualizar");
        jAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAtualizarMouseClicked(evt);
            }
        });

        jDelet.setText("Deletar");
        jDelet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDeletMouseClicked(evt);
            }
        });
        jDelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeletActionPerformed(evt);
            }
        });

        jSair.setText("Sair");
        jSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jComboDespesas, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jAtualizar)
                .addGap(31, 31, 31)
                .addComponent(jDelet)
                .addGap(18, 18, 18)
                .addComponent(jSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTipoComboDespesa, 0, 165, Short.MAX_VALUE)
                        .addComponent(jDataPagamentoEsperado, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jDataPagamento, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jValor, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAtualizar)
                    .addComponent(jDelet)
                    .addComponent(jSair))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jDataPagamentoEsperado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTipoComboDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(110, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDataPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDataPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDataPagamentoActionPerformed

    private void jDataPagamentoEsperadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDataPagamentoEsperadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDataPagamentoEsperadoActionPerformed

    private void jValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jValorActionPerformed

    private void jTipoComboDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTipoComboDespesaActionPerformed
       
    }//GEN-LAST:event_jTipoComboDespesaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            this.atualizarListaDespesas();
        } catch (SQLException ex) {
            Logger.getLogger(FEditDespesas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void jComboDespesasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboDespesasItemStateChanged
        if (jComboDespesas.getItemCount() <= 0){
            return;
        }
        
        if (jComboDespesas.getSelectedIndex() < 0){
            return;
        } 
        
        Despesas despesas = (Despesas) jComboDespesas.getSelectedItem();
        jValor.setText(String.valueOf(despesas.getValor()));
        jDataPagamento.setText(despesas.getDataPagamento());
        jDataPagamentoEsperado.setText(despesas.getDataPagamentoEsperado());
        jTipoComboDespesa.setSelectedItem(despesas.getTipoDespesa());
        
    }//GEN-LAST:event_jComboDespesasItemStateChanged

    private void jAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAtualizarMouseClicked
       if (jComboDespesas.getSelectedIndex() >= 0){
            Despesas despesas = (Despesas) jComboDespesas.getSelectedItem();
            despesas.setDataPagamento(jDataPagamento.getText());
            despesas.setDataPagamentoEsperado(jDataPagamentoEsperado.getText());
            despesas.setTipoDespesa(jTipoComboDespesa.getSelectedItem().toString());
            despesas.setValor(Float.parseFloat(jValor.getText()));

           try {
                servicodespesas.update(despesas);
                JOptionPane.showMessageDialog(rootPane, "Despesas atualizada com sucesso!!");
                this.limparTela();
           } catch (SQLException ex) {
               Logger.getLogger(FEditDespesas.class.getName()).log(Level.SEVERE, null, ex);
           }
     
        }
   
    }//GEN-LAST:event_jAtualizarMouseClicked

    private void jDeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeletActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDeletActionPerformed

    private void jDeletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDeletMouseClicked
       if (jComboDespesas.getSelectedIndex() >= 0){
            Despesas despesas = (Despesas) jComboDespesas.getSelectedItem();
            try {
                servicodespesas.delete(despesas);
                JOptionPane.showMessageDialog(rootPane, "Despesas deletadas!!");
            } catch (SQLException ex) {
                Logger.getLogger(FEditDespesas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jDeletMouseClicked

    private void jSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseClicked
        dispose();
    }//GEN-LAST:event_jSairMouseClicked
    
    private void atualizarListaDespesas() throws SQLException{
        if (jComboDespesas.getItemCount() > 0){
            jComboDespesas.removeAllItems();
        }

        ArrayList<Despesas> lista = servicodespesas.getListaDespesas();   
        for (Despesas u:lista){
               jComboDespesas.addItem(u);
        }      
        this.limparTela();
     }
    
   public void limparTela(){
        jValor.setText("");
        jDataPagamento.setText("");
        jDataPagamentoEsperado.setText("");
        jTipoComboDespesa.setSelectedIndex(-1);
        jComboDespesas.setSelectedIndex(-1);
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
            java.util.logging.Logger.getLogger(FEditDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FEditDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FEditDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FEditDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FEditDespesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAtualizar;
    private javax.swing.JComboBox<Despesas> jComboDespesas;
    private javax.swing.JTextField jDataPagamento;
    private javax.swing.JTextField jDataPagamentoEsperado;
    private javax.swing.JButton jDelet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JButton jSair;
    private javax.swing.JComboBox<String> jTipoComboDespesa;
    private javax.swing.JTextField jValor;
    // End of variables declaration//GEN-END:variables
}
