/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package goodhealthwellbeing.view.components;

import goodhealthwellbeing.view.ui.Modules;

/**
 *
 *MD MAHMUDUL HASAN
 */
public class MentalHealthGUI extends javax.swing.JFrame {

    /**
     * Creates new form MentalHealth
     */
    public MentalHealthGUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modulesMainPanel = new javax.swing.JPanel();
        loginLeftPanel = new javax.swing.JPanel();
        modulesLogo = new javax.swing.JLabel();
        modulesRights = new javax.swing.JLabel();
        supportBtn = new javax.swing.JButton();
        stressAndAnxietyBtn = new javax.swing.JButton();
        modulesWelcome = new javax.swing.JLabel();
        meditationBtn = new javax.swing.JButton();
        depressionBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        modulesMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        modulesMainPanel.setOpaque(false);
        modulesMainPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        modulesMainPanel.setLayout(null);

        loginLeftPanel.setBackground(new java.awt.Color(0, 102, 102));
        loginLeftPanel.setPreferredSize(new java.awt.Dimension(400, 500));
        loginLeftPanel.setLayout(null);

        modulesLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ApplicationLogo.png"))); // NOI18N
        loginLeftPanel.add(modulesLogo);
        modulesLogo.setBounds(25, 33, 350, 350);

        modulesRights.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        modulesRights.setForeground(new java.awt.Color(255, 255, 255));
        modulesRights.setText("© 2023 Good Health & Well Being. All Rights Reserved");
        loginLeftPanel.add(modulesRights);
        modulesRights.setBounds(30, 431, 346, 17);

        modulesMainPanel.add(loginLeftPanel);
        loginLeftPanel.setBounds(0, 0, 400, 500);

        supportBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_find_support.png"))); // NOI18N
        supportBtn.setBorder(null);
        supportBtn.setBorderPainted(false);
        supportBtn.setFocusPainted(false);
        supportBtn.setPreferredSize(new java.awt.Dimension(105, 25));
        supportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supportBtnActionPerformed(evt);
            }
        });
        modulesMainPanel.add(supportBtn);
        supportBtn.setBounds(510, 330, 190, 90);

        stressAndAnxietyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_Stress&anxiety.png"))); // NOI18N
        stressAndAnxietyBtn.setBorder(null);
        stressAndAnxietyBtn.setBorderPainted(false);
        stressAndAnxietyBtn.setFocusPainted(false);
        stressAndAnxietyBtn.setPreferredSize(new java.awt.Dimension(105, 25));
        stressAndAnxietyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stressAndAnxietyBtnActionPerformed(evt);
            }
        });
        modulesMainPanel.add(stressAndAnxietyBtn);
        stressAndAnxietyBtn.setBounds(510, 60, 190, 90);

        modulesWelcome.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        modulesWelcome.setForeground(new java.awt.Color(0, 102, 102));
        modulesWelcome.setText("Mental Health Suport");
        modulesMainPanel.add(modulesWelcome);
        modulesWelcome.setBounds(480, 20, 250, 30);

        meditationBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_Meditation.png"))); // NOI18N
        meditationBtn.setBorder(null);
        meditationBtn.setBorderPainted(false);
        meditationBtn.setFocusPainted(false);
        meditationBtn.setPreferredSize(new java.awt.Dimension(105, 25));
        meditationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meditationBtnActionPerformed(evt);
            }
        });
        modulesMainPanel.add(meditationBtn);
        meditationBtn.setBounds(510, 240, 190, 90);

        depressionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_depression.png"))); // NOI18N
        depressionBtn.setBorder(null);
        depressionBtn.setBorderPainted(false);
        depressionBtn.setFocusPainted(false);
        depressionBtn.setPreferredSize(new java.awt.Dimension(105, 25));
        depressionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depressionBtnActionPerformed(evt);
            }
        });
        modulesMainPanel.add(depressionBtn);
        depressionBtn.setBounds(510, 150, 190, 90);

        homeBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        homeBtn.setText("Back To Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        modulesMainPanel.add(homeBtn);
        homeBtn.setBounds(510, 440, 200, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(modulesMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(modulesMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stressAndAnxietyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stressAndAnxietyBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        StressAndAnxietyGUI stressAndAnxiety=new StressAndAnxietyGUI();
        stressAndAnxiety.setVisible(true);
    }//GEN-LAST:event_stressAndAnxietyBtnActionPerformed

    private void depressionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depressionBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        DepressionGUI depression=new DepressionGUI();
        depression.setVisible(true);
    }//GEN-LAST:event_depressionBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Modules modules = Modules.getInstance();
        modules.setVisible(true);
        
    }//GEN-LAST:event_homeBtnActionPerformed

    private void meditationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meditationBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MeditationGUI meditation=new MeditationGUI();
        meditation.setVisible(true);
    }//GEN-LAST:event_meditationBtnActionPerformed

    private void supportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supportBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        FindSupportGUI findSupport=new FindSupportGUI();
        findSupport.setVisible(true);
    }//GEN-LAST:event_supportBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MentalHealthGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MentalHealthGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MentalHealthGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MentalHealthGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MentalHealthGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton depressionBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel loginLeftPanel;
    private javax.swing.JButton meditationBtn;
    private javax.swing.JLabel modulesLogo;
    private javax.swing.JPanel modulesMainPanel;
    private javax.swing.JLabel modulesRights;
    private javax.swing.JLabel modulesWelcome;
    private javax.swing.JButton stressAndAnxietyBtn;
    private javax.swing.JButton supportBtn;
    // End of variables declaration//GEN-END:variables
}
