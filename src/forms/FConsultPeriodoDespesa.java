/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import classes.Despesas;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import servicos.ServicoDespesas;

/**
 *
 * @author Pichau
 */
public class FConsultPeriodoDespesa extends javax.swing.JFrame {

    /**
     * Creates new form FConsultPeriodoDespesas
     */
    public FConsultPeriodoDespesa() {
        initComponents();
    }

    ServicoDespesas servicodespesas = new ServicoDespesas();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPrimeiroPeriodo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboDespesa = new javax.swing.JComboBox<>();
        jSegundoPeriodo = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Digite o primeiro período");

        jPrimeiroPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrimeiroPeriodoActionPerformed(evt);
            }
        });

        jLabel2.setText("Digite o segundo período");

        jBuscar.setText("Buscar");
        jBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBuscarMouseClicked(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSair)
                    .addComponent(jBuscar)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPrimeiroPeriodo))
                    .addComponent(jSegundoPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPrimeiroPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSegundoPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBuscar)
                .addGap(18, 18, 18)
                .addComponent(jComboDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPrimeiroPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrimeiroPeriodoActionPerformed

    }//GEN-LAST:event_jPrimeiroPeriodoActionPerformed

    private void jBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBuscarMouseClicked
        if (jPrimeiroPeriodo.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Voce precisa digitar o primeiro periodo");
            jPrimeiroPeriodo.requestFocus();
        }else{

            if (jSegundoPeriodo.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Voce precisa digitar o segundo periodo");
                jSegundoPeriodo.requestFocus();
            }}



        try {
            jComboDespesa.removeAllItems();
            ArrayList<Despesas> lista;
            lista = servicodespesas.getDespesasByDate(jPrimeiroPeriodo.getText(), jSegundoPeriodo.getText());
            for (Despesas u:lista){
                jComboDespesa.addItem(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FConsultPeriodoDespesa.class.getName()).log(Level.SEVERE, null, ex);
        }



    }//GEN-LAST:event_jBuscarMouseClicked

    private void jSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseClicked
        dispose();
    }//GEN-LAST:event_jSairMouseClicked

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
            java.util.logging.Logger.getLogger(FConsultPeriodoDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FConsultPeriodoDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FConsultPeriodoDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FConsultPeriodoDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FConsultPeriodoDespesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuscar;
    private javax.swing.JComboBox<Despesas> jComboDespesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jPrimeiroPeriodo;
    private javax.swing.JButton jSair;
    private javax.swing.JTextField jSegundoPeriodo;
    // End of variables declaration//GEN-END:variables
}
