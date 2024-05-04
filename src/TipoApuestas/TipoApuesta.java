
package TipoApuestas;

import Clases.Casillero;
import Clases.Mesa;
import Clases.Usuarios.Jugador;
import java.util.ArrayList;


public abstract class TipoApuesta {
    boolean esDirecta;
    int FactorPago;
    boolean Obligatorio;
    String NombreApuesta;

    public TipoApuesta(String NombreApuesta) {
        this.NombreApuesta = NombreApuesta;
    }

    public TipoApuesta(boolean esDirecta, int FactorPago, boolean Obligatorio, String NombreApuesta) {
        this.esDirecta = esDirecta;
        this.FactorPago = FactorPago;
        this.Obligatorio = Obligatorio;
        this.NombreApuesta = NombreApuesta;
    }
    
    
    public String getNombreApuesta() {
        return NombreApuesta;
    }

    public void setNombreApuesta(String NombreApuesta) {
        this.NombreApuesta = NombreApuesta;
    }
    
    public abstract int Pago(int MontoApuesta);

    public boolean isObligatorio() {
        return Obligatorio;
    }
    
    
    public abstract ArrayList<Casillero> crearCaillero();     
    public abstract boolean ValidarApuesta(Mesa m, int ficha, int cellcode, Jugador j);
    
    
    @Override
    public String toString() {
        return NombreApuesta;
    }
            
    
}
