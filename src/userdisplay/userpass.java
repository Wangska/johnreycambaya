/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userdisplay;

import adminfolder.admindash;
import config.dbConnector;
import config.session;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static login.registerform.passwordHash;

/**
 *
 * @author wangs
 */
public class userpass extends javax.swing.JFrame {

    /**
     * Creates new form userpass
     */
    public userpass() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        reglast = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        regfirst = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        regmid = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        regadd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        regemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        regcontact = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        gen = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        display_id = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        upuser = new javax.swing.JTextField();
        idsss = new javax.swing.JLabel();
        showpass2 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        uppass = new javax.swing.JPasswordField();
        conpass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        conpass1 = new javax.swing.JPasswordField();
        shpass = new javax.swing.JCheckBox();
        showpass3 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(798, 642));
        setResizable(false);

        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Last Name : ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 100, 120, 30);

        reglast.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(reglast);
        reglast.setBounds(210, 100, 200, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("First Name : ");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(30, 140, 120, 30);

        regfirst.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(regfirst);
        regfirst.setBounds(210, 140, 200, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Middle Name : ");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(30, 180, 140, 30);

        regmid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(regmid);
        regmid.setBounds(210, 180, 200, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Address :");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(30, 220, 140, 30);

        regadd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        regadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regaddActionPerformed(evt);
            }
        });
        jPanel2.add(regadd);
        regadd.setBounds(210, 220, 200, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Email :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 300, 160, 30);

        regemail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        regemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regemailActionPerformed(evt);
            }
        });
        jPanel2.add(regemail);
        regemail.setBounds(210, 300, 200, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Contact Number :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 260, 170, 30);

        regcontact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        regcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regcontactActionPerformed(evt);
            }
        });
        jPanel2.add(regcontact);
        regcontact.setBounds(210, 260, 200, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Gender :");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(30, 340, 150, 30);

        gen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel2.add(gen);
        gen.setBounds(210, 340, 200, 30);

        jLabel6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel6AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6);
        jLabel6.setBounds(420, 10, 30, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("ID NO: ");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 40, 80, 20);

        display_id.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        display_id.setText("D ID");
        jPanel2.add(display_id);
        display_id.setBounds(90, 40, 80, 20);

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("Update Information");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(250, 410, 190, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 0, 0);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("ID NO: ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(290, 50, 80, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Username :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(240, 100, 170, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText(" Old Password :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(210, 150, 170, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Confirm Password :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(170, 250, 190, 30);

        upuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upuserActionPerformed(evt);
            }
        });
        jPanel1.add(upuser);
        upuser.setBounds(370, 90, 190, 40);
        jPanel1.add(idsss);
        idsss.setBounds(380, 50, 110, 20);

        showpass2.setText("Show Password");
        showpass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpass2ActionPerformed(evt);
            }
        });
        jPanel1.add(showpass2);
        showpass2.setBounds(570, 150, 150, 29);

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Update Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(550, 510, 190, 40);
        jPanel1.add(uppass);
        uppass.setBounds(370, 250, 190, 40);

        conpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conpassActionPerformed(evt);
            }
        });
        jPanel1.add(conpass);
        conpass.setBounds(370, 140, 190, 40);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(650, 570, 65, 29);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Password :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(250, 210, 170, 30);

        conpass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conpass1ActionPerformed(evt);
            }
        });
        jPanel1.add(conpass1);
        conpass1.setBounds(370, 200, 190, 40);

        shpass.setText("Show Password");
        shpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shpassActionPerformed(evt);
            }
        });
        jPanel1.add(shpass);
        shpass.setBounds(570, 260, 150, 29);

        showpass3.setText("Show Password");
        showpass3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpass3ActionPerformed(evt);
            }
        });
        jPanel1.add(showpass3);
        showpass3.setBounds(570, 210, 150, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\wangs\\Downloads\\pexels-thought-catalog-317580-904616.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -20, 800, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regaddActionPerformed

    private void regemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regemailActionPerformed

    private void regcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regcontactActionPerformed

    private void jLabel6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel6AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6AncestorAdded

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
      

        String idss = display_id.getText();
        String lastnames = reglast.getText();
        String firstnames = regfirst.getText();
        String middlenames = regmid.getText();
        String addresss = regadd.getText();
        String emails = regemail.getText();
        String contactnum = regcontact.getText();
        String genders = gen.getSelectedItem().toString();

        dbConnector dbc = new dbConnector();

        try{

            if(dbc.insertData("UPDATE datanew SET f_name ='"+firstnames+"', "
                + "l_name ='"+lastnames+"', middle_initial ='"+middlenames+"',"
                + " contact_number ='"+contactnum+"', Gender ='"+genders+"', "
                + " email ='"+emails+"', address ='"+addresss+"' "
                + "  WHERE id ='"+idss+"' ")){

            JOptionPane.showMessageDialog(null, "Data Updated Please Login Again to Refresh the Information!");

            

            this.dispose();
        }

        } catch (Exception e){

            System.out.println(e);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void upuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upuserActionPerformed
        
    }//GEN-LAST:event_upuserActionPerformed

    private void showpass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpass2ActionPerformed
        // TODO add your handling code here:
       
        
        if (showpass2.isSelected()){
            conpass.setEchoChar((char)0);
        }else{
            conpass.setEchoChar('*');

        }
    }//GEN-LAST:event_showpass2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String idss = display_id.getText();

        String usernamess = conpass1.getText();
        
        

        try{
            
            dbConnector dbc = new dbConnector();
            
            session sess = session.getInstance();
            
            String query = "SELECT * FROM datanew WHERE id ='"+sess.getId()+"' ";
            ResultSet rs = dbc.getData(query);
            
            if(rs.next()){
            
                String oldpassword = rs.getString("password");
                String oldhash = passwordHash(conpass1.getText());
                
                if(oldpassword.equals(oldhash)){
                    String npass = passwordHash(conpass.getText());
                    dbc.insertData("UPDATE datanew SET username ='"+usernamess+"', password ='"+npass+"' WHERE id ='"+idss+"' ");
                    JOptionPane.showMessageDialog(null, "Data Updated Please Login Again!");
                    displayuser sad = new displayuser();
                    sad.setVisible(true);
                    this.dispose();
                
                }else{
                    JOptionPane.showMessageDialog(null, "Old Password is Incorrect!");
                }
                
            }

        } catch (Exception e){

            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        admindash ads = new admindash();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void conpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conpassActionPerformed

    private void conpass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conpass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conpass1ActionPerformed

    private void shpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shpassActionPerformed
 if (shpass.isSelected()){
            uppass.setEchoChar((char)0);
        }else{
            uppass.setEchoChar('*');

        }        // TODO add your handling code here:
    }//GEN-LAST:event_shpassActionPerformed

    private void showpass3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpass3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showpass3ActionPerformed

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
            java.util.logging.Logger.getLogger(userpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userpass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPasswordField conpass;
    public javax.swing.JPasswordField conpass1;
    public javax.swing.JLabel display_id;
    public javax.swing.JComboBox<String> gen;
    private javax.swing.JLabel idsss;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField regadd;
    public javax.swing.JTextField regcontact;
    public javax.swing.JTextField regemail;
    public javax.swing.JTextField regfirst;
    public javax.swing.JTextField reglast;
    public javax.swing.JTextField regmid;
    private javax.swing.JCheckBox showpass2;
    private javax.swing.JCheckBox showpass3;
    private javax.swing.JCheckBox shpass;
    public javax.swing.JPasswordField uppass;
    public javax.swing.JTextField upuser;
    // End of variables declaration//GEN-END:variables
}
