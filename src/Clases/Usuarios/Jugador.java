
package Clases.Usuarios;

import Clases.SaldoJugador;
import Clases.Usuarios.Usuario;

public class Jugador extends Usuario{
    
    int Saldo;

    public boolean ValidarApuesta(int ficha) {
        return this.Saldo>=ficha;
    }
    
    public enum eventos{cambioValor,reset};
    
    
    public Jugador(String Cedula, String Contraseña,int saldo) {
        super(Cedula, Contraseña);
        Saldo=saldo;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void sumarSaldo(int SaldoMas) {
        this.Saldo+=SaldoMas;
        avisar(eventos.cambioValor);
    }
    public void restarSaldo(int SaldoMenos){
        if(this.Saldo>0){
         this.Saldo-=SaldoMenos;      
         avisar(eventos.cambioValor);
        }
        
    }
    
}
