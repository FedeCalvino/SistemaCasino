
package Clases;

import observador.Observable;

public class SaldoJugador extends Observable {
    
    private int Saldo;
    
    public enum eventos{cambioValor,reset};

    public SaldoJugador(int saldo) {
        Saldo=saldo;
    }
    
    public void sumar(int ganancia){
        Saldo+=ganancia;
        avisar(eventos.cambioValor);
    }
    public boolean restar(int perdida){
        if(Saldo>0){
          Saldo-=perdida;
          avisar(eventos.cambioValor);
          return true;
        }
        return false;
    }

    public int getSaldo() {
        return Saldo;
    }
    public void SetSaldo(int saldo) {
        this.Saldo=saldo;
    }
    public void reset() {
        Saldo = 0;
        avisar(eventos.cambioValor);
        avisar(eventos.reset);
    }
}
