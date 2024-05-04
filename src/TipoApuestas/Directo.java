
package TipoApuestas;

import Clases.Casillero;
import Clases.Mesa;
import Clases.Usuarios.Jugador;
import TipoApuestas.TipoApuesta;
import java.util.ArrayList;


public class Directo extends TipoApuesta{
    public Directo(boolean esDirecta, int FactorPago, boolean Obligatorio, String NombreApuesta) {
        super(esDirecta, FactorPago, Obligatorio, NombreApuesta);
    }
    
    @Override
    public int Pago(int MontoApuesta) {
        return MontoApuesta*FactorPago;
    }
    @Override
    public boolean ValidarApuesta(Mesa m, int ficha, int cellcode, Jugador j) {
        return true;
    }

    @Override
    public ArrayList<Casillero> crearCaillero() {
        ArrayList<Casillero> ret = new ArrayList<Casillero>();
        Casillero a1 = new Casillero(1, this,"red");
        ret.add(a1);

        Casillero a2 = new Casillero(2, this,"Negro");
        ret.add(a2);

        Casillero a3 = new Casillero(3, this,"red");
        ret.add(a3);

        Casillero a4 = new Casillero(4, this,"Negro");
        ret.add(a4);

        Casillero a5 = new Casillero(5, this,"red");
        ret.add(a5);

        Casillero a6 = new Casillero(6, this,"Negro");
        ret.add(a6);

        Casillero a7 = new Casillero(7, this,"red");
        ret.add(a7);
        Casillero a8 = new Casillero(8, this,"Negro");
        ret.add(a8);

        Casillero a9 = new Casillero(9, this,"red");
        ret.add(a9);

        Casillero a10 = new Casillero(10, this,"Negro");
        ret.add(a10);

        Casillero a11 = new Casillero(11, this,"Negro");
        ret.add(a11);

        Casillero a12 = new Casillero(12, this,"red");
        ret.add(a12);

        Casillero a13 = new Casillero(13, this,"Negro");
        ret.add(a13);

        Casillero a14 = new Casillero(14, this,"red");
        ret.add(a14);

        Casillero a15 = new Casillero(15, this,"Negro");
        ret.add(a15);

        Casillero a16 = new Casillero(16, this,"red");
        ret.add(a16);

        Casillero a17 = new Casillero(17, this,"Negro");
        ret.add(a17);

        Casillero a18 = new Casillero(18, this,"red");
        ret.add(a18);

        Casillero a19 = new Casillero(19, this,"red");
        ret.add(a19);

        Casillero a20 = new Casillero(20, this,"Negro");
        ret.add(a20);

        Casillero a21 = new Casillero(21, this,"red");
        ret.add(a21);

        Casillero a22 = new Casillero(22, this,"Negro");
        ret.add(a22);

        Casillero a23 = new Casillero(23, this,"red");
        ret.add(a23);

        Casillero a24 = new Casillero(24, this,"Negro");
        ret.add(a24);

        Casillero a25 = new Casillero(25, this,"Negro");
        ret.add(a25);

        Casillero a26 = new Casillero(26, this,"Negro");
        ret.add(a26);

        Casillero a27 = new Casillero(27, this,"red");
        ret.add(a27);

        Casillero a28 = new Casillero(28, this,"Negro");
        ret.add(a28);

        Casillero a29 = new Casillero(29, this,"Negro");
        ret.add(a29);

        Casillero a30 = new Casillero(30, this,"red");
        ret.add(a30);

        Casillero a31 = new Casillero(31, this,"Negro");
        ret.add(a31);

        Casillero a32 = new Casillero(32, this,"red");
        ret.add(a32);

        Casillero a33 = new Casillero(33, this,"Negro");
        ret.add(a33);
        Casillero a34 = new Casillero(34, this,"red");
        ret.add(a34);

        Casillero a35 = new Casillero(35, this,"Negro");
        ret.add(a35);

        Casillero a36 = new Casillero(36, this,"red");
        ret.add(a36);
        
        return ret;
    }
}
