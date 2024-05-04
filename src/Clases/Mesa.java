
package Clases;

import TipoApuestas.TipoApuesta;
import Clases.Usuarios.Crupie;
import Clases.Usuarios.Jugador;
import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.List;
import observador.Observable;


public class Mesa extends Observable{
    int NumeroMesa;
    int Balance;
    ArrayList<TipoApuesta> TipoApuestaHablitadas;
    ArrayList<Jugador> Jugadores;
    boolean iniciada;
    ArrayList<Ronda> ListaRondas;
    private static int UltimoId=1;

    private void IniciarRonda() {
        Ronda r = new Ronda(0,"",0,this,TipoApuestaHablitadas);
        iniciada=true;
    }
 //   public boolean Validarapuestamesa(int Cellcode, Jugador j ){
     //   this.getUltimaRonda().Casilleros.g
  //  }
    public int getMontoApostadoJRonda(Jugador j,Ronda r) {
      return r.GetApostadoJ(j);
    }

    public void EliminarJugador(Jugador jugador) {
        this.Jugadores.remove(jugador);
    }
   
    
    
    
    public enum eventos{cambioRonda,NumeroSorteado,ApuestaHecha,reset,PagarRonda,HacerApuesta,PausarMesa,Reanudar,EntroJugador};
    
    
    public  ArrayList<ArrayList<Integer>> cargarTablarondasJugador(Jugador jugador){
      ArrayList<ArrayList<Integer>> listadelistaret = new  ArrayList<>();
        
     int i = 0;
        for(Ronda r : ListaRondas){
            if(r.ApostoJugador(jugador)){
                ArrayList<Integer> sum = new ArrayList<>();
                sum.add(i++);
                int total=r.GetApostadoJ(jugador);
                int ganado=r.GetGanadoJ(jugador);
                int perdido = ganado - total;
                int balance = ganado  - abs(perdido);
                if(balance > 0){
                sum.add(total);
                sum.add(ganado);
                sum.add(0);
                sum.add(ganado-total);
          }else{
                sum.add(total);
                sum.add(0);
                sum.add( abs(perdido));
                sum.add(balance);
          }
          listadelistaret.add(sum);
                
            }
    }
     return listadelistaret;
    }
    public void EntroJugador(){
        avisar(eventos.EntroJugador);
    }
            
   
    public  ArrayList<ArrayList<Integer>> cargarTablarondasCrupie(Crupie crupie){
      ArrayList<ArrayList<Integer>> listadelistaret = new  ArrayList<>();
        
     int i = 1;
     int balanceAnterior= 0;
        for(Ronda r : ListaRondas){
                ArrayList<Integer> sum = new ArrayList<>();
                sum.add(i);
     /*           if(i!=1){
                    balanceAnterior = ListaRondas.get.getBalanceRondaCrupie();    
                }*/
                
                int Apuestas=r.getMontoTotalApostado();
                int recoleccion = r.getRecoleccion();
                int liquidacion = r.getLiquidacion();
                int balanceAcc =  balanceAnterior +  recoleccion - liquidacion; //ListaRondas.get(ListaRondas.size()-i).getBalanceRondaCrupie();
               
                sum.add(balanceAnterior);
                sum.add(Apuestas);
                sum.add(recoleccion);
                sum.add(liquidacion);
                sum.add(balanceAcc);


            listadelistaret.add(sum);
            balanceAnterior=balanceAcc;
                i++;
        }
     return listadelistaret;
    }
    public Ronda GetRondaAnterior(){
        return this.ListaRondas.get(ListaRondas.size()-1);
    }
    public void PausarMesa(){
        avisar(eventos.PausarMesa);
    }
    public void ReanudarMesa(){
        avisar(eventos.Reanudar);
    }
    
    public Ronda getPenUltimaRonda(){
        return this.ListaRondas.get(ListaRondas.size()-2);
    }
    
    public void avisarNumeroSorteado(){
        avisar(eventos.NumeroSorteado);
    }
    
    public int getUltimoNumeroSorteado(){
        return this.ListaRondas.get(ListaRondas.size()-1).NumeroSorteado;
    } 
    public int getPenUltimoNumeroSorteado(){
        return this.ListaRondas.get(ListaRondas.size()-2).NumeroSorteado;
    } 
    public void PagarRonda(){
        this.getUltimaRonda().PagarRonda();
        avisar(eventos.PagarRonda);
        IniciarRonda();
    }
   
    
    public Ronda getUltimaRonda(){
        return this.ListaRondas.get(ListaRondas.size()-1);
    }
    public int NumeroDeRondas(){
        return this.ListaRondas.size();
    }
            
    public int getNumeroMesa() {
        return NumeroMesa;
    }
    public void AvisarApuesta(){
        avisar(eventos.ApuestaHecha);
    }

