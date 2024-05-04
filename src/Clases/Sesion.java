package Clases;


import Clases.Usuarios.Usuario;
import java.util.Date;
import observador.Observable;
import observador.Observador;

/**
 *
 * @author PC
 */
public class Sesion extends Observable{
    private Usuario usuario;
    private Date fecha = new Date();

    public Sesion(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Date getFecha() {
        return fecha;
    }
    
    @Override
    public String toString(){
        return usuario.getNombreCompelto();
    }

}
