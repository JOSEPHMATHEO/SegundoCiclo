package paquetedos;

import java.util.Scanner;

public class Metodo {
    
    public static void presentacionPrograma(){
        
        System.out.println("==================================");
        System.out.println("Programa que Trabaja con Arreglos");
        System.out.println("==================================\n");
        
    }
    
    public static int dimensionArreglo(){
        
        // Objeto de tipo Scanner
        
        Scanner lm = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de elementos que desea tener en su vector: ");
        int n = lm.nextInt();
        
        return n;
        
    }
    
    public static void pedirDatos(int[] arreglo){
        
        // Objeto de tipo Scanner
        
        Scanner lm = new Scanner(System.in);
        
        // Peticion de datos a traves de cilo for
        
        for(int i = 0; i < arreglo.length; i++){
        
            System.out.print("Ingrese los datos del arreglo en la posicion[" + (i +1) + "]: ");
            arreglo[i] = lm.nextInt();
        
        }
        
    }
        
    public static void presentar(int[] arreglo){
        
        //Ciclo para presentar el Array
        
        System.out.println("El vector es: ");
        System.out.print("[");
        
        for(int i = 0; i < arreglo.length; i++){
            
            System.out.print(arreglo[i] + " ");
                    
        }
        
        System.out.print("]");

    }
    
    public static int elementSearch(){
        
        // Objeto de tipo Scanner
        
        Scanner lm = new Scanner(System.in);
        
        System.out.print("\nIngrese el elemnto que desea buscar en su vector: ");
        int n = lm.nextInt();
        
        return n;
        
    }
    
    
    
    public static int busquedaSecuencial(int[] arreglo, int num){
    
        for(int i = 0; i < arreglo.length; i++){
            
            if(arreglo[i] == num){
                
            return i;
            
            }  
            
        }
        
        return -1;
    }
    
    public static void eliminarElemnt(int[] arreglo, int num){
    
        int index = busquedaSecuencial(arreglo,num);
        
        if(index != -1){
            
            for(int i = index; i < arreglo.length-1; i++){
            
                arreglo[i] = arreglo[ i+1 ];
                arreglo[i + 1] = 0;
                
            }
            
        }else
            
            System.out.println("El elemnto no existe...");
    
    }
    
}