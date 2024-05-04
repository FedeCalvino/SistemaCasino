
package TipoApuestas;

import Clases.Casillero;
import Clases.Mesa;
import Clases.Usuarios.Jugador;
import TipoApuestas.TipoApuesta;
import java.util.ArrayList;


public class Color extends TipoApuesta{

    public Color(boolean esDirecta, int FactorPago, boolean Obligatorio, String NombreApuesta) {
        super(esDirecta, FactorPago, Obligatorio, NombreApuesta);
    }
    
    @Override
    public int Pago(int MontoApuesta) {
       return MontoApuesta*FactorPago;
    }
    
    @Override
    public boolean ValidarApuesta(Mesa m, int ficha, int cellcode, Jugador j) {
        if(m.getListaRondas().size()>1) {
            if(m.getPenUltimaRonda().CasilleroApostadoxjug(43,j)&& m.getPenUltimaRonda().CasilleroApostadoxjug(44,j) && m.getPenUltimaRonda().getNumeroSorteado() != 0 ){
                return true;
            }else if(cellcode == 43){
                if(!m.getPenUltimaRonda().CasilleroApostadoxjug(43,j)){
                    return true;
                }
                if(m.getPenUltimaRonda().CasilleroApostadoxjug(43,j) &&  m.getPenUltimaRonda().getCasillero(cellcode).getNumerosApostados().contains( m.getPenUltimaRonda().getNumeroSorteado())){
                 return true;
                }else{ Casillero estecas = m.getUltimaRonda().getCasillero(cellcode);
                        Casillero anteriorcas = m.getPenUltimaRonda().getCasillero(cellcode);
                    return (estecas.TotalApostadoJ(j)+ficha ) <= anteriorcas.TotalApostadoJ(j);

                    }

            }else if(cellcode == 44){
                if(!m.getPenUltimaRonda().CasilleroApostadoxjug(44,j)){
                    return true;
                }
             if(m.getPenUltimaRonda().CasilleroApostadoxjug(44,j) &&  m.getPenUltimaRonda().getCasillero(cellcode).getNumerosApostados().contains( m.getPenUltimaRonda().getNumeroSorteado())){
                 return true;
                }else{ Casillero estecas = m.getUltimaRonda().getCasillero(cellcode);
                        Casillero anteriorcas = m.getPenUltimaRonda().getCasillero(cellcode);
                    return (estecas.TotalApostadoJ(j)+ficha ) <= anteriorcas.TotalApostadoJ(j);

                    }}
        }
        return true;
    }

    
    
    @Override
    public ArrayList<Casillero> crearCaillero() {
      
        ArrayList<Casillero> ret = new ArrayList<>();
        ArrayList<Integer> numrojo = new ArrayList<>();
        numrojo.add(1);
        numrojo.add(3);
        numrojo.add(5);
        numrojo.add(7);
        numrojo.add(9);
        numrojo.add(12);
        numrojo.add(14);
        numrojo.add(16);
        numrojo.add(18);
        numrojo.add(19);
        numrojo.add(21);
        numrojo.add(23);
        numrojo.add(25);
        numrojo.add(27);
        numrojo.add(30);
        numrojo.add(32);
        numrojo.add(34);
        numrojo.add(36);

        Casillero a43 = new Casillero(43,numrojo, this, "rojo");
        ret.add(a43);
        
         ArrayList<Integer> numnegro = new ArrayList<>();
         numnegro.add(2);
        numnegro.add(4);
        numnegro.add(6);
        numnegro.add(8);
        numnegro.add(10);
        numnegro.add(11);
        numnegro.add(13);
        numnegro.add(15);
        numnegro.add(17);
        numnegro.add(20);
        numnegro.add(22);
        numnegro.add(24);
        numnegro.add(26);
        numnegro.add(29);
        numnegro.add(28);
        numnegro.add(31);
        numnegro.add(33);
        numnegro.add(35);
        
        Casillero a44 = new Casillero(44,numnegro, this,"negro");
        ret.add(a44);
        
        return ret;
    }
    
}
