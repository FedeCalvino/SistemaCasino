/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Clases.Efectos.Efecto;
import TipoApuestas.TipoApuesta;
import Clases.Sesion;
import Clases.SistemaAcceso;
import Clases.Usuarios.Crupie;
import Clases.Usuarios.Jugador;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Fachada {
    
    private static Fachada instancia = new Fachada();

    private SistemaAcceso sAcceso = new SistemaAcceso();
    private SistemaApuesta sApuesta = new SistemaApuesta();
    //RECORDAR: NO GET's DE LOS SUBSISTEMAS
    
    public static Fachada getInstancia() {
        return instancia;
    }

    private Fachada() {
    }
    
    //DELEGACIONES

    public Jugador agregarJugador(String cedula, String pass, int Saldo) {
        return sAcceso.agregarJugador(cedula, pass, Saldo);
    }

    public Sesion loginJugador(String nom, String pass) {
        return sAcceso.loginJugador(nom, pass);
    }

    public void logout(Sesion s) {
        sAcceso.logout(s);
    }
    public void AgregarCasillero(Casillero c){
        sApuesta.AgregarCasillero(c);
    }
  /*  public Casillero GetCasillero(int universalCode){
        return sApuesta.GetCasillero(universalCode);
    }*/

    public ArrayList<Sesion> getSesiones() {
        return sAcceso.getSesiones();
    }
    public ArrayList<TipoApuesta> getTipoApuetas() {
        return sApuesta.getTipoApuestas();
    }
    public ArrayList<TipoApuesta> getTipoApuetasObligatorias() {
        return sApuesta.getTipoApuestasObligatorias();
    }
    
    public Crupie agregarCrupie(String ced, String pass) {
        return sAcceso.agregarCrupie(ced, pass);
    }
    public ArrayList<Mesa> getMesas() {
        return sApuesta.getMesas();
    }

    public void AgregarMesa(Mesa m) {
        sApuesta.AgregarMesa(m);
    }
    
    
    public Sesion loginCrupie(String nom, String pass) {
        return sAcceso.loginCrupie(nom, pass);
    }
    
   public void AgregarTipoApuesta(TipoApuesta TA){
        sApuesta.AgregarTiposApuestas(TA);
    }

    public ArrayList<Mesa> getMesasActivas() {
        return sApuesta.getMesasAbiertas();
    }
    
    
    public ArrayList<Efecto> getEfectos() {
        return sApuesta.getEfectos();
    }
   
    public void AgregarEfecto(Efecto f){
        sApuesta.AgregarEfecto(f);
    }
    
    
}
