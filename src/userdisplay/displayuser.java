
package userdisplay;

import config.dbConnector;
import config.session;
import java.sql.ResultSet;
import login.registerform;


public class displayuser extends javax.swing.JFrame {

    
    public displayuser() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        upinfo = new javax.swing.JButton();
        updatepass = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        adds = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        mi = new javax.swing.JLabel();
        emall = new javax.swing.JLabel();
        idsss = new javax.swing.JLabel();
        upl_name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(748, 641));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setLayout(null);

        upinfo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        upinfo.setText("Update Information");
        upinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upinfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                upinfoMouseEntered(evt);
            }
        });
        upinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upinfoActionPerformed(evt);
            }
        });
        jPanel2.add(upinfo);
        upinfo.setBounds(220, 480, 190, 40);

        updatepass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        updatepass.setText("Update Password");
        updatepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatepassMouseClicked(evt);
            }
        });
        updatepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatepassActionPerformed(evt);
            }
        });
        jPanel2.add(updatepass);
        updatepass.setBounds(480, 480, 190, 40);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("ID NO: ");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(40, 10, 80, 20);

        adds.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        adds.setText("jLabel2");
        jPanel2.add(adds);
        adds.setBounds(290, 240, 190, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Address:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(190, 240, 110, 19);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("First Name:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(160, 80, 110, 19);

        fname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        fname.setText("jLabel2");
        jPanel2.add(fname);
        fname.setBounds(290, 80, 190, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Last Name: ");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(160, 130, 110, 19);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Middle initial: ");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(150, 170, 110, 19);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setText("Email:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(200, 210, 110, 19);

        lname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lname.setText("jLabel2");
        jPanel2.add(lname);
        lname.setBounds(290, 130, 190, 30);

        mi.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mi.setText("jLabel2");
        jPanel2.add(mi);
        mi.setBounds(290, 170, 190, 30);

        emall.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        emall.setText("jLabel2");
        jPanel2.add(emall);
        emall.setBounds(290, 200, 190, 30);

        idsss.setText("jLabel1");
        jPanel2.add(idsss);
        idsss.setBounds(110, 10, 100, 40);

        upl_name.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        upl_name.setIcon(new javax.swing.ImageIcon("C:\\Users\\wangs\\Downloads\\pexels-thought-catalog-317580-904616.jpg")); // NOI18N
        upl_name.setText("jLabel2");
        jPanel2.add(upl_name);
        upl_name.setBounds(-10, 0, 750, 640);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void upinfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upinfoMouseEntered
      
    }//GEN-LAST:event_upinfoMouseEntered

    private void upinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upinfoActionPerformed
    
       
        String ids = upinfo.getText();
        
        dbConnector dbc = new dbConnector();
        
        try{
            
            String query =("SELECT * FROM datanew WHERE id ='"+ids+"' ");
            ResultSet rs = dbc.getData(query);
            
            if(rs.next()){
                
                session sess = session.getInstance(); 
                
                userupdate upd = new userupdate();
           
                upd.setVisible(true);
                
                upd.display_id.setText(""+sess.getId());
                upd.upf_name.setText(""+sess.getFirst());
                upd.upl_name.setText(""+sess.getLast());
                upd.upmail.setText(""+sess.getEmail_add());
                upd.upcontact.setText(""+sess.getContac());
                upd.gen.setSelectedItem(""+sess.getGender_m());
               
                
            
            
            }
        
        
        }catch(Exception e){
        
        
        
        }
        
        
        
    

    }//GEN-LAST:event_upinfoActionPerformed

    private void updatepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatepassActionPerformed
        // TODO add your handling code here:

        String ids = upinfo.getText();

        dbConnector dbc = new dbConnector();

        try{

            String query =("SELECT * FROM datanew WHERE id ='"+ids+"' ");
            ResultSet rs = dbc.getData(query);

            if(rs.next()){
                
            session sess = session.getInstance(); 
                userpass upd = new userpass();
               
                 upd.setVisible(true);
                  upd.display_id.setText(""+sess.getId());
                   upd.upuser.setText(""+sess.getUser_name());
                    upd.conpass.setText(""+sess.getPass_word());
                     upd.uppass.setText(""+sess.getPass_word());
                  
              

            }

        }catch(Exception e){

        }

    }//GEN-LAST:event_updatepassActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
      
        
    }//GEN-LAST:event_formWindowActivated

    private void upinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upinfoMouseClicked
        userupdate use = new userupdate();
         use.setVisible(true);
         this.dispose();
        
    }//GEN-LAST:event_upinfoMouseClicked

    private void updatepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatepassMouseClicked
    userpass use = new userpass();
         use.setVisible(true);
         this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_updatepassMouseClicked

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
            java.util.logging.Logger.getLogger(displayuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(displayuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(displayuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(displayuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new displayuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel adds;
    public javax.swing.JLabel emall;
    public javax.swing.JLabel fname;
    public javax.swing.JLabel idsss;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lname;
    public javax.swing.JLabel mi;
    private javax.swing.JButton updatepass;
    private javax.swing.JButton upinfo;
    private javax.swing.JLabel upl_name;
    // End of variables declaration//GEN-END:variables
}
