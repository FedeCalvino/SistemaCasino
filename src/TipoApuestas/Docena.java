
package TipoApuestas;

import Clases.Casillero;
import Clases.Mesa;
import Clases.Usuarios.Jugador;
import TipoApuestas.TipoApuesta;
import java.util.ArrayList;


public class Docena extends TipoApuesta {


    public Docena(boolean esDirecta, int FactorPago, boolean Obligatorio, String NombreApuesta) {
        super(esDirecta, FactorPago, Obligatorio, NombreApuesta);
    }

    @Override
    public int Pago(int MontoApuesta) {
        return MontoApuesta*FactorPago;
    }
    
    public boolean ValidarApuesta(Mesa m, int ficha, int cellcode, Jugador j) {
        if (cellcode == 40){
            if(m.getUltimaRonda().CasilleroApostadoxjug(41,j)||m.getUltimaRonda().CasilleroApostadoxjug(42,j)){
            return false;
            }
        }else if(cellcode == 41){
            if(m.getUltimaRonda().CasilleroApostadoxjug(40,j)||m.getUltimaRonda().CasilleroApostadoxjug(42,j)){
            return false;
            }
        }
            else if(cellcode == 42){
            if(m.getUltimaRonda().CasilleroApostadoxjug(40,j)||m.getUltimaRonda().CasilleroApostadoxjug(41,j)){
            return false;
                }
            }
            return true;
    }


    @Override
    public ArrayList<Casillero> crearCaillero() {
       ArrayList<Casillero> ret = new ArrayList<>();
        ArrayList<Integer> primdocena = new ArrayList<>();
        primdocena.add(1);
        primdocena.add(2);
        primdocena.add(3);
        primdocena.add(4);
        primdocena.add(5);
        primdocena.add(6);
        primdocena.add(7);
        primdocena.add(8);
        primdocena.add(9);
        primdocena.add(10);
        primdocena.add(11);
        primdocena.add(12);

        Casillero a40 = new Casillero(40,primdocena, this,"Primera docena");
        ret.add(a40);


        ArrayList<Integer> segundadocena = new ArrayList<>();
        segundadocena.add(13);
        segundadocena.add(14);
        segundadocena.add(15);
        segundadocena.add(16);
        segundadocena.add(17);
        segundadocena.add(18);
        segundadocena.add(19);
        segundadocena.add(20);
        segundadocena.add(21);
        segundadocena.add(22);
        segundadocena.add(23);
        segundadocena.add(24);


        Casillero a41 =new Casillero(41,segundadocena, this,"Segunda Docena");
        ret.add(a41);


        ArrayList<Integer> terceradocena = new ArrayList<>();
        terceradocena.add(25);
        terceradocena.add(26);
        terceradocena.add(27);
        terceradocena.add(28);
        terceradocena.add(29);
        terceradocena.add(30);
        terceradocena.add(31);
        terceradocena.add(32);
        terceradocena.add(33);
        terceradocena.add(34);
        terceradocena.add(35);
        terceradocena.add(36);

        Casillero a42 = new Casillero(42,terceradocena,this,"Tercera Docena");
        ret.add(a42);

        return ret;
    
    }
    
}
