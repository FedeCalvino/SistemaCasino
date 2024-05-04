
package Clases.Efectos;

import Clases.Casillero;
import Clases.Mesa;
import java.util.ArrayList;


public abstract class Efecto {
    String Nombre;

    public String getNombre() {
        return Nombre;
    }

    public Efecto(String Nombre) {
        this.Nombre = Nombre;
    }

  public abstract int HacerTiro(ArrayList<Casillero> casilleros,Mesa mesa);

    @Override
    public String toString() {
        return Nombre;
    }
    
  
}
