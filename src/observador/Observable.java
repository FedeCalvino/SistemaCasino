
package observador;

import java.util.ArrayList;


public class Observable {
    
    private ArrayList<Observador> observadores = new ArrayList();
    
    
    public void avisar(Object evento){
        ArrayList<Observador> copia = new ArrayList(observadores);
        for(Observador obs:copia){
            obs.actualizar(evento, this);
        }
    }
    public void AgregarObservador(Observador obs){
        if(!observadores.contains(obs)){
            observadores.add(obs);
        }
    }
    public void SacarObservador(Observador obs){
        observadores.remove(obs);
    }
}
