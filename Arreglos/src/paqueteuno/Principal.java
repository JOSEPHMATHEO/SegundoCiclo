package paqueteuno;

import java.util.Scanner;
import paquetedos.Metodo.*;
import static paquetedos.Metodo.*;

public class Principal {
    
    public static void main(String[] args) {
        
        // Declaracion de Variables
        
        int n,s,d;  
        Scanner lm = new Scanner(System.in);
        
        // Presentacion del Programa
        
        presentacionPrograma();
        
        // Creacion y dimension del Array
        
        int[] array = new int[dimensionArreglo()];
        
        // LLenado del Vector 
        
        pedirDatos(array);
        presentar(array);
        
        // Procedimiento que Busca el elemento del vector 
        
        
        s = elementSearch();
        System.out.print(busquedaSecuencial(array,s));
        
        System.out.print("\nIngrese el elemnto que desea eliminar del vector: ");
        d = lm.nextInt();
        
        eliminarElemnt(array,d);
        presentar(array);
        
    }
    
    
    
}
