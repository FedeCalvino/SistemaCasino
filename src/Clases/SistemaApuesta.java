
package Clases;

import Clases.Efectos.Efecto;
import TipoApuestas.TipoApuesta;
import Clases.Usuarios.Jugador;
import static java.lang.System.in;
import java.util.ArrayList;


public class SistemaApuesta {
    private ArrayList<TipoApuesta> TipoApuestas = new ArrayList();
    private ArrayList<Mesa> Mesas = new ArrayList();
    private ArrayList<Efecto> Efectos = new ArrayList();
    
    public ArrayList<TipoApuesta> getTipoApuestas() {
        return TipoApuestas;
    }

    public ArrayList<Efecto> getEfectos() {
        return Efectos;
    }
    public void AgregarEfecto(Efecto f){
        Efectos.add(f);
    }
    public void AgregarCasillero(Casillero c){
   //     Casilleros.add(c);
    }
    public void AgregarTiposApuestas(TipoApuesta ta) {
        TipoApuestas.add(ta);
    }
    
    public ArrayList<Mesa> getMesas() {
        return Mesas;
    }

    public void AgregarMesa(Mesa m) {
        Mesas.add(m);
    }

  //  public ArrayList<Casillero> getCasilleros() {
     //   return Casilleros;
    //}

    public void AgregarMesa(Casillero c) {
     //   Casilleros.add(c);
    }
    
    public ArrayList<TipoApuesta> getTipoApuestasObligatorias() {
       ArrayList<TipoApuesta> obligatorias = new ArrayList<TipoApuesta>();
       for(TipoApuesta ta:TipoApuestas)   {
           if(ta.isObligatorio()){
               obligatorias.add(ta);
           }
       }      
       return obligatorias;
    }
     public ArrayList<Mesa> getMesasAbiertas() {
       ArrayList<Mesa> MesasActivas = new ArrayList<Mesa>();
       for(Mesa m : Mesas)   {
           if(m.isIniciada()){
               MesasActivas.add(m);
           }
       }      
       return MesasActivas;
    }

 /*   public Casillero GetCasillero(int universalCode) {
        for(Casillero c:this.getCasilleros()){
            if(c.CellCode==universalCode){
                return c;
            }
        }
        return null;
    }*/
    
    
    
}
