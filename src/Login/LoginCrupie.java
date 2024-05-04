
package Login;

import ControladoresVistas.EstablecerConfigMesa;
import Login.LoginVentana;
import Clases.Fachada;
import Clases.Sesion;
import Clases.Usuarios.Crupie;
import java.awt.Frame;



public class LoginCrupie extends LoginVentana{
   public LoginCrupie(Frame parent, boolean modal) {     super(parent, modal, "LOGIN CRUPIE");
    }

    
    @Override
    public Object llamarLogin(String usr, String pwd) {
       
        return Fachada.getInstancia().loginCrupie(usr, pwd);
                
    }
    
    @Override
    public void proximoCasoUso(Sesion u) {
        new EstablecerConfigMesa(null, false, u).setVisible(true);
    }
    
}
