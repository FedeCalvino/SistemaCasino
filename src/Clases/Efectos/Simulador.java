
package Clases.Efectos;

import Clases.Casillero;
import Clases.Efectos.Efecto;
import Clases.Mesa;
import java.util.ArrayList;


public class Simulador extends Efecto {  

    public Simulador(String Nombre) {
        super(Nombre);
    }

    @Override
    public int HacerTiro(ArrayList<Casillero> casilleros, Mesa mesa) {
        boolean ok=false;
        int numero=0;
        if(mesa.getUltimaRonda().Apostado()){
            while(!ok){
                    numero = (int)(Math.random()*36);
                    for(Casillero c : casilleros){
                        if(c.EstaApostado()){
                            if(c.getCellCode()==numero){
                                ok=true;
                            }      
                        }
                    
                    }
            }   
        }else{
          numero=0;  
        }
        return numero;
    }
}
