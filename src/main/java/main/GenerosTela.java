
package main;

import bean.Generos;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class GenerosTela extends javax.swing.JFrame {

    private int ide;
    private bean.Generos generoSelecionado;
    private List <bean.Generos> generos;

    public void setIde(int ide) {
        this.ide = ide; //resgata o id unico de usuario para manter a indentificação
    }

    public int getIde() {
        return ide;
    }
    
    public GenerosTela(int ide) {
        
        this.ide = ide;
        initComponents();
        buscarGenerosIdUsuario(ide);
        buscaGenerosUsuario();
        System.out.println(ide);
        
    }
    
    public GenerosTela(){
        initComponents();
    }
    
    
    private void selecionarGenero(int index){
        this.generoSelecionado = this.generos.get(index);
    }
    
    private void buscaGenerosUsuario(){
          this.generos = dao.ListaGenerosDAO.buscarGenerosId(ide);
          boxListaGenero.setListData(generos.toArray(new bean.Generos[0]));
    }
    
      private void buscarGenerosIdUsuario (int id){
        try{
            List <bean.Generos> generos = dao.ListaGenerosDAO.obterGenerosNaoAtribuidosAoUsuario(id);
            cbx_Generos.setModel(new DefaultComboBoxModel<>(generos.toArray(new bean.Generos[0])));
        
        }
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Tente novamente mais tarde");
        }
    }
      
    
      


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnApagarGenero = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        boxListaGenero = new javax.swing.JList<>();
        cbx_Generos = new javax.swing.JComboBox<>();
        btnSalavarGenero = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
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

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Meus Gêneros");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SaturnLogo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 4, -1, 130));

        exit.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 22, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        btnApagarGenero.setText("Deletar Gênero");
        btnApagarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarGeneroActionPerformed(evt);
            }
        });
        jPanel2.add(btnApagarGenero);
        btnApagarGenero.setBounds(310, 340, 200, 60);

        boxListaGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boxListaGeneroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(boxListaGenero);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 60, 600, 120);

        cbx_Generos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_GenerosActionPerformed(evt);
            }
        });
        jPanel2.add(cbx_Generos);
        cbx_Generos.setBounds(80, 250, 430, 60);

        btnSalavarGenero.setText("Salvar Genero");
        btnSalavarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalavarGeneroActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalavarGenero);
        btnSalavarGenero.setBounds(80, 340, 200, 60);

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(45, 118, 232));
        jLabel15.setText("Sua Lista de Gêneros.");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(10, 30, 168, 18);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atualizar.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 180, 30, 32);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 620, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
//        Home home = new Home();
//        home.setVisible(true);
        Home home= new Home();
        home.setVisible(true);
        this.dispose();
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

    private void btnSalavarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalavarGeneroActionPerformed
        // TODO add your handling code here:
        Generos cadastro = new Generos();
        cadastro = (Generos) cbx_Generos.getSelectedItem();
        dao.ListaGenerosDAO.salvar(cadastro.getId(), ide);
        buscaGenerosUsuario();
        buscarGenerosIdUsuario(ide);
        JOptionPane.showMessageDialog(null, "id: "+cadastro.getId()+" nome: "+cadastro.getNome() +" salvo com sucesso!");
    }//GEN-LAST:event_btnSalavarGeneroActionPerformed

    private void cbx_GenerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_GenerosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_GenerosActionPerformed

    private void btnApagarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarGeneroActionPerformed
        // TODO add your handling code here:
        dao.ListaGenerosDAO.deletar(generoSelecionado.getId(), ide);
        buscaGenerosUsuario();
        buscarGenerosIdUsuario(ide);
    }//GEN-LAST:event_btnApagarGeneroActionPerformed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
        buscaGenerosUsuario();
    }//GEN-LAST:event_jLabel2MousePressed

    private void boxListaGeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxListaGeneroMouseClicked
        // TODO add your handling code here:
        
        if(evt.getClickCount() == 1){
            JList target = (JList) evt.getSource();
            int index = target.locationToIndex(evt.getPoint());
            
            if(index >= 0){
                selecionarGenero(index);
            }
        
        }
        
    }//GEN-LAST:event_boxListaGeneroMouseClicked

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
                if ("MS Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GenerosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerosTela().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<bean.Generos> boxListaGenero;
    private javax.swing.JButton btnApagarGenero;
    private javax.swing.JButton btnSalavarGenero;
    private javax.swing.JComboBox<bean.Generos> cbx_Generos;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
