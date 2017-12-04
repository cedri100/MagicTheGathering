/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MagicGUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author bellaceds
 */

public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    
    
    public MainPage() {
        initComponents();


        extraBox1.setVisible(false);
        extraBox2.setVisible(false);
        typeSearch.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardNameText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        costDropDown = new javax.swing.JComboBox<>();
        typeComboBox = new javax.swing.JComboBox<>();
        TypeLabel = new javax.swing.JLabel();
        typeSearch = new javax.swing.JTextField();
        Cost = new javax.swing.JLabel();
        extraBox1 = new javax.swing.JComboBox<>();
        extraBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(84, 84));

        cardNameText.setText("Name");
        cardNameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cardNameTextFocusGained(evt);
            }
        });
        cardNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNameTextActionPerformed(evt);
            }
        });

        jButton1.setText("Go");

        costDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "no preference", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        costDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costDropDownActionPerformed(evt);
            }
        });

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unspecified", "Artifacts", "Creatures", "Enchantments", "Instants", "Lands", "Planeswalker", "Sorceries" }));
        typeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboBoxActionPerformed(evt);
            }
        });

        TypeLabel.setText("Type");

        typeSearch.setText("Subtype");
        typeSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                typeSearchFocusGained(evt);
            }
        });
        typeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeSearchActionPerformed(evt);
            }
        });

        Cost.setText("Cost");

        extraBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraBox1ActionPerformed(evt);
            }
        });

        extraBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addGap(692, 692, 692))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(extraBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(typeComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cost, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(extraBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(costDropDown, javax.swing.GroupLayout.Alignment.LEADING, 0, 366, Short.MAX_VALUE)
                            .addComponent(cardNameText, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(typeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(316, 316, 316))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(cardNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(TypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(typeSearch))
                .addGap(27, 27, 27)
                .addComponent(extraBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(extraBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Cost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(costDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cardNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNameTextActionPerformed

        cardNameText.setSize(366, 35);
    }//GEN-LAST:event_cardNameTextActionPerformed

    private void costDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costDropDownActionPerformed
        // TODO add your handling code here:
        costDropDown.setSize(366, 35);
    }//GEN-LAST:event_costDropDownActionPerformed

    private void typeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboBoxActionPerformed
        // TODO add your handling code here:
        typeComboBox.setSize(366, 35);
        cardNameText.setSize(366, 35);
        costDropDown.setSize(366, 35);
        typeSearch.setSize(366, 35);  
        extraBox1.setSize(366, 35);   
        extraBox2.setSize(366, 35);          
        
        Object selectedItem = typeComboBox.getSelectedItem();
        selectedItem.toString();
        //Unspecified, Artifacts, Creatures, Enchantments, Instants, Lands, Planeswalker, Sorceries
        

        if (selectedItem == "Unspecified")
        {
            extraBox1.setVisible(false);
            extraBox2.setVisible(false);
            typeSearch.setVisible(false);
        }        
        if (selectedItem == "Artifacts")
        {
            extraBox1.setVisible(false);
            extraBox2.setVisible(false);
            typeSearch.setVisible(true);

        }
        if (selectedItem == "Creatures")
        {
            extraBox1.setVisible(true);
            extraBox2.setVisible(true);
            typeSearch.setVisible(true);
            
        }
        if (selectedItem == "Enchantments")
        {
            extraBox1.setVisible(false);
            extraBox2.setVisible(false);
            typeSearch.setVisible(true);
        }
        if (selectedItem == "Instants")
        {
            extraBox1.setVisible(false);
            extraBox2.setVisible(false);
            typeSearch.setVisible(false);            
        }        
        if (selectedItem == "Lands")
        {
            extraBox1.setVisible(false);
            extraBox2.setVisible(false);
            typeSearch.setVisible(true);
        }      
        if (selectedItem == "Planeswalker")
        {
            extraBox1.setVisible(true);    
            extraBox2.setVisible(false);
            typeSearch.setVisible(true);            
        }        
        if (selectedItem == "Sorceries")
        {
            extraBox1.setVisible(false);
            extraBox2.setVisible(false);
            typeSearch.setVisible(false);            
        }        
        
    }//GEN-LAST:event_typeComboBoxActionPerformed

    private void typeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeSearchActionPerformed
        
        typeSearch.setSize(366, 35);        
    }//GEN-LAST:event_typeSearchActionPerformed

    private void cardNameTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cardNameTextFocusGained
        cardNameText.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
            cardNameText.setText("");
        }
    });
 
    }//GEN-LAST:event_cardNameTextFocusGained

    private void typeSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_typeSearchFocusGained
        typeSearch.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
            typeSearch.setText("");
        }
    });
        
    }//GEN-LAST:event_typeSearchFocusGained

    private void extraBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraBox1ActionPerformed
        // TODO add your handling code here:
        extraBox1.setSize(366, 35);        
        
    }//GEN-LAST:event_extraBox1ActionPerformed

    private void extraBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraBox2ActionPerformed
        // TODO add your handling code here:
        extraBox2.setSize(366, 35);        
    }//GEN-LAST:event_extraBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cost;
    private javax.swing.JLabel TypeLabel;
    private javax.swing.JTextField cardNameText;
    private javax.swing.JComboBox<String> costDropDown;
    private javax.swing.JComboBox<String> extraBox1;
    private javax.swing.JComboBox<String> extraBox2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JTextField typeSearch;
    // End of variables declaration//GEN-END:variables
}
