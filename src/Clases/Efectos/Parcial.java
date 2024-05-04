
package Clases.Efectos;

import Clases.Casillero;
import Clases.Efectos.Efecto;
import Clases.Mesa;
import java.util.ArrayList;


public class Parcial extends Efecto{

    public Parcial(String Nombre) {
        super(Nombre);
    }

    
    public int HacerTiro(ArrayList<Casillero> casilleros,Mesa mesa){
        boolean esta = false;
        int numero=0;
        while (!esta){
          numero = (int)(Math.random()*36);

          if(mesa.UltimosNumeros().contains(numero)){
 
          }else{
              esta=true;
          }
          
        }
        return numero; 
    
}

}
