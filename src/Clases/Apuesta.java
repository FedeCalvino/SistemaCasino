
package Clases;

import Clases.Usuarios.Jugador;


public class Apuesta {
    private static int UltimoId=1;
    int Id;
    Jugador jugador; 
    int Monto;
    Casillero casillero;

    
    
    public Apuesta(Jugador jugador, int Monto, Casillero casillero) {
        this.jugador = jugador;
        this.Monto = Monto;
        this.casillero = casillero;
        Id=UltimoId;
        UltimoId++;
    }
    public Apuesta(Jugador jugador, int Monto) {
        this.jugador = jugador;
        this.Monto = Monto;
        this.casillero = casillero;
        Id=UltimoId;
        UltimoId++;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }

    public Casillero getCasillero() {
        return casillero;
    }

    public void setCasillero(Casillero casillero) {
        this.casillero = casillero;
    }

    public int getId() {
        return Id;
    }
    
    
}
