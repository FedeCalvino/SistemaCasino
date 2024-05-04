
package Clases.Usuarios;

import observador.Observable;


public class Usuario extends Observable{
    String Cedula;
    String Contraseña;
    String NombreCompelto;

    public Usuario(String Cedula, String Contraseña) {
        this.Cedula = Cedula;
        this.Contraseña = Contraseña;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getNombreCompelto() {
        return NombreCompelto;
    }

    public void setNombreCompelto(String NombreCompelto) {
        this.NombreCompelto = NombreCompelto;
    }
    
    
    
}
