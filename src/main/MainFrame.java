/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package View;

/**
 *
 * @author chath
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void Enternumbers(String q){
        String Nums = jtxtResults.getText()+q;
        jtxtResults.setText(Nums); 
    }       
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtResults = new javax.swing.JTextField();
        jBtnNum3 = new javax.swing.JButton();
        jbtnNum1 = new javax.swing.JButton();
        jBtnNum2 = new javax.swing.JButton();
        jBtnNum6 = new javax.swing.JButton();
        jBtnNum5 = new javax.swing.JButton();
        jBtnNum8 = new javax.swing.JButton();
        jBtnNum4 = new javax.swing.JButton();
        jBtnNum7 = new javax.swing.JButton();
        jBtnNum9 = new javax.swing.JButton();
        jBtnAdd = new javax.swing.JButton();
        jBtnsub = new javax.swing.JButton();
        jBtnequal = new javax.swing.JButton();
        jBtnNum0 = new javax.swing.JButton();
        btnClr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtxtResults.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtResultsActionPerformed(evt);
            }
        });

        jBtnNum3.setText("3");
        jBtnNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNum3ActionPerformed(evt);
            }
        });

        jbtnNum1.setText("1");
        jbtnNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum1ActionPerformed(evt);
            }
        });

        jBtnNum2.setText("2");
        jBtnNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNum2ActionPerformed(evt);
            }
        });

        jBtnNum6.setText("6");
        jBtnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNum6ActionPerformed(evt);
            }
        });

        jBtnNum5.setText("5");
        jBtnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNum5ActionPerformed(evt);
            }
        });

        jBtnNum8.setText("8");
        jBtnNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNum8ActionPerformed(evt);
            }
        });

        jBtnNum4.setText("4");
        jBtnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNum4ActionPerformed(evt);
            }
        });

        jBtnNum7.setText("7");
        jBtnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNum7ActionPerformed(evt);
            }
        });

        jBtnNum9.setText("9");
        jBtnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNum9ActionPerformed(evt);
            }
        });

        jBtnAdd.setText("+");
        jBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddActionPerformed(evt);
            }
        });

        jBtnsub.setText("-");
        jBtnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnsubActionPerformed(evt);
            }
        });

        jBtnequal.setText("=");
        jBtnequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnequalActionPerformed(evt);
            }
        });

        jBtnNum0.setText("0");
        jBtnNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNum0ActionPerformed(evt);
            }
        });

        btnClr.setText("AC");
        btnClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jtxtResults, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBtnNum7, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jbtnNum1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnNum4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jBtnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBtnNum2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jBtnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jBtnNum5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBtnNum3, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(jBtnNum6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtnNum9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnsub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnequal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnClr, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jtxtResults, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnequal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClr, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void jBtnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNum6ActionPerformed
      Enternumbers("6"); // TODO add your handling code here:
    }//GEN-LAST:event_jBtnNum6ActionPerformed

    private void jBtnNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNum2ActionPerformed
      Enternumbers ("2");  // TODO add your handling code here:
    }//GEN-LAST:event_jBtnNum2ActionPerformed

    private void jtxtResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtResultsActionPerformed
        
   

    }//GEN-LAST:event_jtxtResultsActionPerformed

    private void jBtnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNum7ActionPerformed
        Enternumbers ("7"); // TODO add your handling code here:
    }//GEN-LAST:event_jBtnNum7ActionPerformed

    private void jBtnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNum8ActionPerformed
        Enternumbers ("8"); // TODO add your handling code here:
    }//GEN-LAST:event_jBtnNum8ActionPerformed

    private void jbtnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum1ActionPerformed
        Enternumbers ("1");// TODO add your handling code here:
    }//GEN-LAST:event_jbtnNum1ActionPerformed

    private void jBtnNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNum3ActionPerformed
        Enternumbers ("3");// TODO add your handling code here:
    }//GEN-LAST:event_jBtnNum3ActionPerformed

    private void jBtnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNum4ActionPerformed
        Enternumbers ("4");// TODO add your handling code here:
    }//GEN-LAST:event_jBtnNum4ActionPerformed

    private void jBtnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNum5ActionPerformed
        Enternumbers ("5");// TODO add your handling code here:
    }//GEN-LAST:event_jBtnNum5ActionPerformed

    private void jBtnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNum9ActionPerformed
        Enternumbers ("9");// TODO add your handling code here:
    }//GEN-LAST:event_jBtnNum9ActionPerformed

    private void jBtnNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNum0ActionPerformed
        Enternumbers ("0");// TODO add your handling code here:
    }//GEN-LAST:event_jBtnNum0ActionPerformed

    private void btnClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClrActionPerformed
        jtxtResults.setText("");
    }//GEN-LAST:event_btnClrActionPerformed

    private void jBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddActionPerformed
        Enternumbers("+");
    }//GEN-LAST:event_jBtnAddActionPerformed

    private void jBtnsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnsubActionPerformed
        Enternumbers("-");
    }//GEN-LAST:event_jBtnsubActionPerformed

    private void jBtnequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnequalActionPerformed
        if(jtxtResults.getText().contains("+")){
            String[] Numbers = jtxtResults.getText().split("\\+");
            result = Integer.parseInt(Numbers[0]) + Integer.parseInt(Numbers[1]);
        }else{
            String[] Numbers = jtxtResults.getText().split("\\-");
            result = Integer.parseInt(Numbers[0]) - Integer.parseInt(Numbers[1]);
        }
        jtxtResults.setText(String.valueOf(result));
    }//GEN-LAST:event_jBtnequalActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    int result;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClr;
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jBtnNum0;
    private javax.swing.JButton jBtnNum2;
    private javax.swing.JButton jBtnNum3;
    private javax.swing.JButton jBtnNum4;
    private javax.swing.JButton jBtnNum5;
    private javax.swing.JButton jBtnNum6;
    private javax.swing.JButton jBtnNum7;
    private javax.swing.JButton jBtnNum8;
    private javax.swing.JButton jBtnNum9;
    private javax.swing.JButton jBtnequal;
    private javax.swing.JButton jBtnsub;
    private javax.swing.JButton jbtnNum1;
    private javax.swing.JTextField jtxtResults;
    // End of variables declaration//GEN-END:variables
}
