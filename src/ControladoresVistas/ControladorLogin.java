
package ControladoresVistas;

import Clases.Sesion;
import Clases.Usuarios.Usuario;
import Login.LoginVentana;
import observador.Observable;

import observador.Observador;


public class ControladorLogin implements Observador{
    private LoginVentana vista;
    private Sesion sesion;
    private Usuario usuario;

    public ControladorLogin(LoginVentana vista) {
        this.vista = vista;
        this.sesion = sesion;
        usuario=sesion.getUsuario();
    }
    
    
    @Override
    public void actualizar(Object evento, Observable origen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
