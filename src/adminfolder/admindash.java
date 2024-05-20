
package adminfolder;

import com.mysql.jdbc.Connection;
import config.dbConnector;
import config.session;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import login.loginform;
import static login.registerform.passwordHash;
import static login.registerform.user_name;
import userdisplay.displayuser;


/**
 *
 * @author Sofia
 */
public class admindash extends javax.swing.JFrame {

    /**
     * Creates new form admindash
     */
    public admindash() {
        initComponents();
        table_load();
       
    }
    
    public static String email_user, user_name;
    
    public boolean emailcheck(){
        dbConnector dbc = new dbConnector();
        
        try{
        String query = "SELECT * FROM datanew WHERE username ='"+reguser.getText()+"' AND email ='"+regemail.getText()+"' ";
            ResultSet resultSet = dbc.getData(query);
       
            
            if(resultSet.next()){
                email_user = resultSet.getString("email");  
                if(email_user.equals(regemail.getText())){
                    JOptionPane.showMessageDialog(null, "Email Already exist!");
                    regemail.setText("");
                }
                user_name = resultSet.getString("username");
                if(user_name.equals(reguser.getText())){
                    JOptionPane.showMessageDialog(null, "Username Already exist!");
                    reguser.setText("");
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
    
    
        
    
    public void table_load(){
         
         dbConnector dbc = new dbConnector();
    
        try {
            
        
            DefaultTableModel dt = (DefaultTableModel) adminstable.getModel();
            dt.setRowCount(0);
            
            String query = ("SELECT * FROM datanew");
            ResultSet rs = dbc.getData(query);
            
            while(rs.next()){
            
                Vector v = new Vector();
                
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(rs.getString(8));
                v.add(rs.getString(9));
                v.add(rs.getString(10));
                v.add(rs.getString(11));
                v.add(rs.getString(12));
         
                
                
                dt.addRow(v);
            
            }
       
        
        }catch (SQLException e){
            
            System.out.println(e);
        
        }
    
    }
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lastname = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        wala = new javax.swing.JTextField();
        regpass = new javax.swing.JTextField();
        regcontact = new javax.swing.JTextField();
        reg_last = new javax.swing.JTextField();
        regmid = new javax.swing.JTextField();
        regadd = new javax.swing.JTextField();
        regfirst = new javax.swing.JTextField();
        regemail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        u_id = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        stats = new javax.swing.JComboBox<>();
        gen = new javax.swing.JComboBox<>();
        accnt_type = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        reguser = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminstable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        uid = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        namess = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1399, 739));
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMINDASHBOARD");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 70, 238, 29);

        lastname.setBackground(new java.awt.Color(204, 204, 255));
        lastname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lastname.setForeground(new java.awt.Color(255, 255, 255));
        lastname.setText("WELCOME:");
        jPanel1.add(lastname);
        lastname.setBounds(190, 30, 100, 43);

        jButton1.setText("LOGOUT");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1300, 710, 97, 29);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BERGEN UNIVERSITY SCHOLARSHIP");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(360, 0, 400, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Search:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(800, 10, 110, 20);

        wala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walaActionPerformed(evt);
            }
        });
        wala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                walaKeyReleased(evt);
            }
        });
        jPanel1.add(wala);
        wala.setBounds(890, 10, 210, 26);

        regpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regpassActionPerformed(evt);
            }
        });
        jPanel1.add(regpass);
        regpass.setBounds(810, 200, 140, 26);
        jPanel1.add(regcontact);
        regcontact.setBounds(500, 310, 120, 26);

        reg_last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_lastActionPerformed(evt);
            }
        });
        jPanel1.add(reg_last);
        reg_last.setBounds(500, 220, 120, 26);

        regmid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regmidActionPerformed(evt);
            }
        });
        jPanel1.add(regmid);
        regmid.setBounds(500, 250, 120, 26);

        regadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regaddActionPerformed(evt);
            }
        });
        jPanel1.add(regadd);
        regadd.setBounds(500, 340, 120, 26);

        regfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regfirstActionPerformed(evt);
            }
        });
        jPanel1.add(regfirst);
        regfirst.setBounds(500, 190, 120, 26);

        regemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regemailActionPerformed(evt);
            }
        });
        jPanel1.add(regemail);
        regemail.setBounds(500, 280, 120, 26);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 255, 255));
        jLabel7.setText("username:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(690, 150, 120, 29);

        u_id.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        u_id.setText("Id:");
        jPanel1.add(u_id);
        u_id.setBounds(470, 160, 30, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("firstname:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(390, 190, 108, 29);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("lastname:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(390, 220, 110, 29);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("email:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(430, 280, 90, 29);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("contact#:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(390, 310, 120, 29);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("middle initial:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(350, 250, 150, 29);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 255, 255));
        jLabel14.setText("password:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(690, 200, 120, 29);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("address:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(410, 340, 120, 29);

        stats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Active" }));
        jPanel1.add(stats);
        stats.setBounds(810, 310, 100, 26);

        gen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(gen);
        gen.setBounds(810, 250, 100, 26);

        accnt_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        jPanel1.add(accnt_type);
        accnt_type.setBounds(810, 280, 100, 26);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 255, 255));
        jLabel18.setText("status:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(730, 300, 90, 29);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 255, 255));
        jLabel19.setText("gender:");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(720, 240, 90, 29);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 255, 255));
        jLabel20.setText("account_type:");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(650, 270, 160, 29);

        reguser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reguserActionPerformed(evt);
            }
        });
        jPanel1.add(reguser);
        reguser.setBounds(810, 160, 140, 26);

        adminstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "user_ID", "FirstName", "Last Name", "middle_initial", "contact_number", "gender", "email", "address", "username", "password", "accout_type", "status"
            }
        ));
        adminstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminstableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(adminstable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 540, 1300, 200);

        jButton3.setText("clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(560, 450, 70, 20);

        jButton4.setText("delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(840, 450, 80, 20);

        jButton5.setText("update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(750, 450, 80, 20);

        jButton6.setText("add");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(660, 450, 70, 20);

        uid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        uid.setForeground(new java.awt.Color(255, 255, 255));
        uid.setText("put ID");
        jPanel1.add(uid);
        uid.setBounds(510, 160, 110, 29);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminfolder/icons8-scholar-64.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 10, 60, 70);

        namess.setBackground(new java.awt.Color(204, 204, 255));
        namess.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        namess.setForeground(new java.awt.Color(255, 255, 255));
        namess.setText("WELCOME:");
        jPanel1.add(namess);
        namess.setBounds(80, 30, 100, 43);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("View registered applicants");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1120, 0, 230, 40);

        jLabel6.setForeground(new java.awt.Color(102, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/pexels-thought-catalog-317580-904616.jpg"))); // NOI18N
        jLabel6.setText("uuu");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, -200, 1400, 740);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "Log-out Successfully as admin");
            loginform log = new loginform();
            log.setVisible(true);
            this.dispose();
                          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void walaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walaActionPerformed
        
           
    }//GEN-LAST:event_walaActionPerformed

    private void regpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regpassActionPerformed

    private void regmidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regmidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regmidActionPerformed

    private void regaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regaddActionPerformed

    private void regfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regfirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regfirstActionPerformed

    private void regemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regemailActionPerformed

    private void reg_lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_lastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reg_lastActionPerformed

    private void reguserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reguserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reguserActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    uid.setText("");
       reg_last.setText("");
        regfirst.setText("");
         regmid.setText("");
           regcontact.setText("");
             gen.setSelectedItem("");
             regemail.setText("");
            regadd.setText("");
            reguser.setText("");
            regpass.setText("");
            accnt_type.setSelectedItem("");
            stats.setSelectedItem("");        
                                             
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         
        String ids = uid.getText();
        String lastnames = reg_last.getText();
        String firstnames = regfirst.getText();
        String middlenames = regmid.getText();  
        String contactnum = regcontact.getText();
        String genders = gen.getSelectedItem().toString();
        String emails = regemail.getText();
        String addresss = regadd.getText();
        String usernamess = reguser.getText();
        String passwordss = regpass.getText();
        String account_types = accnt_type.getSelectedItem().toString();
        String Stat = stats.getSelectedItem().toString();
    
    if(lastnames.isEmpty()||firstnames
                .isEmpty()||middlenames.isEmpty()||emails.isEmpty()||
                        usernamess.isEmpty()||passwordss.isEmpty()||addresss.isEmpty()||contactnum.isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
            
        }else if(passwordss.length() <8){
            JOptionPane.showMessageDialog(null, "Password Character should be 8 above");
            regpass.setText("");
        
        }else if(emailcheck()){
            System.out.println("Duplicate Exist");
        }else{
        
        dbConnector dbc = new dbConnector();
        
        try{
            
            if(dbc.insertData("INSERT INTO datanew(f_name, l_name, middle_initial, contact_number, gender, email, address, username, password, account_type, status)"
                + "Values ('"+regfirst.getText()+"', '"+reg_last.getText()+"', "
                        + " '"+regmid.getText()+"', '"+regcontact.getText()+"', "
                                + " '"+gen.getSelectedItem()+"', '"+regemail.getText()+"',"
                                        + "  '"+regadd.getText()+"', '"+reguser.getText()+"', "
                                                + " '"+regpass.getText()+"', '"+accnt_type.getSelectedItem()+"', "
                                                        + " '"+Stat+"')")){ 
                JOptionPane.showMessageDialog(null, "Data Added");
        
            }else{
            
                JOptionPane.showMessageDialog(null, "Connection Error");
        } 
        }catch (HeadlessException e){
        
            System.out.println(e);
        
        }      
         table_load();
        }
                        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        

        String ids = uid.getText();
        String lastnames = reg_last.getText();
        String firstnames = regfirst.getText();
        String middlenames = regmid.getText();  
        String contactnum = regcontact.getText();
        String addresss = regadd.getText();
        String emails = regemail.getText();
        String genders = gen.getSelectedItem().toString();
        String account_types = accnt_type.getSelectedItem().toString();
        String usernamess = reguser.getText();
        String passwordss = regpass.getText();
        String Stat = stats.getSelectedItem().toString();
        
        if(lastnames.isEmpty()||firstnames
                .isEmpty()||middlenames.isEmpty()||emails.isEmpty()||
                        usernamess.isEmpty()||addresss.isEmpty()||contactnum.isEmpty()){
            JOptionPane.showMessageDialog(null, "fields are required!");
            
       
        }else{
            
          
        
        try{
            dbConnector dbc = new dbConnector();
         
            
            
            String newPassword = passwordss; 
            if (!newPassword.isEmpty()) {
            newPassword = passwordHash(newPassword);
            }

            String query = "UPDATE datanew SET f_name ='" + firstnames + "', "
                + "l_name ='" + lastnames + "', middle_initial ='" + middlenames + "',"
                + " contact_number ='" + contactnum + "',Gender ='" + genders + "', "
                + " email ='" + emails + "', address ='" + addresss + "',"
                + " account_type ='" + account_types + "', username ='" + usernamess + "',"
                + " Status ='" + Stat + "'";

            if (!passwordss.isEmpty()) {
            query += ", password ='" + newPassword + "'";
            }

            query += " WHERE id ='" + ids + "'";

            if (dbc.insertData(query)) {
            JOptionPane.showMessageDialog(null, "Data Updated");
            }

            } catch (Exception e) {
            System.out.println(e);
            }
        }    
        
        table_load();
                                      
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        String userid = uid.getText();
         
         dbConnector dbc = new dbConnector();
        
        try{
            if(dbc.deleteData("DELETE FROM datanew WHERE id = '"+userid+"' ")){
            
                JOptionPane.showMessageDialog(null, "Data Deleted");
            }
              
            
        } catch (Exception e){
            
            System.out.println(e);

        }        
        
        table_load();
                    // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void walaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_walaKeyReleased
        // TODO add your handling code here:
        String name = wala.getText();
        
        dbConnector dbc = new dbConnector();
        
        try {

            DefaultTableModel dt = (DefaultTableModel) adminstable.getModel();
            dt.setRowCount(0);

            String query = ("SELECT * FROM datanew WHERE l_name LIKE '%"+name+"%' ");
            ResultSet rs = dbc.getData(query);
   

            while(rs.next()){

                Vector v = new Vector();

                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(rs.getString(8));
                v.add(rs.getString(9));
                v.add(rs.getString(10));
                v.add(rs.getString(11));
                v.add(rs.getString(12));

                dt.addRow(v);

            }

        }catch (Exception e){
            table_load();

        }
        
    }//GEN-LAST:event_walaKeyReleased

    private void adminstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminstableMouseClicked
        
        int r = adminstable.getSelectedRow();
        
        String id = adminstable.getValueAt(r, 0).toString();
        String firstname = adminstable.getValueAt(r, 1).toString();
        String lastname = adminstable.getValueAt(r, 2).toString();
        String middlename = adminstable.getValueAt(r, 3).toString();
        String contactnumber = adminstable.getValueAt(r, 4).toString();
        String gender = adminstable.getValueAt(r, 5).toString();
        String email = adminstable.getValueAt(r, 6).toString(); 
        String address = adminstable.getValueAt(r, 7).toString();
        String usernames = adminstable.getValueAt(r, 8).toString();
        String passwords = adminstable.getValueAt(r, 9).toString();
        String account_type = adminstable.getValueAt(r, 10).toString();
        String stat = adminstable.getValueAt(r, 11).toString();
                
        
        uid.setText(id);
        regfirst.setText(firstname);
        reg_last.setText(lastname);
        regmid.setText(middlename);
        regcontact.setText(contactnumber);
        gen.setSelectedItem(gender);
        regemail.setText(email);
        regadd.setText(address);
        reguser.setText(usernames);
        accnt_type.setSelectedItem(account_type);
        stats.setSelectedItem(stat);        
    }//GEN-LAST:event_adminstableMouseClicked

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
    jButton1.setBackground(Color.red);            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
    jButton1.setBackground(Color.white);
    }//GEN-LAST:event_jButton1MouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        
         String last = namess.getText();
        
        dbConnector dbc = new dbConnector();
        
        try{
            
            String query =("SELECT * FROM datanew WHERE l_name ='"+last+"' ");
            ResultSet rs = dbc.getData(query);
            
            if(rs.next()){
                    
                displayuser dis = new displayuser();
                

              session sess = session.getInstance(); 

                dis.idsss.setText(rs.getString("id"));
                dis.fname.setText(rs.getString("f_name"));
                dis.lname.setText(rs.getString("l_name"));
                dis.mi.setText(rs.getString("middle_initial"));
                dis.emall.setText(rs.getString("email"));
                dis.adds.setText(rs.getString("address"));
                dis.setVisible(true);
                
            
            }
        
        
        }catch(SQLException e){
            System.out.println(""+e);

        }
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        adminapp ads = new adminapp();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(admindash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admindash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admindash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admindash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admindash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accnt_type;
    private javax.swing.JTable adminstable;
    private javax.swing.JComboBox<String> gen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lastname;
    public javax.swing.JLabel namess;
    private javax.swing.JTextField reg_last;
    private javax.swing.JTextField regadd;
    private javax.swing.JTextField regcontact;
    private javax.swing.JTextField regemail;
    private javax.swing.JTextField regfirst;
    private javax.swing.JTextField regmid;
    private javax.swing.JTextField regpass;
    private javax.swing.JTextField reguser;
    private javax.swing.JComboBox<String> stats;
    private javax.swing.JLabel u_id;
    private javax.swing.JLabel uid;
    private javax.swing.JTextField wala;
    // End of variables declaration//GEN-END:variables
}
