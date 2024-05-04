/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Clases.Usuarios.Crupie;
import Clases.Usuarios.Jugador;
import Clases.Usuarios.Usuario;
import java.util.ArrayList;



public class SistemaAcceso {
    
    private ArrayList<Jugador> Jugadores = new ArrayList();
    private ArrayList<Crupie> Crupies = new ArrayList();
    private ArrayList<Sesion> sesiones = new ArrayList(); 
    
    public Crupie agregarCrupie(String ced,String pass){
        Crupie c = new Crupie(ced, pass);
        Crupies.add(c);
        return c;
    }
    
    public Jugador agregarJugador(String ced,String pass,int Saldo){
        Jugador j = new Jugador(ced, pass,Saldo);
        Jugadores.add(j);
        return j;
    }
    public Sesion loginJugador(String ced,String pass){
       Usuario u = buscarJugador(ced,pass,Jugadores);
       Sesion s = null;
       if(u!=null){
           s = new Sesion((Jugador)u);
           sesiones.add(s);
       }
       
       return s;
    }

    public ArrayList<Sesion> getSesiones() {
        return sesiones;
    }
    
    public void logout(Sesion s){
        sesiones.remove(s);
    }
    public Sesion loginCrupie(String ced,String pass){
        Usuario u = buscarCrupie(ced,pass,this.Crupies);
        Sesion s = null;
        if(u!=null){
         s=new Sesion((Crupie)u);
         sesiones.add(s);
        }
        return s;
    }
    
    private Jugador buscarJugador(String ced, String pass, ArrayList lista){
        Jugador j;
        for(Object o:lista){
            j = (Jugador)o;
            if(j.getCedula().equals(ced) && j.getContraseña().equals(pass)){
                return j;
            }
        }
        return null;
    }

    private Crupie buscarCrupie(String ced, String pass, ArrayList<Crupie> Crupies) {
        Crupie C;
        for(Object o:Crupies){
            C = (Crupie)o;
            if(C.getCedula().equals(ced) && C.getContraseña().equals(pass)){
                return C;
            }
        }
        return null;
    }
    
}
