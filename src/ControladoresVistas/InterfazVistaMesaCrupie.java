
package ControladoresVistas;

import Clases.Casillero;
import Clases.Efectos.Efecto;
import TipoApuestas.TipoApuesta;
import java.util.ArrayList;


public interface InterfazVistaMesaCrupie {

  //  public void mostrarOperaciones(ArrayList<Operacion> operaciones);

  //  public void mostrarRegistros(Registro[] registros);

    public void CargarEfectosHabilitados(ArrayList<Efecto> Efectos);
    
    public void CargarBalance(int balance);
    
    public void CargarRonda(int NUM);
    
    public void CargarNumRuleta(int Ruleta);
 
    public void LimpiarApuestas(ArrayList<Casillero> casilleros);
    
    public void EstablecerApuestasHablitadas(ArrayList<Casillero> ca);
}
