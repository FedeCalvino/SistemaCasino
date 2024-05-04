/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladoresVistas;

import Clases.Apuesta;
import Clases.Casillero;
import Clases.Efectos.Efecto;
import Clases.Fachada;
import Clases.Mesa;
import Clases.Ronda;
import Clases.Sesion;
import Clases.Usuarios.Crupie;
import Clases.Usuarios.Jugador;
import Clases.Usuarios.Usuario;
import TipoApuestas.TipoApuesta;
import java.util.ArrayList;
import observador.Observable;
import observador.Observador;
import java.lang.String;

/**
 *
 * @author calvi
 */
public class ControladorMesaCrupie implements Observador{
    private VistaMesaCrupie vista;
    private Crupie crupie;

    public ControladorMesaCrupie(VistaMesaCrupie vista, Crupie sesion) {
        this.vista = vista;
        crupie=sesion;
        cargarEfectosHabilitados();
        CargarBalance();
        crupie.getMesa().AgregarObservador(this);
        CargarRonda();
        CargarNumRuleta();
        EstablecerApuestasHablitadas();
    }
    
    void CerrarMesa() {
        this.crupie.getMesa().SacarObservador(this);
        this.crupie.getMesa().setIniciada(false);
        this.crupie.getMesa().setJugadores(new ArrayList<>());
    }
    private void cargarEfectosHabilitados() {
       vista.CargarEfectosHabilitados(Fachada.getInstancia().getEfectos());
    }
    
    private void CargarBalance(){
        vista.CargarBalance(crupie.getMesa().getBalance());
    }
    
    private void CargarRonda(){
        vista.CargarRonda(crupie.getMesa().NumeroDeRondas());
        
    }
    
    private void CargarNumRuleta(){
        vista.CargarNumRuleta(crupie.getMesa().getNumeroMesa());
    }
    
    private void EstablecerApuestasHablitadas(){
    
        ArrayList<Casillero> ca = new ArrayList<>();
        for(TipoApuesta ta: crupie.getMesa().getTipoApuestaHablitadas()){
            ca.addAll(ta.crearCaillero());
            }
        vista.EstablecerApuestasHablitadas(ca);
    }

    void LanzarPagar(Ronda rondaActual,int Indiceefecto,String LanzPag,ArrayList<Casillero> cas) {     
        if(LanzPag.equals("Lanzar")){
            Efecto f = Fachada.getInstancia().getEfectos().get(Indiceefecto);
            crupie.getMesa().getUltimaRonda().setEfecto(f);
            crupie.getMesa().getUltimaRonda().HacerTiro();
            vista.Lanzado(crupie.getMesa().GetNumerosSorteados());
            crupie.getMesa().PausarMesa();
        }else{ 
            crupie.getMesa().PagarRonda();
            vista.Pagar();
            vista.LimpiarApuestas(rondaActual.getCasilleros());
            crupie.getMesa().ReanudarMesa();
            CargarTablaJugadorSaldo();
        }
    }
    public void AgregarApuestas(){
        Ronda r = crupie.getMesa().getUltimaRonda();
        ArrayList<Casillero> list = r.obtenerCasillerosApostados();
        vista.LimpiarApuestas(list);
        for(Casillero c : list){
            for(Apuesta a : c.getApuestas()){
                vista.CargarApuestas(a, c.getCellCode());
            }
        }
    }
    public void CargarTabla(){//modelo va en la view y las logicas de la cuenta van en el dominio 
        vista.CargarTablaDatos(crupie.getMesa().cargarTablarondasCrupie(this.crupie)); 
    }

   private void PagarCasilleros(ArrayList<Casillero> cas, int tiro, Ronda rondaActual){
        /*for(Casillero c : cas){
                c.ValidarPagarApuesta(tiro);
        }*/
    }
   
    public void CargarTablaJugadorSaldo(){
        ArrayList<String> datos = new ArrayList<>();
        for(Jugador j : crupie.getMesa().getJugadores()){
            String nomb=j.getNombreCompelto();
            datos.add(nomb);
            int saldo=j.getSaldo();
            datos.add(saldo+"");
        }
        vista.CargarTablaJugadorSaldo(datos);
    }
    private void CargarUtimoTiro(){
        vista.CargarUltimoTiro(crupie.getMesa().getPenUltimoNumeroSorteado(),crupie.getMesa().getBalance(),crupie.getMesa().getUltimaRonda().getColorSorteado());
    }
    @Override
    public void actualizar(Object evento, Observable origen) {
        if(evento.equals(Mesa.eventos.ApuestaHecha)){
            AgregarApuestas();
        }else{
            if(evento.equals(Mesa.eventos.PagarRonda)){
            this.CargarTabla();
                }else{
                    if(evento.equals(Mesa.eventos.cambioRonda)){
                        this.CargarRonda();
                        CargarUtimoTiro();
                    }else{
                    if(evento.equals(Mesa.eventos.EntroJugador)){
                       CargarTablaJugadorSaldo();
                    }
                }
                }
            
        }
    
    }
}
    

