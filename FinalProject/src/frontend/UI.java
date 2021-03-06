/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import frontend.menu.informes.EstadisticaGame;
import frontend.menu.informes.ReportUser;
import frontend.menu.usuario.BorrarUsuario;
import frontend.menu.usuario.CargarUsuario;
import frontend.menu.usuario.CrearUsuario;

/**
 *
 * @author abner
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
        CrearUsuario sesion = new CrearUsuario(this,false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        mCrearUser = new javax.swing.JMenuItem();
        mCargarUser = new javax.swing.JMenuItem();
        mBorrarUser = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mEstadistGame = new javax.swing.JMenuItem();
        mReportUser = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ZoneWar");
        setSize(new java.awt.Dimension(600, 400));

        jMenu3.setText("Usuario");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        mCrearUser.setText("Crear Partida");
        mCrearUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCrearUserActionPerformed(evt);
            }
        });
        jMenu3.add(mCrearUser);

        mCargarUser.setText("Cargar Partida");
        mCargarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCargarUserActionPerformed(evt);
            }
        });
        jMenu3.add(mCargarUser);

        mBorrarUser.setText("Borrar Partida");
        mBorrarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBorrarUserActionPerformed(evt);
            }
        });
        jMenu3.add(mBorrarUser);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Informes");

        mEstadistGame.setText("Estadisticas Del Juego");
        mEstadistGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEstadistGameActionPerformed(evt);
            }
        });
        jMenu4.add(mEstadistGame);

        mReportUser.setText("Reportes De Usuario");
        mReportUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mReportUserActionPerformed(evt);
            }
        });
        jMenu4.add(mReportUser);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void mCrearUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCrearUserActionPerformed
        // TODO add your handling code here:
        CrearUsuario usernuevo = new CrearUsuario(this,false);
        usernuevo.setVisible(true);
        usernuevo.setLocationRelativeTo(null);
    }//GEN-LAST:event_mCrearUserActionPerformed

    private void mCargarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCargarUserActionPerformed
        // TODO add your handling code here:
        CargarUsuario userload = new CargarUsuario(this,false);
        userload.setVisible(true);
        userload.setLocationRelativeTo(null);
    }//GEN-LAST:event_mCargarUserActionPerformed

    private void mBorrarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBorrarUserActionPerformed
        // TODO add your handling code here:
        BorrarUsuario userkiller = new BorrarUsuario(this,false);
        userkiller.setVisible(true);
        userkiller.setLocationRelativeTo(null);
    }//GEN-LAST:event_mBorrarUserActionPerformed

    private void mEstadistGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEstadistGameActionPerformed
        // TODO add your handling code here:
        EstadisticaGame stadistgame = new EstadisticaGame(this,false);
        stadistgame.setVisible(true);
        stadistgame.setLocationRelativeTo(null);
    }//GEN-LAST:event_mEstadistGameActionPerformed

    private void mReportUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mReportUserActionPerformed
        // TODO add your handling code here:
        ReportUser rportuser = new ReportUser(this,false);
        rportuser.setVisible(true);
        rportuser.setLocationRelativeTo(null);
    }//GEN-LAST:event_mReportUserActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem mBorrarUser;
    private javax.swing.JMenuItem mCargarUser;
    private javax.swing.JMenuItem mCrearUser;
    private javax.swing.JMenuItem mEstadistGame;
    private javax.swing.JMenuItem mReportUser;
    // End of variables declaration//GEN-END:variables
}
