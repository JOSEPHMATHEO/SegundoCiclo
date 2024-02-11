package practica4ed;
import java.util.Scanner;

public class Practica4ED {
    public static void main(String[] args) {
        
        // Decalracion de Variables 
        
        Scanner lm = new Scanner(System.in);
        int [] myArray = new int[5];
        int n,index;
        // Presentacion del Programa
        
        System.out.println("Programa que compara el elemento dentro de un arreglo");
        System.out.println("=====================================================");
        
        // Ingreso de Datos 
        
        System.out.print("\nIngrese el numero que desea comparar: ");
        n = lm.nextInt();
        
        // Procedimiento 
        
        for(int i = 0; i < myArray.length; i++ ){
        
            myArray[i] = i;
        
        }
        
        // Salidad de Datos 
        
        ElementDelete(myArray,n);
        
       for(int i = 0; i < myArray.length; i++){
       
           System.out.print(myArray[i] + "\t");
           
       }
        
    }
    
    public static int PresentarArreglo(int arr[], int elem){
        
        // Procedimiento 
    
        for(int i = 0; i < arr.length; i++){
        
            if (arr[i] == elem){
            
                return i;
                
            }
        
        }
    
        return -1;
    }
    
    public static void ElementDelete(int arr[], int index){
        
        // Procedimiento 
    
        if(index != -1){
            
            int i = index;
            for(;i < arr.length - 1; i++){
            
                arr[i] = arr[i+1];
            
            }
            
            arr[i]= 0;
            
        }
        
    }
    
}
