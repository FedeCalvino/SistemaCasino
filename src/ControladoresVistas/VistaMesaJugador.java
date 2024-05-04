/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ControladoresVistas;

import Clases.Casillero;
import Clases.Efectos.Efecto;
import Clases.Mesa;
import Clases.Ronda;
import Clases.Sesion;
import Clases.Usuarios.Crupie;
import Clases.Usuarios.Jugador;
import ControladoresVistas.ControladorMesaCrupie;
import ControladoresVistas.InterfazVistaMesaCrupie;
import TipoApuestas.Color;
import TipoApuestas.TipoApuesta;
import componente.PanelRuleta;
import componente.PanelRuleta.Escuchador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class VistaMesaJugador extends javax.swing.JDialog implements InterfazVistaMesaJugador,Escuchador{

    private DefaultTableModel model;
    private ControladorMesaJugador controlador;
    Jugador jugador;
    Mesa mesa;
    private int Ficha;
    
    
    public VistaMesaJugador(java.awt.Frame parent, boolean modal,Jugador j,Mesa m) {
        super(parent, modal);
        initComponents();
        jugador=j; 
        mesa=m;
        panelRuleta.agregar(this);
        controlador = new ControladorMesaJugador(this,j,m);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRuleta = new componente.PanelRuleta();
        jLabel3 = new javax.swing.JLabel();
        MontoLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NumeroRonda = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NumRuleta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Ficha1 = new javax.swing.JToggleButton();
        Ficha5 = new javax.swing.JToggleButton();
        Ficha10 = new javax.swing.JToggleButton();
        Ficha50 = new javax.swing.JToggleButton();
        Ficha100 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        NumerosSorteados = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        NombJugador = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        NumSorteado = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        NumeroEstadistica = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EJEMPLO MVC");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("$");

        MontoLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel4.setText("Ronda #");

        NumeroRonda.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        NumeroRonda.setText("n");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Ruleta #");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        NumRuleta.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        NumRuleta.setText("N");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("MESA JUGADOR :");

        Ficha1.setText("1");
        Ficha1.setName(""); // NOI18N
        Ficha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ficha1ActionPerformed(evt);
            }
        });

        Ficha5.setText("5");
        Ficha5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ficha5ActionPerformed(evt);
            }
        });

        Ficha10.setText("10");
        Ficha10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ficha10ActionPerformed(evt);
            }
        });

        Ficha50.setText("50");
        Ficha50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ficha50ActionPerformed(evt);
            }
        });

        Ficha100.setText("100");
        Ficha100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ficha100ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(NumerosSorteados);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Saldo");

        NombJugador.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        NombJugador.setText("Nombre Jugador");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Numero Sorteado:");

        jButton2.setText("Abandonar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ronda", "Total Apostado", "Ganado", "Perdido", "Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaDatos.setCellSelectionEnabled(true);
        jScrollPane2.setViewportView(TablaDatos);
        TablaDatos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        NumSorteado.setEditable(false);
        NumSorteado.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        NumSorteado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NumSorteado.setToolTipText("");

        NumeroEstadistica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Valor", "Ocurrencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(NumeroEstadistica);

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MontoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(106, 106, 106)
                                        .addComponent(Ficha1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(Ficha5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(Ficha10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Ficha50, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(NombJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Ficha100, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(188, 188, 188)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(152, 152, 152)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NumSorteado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NumeroRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(95, 95, 95)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NumRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(panelRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addContainerGap(406, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumeroRonda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NombJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(NumSorteado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(MontoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NumRuleta)
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Ficha1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Ficha5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Ficha10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Ficha50, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Ficha100, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(12, 12, 12)
                                        .addComponent(panelRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(89, 89, 89)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(115, 115, 115)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(307, 307, 307)
                .addComponent(jLabel9)
                .addGap(613, 613, 613)
                .addComponent(jLabel8)
                .addGap(465, 465, 465))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
  //      controlador.salir();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //.getMesa().setIniciada(false);
    }//GEN-LAST:event_formWindowClosed

    private void Ficha5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ficha5ActionPerformed
        this.Ficha=5;
        Ficha50.setSelected(false);
        Ficha10.setSelected(false);
        Ficha100.setSelected(false);
        Ficha1.setSelected(false);
    }//GEN-LAST:event_Ficha5ActionPerformed

    private void Ficha50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ficha50ActionPerformed
        this.Ficha=50;
        Ficha5.setSelected(false);
        Ficha10.setSelected(false);
        Ficha100.setSelected(false);
        Ficha1.setSelected(false);
    }//GEN-LAST:event_Ficha50ActionPerformed

    private void Ficha10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ficha10ActionPerformed
        this.Ficha=10;
        Ficha5.setSelected(false);
        Ficha50.setSelected(false);
        Ficha100.setSelected(false);
        Ficha1.setSelected(false);
    }//GEN-LAST:event_Ficha10ActionPerformed

    private void Ficha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ficha1ActionPerformed
        this.Ficha=1;
        Ficha5.setSelected(false);
        Ficha10.setSelected(false);
        Ficha100.setSelected(false);
        Ficha50.setSelected(false);
    }//GEN-LAST:event_Ficha1ActionPerformed

    private void Ficha100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ficha100ActionPerformed
        this.Ficha=100;
        Ficha5.setSelected(false);
        Ficha10.setSelected(false);
        Ficha1.setSelected(false);
        Ficha50.setSelected(false);
    }//GEN-LAST:event_Ficha100ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        panelRuleta.eliminarEscuchador(this);
        controlador.AbandonarMesa();
        this.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Ficha1;
    private javax.swing.JToggleButton Ficha10;
    private javax.swing.JToggleButton Ficha100;
    private javax.swing.JToggleButton Ficha5;
    private javax.swing.JToggleButton Ficha50;
    private javax.swing.JLabel MontoLabel;
    private javax.swing.JLabel NombJugador;
    private javax.swing.JLabel NumRuleta;
    private javax.swing.JTextField NumSorteado;
    private javax.swing.JTable NumeroEstadistica;
    private javax.swing.JLabel NumeroRonda;
    private javax.swing.JList<String> NumerosSorteados;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private componente.PanelRuleta panelRuleta;
    // End of variables declaration//GEN-END:variables

     
 

    @Override
    public void celdaSeleccionada(int universalCellCode) {
        if(controlador.ValidarApuesta(this.Ficha,universalCellCode,jugador)){
        panelRuleta.SumarApuesta(universalCellCode, Ficha);
        jugador.restarSaldo(Ficha);
        controlador.CrearApuesta(universalCellCode,Ficha);
        controlador.CargarMonto();
        }

    }
   // public int GetMontoSeleccionado(){
      // if(Ficha1.){
            
       // }
  //  }
    @Override
    public void CargarRonda(int numsorteado , int nronda) {
    
        NumSorteado.setText(""+numsorteado);
        NumeroRonda.setText(""+nronda);
    }

    public void CargarUltimoNumSorteado(int num,java.awt.Color color){
        this.NumSorteado.setText(num+"");
        jLabel1.setOpaque(true);
        NumSorteado.setBackground(color);

    }
    
    void CargarTablaOcurrencia(ArrayList<ArrayList<String>> Ocurrenciadecasilleros) {
        model = new DefaultTableModel();
        model.addColumn("Valor");
        model.addColumn("Ocurrencia");
        for(ArrayList<String> lista:Ocurrenciadecasilleros){
        model.addRow(new Object[]{lista.get(0), lista.get(1)+ "%"});
        }
        this.NumeroEstadistica.setModel(model);
    }
    
    @Override
    public void CargarMonto(int monto) {
        
        MontoLabel.setText(monto+"");
    }

    @Override
    public void CargarNumRuleta() {
        NumRuleta.setText(mesa.getNumeroMesa()+"");
    }
    
    
    public void CargarTablaDatos(ArrayList<ArrayList<Integer>> listaLista){
         model = new DefaultTableModel();
        model.addColumn("Ronda");
        model.addColumn("Total Apostado");
        model.addColumn("Ganado");
        model.addColumn("Perdido");
        model.addColumn("Balance");
        for(ArrayList<Integer> lista:listaLista){
        model.addRow(new Object[]{lista.get(0), lista.get(1), lista.get(2), lista.get(3), lista.get(4)});
        }
        this.TablaDatos.setModel(model);
    }
    
    public void AddNumSorteados(String[] nums){
        NumerosSorteados.setListData(nums);
    }
    
    @Override
    public void EstablecerApuestasHablitadas(ArrayList<Casillero> ca) {        
        int i=1;
        while(i<51){
            panelRuleta.setVisible(i,false);
            i++;
            }
        for(Casillero c : ca){
           panelRuleta.setVisible(c.getCellCode(),true);
        }
            
    
        
    }

    void LimpiarApuestas(ArrayList<Casillero> casilleros) {
        for(Casillero c: casilleros){
            panelRuleta.setApuesta(c.getCellCode(), 0);
        }
    }
    
    @Override
    public void CargarNombreJugador() {
        this.NombJugador.setText(jugador.getNombreCompelto());
    }

    @Override
    public void Pausar() {
        panelRuleta.pausar();
    }

    @Override
    public void Reanudar() {
        panelRuleta.reanudar();
    }

    void CargarTablaJugadorSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


 
}
