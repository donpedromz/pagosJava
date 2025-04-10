/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author juanp
 */
public class CriptoForm extends javax.swing.JFrame {

    /**
     * Creates new form CriptoForm
     */
    public CriptoForm() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        walletNumber = new javax.swing.JTextField();
        paymentButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        transactionAmmount = new javax.swing.JTextField();
        walletPasskey = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        destinationAccount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        walletToken2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Criptos.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 282, 660));

        jLabel2.setFont(new java.awt.Font("Hack Nerd Font Mono", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("INGRESE EL NÚMERO DE SU WALLET");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        walletNumber.setBackground(new java.awt.Color(204, 204, 204));
        walletNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        walletNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walletNumberActionPerformed(evt);
            }
        });
        jPanel2.add(walletNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 600, 40));

        paymentButton.setBackground(new java.awt.Color(255, 255, 255));
        paymentButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/1751761.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Hack Nerd Font Mono", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("PAGAR");

        javax.swing.GroupLayout paymentButtonLayout = new javax.swing.GroupLayout(paymentButton);
        paymentButton.setLayout(paymentButtonLayout);
        paymentButtonLayout.setHorizontalGroup(
            paymentButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentButtonLayout.createSequentialGroup()
                .addGroup(paymentButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentButtonLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3))
                    .addGroup(paymentButtonLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paymentButtonLayout.setVerticalGroup(
            paymentButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(26, 26, 26))
        );

        jPanel2.add(paymentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 140, 140));

        jLabel5.setFont(new java.awt.Font("Hack Nerd Font Mono", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("INGRESE LA PASSKEY DE SU WALLET");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        errorLabel.setBackground(new java.awt.Color(255, 0, 0));
        errorLabel.setFont(new java.awt.Font("Hack Nerd Font Mono", 1, 14)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(errorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 450, 40));

        transactionAmmount.setBackground(new java.awt.Color(204, 204, 204));
        transactionAmmount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        transactionAmmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionAmmountActionPerformed(evt);
            }
        });
        jPanel2.add(transactionAmmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 600, 40));

        walletPasskey.setBackground(new java.awt.Color(204, 204, 204));
        walletPasskey.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(walletPasskey, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 600, 40));

        jLabel7.setFont(new java.awt.Font("Hack Nerd Font Mono", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("INGRESE EL MONTO A PAGAR");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        destinationAccount.setBackground(new java.awt.Color(204, 204, 204));
        destinationAccount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        destinationAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationAccountActionPerformed(evt);
            }
        });
        jPanel2.add(destinationAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 600, 40));

        jLabel8.setFont(new java.awt.Font("Hack Nerd Font Mono", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("INGRESE LA CUENTA DESTINO");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        walletToken2.setBackground(new java.awt.Color(204, 204, 204));
        walletToken2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        walletToken2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walletToken2ActionPerformed(evt);
            }
        });
        jPanel2.add(walletToken2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 600, 40));

        jLabel9.setFont(new java.awt.Font("Hack Nerd Font Mono", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("INGRESE LA CUENTA DESTINO");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void walletNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walletNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_walletNumberActionPerformed

    private void transactionAmmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionAmmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transactionAmmountActionPerformed

    private void destinationAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationAccountActionPerformed

    private void walletToken2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walletToken2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_walletToken2ActionPerformed

    public JPanel getPaymentButton() {
        return paymentButton;
    }
    public void addPaymentButtonClickListener(java.awt.event.MouseListener l){
        this.paymentButton.addMouseListener(l);
    }

    public JLabel getErrorLabel() {
        return errorLabel;
    }

    public JTextField getWalletNumber() {
        return walletNumber;
    }

    public JPasswordField getWalletPasskey() {
        return walletPasskey;
    }

    public JTextField getTransactionAmmount() {
        return transactionAmmount;
    }

    public JTextField getDestinationAccount() {
        return destinationAccount;
    }
    
    
    public void showWindow(){
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField destinationAccount;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel paymentButton;
    private javax.swing.JTextField transactionAmmount;
    private javax.swing.JTextField walletNumber;
    private javax.swing.JPasswordField walletPasskey;
    private javax.swing.JTextField walletToken2;
    // End of variables declaration//GEN-END:variables
}
