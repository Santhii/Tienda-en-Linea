/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import tienda.Comprador;

/**
 *
 * @author Admini
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        Registrarse = new javax.swing.JToggleButton();
        iniciarsesion = new javax.swing.JToggleButton();
        verpeliculas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Registrarse.setText("Registrarse ");
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 30));

        iniciarsesion.setText("Iniciar sesión");
        iniciarsesion.setToolTipText("");
        iniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarsesionActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 120, 30));

        verpeliculas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        verpeliculas.setText("Ver Películas");
        verpeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verpeliculasActionPerformed(evt);
            }
        });
        getContentPane().add(verpeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 110, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("          Bienvenido a Peliculas Poli ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 360, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/fondos-del-efecto-de-la-tira-de-la-pelcula-de-grunge-6353838.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    private void verpeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verpeliculasActionPerformed
         Principal u = new Principal();
        u.setVisible(false);
        dispose();
        AñadirCompra i = new AñadirCompra();//(this, rootPaneCheckingEnabled);
        i.setVisible(true);
        dispose();
    }//GEN-LAST:event_verpeliculasActionPerformed

    private void iniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarsesionActionPerformed
        Principal u = new Principal();
        u.setVisible(false);
        dispose();
        Ingreso s = new Ingreso();//(this, rootPaneCheckingEnabled);
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_iniciarsesionActionPerformed

    private void RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseActionPerformed
        Principal u = new Principal();
        u.setVisible(false);
        dispose();
        Registrarse r = new Registrarse();//(this, rootPaneCheckingEnabled);
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegistrarseActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Registrarse;
    private javax.swing.JToggleButton iniciarsesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton verpeliculas;
    // End of variables declaration//GEN-END:variables
}
