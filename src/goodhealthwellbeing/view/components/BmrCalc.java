package goodhealthwellbeing.view.components;

import goodhealthwellbeing.output.BmrFemaleOutput;
import goodhealthwellbeing.output.BmrMaleOutput;
import goodhealthwellbeing.util.Bmr;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * BmrCalc.java
 * @author Ryan Stokes
 */
public class BmrCalc extends javax.swing.JFrame {

    /**
     * Creates new form MacroInfo
     */
    public BmrCalc() {
        initComponents();
        
        //Button used to return to the previous form
        btnBack.addActionListener((ActionEvent e) -> {
            Nutrition nutrition = new Nutrition();
            nutrition.setVisible(true);
            BmrCalc.this.setVisible(false);
        });
        
        //Button to provide the user with bmr depending on radio button selection
        btnBmrCalc.addActionListener((ActionEvent e) -> {
            
            //Male Selection
            if(rdoMale.isSelected()){
                
                Bmr bmr = new BmrMaleOutput();
                setInfo(bmr);
                activeCheck(bmr);
                
            }
            //Female Selection
            else if(rdoFemale.isSelected()){
                
                Bmr bmr = new BmrFemaleOutput();
                setInfo(bmr);
                activeCheck(bmr);
                
            }
            //Validation - Error message if one of gender options not selected
                else{JOptionPane.showMessageDialog(null, "Please select Male or Female");}
        });
    }
    
    //Format result to 0 decimal places
    DecimalFormat fmt = new DecimalFormat("#");
    
    //Method which sets the info needed for the calculation depending on instance of Bmr.java
    public void setInfo(Bmr bmr){
        bmr.setAge(Integer.parseInt(txtAge.getText()));
        bmr.setHeight(Integer.parseInt(txtHeight.getText()));
        bmr.setWeight(Integer.parseInt(txtWeight.getText()));
    }
    
    //Method which will add 500 calories on to final result if Active is checked, also formats result.
    public void activeCheck(Bmr bmr){
        if(chkActive.isSelected()){
            txtBmrOutput.setText(fmt.format((bmr.getBmr() + 500)));
        }
        else{
            txtBmrOutput.setText(fmt.format((bmr.getBmr())));
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        bmrCalcMainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        loginLogo = new javax.swing.JLabel();
        logoRights = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        rdoMale = new javax.swing.JRadioButton();
        rdoFemale = new javax.swing.JRadioButton();
        txtAge = new javax.swing.JFormattedTextField();
        txtWeight = new javax.swing.JFormattedTextField();
        txtBmrOutput = new javax.swing.JTextField();
        chkActive = new javax.swing.JCheckBox();
        lblAge = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        lblBmr = new javax.swing.JLabel();
        btnBmrCalc = new javax.swing.JButton();
        txtHeight = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bmrCalcMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        bmrCalcMainPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        bmrCalcMainPanel.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));

        loginLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ApplicationLogo.png"))); // NOI18N

        logoRights.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        logoRights.setForeground(new java.awt.Color(255, 255, 255));
        logoRights.setText("© 2023 Good Health & Well Being. All Rights Reserved");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoRights, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginLogo))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(loginLogo)
                .addGap(18, 18, 18)
                .addComponent(logoRights, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        bmrCalcMainPanel.add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 500);

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_back.png"))); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        bmrCalcMainPanel.add(btnBack);
        btnBack.setBounds(420, 30, 50, 30);

        buttonGroup1.add(rdoMale);
        rdoMale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdoMale.setForeground(new java.awt.Color(0, 0, 0));
        rdoMale.setText("Male");
        bmrCalcMainPanel.add(rdoMale);
        rdoMale.setBounds(450, 90, 110, 25);

        buttonGroup1.add(rdoFemale);
        rdoFemale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdoFemale.setForeground(new java.awt.Color(0, 0, 0));
        rdoFemale.setText("Female");
        rdoFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoFemaleActionPerformed(evt);
            }
        });
        bmrCalcMainPanel.add(rdoFemale);
        rdoFemale.setBounds(680, 90, 110, 25);
        bmrCalcMainPanel.add(txtAge);
        txtAge.setBounds(500, 150, 210, 40);

        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });
        bmrCalcMainPanel.add(txtWeight);
        txtWeight.setBounds(500, 290, 210, 40);

        txtBmrOutput.setEditable(false);
        txtBmrOutput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bmrCalcMainPanel.add(txtBmrOutput);
        txtBmrOutput.setBounds(480, 420, 240, 50);

        chkActive.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkActive.setForeground(new java.awt.Color(0, 0, 0));
        chkActive.setText("Active");
        bmrCalcMainPanel.add(chkActive);
        chkActive.setBounds(460, 360, 85, 24);

        lblAge.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAge.setForeground(new java.awt.Color(0, 0, 0));
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAge.setText("Age");
        lblAge.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bmrCalcMainPanel.add(lblAge);
        lblAge.setBounds(570, 120, 60, 30);

        lblHeight.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHeight.setForeground(new java.awt.Color(0, 0, 0));
        lblHeight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeight.setText("Height (cm)");
        bmrCalcMainPanel.add(lblHeight);
        lblHeight.setBounds(560, 190, 80, 30);

        lblWeight.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblWeight.setForeground(new java.awt.Color(0, 0, 0));
        lblWeight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWeight.setText("Weight (kg)");
        bmrCalcMainPanel.add(lblWeight);
        lblWeight.setBounds(560, 260, 80, 30);

        lblBmr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBmr.setForeground(new java.awt.Color(0, 0, 0));
        lblBmr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBmr.setText("Daily Recommended Calories");
        bmrCalcMainPanel.add(lblBmr);
        lblBmr.setBounds(480, 390, 240, 30);

        btnBmrCalc.setBackground(new java.awt.Color(255, 255, 255));
        btnBmrCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_calculate.png"))); // NOI18N
        btnBmrCalc.setContentAreaFilled(false);
        bmrCalcMainPanel.add(btnBmrCalc);
        btnBmrCalc.setBounds(660, 350, 90, 36);
        bmrCalcMainPanel.add(txtHeight);
        txtHeight.setBounds(500, 220, 210, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bmrCalcMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bmrCalcMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void rdoFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoFemaleActionPerformed

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
            java.util.logging.Logger.getLogger(BmrCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BmrCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BmrCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BmrCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BmrCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bmrCalcMainPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBmrCalc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkActive;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBmr;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel loginLogo;
    private javax.swing.JLabel logoRights;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JFormattedTextField txtAge;
    private javax.swing.JTextField txtBmrOutput;
    private javax.swing.JFormattedTextField txtHeight;
    private javax.swing.JFormattedTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
