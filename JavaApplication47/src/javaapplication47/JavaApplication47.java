/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication47;

import java.util.Scanner;

/**
 *
 * @author JosephMatheo
 */
public class JavaApplication47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Llamado a escaner
        
        Scanner sc = new Scanner(System.in);
        
        // creacion de variables
       
        String resp;
        int si = 1, no = 1, i = 0;
        String res[] = new String[10];
        
        // Interfaz y arreglo
        
        System.out.println("Vuelos de Avion Loja - Quito");
       
        // Arreglo 
       
            while(i <= res.length-1){
                
                System.out.println("Usted fuma?: ");
                resp = sc.nextLine();
                
                if(resp.equals("Si")|| resp.equals("si") ){
                    
                    if(si <= 5){
                
                    System.out.println("Ingrese su numero de cedula: ");
                    res[i] = sc.nextLine();
                    
                    si = si + 1;
                    
                    i = i + 1;
                
                    }else{
                        
                       System.out.println("No existen mas puestos disponibles para fumadores"); 
                        
                    } 
                    
                }else{
                    
                    if(resp.equals("No") || resp.equals("no")){
                     
                        if(no <= 5){
                
                            System.out.println("Ingrese su numero de cedula: ");
                            res[i] = sc.nextLine();
                    
                        no = no + 1;
                        i = i + 1;
                
                    }else{
                        
                       System.out.println("No existen mas puestos disponibles para no fumadores"); 
                        
                    } 
                            
                    }
                    
                }
                
            }
            
            for(i = 0; i <= res.length-1;i++){
                
                System.out.print(res[i]+" ");
            
            }
    }
}
 