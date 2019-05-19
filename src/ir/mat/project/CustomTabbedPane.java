package ir.mat.project;

/*


This panel is designed to personalize the tab
This customization involves closing a tab.


Mostafa Tabrizi

*/

import java.awt.Component;
import java.awt.event.ActionEvent;

/**
 *
 * @author mat
 */
public class CustomTabbedPane extends javax.swing.JPanel {

  
    public CustomTabbedPane() {
        initComponents();
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CloseButton = new javax.swing.JButton();
        TabName1 = new javax.swing.JLabel();

        CloseButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        CloseButton.setPreferredSize(new java.awt.Dimension(40, 45));

        TabName1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TabName1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TabName1))
                .addGap(0, 11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton CloseButton;
    public javax.swing.JLabel TabName1;
    // End of variables declaration//GEN-END:variables

    
    
}
