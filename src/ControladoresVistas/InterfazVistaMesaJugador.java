
package ControladoresVistas;

import Clases.Casillero;
import Clases.Efectos.Efecto;
import TipoApuestas.TipoApuesta;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public interface InterfazVistaMesaJugador {

  //  public void mostrarOperaciones(ArrayList<Operacion> operaciones);

  //  public void mostrarRegistros(Registro[] registros);
    
    public void CargarMonto(int monto);
    
    public void CargarRonda(int numsorteado , int nronda);
    
    
    public void CargarNumRuleta();
    
    public void CargarNombreJugador();
    
    public void CargarTablaDatos(ArrayList<ArrayList<Integer>> listaLista);
    
   public void EstablecerApuestasHablitadas(ArrayList<Casillero> ca);
    
    public void Pausar();
    public void Reanudar();
}
