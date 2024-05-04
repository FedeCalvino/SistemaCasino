
package ControladoresVistas;

import Clases.Fachada;
import Clases.Mesa;
import Clases.Sesion;
import TipoApuestas.TipoApuesta;
import Clases.Usuarios.Crupie;
import java.util.ArrayList;


public class EstablecerConfigMesa extends javax.swing.JDialog {
    
    ControladorEstalecerConfiguracionMesa Contolador;
    Crupie crupie;
    public EstablecerConfigMesa(java.awt.Frame parent, boolean modal,Sesion s) {
        super(parent, modal);
        initComponents();
        crupie=(Crupie) s.getUsuario();
        setLocationRelativeTo(parent);
        Contolador = new ControladorEstalecerConfiguracionMesa(this);
        //mostrarMesaCreada((Crupie) s.getUsuario());
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    public void cargarTiposDeApuestas(ArrayList<TipoApuesta> lista){
        ArrayList<TipoApuesta> tiposApùestas = lista;
        listaTiposApuestas.setListData(tiposApùestas.toArray());
    }
    
    public static void mostrarMesaCreada(Crupie c){
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaTiposApuestas = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jScrollPane1.setViewportView(listaTiposApuestas);

        jLabel1.setText("Tipos de apuestas");

        jButton1.setText("Iniciar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        ArrayList<TipoApuesta> Tipos =  (ArrayList<TipoApuesta>) listaTiposApuestas.getSelectedValuesList();
        crupie.getMesa().setTipoApuestaHablitadas(Tipos,Fachada.getInstancia().getTipoApuetasObligatorias()); 
        crupie.getMesa().setIniciada(true);
        this.setVisible(false);
        new VistaMesaCrupie(null, false, crupie).setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaTiposApuestas;
    // End of variables declaration//GEN-END:variables
}
