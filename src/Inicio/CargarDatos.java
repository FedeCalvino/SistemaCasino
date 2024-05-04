
package Inicio;

import Clases.Casillero;
import Clases.Efectos.Completo;
import Clases.Efectos.Parcial;
import Clases.Efectos.Simulador;
import TipoApuestas.Color;
import TipoApuestas.Directo;
import TipoApuestas.Docena;
import Clases.Fachada;
import Clases.Mesa;
import java.util.ArrayList;
import java.util.List;

public class CargarDatos {
    public static void Cargar(){
    Fachada F = Fachada.getInstancia();
    F.agregarJugador("201", "aaa", 1000).setNombreCompelto("Juan pedro Emilio Ramirez");
    F.agregarJugador("202", "bbb", 500).setNombreCompelto("Emilio Alfonso Roberto"); 
    F.agregarJugador("203", "ccc", 100).setNombreCompelto("Jose Fuentes"); 
    F.agregarJugador("204", "ddd", 50).setNombreCompelto("Fefi Calvino"); 
    F.agregarJugador("205", "eee", 10).setNombreCompelto("Tenedor Cuchara"); 
    Mesa m1 = new Mesa(0);
    Mesa m2 = new Mesa(0);
    Mesa m3 = new Mesa(0);
    Color color = new Color(false,2,false ,"Color");
    Directo directo = new Directo(true,36,true,"Directo");
    Docena docena = new Docena(false,3,false,"Docena");
    /*for(int i=0;i<44;i++){
        Casillero 1 = new Casillero(1,1,directo,);
    }
    */
    Completo c = new Completo("Completo");
    Parcial p = new Parcial("Parcial");
    Simulador s = new Simulador("Simulador");
    
    F.AgregarEfecto(c);
    F.AgregarEfecto(p);
    F.AgregarEfecto(s);
    
    
    F.AgregarMesa(m1);
    F.AgregarMesa(m2);
    F.AgregarMesa(m3);
    
    
    F.agregarCrupie("101", "aaa").setMesa(m1);
    
    F.agregarCrupie("102", "bbb").setMesa(m2);
    
    F.agregarCrupie("103", "ccc").setMesa(m3);
    F.AgregarTipoApuesta(color);
    F.AgregarTipoApuesta(docena);
    F.AgregarTipoApuesta(directo);
    
    

        
        


/*
        ArrayList<Integer> primeradocena = new ArrayList();
        int i = 1;
        while(i<13){
        primeradocena.add(i);
        i++;
        }
        
 
        
        Casillero a40 = new Casillero(40,primeradocena,docena);
        
        
        
        ArrayList<Integer> segundadocena = new ArrayList();
           
        while(i<25){
        segundadocena.add(i);
        i++;
        }
        Casillero a41 = new Casillero(41,segundadocena,docena);
        
         ArrayList<Integer> terceradocena = new ArrayList();
                   
        while(i<37){
        terceradocena.add(i);
        i++;
        }
        Casillero a42 = new Casillero(42,terceradocena,docena);
        
        
        ArrayList<Integer> numerosRojos = new ArrayList<>();

        // Agregar los números rojos a la lista
        numerosRojos.add(1);
        numerosRojos.add(3);
        numerosRojos.add(5);
        numerosRojos.add(7);
        numerosRojos.add(9);
        numerosRojos.add(12);
        numerosRojos.add(14);
        numerosRojos.add(16);
        numerosRojos.add(18);
        numerosRojos.add(19);
        numerosRojos.add(21);
        numerosRojos.add(23);
        numerosRojos.add(25);
        numerosRojos.add(27);
        numerosRojos.add(30);
        numerosRojos.add(32);
        numerosRojos.add(34);
        numerosRojos.add(36);
        
        Casillero a43 = new Casillero(43,numerosRojos,color);
        
         ArrayList<Integer> numerosNegros = new ArrayList<>();

        // Agregar los números negros a la lista
        numerosNegros.add(2);
        numerosNegros.add(4);
        numerosNegros.add(6);
        numerosNegros.add(8);
        numerosNegros.add(10);
        numerosNegros.add(11);
        numerosNegros.add(13);
        numerosNegros.add(15);
        numerosNegros.add(17);
        numerosNegros.add(20);
        numerosNegros.add(22);
        numerosNegros.add(24);
        numerosNegros.add(26);
        numerosNegros.add(29);
        numerosNegros.add(31);
        numerosNegros.add(33);
        numerosNegros.add(35);
        
         Casillero a44 = new Casillero(44,numerosNegros,color);
        
    }*/
}
    }
