
package Clases.Usuarios;

import Clases.Mesa;
import Clases.Usuarios.Usuario;


public class Crupie extends Usuario{
    
    Mesa Mesa;
    
    public Crupie(String Cedula, String Contraseña) {
        super(Cedula, Contraseña);
    }

    public Mesa getMesa() {
        return Mesa;
    }

    public void setMesa(Mesa Mesa) {
        this.Mesa = Mesa;
    }
    
    
}
