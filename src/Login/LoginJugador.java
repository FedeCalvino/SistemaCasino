/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import Clases.Fachada;
import Clases.Sesion;
import Clases.Usuarios.Jugador;
import ControladoresVistas.UnirseAMesa;
import java.awt.Frame;
/*import iuGrafica.Login;
import iuGrafica.UsuariosConectados;
import logica.Fachada;
import logica.Usuario;

/**
 *
 * @author PC
 */
public class LoginJugador extends LoginVentana{

    public LoginJugador(Frame parent, boolean modal) {
        super(parent, modal, "LOGIN jUGADOR");
    }
    
    @Override
    public Object llamarLogin(String usr, String pwd) {
        return Fachada.getInstancia().loginJugador(usr, pwd);
    }

    @Override
    public void proximoCasoUso(Sesion u) {
       new UnirseAMesa(null,false,u).setVisible(true);
    }
    
}
