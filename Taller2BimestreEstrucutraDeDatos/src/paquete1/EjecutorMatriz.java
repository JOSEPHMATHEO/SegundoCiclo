package paquete1;

import java.util.Scanner;
import paquete3.*;

public class EjecutorMatriz {
    public static void main(String[] args) {
        Grafo g = new Grafo(6,false);
        
        g.addVertices("0");
        g.addVertices("1");
        g.addVertices("2");
        g.addVertices("3");
        g.addVertices("4");
        g.addVertices("5");
        
        g.addArista("0","1");
        g.addArista("0","3");
        g.addArista("0","4");
        g.addArista("1","2");
        g.addArista("1","4");
        g.addArista("3","5");
        g.addArista("3","5");
        
        g.printMatriz();
        
    }
    
}
