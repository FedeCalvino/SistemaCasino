
package Inicio;

import Clases.Casillero;
import Clases.Efectos.Completo;
import Clases.Efectos.Efecto;
import Clases.Efectos.Simulador;
import Login.Menu;
import java.util.ArrayList;


public class Inicio {
    public static void main(String[] args) {
        CargarDatos.Cargar();
        //ArrayList<Casillero> salieron = new ArrayList[3,1,2,4,5,6,7,8,9,10];
        System.out.println();
        new Menu().setVisible(true);
    }
}
