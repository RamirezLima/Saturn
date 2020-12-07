
package main;

import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btn_Cadastrese = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Login Saturn");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 130));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Powered By SaturnProject");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 90));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 240, 30));

        exit.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 22, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SaturnLogo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 130));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pessoa.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 40, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Chave.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 40, 60));

        txtLogin.setBorder(javax.swing.BorderFactory.createTitledBorder("Digite seu login"));
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        jPanel2.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 46, 300, 60));

        txtSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("Digite sua senha"));
        jPanel2.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 106, 300, 60));

        btn_Cadastrese.setBackground(new java.awt.Color(45, 118, 232));
        btn_Cadastrese.setForeground(new java.awt.Color(255, 255, 255));
        btn_Cadastrese.setText("Cadastre-se");
        btn_Cadastrese.setBorder(null);
        btn_Cadastrese.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CadastreseMouseClicked(evt);
            }
        });
        btn_Cadastrese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastreseActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Cadastrese, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 140, 40));

        btnLogin.setBackground(new java.awt.Color(45, 118, 232));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 140, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 450, 340));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String login = txtLogin.getText();
        String senha = new String(txtSenha.getPassword());
        bean.Usuario usuario = new bean.Usuario (login, senha);
        try{
            if (dao.ValidarDAO.valida(usuario)){
                JOptionPane.showMessageDialog(null, String.format("Bem vindo, %s!", usuario.getNome()));
                
                
                int result = dao.ValidarDAO.dados(usuario); //chama metodo valiada dados e armazena id do usuario
    
                Home home= new Home();
                home.setIde(result);//Itera no home o id do usuario
                home.setVisible(true);
                this.dispose();
                
                
            }
            else{
                JOptionPane.showMessageDialog(null, String.format("Usuario %s invalido", usuario.getNome()));
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Por favor, tente novamente mais tarde.");
            e.printStackTrace();
        }

        /*if (login.equals("admin") && senha.equals("admin")){//ADMIN Admin AdMiN
            JOptionPane.showMessageDialog(null, "Beleza, logou");
        }
        else{
            JOptionPane.showMessageDialog(null, "Não rolou");
        }*/
    }//GEN-LAST:event_btnLoginActionPerformed

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed
int xx, xy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy); 
    }//GEN-LAST:event_jPanel1MouseDragged

    private void btn_CadastreseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CadastreseMouseClicked
        // TODO add your handling code here:
              
        
    }//GEN-LAST:event_btn_CadastreseMouseClicked

    private void btn_CadastreseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastreseActionPerformed
        // TODO add your handling code here:
        Cadastro cadastro= new Cadastro();
        cadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_CadastreseActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed
   
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btn_Cadastrese;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
