/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

/**
 *
 * @author calvi
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LoginCrupie = new javax.swing.JMenuItem();
        LoginJugador = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Login");

        LoginCrupie.setText("Login Crupie");
        LoginCrupie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginCrupieMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoginCrupieMousePressed(evt);
            }
        });
        jMenu1.add(LoginCrupie);

        LoginJugador.setText("Login Jugador");
        LoginJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginJugadorMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoginJugadorMousePressed(evt);
            }
        });
        LoginJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginJugadorActionPerformed(evt);
            }
        });
        jMenu1.add(LoginJugador);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginCrupieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginCrupieMouseClicked

    }//GEN-LAST:event_LoginCrupieMouseClicked

    private void LoginJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginJugadorActionPerformed

    private void LoginJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginJugadorMouseClicked
       
    }//GEN-LAST:event_LoginJugadorMouseClicked

    private void LoginCrupieMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginCrupieMousePressed
        LoginCrupie p = new LoginCrupie(this,true);
        p.setVisible(true);
    }//GEN-LAST:event_LoginCrupieMousePressed

    private void LoginJugadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginJugadorMousePressed
       LoginJugador p = new LoginJugador(this,true);
       p.setVisible(true);
    }//GEN-LAST:event_LoginJugadorMousePressed

    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem LoginCrupie;
    private javax.swing.JMenuItem LoginJugador;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
