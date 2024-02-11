package practica2bim2;

/**
 * Autores: @Luis Morales @Santiago Riofrio
 */

import java.util.Scanner;

public class Practica2Bim2 {
    public static void main(String[] args) {
        
        // Declaracion de Datos

        Scanner lm = new Scanner(System.in);
        boolean condicion = true;
        
        Vecino vecino1 = new Vecino();
        Vecino vecino2 = new Vecino("11025781089","propia");
        Vecino vecino3 = new Vecino("49461365958","arriendo");
        Vecino vecino4 = new Vecino("11025629565","propia");
        
        while(condicion){
            
            System.out.printf("\n%s\n\n%s\n%s\n%s\n%s\n\n%s",
                    "--Menu de Opciones--",
                    "1) Modificar Todos los Datos: ",
                    "2) Modificar Todos los Vecino: ",
                    "3) Mostrar Datos: ",
                    "4) Salir del Programa ",
                    "Elija una opcion: ");
        
            int opcion = lm.nextInt();
            
            lm.nextLine(); // Limpiar Buffer
            
            switch(opcion){

                case 1: 
                    
                    System.out.printf("\n%s\n\n%s\n%s\n%s\n%s\n\n%s",
                            "--Opciones de Modificacion--",
                            "1) Modificar Datos del 1° vecino",
                            "2) Modificar Datos del 2° vecino",
                            "3) Modificar Datos del 3° vecino",
                            "4) Modificar Datos del 4° vecino",
                            "Elija una opcion: ");

                    int opcion1 = lm.nextInt();
                    lm.nextLine(); // Limpiar Buffer
                    
                    switch (opcion1) {

                        case 1:

                            System.out.print("\nIngrese la nueva cedula del 1° vecino: ");
                            String cedula = lm.nextLine();

                            System.out.print("Ingrese el nuevo tipo de Casa del 1° vecino: ");
                            String tipo = lm.nextLine();

                            vecino1.modificarDatos(cedula,tipo);

                            break;

                        case 2:

                            System.out.print("\nIngrese la nueva cedula del 2° vecino: ");
                            cedula = lm.nextLine();

                            System.out.print("Ingrese el nuevo tipo de Casa del 2° vecino: ");
                            tipo = lm.nextLine();
                            
                            vecino2.modificarDatos(cedula,tipo);
                            
                            break;
                            
                        case 3:

                            System.out.print("\nIngrese la nueva cedula del 3° vecino: ");
                            cedula = lm.nextLine();

                            System.out.print("Ingrese el nuevo tipo de Casa del 3° vecino: ");
                            tipo = lm.nextLine();

                            vecino3.modificarDatos(cedula,tipo);
                            
                            break;
                         
                        case 4:

                            System.out.print("\nIngrese la nueva cedula del 4° vecino: ");
                            cedula = lm.nextLine();

                            System.out.print("Ingrese el nuevo tipo de Casa del 4° vecino: ");
                            tipo = lm.nextLine();

                            vecino4.modificarDatos(cedula,tipo);
                            
                            break;

                        default:
                            
                            System.out.println("\nOpcion incorrecta...");
                    }

                    break;

                case 2: 

                    vecino1.modificarVecino(vecino2);
                    vecino2.modificarVecino(vecino3);
                    vecino3.modificarVecino(vecino4);

                    break;

                case 3: 
                    
                    System.out.printf("\n%s\n\n%s\n%s\n%s\n%s\n\n%s",
                            "--Opciones de Presentacion--",
                            "1) Mostar Datos del 1° vecino",
                            "2) Mostar Datos del 2° vecino",
                            "3) Mostar Datos del 3° vecino",
                            "4) Mostar Datos del 4° vecino",
                            "Elija una opcion: ");

                    int opcion2 = lm.nextInt();
                    lm.nextLine(); // Limpiar Buffer
                    
                    switch (opcion2) {

                        case 1:

                            vecino1.mostrarDatos();

                            break;

                        case 2:

                            vecino2.mostrarDatos();
                            
                            break;
                            
                        case 3:

                            vecino3.mostrarDatos();
                            
                            break;
                         
                        case 4:

                            vecino4.mostrarDatos();
                            
                            break;

                        default:
                            
                            System.out.println("\nOpcion incorrecta...");
                            
                             break;
                             
                    }
                    
                    break;

                case 4: 

                    System.err.println("Saliendo del programa");
                    condicion = false;

                    break;

                default: 

                    System.err.println("Opcion invalida!");

                    break;
                    
            }
            
        }
        
    }
    
}
