
package goodhealthwellbeing.view;

import java.awt.event.ActionEvent;

/*
 * 11/11/23
 * Nutrition.java
 * @author ryans
 */
public class MacroInfo extends javax.swing.JFrame {

    /**
     * Creates new form MacroInfo
     */
    public MacroInfo() {
        initComponents();
        
        homeButton.addActionListener((ActionEvent e) -> {
            Nutrition nutrition = new Nutrition();
            nutrition.setVisible(true);
            MacroInfo.this.setVisible(false);
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        macroInfoMainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        fatButton = new javax.swing.JButton();
        carbButton = new javax.swing.JButton();
        proteinButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        macroInfoMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        macroInfoMainPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        macroInfoMainPanel.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        macroInfoMainPanel.add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 500);

        homeButton.setText("BACK");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        macroInfoMainPanel.add(homeButton);
        homeButton.setBounds(440, 40, 72, 23);

        fatButton.setText("Fats");
        macroInfoMainPanel.add(fatButton);
        fatButton.setBounds(520, 350, 150, 60);

        carbButton.setText("Carbohydrates");
        macroInfoMainPanel.add(carbButton);
        carbButton.setBounds(520, 170, 150, 60);

        proteinButton.setText("Proteins");
        proteinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinButtonActionPerformed(evt);
            }
        });
        macroInfoMainPanel.add(proteinButton);
        proteinButton.setBounds(520, 260, 150, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(macroInfoMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(macroInfoMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonActionPerformed

    private void proteinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MacroInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MacroInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MacroInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MacroInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MacroInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton carbButton;
    private javax.swing.JButton fatButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel macroInfoMainPanel;
    private javax.swing.JButton proteinButton;
    // End of variables declaration//GEN-END:variables
}