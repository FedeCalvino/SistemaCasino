
package Clases;
import Clases.Efectos.Efecto;
import Clases.Usuarios.Jugador;
import TipoApuestas.TipoApuesta;
import java.util.ArrayList;
import java.util.List;


public class Ronda {
    String Estado;
    int NumeroSorteado;
    int NumeroRonda;
    int MontoTotalApostado;
    Efecto efecto;
    Mesa mesa;
    ArrayList<Casillero> Casilleros;

    public Ronda(int Numronda,String Estado, int MontoTotalApostado, Mesa mesa,ArrayList<TipoApuesta> tipos) {
        Casilleros = new ArrayList<Casillero>();
        this.Estado = Estado;
        this.MontoTotalApostado = MontoTotalApostado;
        this.mesa = mesa;
        NumeroRonda=Numronda;
        CrearCasilleros(tipos);
        //this.NumeroSorteado = HacerTiroEnEfecto();
        this.mesa.AgregarRonda(this);
    }
    public boolean Apostado(){
        boolean ret=false;
        for(Casillero c:this.getCasilleros()){
            if(c.EstaApostado()){
                return true;
            }
        }
        return ret;
    }
    public String getColorSorteado(){
        String color="";
        for(Casillero c :this.Casilleros){
            if(this.NumeroSorteado==c.CellCode){
                color= c.Color;
            }
        }
        return color;
    }
    public int getBalanceRondaCrupie(){
        int ret=0;
        for(Casillero c :this.Casilleros){
            if(c.ValidarApuesta(this.NumeroSorteado)){
                ret-=c.TotalGanado();
            }else{
                ret+=c.TotalApostado();
            }
        }
        return ret;
    }
    public boolean ApostoEnRonda(){
        boolean ret=false;
        for(Casillero c:this.getCasilleros()){
                return true;
            
        }
        return ret;
    }
    
    public boolean ApostoJugador(Jugador j){
        boolean ret=false;
        for(Casillero c:this.getCasilleros()){
            if(c.EstaApostadoJugador(j)){
                return true;
            }
        }
        return ret;
    }
  /*  public boolean validarCasillero(int cellcode,int monto){    
        for(Casillero c : casilleros){
            if(c.CellCode== cellcode){
                return c.tipoApuesta.Validar()
            }
        }
    }*/
    public void CrearCasilleros(ArrayList<TipoApuesta> tipos){
        for(TipoApuesta ta : tipos){
            this.Casilleros.addAll(ta.crearCaillero());
        }
    }
    public int HacerTiro(){
        int tiro = Sortear();
        this.setNumeroSorteado(tiro);
        return tiro;
    }
    
    public ArrayList<Casillero> obtenerCasillerosApostados(){
        ArrayList<Casillero> ret = new ArrayList<Casillero>();
        for(Casillero c : this.Casilleros){
            if(!c.Apuestas.isEmpty()){
               ret.add(c); 
            }
        }
        return ret;
    }
    public int Sortear(){
        return efecto.HacerTiro(Casilleros, mesa);
    }
    public boolean Estadisticas(int balance){
        return balance>0;
        
    }
    public void PagarRonda(){
        for(Casillero c : this.Casilleros){
            c.ValidarPagarApuesta(NumeroSorteado);
        }
    }
    
    
    public void AgregarApuesta(int CellCode,Apuesta a){//fijarse si el jugador tiene plata y si valida. Lanzar excepcion 
        for(Casillero c :this.Casilleros){
            if(c.CellCode==CellCode){   
                c.AgregarApuesta(a);
                a.setCasillero(c);
            }
            
        }
        mesa.AvisarApuesta();
    }
    
    public void setNumeroSorteado(int NumeroSorteado) {
        this.NumeroSorteado = NumeroSorteado;
        mesa.avisarNumeroSorteado();
        ValidarPago();
    }
    public boolean EstaCasillero(int cellCode){
        for(Casillero c:this.Casilleros){
            if(c.CellCode==cellCode){
                return true;
            }
        }
        return false;
    }
    
    public void agregarCasillero(Casillero c){
        Casilleros.add(c);
    }
    public int getMontoTotalApostado() {
        int retorno=0;
        for(Casillero c:this.Casilleros){
            retorno+=c.TotalApostado();
        }
        return retorno;
    }

    public void setMontoTotalApostado(int MontoTotalApostado) {
        this.MontoTotalApostado = MontoTotalApostado;
    }

    public Efecto getEfecto() {
        return efecto;
    }

    public void setEfecto(Efecto efecto) {
        this.efecto = efecto;
    }

    public ArrayList<Casillero> getCasilleros() {
        return Casilleros;
    }
    
    public void setCasilleros(ArrayList<Casillero> Casilleros) {
        this.Casilleros = Casilleros;
    }

    public int getNumeroSorteado() {
        return NumeroSorteado;
    }

    private void ValidarPago() {
        for(Casillero c: this.Casilleros){
            c.ValidarPagarApuesta(NumeroRonda);
        }
    }

    public int GetApostadoJ(Jugador j) {
        int ret=0;
        for(Casillero c:this.Casilleros){
            ret+=c.TotalApostadoJ(j);
        }
        return ret;
    }
    public int GetGanadoJ(Jugador j) {
        int ret=0;
        for(Casillero c:this.Casilleros){
            ret+=c.TotalGanadoJ(j,NumeroSorteado);
        }
        return ret;
    }

    int getRecoleccion() {
        int ret=0;
        for(Casillero c:this.Casilleros){
            if(!c.ValidarApuesta(this.NumeroSorteado)){
                ret+=c.TotalApostado();
            }
        }
        return ret;
    }

    int getLiquidacion() {
        int ret=0;
        for(Casillero c:this.Casilleros){
            if(c.ValidarApuesta(this.NumeroSorteado)){
                ret+=c.TotalGanado();
            }
        }
        return ret;
    }
   
    public Casillero getCasillero(int cellcode){
        for(Casillero c : Casilleros){
            if(c.getCellCode()== cellcode){
                return c;
            }
    }return null;
    }
    
    public boolean CasilleroApostadoxjug(int cellcode, Jugador j){
    for(Casillero c: Casilleros){
        if(c.CellCode == cellcode){
            return c.EstaApostadoxJug(j);
        }
    }

    return false;

    }
    
    public boolean ValidarApuesta(int ficha, int cellcode, Jugador j){
        for(Casillero c :this.Casilleros){
           if(c.CellCode==cellcode){
               return c.ValidarIngresoApuesta(ficha,cellcode,this,j);
           }

    }
            return false;
    }
        
    
}
