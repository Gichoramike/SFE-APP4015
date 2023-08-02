
package gymManagement;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Michael
 */
public class listMember extends javax.swing.JFrame {

    Connection cn;
    PreparedStatement pst;
    ResultSet rs;
    
    public listMember() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel)tablelist.getModel();
        
        try
        {
            cn= DriverManager.getConnection("jdbc:mysql://localhost/members","root",null);
            pst=cn.prepareStatement("select * from membersinfo");
            rs=pst.executeQuery();
            while (rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)});
            
            }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        
        }
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mainpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnclose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablelist = new javax.swing.JTable();
        btnPrint = new javax.swing.JButton();
        sidepanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        menupanel = new javax.swing.JPanel();
        btnnewMember = new javax.swing.JButton();
        btnupdateDelete = new javax.swing.JButton();
        btnlist = new javax.swing.JButton();
        btnpayment = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainpanel.setBackground(new java.awt.Color(87, 89, 112));
        mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gymImages/Admin profile.png"))); // NOI18N
        mainpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, -1, -1));
        mainpanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 392, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("List Of Members");
        mainpanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 80, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gymImages/icons8-list-view-64.png"))); // NOI18N
        mainpanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mainpanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnclose.setBackground(new java.awt.Color(64, 66, 88));
        btnclose.setForeground(new java.awt.Color(255, 255, 255));
        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gymImages/close.png"))); // NOI18N
        btnclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncloseMouseClicked(evt);
            }
        });
        mainpanel.add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, -1, -1));

        tablelist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Memeber ID", "First Name", "Last Name", "Mobile Number", "Gym Time", "Email", "ID Number", "Gender", "Amount to Pay"
            }
        ));
        jScrollPane1.setViewportView(tablelist);

        mainpanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 760, 340));

        btnPrint.setBackground(new java.awt.Color(43, 43, 57));
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("Print List");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        mainpanel.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, -1, -1));

        jPanel1.add(mainpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 960, 690));

        sidepanel.setBackground(new java.awt.Color(43, 43, 57));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gymImages/gym logo 2.png"))); // NOI18N
        jLabel3.setText("GYM PARADISE");
        sidepanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        menupanel.setBackground(new java.awt.Color(43, 43, 59));

        btnnewMember.setBackground(new java.awt.Color(64, 66, 88));
        btnnewMember.setForeground(new java.awt.Color(255, 255, 255));
        btnnewMember.setText("New Member");
        btnnewMember.setBorder(null);
        btnnewMember.setBorderPainted(false);
        btnnewMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnewMemberMouseClicked(evt);
            }
        });

        btnupdateDelete.setBackground(new java.awt.Color(64, 66, 88));
        btnupdateDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnupdateDelete.setText("Update & Delete Member");
        btnupdateDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnupdateDeleteMouseClicked(evt);
            }
        });

        btnlist.setBackground(new java.awt.Color(255, 123, 0));
        btnlist.setForeground(new java.awt.Color(255, 255, 255));
        btnlist.setText("List of Members");
        btnlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlistMouseClicked(evt);
            }
        });

        btnpayment.setBackground(new java.awt.Color(64, 66, 88));
        btnpayment.setForeground(new java.awt.Color(255, 255, 255));
        btnpayment.setText("Payment ");
        btnpayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpaymentMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menupanelLayout = new javax.swing.GroupLayout(menupanel);
        menupanel.setLayout(menupanelLayout);
        menupanelLayout.setHorizontalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnnewMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnupdateDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnlist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnpayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menupanelLayout.setVerticalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnnewMember, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnupdateDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnlist, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        sidepanel.add(menupanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        btnlogout.setBackground(new java.awt.Color(64, 66, 88));
        btnlogout.setForeground(new java.awt.Color(255, 255, 255));
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gymImages/log out 2.png"))); // NOI18N
        btnlogout.setText("Log out");
        btnlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlogoutMouseClicked(evt);
            }
        });
        sidepanel.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, -1, -1));

        jPanel1.add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btncloseMouseClicked

    private void btnlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseClicked
        // TODO add your handling code here:
        int a =JOptionPane.showConfirmDialog(null,"Do you really want to log out","select",JOptionPane.YES_NO_CANCEL_OPTION);

        if(a==0)
        {
            setVisible(false);
            new Login().setVisible(true);

        }
    }//GEN-LAST:event_btnlogoutMouseClicked

    private void btnlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlistMouseClicked
        
        new listMember().setVisible(true);
        new newMember().setVisible(false);
        new updateDelete().setVisible(false);
        new payment().setVisible(false);
        
    }//GEN-LAST:event_btnlistMouseClicked

    private void btnnewMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnewMemberMouseClicked
        
        new listMember().setVisible(false);
        new newMember().setVisible(true);
        
    }//GEN-LAST:event_btnnewMemberMouseClicked

    private void btnupdateDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupdateDeleteMouseClicked
        
        new listMember().setVisible(false);
        new updateDelete().setVisible(true);
        
    }//GEN-LAST:event_btnupdateDeleteMouseClicked

    private void btnpaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpaymentMouseClicked
        
        new listMember().setVisible(false);
        new payment().setVisible(true);
        
    }//GEN-LAST:event_btnpaymentMouseClicked

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Do you want to print records?","select",JOptionPane.YES_NO_OPTION);
        
        if(a==0)
        {
            try
            {
                new listMember();
                tablelist.print();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnPrintActionPerformed

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
            java.util.logging.Logger.getLogger(listMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnlist;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnnewMember;
    private javax.swing.JButton btnpayment;
    private javax.swing.JButton btnupdateDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JPanel menupanel;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JTable tablelist;
    // End of variables declaration//GEN-END:variables
}
