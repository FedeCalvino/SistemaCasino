
package Clases.Efectos;

import Clases.Casillero;
import Clases.Efectos.Efecto;
import Clases.Mesa;
import java.util.ArrayList;


public class Completo extends Efecto {

    public Completo(String Nombre) {
        super(Nombre);
    }



    @Override
    public int HacerTiro(ArrayList<Casillero> casilleros, Mesa mesa) {
        int numero = (int)(Math.random()*36);
        return numero; 
    }

            
    
    
    
    
}
