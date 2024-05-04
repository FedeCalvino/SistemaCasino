
package ControladoresVistas;

import Clases.Apuesta;
import Clases.Casillero;
import Clases.Fachada;
import Clases.Mesa;
import Clases.Ronda;
import Clases.Usuarios.Crupie;
import Clases.Usuarios.Jugador;
import TipoApuestas.TipoApuesta;
import static java.lang.Math.abs;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import observador.Observable;
import observador.Observador;

public class ControladorMesaJugador implements Observador{
    VistaMesaJugador vista;
    Jugador jugador;
    Mesa m;

    public ControladorMesaJugador(VistaMesaJugador vista, Jugador jugador,Mesa mes) {
        this.vista = vista;
        this.jugador = jugador;

        m=mes;
        CargarNumRuleta();
        m.AgregarObservador(this);
        jugador.AgregarObservador(this);
        CargarMonto();
        CargarRonda();
        EstablecerApuestasHablitadas();
        cargarNombreJ();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Ronda");
        model.addColumn("Total Apostado");
        model.addColumn("Ganado");
        model.addColumn("Perdido");
        model.addColumn("Balance");
    }
    public void CargarMonto(){
        vista.CargarMonto(jugador.getSaldo());
        
    }
    
    private void CargarNumRuleta(){
        vista.CargarNumRuleta();
    }
    
    public void AbandonarMesa(){
        m.EliminarJugador(jugador);
        jugador.SacarObservador(this);
    }
    
    private void CargarRonda(){
        int numrondas = m.NumeroDeRondas();
        
        if(numrondas==1){
            vista.CargarRonda(0,numrondas);
        }else{
            int ultnumsorteado = m.getPenUltimoNumeroSorteado();
            vista.CargarRonda(ultnumsorteado,numrondas);
        }    
    }  
    private void CargarUtimoTiro(){
        if(m.getUltimaRonda().getNumeroSorteado()==0){
            vista.CargarUltimoNumSorteado(m.getUltimaRonda().getNumeroSorteado(),new java.awt.Color(0, 255, 0));
        }else{
            if(m.getUltimaRonda().getColorSorteado().equals("red")){
            vista.CargarUltimoNumSorteado(m.getUltimaRonda().getNumeroSorteado(),new java.awt.Color(255,160,122));
        }else{
            vista.CargarUltimoNumSorteado(m.getUltimaRonda().getNumeroSorteado(),new java.awt.Color(0, 0, 0));
        }
        }


    }

    private void EstablecerApuestasHablitadas() {
        ArrayList<Casillero> ca = new ArrayList<>();
        for(TipoApuesta ta: m.getTipoApuestaHablitadas()){
            ca.addAll(ta.crearCaillero());
            }
        vista.EstablecerApuestasHablitadas(ca);
    }


    private void NumeroSorteado(){
        String[] nums = new String[m.getListaRondas().size()+1];
        int ronda=0;
        for(Ronda r : m.getListaRondas()){
            nums[ronda]=(r.getNumeroSorteado()+"");
            ronda++;
        }
        vista.AddNumSorteados(nums);
    }
    private void CargarTablaOcurrencia() {
        vista.CargarTablaOcurrencia(m.Ocurrenciadecasilleros());
    }
    
    @Override
    public void actualizar(Object evento, Observable origen) {
        if(evento.equals(Mesa.eventos.cambioRonda)){
            CargarRonda();
        }else if(evento.equals(Jugador.eventos.reset)){
           // vista.mensajeReset();
        }else if(evento.equals(Mesa.eventos.NumeroSorteado)){
            NumeroSorteado();
            CargarUtimoTiro();
        }
        else if(evento.equals(Mesa.eventos.PagarRonda)){
            CargarMonto();
            LimpiarMesa();
            this.CargarTabla();
            this.CargarTablaOcurrencia();
        }else if(evento.equals(Mesa.eventos.PausarMesa)){
            vista.Pausar();
        }
        else if(evento.equals(Mesa.eventos.Reanudar)){
            vista.Reanudar();
        }
    }

    void CrearApuesta(int universalCellCode, int Ficha) {
        Ronda r =m.getUltimaRonda();
        Apuesta a = new Apuesta(jugador, Ficha);
        r.AgregarApuesta(universalCellCode, a); 
    }

    private void cargarNombreJ() {
        vista.CargarNombreJugador();
    }

    private void LimpiarMesa() {
        vista.LimpiarApuestas(m.getUltimaRonda().getCasilleros());
    }

    public boolean ValidarApuesta(int ficha, int cellcode,Jugador j) {
        return jugador.ValidarApuesta(ficha) && m.getUltimaRonda().ValidarApuesta(ficha,cellcode,j);
    }
    public void CargarTabla(){//modelo va en la view y las logicas de la cuenta van en el dominio 
        vista.CargarTablaDatos(m.cargarTablarondasJugador(this.jugador)); 
    }
    
}
