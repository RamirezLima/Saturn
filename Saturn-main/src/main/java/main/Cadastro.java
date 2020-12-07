
package main;

import javax.swing.JOptionPane;


public class Cadastro extends javax.swing.JFrame {


    public Cadastro() {
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
        txtNovoLogin = new javax.swing.JTextField();
        txtNovaSenha = new javax.swing.JPasswordField();
        btn_Voltar = new javax.swing.JButton();
        btn_CadastreseTela = new javax.swing.JButton();

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
        jLabel15.setText("Cadastro Saturn");
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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, -1, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNovoLogin.setBorder(javax.swing.BorderFactory.createTitledBorder("Digite seu login"));
        jPanel2.add(txtNovoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 300, -1));

        txtNovaSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("Digite sua senha"));
        jPanel2.add(txtNovaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 300, -1));

        btn_Voltar.setBackground(new java.awt.Color(45, 118, 232));
        btn_Voltar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Voltar.setText("Voltar");
        btn_Voltar.setBorder(null);
        btn_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 290, 40));

        btn_CadastreseTela.setBackground(new java.awt.Color(45, 118, 232));
        btn_CadastreseTela.setForeground(new java.awt.Color(255, 255, 255));
        btn_CadastreseTela.setText("Cadastrar");
        btn_CadastreseTela.setBorder(null);
        btn_CadastreseTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastreseTelaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_CadastreseTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 290, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 450, 340));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed
int xx, xy;
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void btn_CadastreseTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastreseTelaActionPerformed
        // TODO add your handling code here:
        String login= txtNovoLogin.getText();
        String senha = new String(txtNovaSenha.getPassword());
        
        bean.Usuario usuario = new bean.Usuario (login, senha);
        try{
            if (dao.CadastroDAO.cadastrarUsuario(usuario)){
                JOptionPane.showMessageDialog(null, String.format("Bem vindo, %s!", usuario.getNome()));
                Login loginId= new Login();
                loginId.setVisible(true);
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
        
    }//GEN-LAST:event_btn_CadastreseTelaActionPerformed

    private void btn_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VoltarActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CadastreseTela;
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txtNovaSenha;
    private javax.swing.JTextField txtNovoLogin;
    // End of variables declaration//GEN-END:variables
}
