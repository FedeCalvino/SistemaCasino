
package ControladoresVistas;

import Clases.Fachada;
import Clases.Sesion;
import Clases.Usuarios.Crupie;
import Clases.Usuarios.Jugador;
import Clases.Usuarios.Usuario;
import observador.Observable;


public class ControladorUnirseAMesa {
    private UnirseAMesa vista;
    private Jugador jugador;

    public ControladorUnirseAMesa(UnirseAMesa vista, Jugador j) {
        this.vista = vista;
        jugador = j;
        // usuario..AgregarObservador(this);      
        MostrarMesasActivas();
    }

    
    
    
    public void salir(){
        
    }

    private void MostrarMesasActivas() {
        vista.MostrarMesasAbiertas(Fachada.getInstancia().getMesasActivas());
    }
}
