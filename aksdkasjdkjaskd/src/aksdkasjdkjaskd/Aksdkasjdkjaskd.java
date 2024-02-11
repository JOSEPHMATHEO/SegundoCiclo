package aksdkasjdkjaskd;
import java.util.Scanner;
public class Aksdkasjdkjaskd {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Filas Columna
        
        System.out.println("Ingrese el número de filas y columnas de la primera Matriz: ");
        System.out.print("Filas --> ");
        int filas_A = teclado.nextInt();
        
        System.out.print("Columnas --> ");
        int colunmas_A = teclado.nextInt();
        
        // matriz A 
        int matriz_A[][] = new int[filas_A][colunmas_A];
        for (int f = 0; f < filas_A; f++) {
            for (int c = 0; c < colunmas_A; c++) {
                System.out.println("Ingrese un valor para la posición ["+f+"]["+c+"]");
                matriz_A[f][c] = teclado.nextInt();
            }
        }
        
        // Filas Columna
        
        System.out.println("Ingrese el número de filas y columnas de la segunda Matriz: ");
        System.out.print("Filas --> ");
        int filas_B = teclado.nextInt();
        System.out.print("Columnas --> ");
        int colunmas_B = teclado.nextInt();
        
        // matriz B
        
        int matriz_B[][] = new int[filas_B][colunmas_B];
        for (int f = 0; f < filas_B; f++) {
            for (int c = 0; c < colunmas_B; c++) {
                System.out.println("Ingrese un valor para la posición ["+f+"]["+c+"]");
                matriz_B[f][c] = teclado.nextInt();
            }
        }
        
        // producto matriz 

        System.out.println("------------------------------");
        if (colunmas_A == filas_B) {
            
            System.out.println("MATRIZ A X MATRIZ B = MATRIZ C");
            System.out.println("(A)");
            
            for (int f = 0; f < filas_A; f++) {
                for (int c = 0; c < colunmas_A; c++) {
                    System.out.print(matriz_A[f][c]+"\t");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("X");
            System.out.println();
            System.out.println("(B)");
            for (int f = 0; f < filas_B; f++) {
                for (int c = 0; c < colunmas_B; c++) {
                    System.out.print(matriz_B[f][c]+"\t");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("||");
            System.out.println();
            System.out.println("(C)");
            
            int matriz_C[][] = new int[filas_A][colunmas_B];
            int suma_mult = 0;
            
            for (int f = 0; f < filas_A ; f++) {
                
                for (int c = 0; c < colunmas_B; c++) {
                    
                    for (int i = 0; i < filas_B; i++) {
                        
                        suma_mult = suma_mult + (matriz_A[f][i] * matriz_B[i][c]);
                        
                    }
                    
                    matriz_C[f][c] = suma_mult;
                    suma_mult = 0;
                    System.out.print(matriz_C[f][c] +"\t");
                }
                
                System.out.println();
                
            }
            
            
        }else {
            System.out.println("LAS MATRICES INGRESADAS NO SE PUEDEN MULTIPLICAR");
        }
    }
}