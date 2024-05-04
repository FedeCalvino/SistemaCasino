/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ControladoresVistas;

import Clases.Apuesta;
import Clases.Casillero;
import Clases.Efectos.Efecto;
import Clases.Ronda;
import Clases.Sesion;
import Clases.Usuarios.Crupie;
import ControladoresVistas.ControladorMesaCrupie;
import ControladoresVistas.InterfazVistaMesaCrupie;
import TipoApuestas.TipoApuesta;
import componente.PanelRuleta;
import componente.PanelRuleta.Escuchador;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import observador.Observable;
import observador.Observador;

/**
 *
 * @author PC
 */
public class VistaMesaCrupie extends javax.swing.JDialog implements InterfazVistaMesaCrupie,Escuchador,Observador{
    
    private ControladorMesaCrupie controlador;
    Crupie crupie;
    
    public VistaMesaCrupie(java.awt.Frame parent, boolean modal,Crupie c) {
        super(parent, modal);
        initComponents();
        crupie=c; 
        controlador = new ControladorMesaCrupie(this,c);  
        panelRuleta.agregar(this);
        c.AgregarObservador(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NumSorteado = new javax.swing.JLabel();
        panelRuleta = new componente.PanelRuleta();
        LanzarPagar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Balance = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NumeroRonda = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NumRuleta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaNumerosSorteados = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        UltNumSorteado = new javax.swing.JLabel();
        BalanceLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaJS = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        ComboEfectos = new javax.swing.JComboBox<>();
        Salir = new javax.swing.JButton();

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

        LanzarPagar.setText("Lanzar");
        LanzarPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LanzarPagarMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("$");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel4.setText("Ronda #");

        NumeroRonda.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Ruleta #");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        NumRuleta.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        NumRuleta.setText("N");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("MESA CRUPIE");

        jScrollPane1.setViewportView(ListaNumerosSorteados);

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ronda", "Balance Anterior", "Apuestas", "Recoleccion", "Liquidacion", "Balance Posterior"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaDatos);

        UltNumSorteado.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N

        TablaJS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Jugador", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TablaJS);

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setToolTipText("");

        Salir.setText("Cerrar Mesa");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

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
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Balance, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(NumeroRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(BalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(ComboEfectos, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(NumRuleta))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(LanzarPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(121, 121, 121)
                        .addComponent(UltNumSorteado, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(panelRuleta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(131, 131, 131)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(173, 173, 173)
                                    .addComponent(Salir))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(BalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(Balance, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NumRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(LanzarPagar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumeroRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(ComboEfectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UltNumSorteado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))))
                .addGap(23, 23, 23)
                .addComponent(panelRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
  //      controlador.salir();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        crupie.getMesa().setIniciada(false);
    }//GEN-LAST:event_formWindowClosed

    private void LanzarPagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LanzarPagarMouseClicked
        int f = ComboEfectos.getSelectedIndex(); 
        controlador.LanzarPagar(crupie.getMesa().getUltimaRonda(),f,LanzarPagar.getText(),crupie.getMesa().getUltimaRonda().getCasilleros());
    }//GEN-LAST:event_LanzarPagarMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        panelRuleta.eliminarEscuchador(this);
        CerrarMesa();
        this.setVisible(false);
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed
    
    public void CargarTablaDatos(ArrayList<ArrayList<Integer>> listaLista){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Ronda");
        model.addColumn("Balance Anterior");
        model.addColumn("Apuestas");
        model.addColumn("Recoleccion");
        model.addColumn("Liquidacion");
        model.addColumn("Balance Posterior");
        for(ArrayList<Integer> lista:listaLista){
        model.addRow(new Object[]{lista.get(0), lista.get(1), lista.get(2), lista.get(3), lista.get(4), lista.get(5)});
        }
        this.TablaDatos.setModel(model);
    }
    public void CerrarMesa(){
        controlador.CerrarMesa();
        this.setVisible(false);
    }

    public void Lanzado(ArrayList<Integer> nums){
        String[] numsStr = new String[nums.size()+1];
        int ronda=0;
        for(int i : nums){
            numsStr[ronda]=i+"";
            ronda++;
        }
        ListaNumerosSorteados.setListData(numsStr);
        LanzarPagar.setText("Pagar");
    }
    
    
    public void Pagar(){
        LanzarPagar.setText("Lanzar");    
    }
    
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Balance;
    private javax.swing.JLabel BalanceLabel;
    private javax.swing.JComboBox<String> ComboEfectos;
    private javax.swing.JButton LanzarPagar;
    private javax.swing.JList<String> ListaNumerosSorteados;
    private javax.swing.JLabel NumRuleta;
    private javax.swing.JLabel NumSorteado;
    private javax.swing.JLabel NumeroRonda;
    private javax.swing.JButton Salir;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JTable TablaJS;
    private javax.swing.JLabel UltNumSorteado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private componente.PanelRuleta panelRuleta;
    // End of variables declaration//GEN-END:variables

     
 

    @Override
    public void celdaSeleccionada(int universalCellCode) {
     //   panelRuleta.ce(universalCellCode)+=panelRuleta.getApuesta(universalCellCode);
    }

    @Override
    public void CargarEfectosHabilitados(ArrayList<Efecto> Efectos) {
        for(Efecto f: Efectos){
            ComboEfectos.addItem(f.toString());
        }
    }

    @Override
    public void CargarBalance(int balance) {
        Balance.setText(balance+"");
    }

    @Override
    public void EstablecerApuestasHablitadas(ArrayList<Casillero> ca){
        
        int i=1;
        while(i<51){
            panelRuleta.setVisible(i,false);
            i++;
            }
        for(Casillero c : ca){
           panelRuleta.setVisible(c.getCellCode(),true);
        }
            
    }
        
    @Override
    public void CargarRonda(int RondaAct) {
        NumeroRonda.setText(RondaAct+"");
    }

    @Override
    public void CargarNumRuleta(int Ruleta) {
        NumRuleta.setText(Ruleta+"");
    }

    void CargarApuestas(Apuesta a,int CellCode) {
            panelRuleta.SumarApuesta(CellCode, a.getMonto());      
    }

    @Override
    public void actualizar(Object evento, Observable origen) {
        
    }
    
    
    public void CargarUltimoTiro(int num,int balance,String color){
        this.UltNumSorteado.setText(num+"");
        BalanceLabel.setText(balance+"");
    }

    @Override
    public void LimpiarApuestas(ArrayList<Casillero> casilleros) {
        for(Casillero c: casilleros){
            panelRuleta.setApuesta(c.getCellCode(), 0);
        }
    }

    void CargarTablaJugadorSaldo(ArrayList<String> datos) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Jugador");
        model.addColumn("Saldo");
        int i;
        for(i=0;i<datos.size();i+=2){
        model.addRow(new Object[]{datos.get(i), datos.get(i+1)});
        }
        TablaJS.setModel(model);
    }
}