    public void setNumeroMesa(int NumeroMesa) {
        this.NumeroMesa = NumeroMesa;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList<Jugador> Jugadores) {
        this.Jugadores = Jugadores;
    }

    public ArrayList<Ronda> getListaRondas() {
        return ListaRondas;
    }

    public void setListaRondas(ArrayList<Ronda> ListaRondas) {
        this.ListaRondas = ListaRondas;
    }

    public static int getUltimoId() {
        return UltimoId;
    }

    public static void setUltimoId(int UltimoId) {
        Mesa.UltimoId = UltimoId;
    }
    public void AgregarJugador(Jugador j){
        this.Jugadores.add(j);
        EntroJugador();
    }
    
    public Mesa(int Balance) {
        this.Balance = Balance;
        this.TipoApuestaHablitadas = new ArrayList<TipoApuesta>();
        this.Jugadores = new ArrayList<Jugador>();
        iniciada=false;
        NumeroMesa=UltimoId;
        ListaRondas = new ArrayList<Ronda>();
        UltimoId++;
    }

    public ArrayList<Integer> GetNumerosSorteados(){
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for(Ronda r:this.getListaRondas()){
            ret.add(r.NumeroSorteado);
        }
        return ret;
    }
    
    public ArrayList<TipoApuesta> getTipoApuestaHablitadas() {
        return TipoApuestaHablitadas;
    }
    
    public void AgregarRonda(Ronda r){
        this.ListaRondas.add(r);
        avisar(eventos.cambioRonda);
    }
    
    
    public ArrayList<Integer> UltimosNumeros(){
        List<Ronda> numeros = new ArrayList<Ronda> ();
        ArrayList<Integer> num= new ArrayList<Integer>();
        if(ListaRondas.size()>3){
            numeros= ListaRondas.subList(ListaRondas.size()-3, ListaRondas.size());
        }else{
            numeros=ListaRondas;
        }
        
        
        for(Ronda r : numeros){
            num.add(r.getNumeroSorteado());
        }
        return num;
    }

    public void setTipoApuestaHablitadas(ArrayList<TipoApuesta> TipoApuestaHablitadas,ArrayList<TipoApuesta> TipoApuestaObligatorias) {
        for (TipoApuesta tipoApuesta : TipoApuestaObligatorias) {
                if (!TipoApuestaHablitadas.contains(tipoApuesta)) {
                        TipoApuestaHablitadas.add(tipoApuesta);
                }
        }
        this.TipoApuestaHablitadas = TipoApuestaHablitadas; 
        IniciarRonda();
    }

    public boolean isIniciada() {
        return iniciada;
    }

    public void setIniciada(boolean iniciada) {
        this.iniciada = iniciada;
    }

    public ArrayList<ArrayList<String>> Ocurrenciadecasilleros(){ 
         ArrayList<ArrayList<String>> ret = new ArrayList<>();
         
        ArrayList<Casillero> casMesa = this.getUltimaRonda().getCasilleros();
        for(Casillero c: casMesa ){
            ArrayList<String> sum = new ArrayList<>();
            int cellcode = c.getCellCode();
            if(cellcode<37){
                
                double vecessalio = GetOcurrenciaDirecta(cellcode);
                if(vecessalio>0){
                sum.add(cellcode+"");
                int ocurrencia = (int)(vecessalio/this.ListaRondas.size()*100);
                sum.add(ocurrencia+"");
                ret.add(sum);
                }
                    }else{
                        double vecessalio1 = GetOcurrenciaOtras(cellcode);
                         if(vecessalio1 >0){
                        sum.add(c.getNombre());
                        int ocurrencia1 = (int)(vecessalio1/this.ListaRondas.size()*100);
                       
                        sum.add(""+(ocurrencia1));
                        ret.add(sum);
                        }
                    }
                }
    return ret;
    }
    
    public double GetOcurrenciaDirecta(int cellcode){
        int vecessalio = 0;
        for(Ronda r:ListaRondas ){
            if(r.NumeroSorteado == cellcode){
            vecessalio++;
            }
                }
        return vecessalio;

    }
    
    
    @Override
    public String toString() {
        return "Mesa numero: " + NumeroMesa + "     TipoApuestaHablitadas " + TipoApuestaHablitadas;
    }
    public double GetOcurrenciaOtras(int cellcode){
        int vecessalio = 0;
        Casillero c = this.getUltimaRonda().getCasillero(cellcode);
           for(Ronda r:ListaRondas ){
               if(c.NumerosApostados.contains(r.NumeroSorteado)){
                   vecessalio++;
               } 
           }
            return vecessalio;
    }
    //public int CrearRonda
    
}
