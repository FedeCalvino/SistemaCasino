
package ControladoresVistas;

import Clases.Fachada;
import Clases.Mesa;
import Clases.Sesion;
import Clases.Usuarios.Crupie;
import Clases.Usuarios.Usuario;
import observador.Observable;
import observador.Observador;


public class ControladorEstalecerConfiguracionMesa implements Observador{
    private EstablecerConfigMesa vista;

    public ControladorEstalecerConfiguracionMesa(EstablecerConfigMesa vista) {
        this.vista = vista;     
        MostrarTiposDeEfectos();
    }

    
    
    
    public void salir(){
        
    }
    @Override
    public void actualizar(Object evento, Observable origen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void MostrarTiposDeEfectos() {
        vista.cargarTiposDeApuestas(Fachada.getInstancia().getTipoApuetas());
    }
    
}
