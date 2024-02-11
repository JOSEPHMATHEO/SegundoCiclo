package javaapplication25;

import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication25 {
    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        int tmn;

        //Ingreso de datos
        System.out.println("\tORDENAR NUMEROS DE MENOR A MAYOR");
        System.out.println("---------------------------------------------");
        System.out.print("Ingrese el tamaño del vector: ");
        tmn = sc.nextInt();
        
        int [] lista_numeros = new int[tmn];
        
        //Llenado del vector
        for (int i = 0; i < tmn; i++) {
            System.out.print("Ingrese el numero "+ (i+1) + ": ");
            lista_numeros[i] = sc.nextInt();
        }
        
        //lista_numeros = OrdenarVector(lista_numeros);
        System.out.println("\nLos numeros ordenados de menor a mayor son : " );
        System.out.println(Arrays.toString(OrdenarVector(lista_numeros)));

    }
    public static int[] OrdenarVector(int x[]) {
        
        int aux;
        
        for (int lim = x.length-1; lim >= 1; lim--) {
            for (int i = 0; i <= lim - 1; i++) {
                if (x[i] > x[i+1]) {
                    aux = x[i];
                    x[i] = x[i+1];
                    x[i+1] = aux;
                }
                
            }
            
        }
        
        return x;
        
    }
    
}