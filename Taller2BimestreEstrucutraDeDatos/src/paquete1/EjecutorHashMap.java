package paquete1;

import java.util.ArrayList;
import paquete2.*;

public class EjecutorHashMap {

    public static void main(String[] args) {
        
        Grafo g = new Grafo(false);

        g.agregarArista("0", "1");
        g.agregarArista("0", "3");
        g.agregarArista("0", "4");
        g.agregarArista("1", "2");
        g.agregarArista("1", "4");
        g.agregarArista("2", "4");
        g.agregarArista("3", "5");
        g.agregarArista("4", "5");

        ArrayList<String> recorridoA = g.recorridoAmplitud("0");

        System.out.println("Recorrido en Amplitud");

        System.out.println(recorridoA);

        ArrayList<String> recorridoAd = g.recorridoProfundidad("2");

        System.out.println("\nRecorrido en Profundidad");

        System.out.println(recorridoAd);
        
    }
    
}
