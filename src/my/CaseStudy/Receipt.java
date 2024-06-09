/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package my.CaseStudy;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author PLPASIG
 */
public class Receipt extends javax.swing.JFrame {    

    public Receipt(Object[][] data) {
    initComponents();
    populateTable(data);
    receipt();
    
    
        
        
    }

private void populateTable(Object[][] data) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (Object[] row : data) {
            model.addRow(row);
        }
    }
        
public void receipt() {
        // bill print
        
        try {
            
            receipter.setText(receipter.getText() + "------------------------------------------------------------------------------------\n");
            receipter.setText(receipter.getText() + "  Name\t\t\tQty \n");
            receipter.setText(receipter.getText() + "------------------------------------------------------------------------------------\n");
            
            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
            
            // get table Product details
            
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                
                String Name = df.getValueAt(i, 1).toString();
                String Qty = df.getValueAt(i, 2).toString();
                
                receipter.setText(receipter.getText() +"  "+ Name+"\t\t\t"+Qty +"\n");
            }
            
            
            receipter.setText(receipter.getText() + "------------------------------------------------------------------------------------\n");
            receipter.setText(receipter.getText() + "                     Thanks For Your Business...!"+"\n");
            receipter.setText(receipter.getText() + "---------------------------------------------------- -------------------------------\n");
            
           
       
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
            
            
        }

    
    
}
 public javax.swing.JTextArea getReceipter() {
        return receipter;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        receipter = new javax.swing.JTextArea();
        prcdbttn = new javax.swing.JButton();
        prcdbttn1 = new javax.swing.JButton();

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable12);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Name", "Qty", "Proce"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        receipter.setEditable(false);
        receipter.setColumns(20);
        receipter.setRows(5);
        jScrollPane1.setViewportView(receipter);

        prcdbttn.setText("Proceed");
        prcdbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prcdbttnActionPerformed(evt);
            }
        });

        prcdbttn1.setText("Back");
        prcdbttn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prcdbttn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(prcdbttn1)
                .addGap(50, 50, 50)
                .addComponent(prcdbttn)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prcdbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prcdbttn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prcdbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prcdbttnActionPerformed
        UserInput ui = new UserInput();
        ui.setVisible(true);
        ui.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_prcdbttnActionPerformed

    private void prcdbttn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prcdbttn1ActionPerformed
        // TODO add your handling code here:
        MenuPage menu = new MenuPage();
        menu.setEnabled(true);
        this.hide();
    }//GEN-LAST:event_prcdbttn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable12;
    private javax.swing.JButton prcdbttn;
    private javax.swing.JButton prcdbttn1;
    private javax.swing.JTextArea receipter;
    // End of variables declaration//GEN-END:variables
}
