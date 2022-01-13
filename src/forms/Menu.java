/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

/**
 *
 * @author Matheus
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }
    
    public FCadReceitas fcadreceitas;

    public FCadDespesas fcaddespesas;
    
    public FCadContas fcadcontas;
    
    public FEditReceitas feditreceitas;
    
    public FEditDespesas feditdespesas;
    
    public FEditContas feditcontas;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jToggleButton1 = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jMenuBar4 = new javax.swing.JMenuBar();
        jcadastro = new javax.swing.JMenu();
        jDespesas = new javax.swing.JMenuItem();
        jCadReceitas = new javax.swing.JMenuItem();
        jContas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jEditReceitas = new javax.swing.JMenuItem();
        jEditDespesas = new javax.swing.JMenuItem();
        jEDitContas = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        jToggleButton1.setText("jToggleButton1");

        jMenu5.setText("File");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar1.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        jLabel1.setText("Menu");

        jToolBar1.setRollover(true);

        jcadastro.setText("Cadastro");

        jDespesas.setText("Despesas");
        jDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDespesasActionPerformed(evt);
            }
        });
        jcadastro.add(jDespesas);

        jCadReceitas.setText("Receita");
        jCadReceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadReceitasActionPerformed(evt);
            }
        });
        jcadastro.add(jCadReceitas);

        jContas.setText("Contas");
        jContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jContasActionPerformed(evt);
            }
        });
        jcadastro.add(jContas);

        jMenuBar4.add(jcadastro);

        jMenu7.setText("Editar");

        jEditReceitas.setText("Receitas");
        jEditReceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditReceitasActionPerformed(evt);
            }
        });
        jMenu7.add(jEditReceitas);

        jEditDespesas.setText("Despesas");
        jEditDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditDespesasActionPerformed(evt);
            }
        });
        jMenu7.add(jEditDespesas);

        jEDitContas.setText("Contas");
        jEDitContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEDitContasActionPerformed(evt);
            }
        });
        jMenu7.add(jEDitContas);

        jMenuBar4.add(jMenu7);

        setJMenuBar(jMenuBar4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCadReceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadReceitasActionPerformed
        if (fcadreceitas == null){
            fcadreceitas = new FCadReceitas();
        }
        fcadreceitas.setVisible(true);
    }//GEN-LAST:event_jCadReceitasActionPerformed

    private void jDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDespesasActionPerformed
        if (fcaddespesas== null){
            fcaddespesas = new FCadDespesas();
        }
        fcaddespesas.setVisible(true);
    }//GEN-LAST:event_jDespesasActionPerformed

    private void jContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jContasActionPerformed
     if (fcadcontas== null){
            fcadcontas = new FCadContas();
        }
        fcadcontas.setVisible(true);
    }//GEN-LAST:event_jContasActionPerformed

    private void jEditReceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditReceitasActionPerformed
     if (feditreceitas== null){
            feditreceitas = new FEditReceitas();
        }
        feditreceitas.setVisible(true);
    }//GEN-LAST:event_jEditReceitasActionPerformed

    private void jEditDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditDespesasActionPerformed
     if (feditdespesas== null){
            feditdespesas = new FEditDespesas();
        }
        feditdespesas.setVisible(true);
    }//GEN-LAST:event_jEditDespesasActionPerformed

    private void jEDitContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEDitContasActionPerformed
     if (feditcontas== null){
            feditcontas = new FEditContas();
        }
        feditcontas.setVisible(true);   
    }//GEN-LAST:event_jEDitContasActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jCadReceitas;
    private javax.swing.JMenuItem jContas;
    private javax.swing.JMenuItem jDespesas;
    private javax.swing.JMenuItem jEDitContas;
    private javax.swing.JMenuItem jEditDespesas;
    private javax.swing.JMenuItem jEditReceitas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu jcadastro;
    // End of variables declaration//GEN-END:variables
}
