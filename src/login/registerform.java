/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import adminfolder.admindash;
import config.dbConnector;
import java.awt.Color;
import java.security.MessageDigest;

/**
 *
 * @author Sofia
 */
public class registerform extends javax.swing.JFrame {

    /**
     * Creates new form registerform
     */
    public registerform() {
        initComponents();
    }
public static String email_user, user_name;
    
    public boolean emailcheck(){
        dbConnector dbc = new dbConnector();
        
        try{
        String query = "SELECT * FROM datanew WHERE Email ='"+regmail2.getText()+"' ";
            ResultSet resultSet = dbc.getData(query);
       
            
            if(resultSet.next()){
                email_user = resultSet.getString("email");  
                if(email_user.equals(regmail2.getText())){
                    JOptionPane.showMessageDialog(null, "Email Already exist!");
                    regmail2.setText("");
                } 
                return true;
            }else{
                return false;
            }
            
            
        
        }catch(SQLException e){
            System.out.println(""+e);
            return false;
        }
        
    }
    
    public boolean usercheck(){
        dbConnector dbc = new dbConnector();
        
        try{
        String query = "SELECT * FROM datanew WHERE username ='"+user.getText()+"' AND username ='"+user.getText()+"' ";
            ResultSet resultSet = dbc.getData(query);
       
            
            if(resultSet.next()){
                user_name = resultSet.getString("username");
                if(user_name.equals(user.getText())){
                    JOptionPane.showMessageDialog(null, "Username Already exist!");
                    user.setText("");
                }
                return true;
            }else{
                return false;
            }
            
            
        
        }catch(SQLException e){
            System.out.println(""+e);
            return false;
        }
        
    }
    public static String passwordHash(String password){
        
        try{
        
            MessageDigest md = MessageDigest.getInstance("SHA");
            md.update(password.getBytes());
            byte[] rbt = md.digest();
            StringBuilder sb = new StringBuilder();
            
            for(byte b: rbt){
                
                sb.append(String.format("%02x", b));
            
            }
            return sb.toString();
        
        }catch(Exception e){
        
        
        }
        return null;
    
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        regfirst = new javax.swing.JTextField();
        reglast = new javax.swing.JTextField();
        regcontact = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        regpass = new javax.swing.JTextField();
        account_type = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        reguser = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        logg = new javax.swing.JButton();
        regmail2 = new javax.swing.JTextField();
        regaddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        regen = new javax.swing.JComboBox<>();
        reginit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(901, 747));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("FirstName:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 150, 99, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("LastName:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 180, 97, 21);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Email:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 300, 56, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Contact Number:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 240, 155, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("username:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 370, 98, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Password:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 400, 94, 19);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Account Type:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 440, 129, 22);

        regfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regfirstActionPerformed(evt);
            }
        });
        getContentPane().add(regfirst);
        regfirst.setBounds(180, 150, 172, 26);

        reglast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reglastActionPerformed(evt);
            }
        });
        getContentPane().add(reglast);
        reglast.setBounds(180, 180, 170, 26);

        regcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regcontactActionPerformed(evt);
            }
        });
        getContentPane().add(regcontact);
        regcontact.setBounds(180, 240, 170, 26);
        getContentPane().add(user);
        user.setBounds(180, 370, 170, 26);

        regpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regpassActionPerformed(evt);
            }
        });
        getContentPane().add(regpass);
        regpass.setBounds(180, 400, 170, 26);

        account_type.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        account_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User", " " }));
        getContentPane().add(account_type);
        account_type.setBounds(190, 440, 160, 28);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Have an Account?");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 500, 125, 17);

        reguser.setText("Register");
        reguser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reguserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reguserMouseExited(evt);
            }
        });
        reguser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reguserActionPerformed(evt);
            }
        });
        getContentPane().add(reguser);
        reguser.setBounds(260, 500, 90, 30);

        exit.setText("Exit");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(290, 540, 59, 29);

        logg.setText("LOGIN");
        logg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loggMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loggMouseExited(evt);
            }
        });
        logg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggActionPerformed(evt);
            }
        });
        getContentPane().add(logg);
        logg.setBounds(80, 530, 81, 36);

        regmail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regmail2ActionPerformed(evt);
            }
        });
        getContentPane().add(regmail2);
        regmail2.setBounds(180, 300, 170, 26);
        getContentPane().add(regaddress);
        regaddress.setBounds(180, 340, 170, 26);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("gender:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(100, 270, 71, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Address:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(90, 340, 78, 22);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Middle initial:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 210, 121, 22);

        regen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male ", "Female" }));
        regen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regenActionPerformed(evt);
            }
        });
        getContentPane().add(regen);
        regen.setBounds(180, 270, 170, 26);

        reginit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reginitActionPerformed(evt);
            }
        });
        getContentPane().add(reginit);
        reginit.setBounds(180, 210, 170, 26);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regpassActionPerformed

    private void reguserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reguserActionPerformed
        
        if(regfirst.getText().isEmpty() || reglast.getText().isEmpty() 
                || regmail2.getText().isEmpty() || regcontact.getText().isEmpty() 
                || user.getText().isEmpty() || regpass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
            
        }else if(emailcheck()){
            System.out.println("Duplicate Exist!");
            
        }else if(regcontact.getText().length() != 11 ){
            JOptionPane.showMessageDialog(null, "Contact Number should be 11");
            regcontact.setText("");
            
        }else if(usercheck()){
            System.out.println("Duplicate Exist!");
            
        }else if(regpass.getText().length() <8){
            JOptionPane.showMessageDialog(null, "Password Should be 8!");
            regpass.setText("");

        }else{
            dbConnector dbc = new dbConnector();
            
              String password = passwordHash(regpass.getText());
              
        

        if(dbc.insertData("INSERT INTO datanew(f_name, l_name, middle_initial, contact_number,  "
                + " Gender, email, address, username, password, account_type, status) "
                            + " Values ('"+regfirst.getText()+"', '"+reglast.getText()+"', '"+reginit.getText()+"', '"+regcontact.getText()+"', '"
                                    +regen.getSelectedItem()+ "', '"+regmail2.getText()+"', '"+regaddress.getText()+"', '"
                                    +user.getText()+"', '"+password+"', '"
                                            +account_type.getSelectedItem()+"', 'Pending')"))
        {
            JOptionPane.showMessageDialog(null, "Registration Successfully");
            loginform log = new loginform();
            log.setVisible(true);
            this.dispose();
        
        }else{
            JOptionPane.showMessageDialog(null, "Connection Error");
        }
        }
                // TODO add your handling code here:
    }//GEN-LAST:event_reguserActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
 loginform ads = new loginform();
                ads.setVisible(true);
                this.dispose();
                               // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void loggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggActionPerformed
    loginform log = new loginform();
    log.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_loggActionPerformed

    private void reguserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reguserMouseEntered
    reguser.setBackground(Color.green);        // TODO add your handling code here:
    }//GEN-LAST:event_reguserMouseEntered

    private void reguserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reguserMouseExited
        reguser.setBackground(Color.white);
    }//GEN-LAST:event_reguserMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
       exit.setBackground(Color.red);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setBackground(Color.white);
    }//GEN-LAST:event_exitMouseExited

    private void loggMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loggMouseEntered
       logg.setBackground(Color.green);
    }//GEN-LAST:event_loggMouseEntered

    private void loggMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loggMouseExited
        logg.setBackground(Color.white);
    }//GEN-LAST:event_loggMouseExited

    private void reginitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reginitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reginitActionPerformed

    private void regenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regenActionPerformed

    private void regmail2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regmail2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regmail2ActionPerformed

    private void reglastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reglastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reglastActionPerformed

    private void regfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regfirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regfirstActionPerformed

    private void regcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regcontactActionPerformed

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
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> account_type;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton logg;
    private javax.swing.JTextField regaddress;
    private javax.swing.JTextField regcontact;
    private javax.swing.JComboBox<String> regen;
    private javax.swing.JTextField regfirst;
    private javax.swing.JTextField reginit;
    private javax.swing.JTextField reglast;
    private javax.swing.JTextField regmail2;
    private javax.swing.JTextField regpass;
    private javax.swing.JButton reguser;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
