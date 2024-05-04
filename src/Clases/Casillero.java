
package Clases;

import Clases.Usuarios.Jugador;
import TipoApuestas.TipoApuesta;
import java.util.ArrayList;
import java.util.List;


public class Casillero {
    
    int CellCode;
    List<Integer> NumerosApostados;
    ArrayList<Apuesta> Apuestas;
    TipoApuesta tipoApuesta;
    Ronda ronda;
    String Color;
    String Nombre;

    public Casillero(int CellCode, List<Integer> NumerosApostados, TipoApuesta tipoApuesta, Ronda ronda) {
        this.CellCode = CellCode;
        this.NumerosApostados = NumerosApostados;
        this.tipoApuesta = tipoApuesta;
        this.ronda = ronda;
        this.Apuestas = new ArrayList<Apuesta>();
    }
    
    public Casillero(int CellCode, List<Integer> NumerosApostados, TipoApuesta tipoApuesta, String nombre) {
        this.CellCode = CellCode;
        this.NumerosApostados = NumerosApostados;
        this.tipoApuesta = tipoApuesta;
        this.ronda = ronda;
        this.Nombre= nombre;
        this.Apuestas = new ArrayList<Apuesta>();
    }
    
    public List<Integer> getNumerosApostados() {
        return NumerosApostados;
    }
    
    
    public void AgregarApuesta(Apuesta a){
        this.Apuestas.add(a);
    }
    public ArrayList<Apuesta> getApuestas(){
        return this.Apuestas;
    }
    public boolean EstaApostado(){
        return !this.Apuestas.isEmpty();
    }
    public boolean EstaApostadoxJug(Jugador j){
        if(!this.Apuestas.isEmpty()){
            for(Apuesta a : this.Apuestas){
            if(a.jugador == j){
            return true;
                    }}
        }
        return false;
    }
    
    public boolean EstaApostadoJugador(Jugador j){
        for(Apuesta a:this.getApuestas()){
            if(a.jugador==j){
                return true;
            }
        }
        return false;
    }
    
    public Casillero(int CellCode, TipoApuesta tipoApuesta) {
        this.CellCode = CellCode;
        this.tipoApuesta = tipoApuesta;
        this.Apuestas = new ArrayList<Apuesta>();
        this.NumerosApostados = new ArrayList<Integer>();
    }
        public Casillero(int CellCode, TipoApuesta tipoApuesta,String color) {
        this.CellCode = CellCode;
        this.Color=color;
        this.tipoApuesta = tipoApuesta;
        this.Apuestas = new ArrayList<Apuesta>();
        this.NumerosApostados = new ArrayList<Integer>();
    }

    public String getNombre() {
        return Nombre;
    }
    
    

        
    public int getCellCode() {
        return CellCode;
    }
    
    public void borrarApuestasJugador(Jugador j){
    List<Apuesta> apuestasAEliminar = new ArrayList<>();
    for(Apuesta a : Apuestas){
        if(a.jugador.equals(j)){
            apuestasAEliminar.add(a);
        }
    }
        Apuestas.removeAll(apuestasAEliminar);
    }
    
    public void ValidarPagarApuesta(int tiro){
        if(NumerosApostados.isEmpty()){         
            if(this.CellCode==tiro){
                for(Apuesta a : Apuestas){
                    int monto = a.getMonto();
                    int pago = tipoApuesta.Pago(monto);
                    a.jugador.sumarSaldo(pago);
                }

            }
        }else{
          if(this.CellCode==tiro || NumerosApostados.contains(tiro)){
                for(Apuesta a : Apuestas){
                    int monto = a.getMonto();
                    int pago = tipoApuesta.Pago(monto);
                    a.jugador.sumarSaldo(pago);
                }

            }  
        }
    }
    public boolean ValidarApuesta(int tiro){
        boolean retorno=false;
        if(NumerosApostados.isEmpty()){         
            if(this.CellCode==tiro){
                retorno = true;
            }
        }else{
          if(this.CellCode==tiro || NumerosApostados.contains(tiro)){
                retorno = true;
            }  
        }
        return retorno;
    }

    public boolean ValidarIngresoApuesta(int ficha, int cellcode, Ronda r,Jugador j) {
        return this.tipoApuesta.ValidarApuesta(r.mesa,ficha,cellcode,j);

    }
    
    public int TotalApostadoJ(Jugador j) {
        int ret=0;
        for(Apuesta a:this.Apuestas){
            if(a.jugador==j){
                ret+=a.Monto;
            }
        }
        return ret;
    }
    
    public int TotalApostado() {
        int ret=0;
        for(Apuesta a:this.Apuestas){
                ret+=a.getMonto();
        }
        return ret;
    }
    public int TotalGanado() {
        int ret=0;
        for(Apuesta a:this.Apuestas){
                ret+=this.tipoApuesta.Pago(a.getMonto());
        }
        return ret;
    }
    
    
    public int TotalGanadoJ(Jugador j,int Ganador){
        int ret=0;
        for(Apuesta a:this.Apuestas){
            if(a.jugador==j){
                if(Ganador==this.CellCode || this.NumerosApostados.contains(Ganador)){
                   int monto = a.getMonto();
                   ret += this.tipoApuesta.Pago(monto);
                }
                           
            }
        }
        return ret;
    }
    
    
}
