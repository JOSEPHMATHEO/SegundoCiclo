package paqueteUno;

import java.util.Scanner;

public class Ejecutor {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Creación de lista de turnos
        
        AsignacionTurno l = new AsignacionTurno();
        
        // Menú de opciones
        
        boolean interruptor = true;
        int tickets = 1;
        int numeroAtendidos = 0;
        
        while (interruptor){
           
            System.out.println("\nMENÚ DE OPCIONES:");
            System.out.println("1. Asignación de tickets: ");
            System.out.println("2. Atencion de Alumnos: ");
            System.out.println("3. Lista de los alumnos en la sala: ");
            System.out.println("4. Salir del Programa: ");
            System.out.print("\nElija su opción -> ");
            int opcion = sc.nextInt();
            
            sc.nextLine(); // Limpieza de Buffer
            
            switch (opcion){
                
                case 1:
                    
                    System.out.print("\nIngrese su cédula: ");
                    String cedula = sc.nextLine();
                    
                    l = l.asignarTurno(l,tickets,cedula);
                    System.out.print(cedula + " su turno es el " + tickets + "\n");
                    tickets++;
                    
                    break;
                    
                case 2:
                    
                    if(l.head != null)
                        
                        numeroAtendidos++;
                    
                    l = l.eliminarTurnoAtendido(l);
                    
                    break;
                    
                case 3:
                    
                    l.presentarListaAlumnos(l);
                    
                    break;
                    
                case 4:
                    
                    System.out.println("\nSe atendió "+ numeroAtendidos
                            + " alumno(s) en total");
                    System.out.println("\nSaliendo del programa...");
                    interruptor = false;
                    break;
                    
                default:
                    
                    System.out.println("\nOpción no válida");
                    System.out.println("");
            
            }
        
        }
    
    }
    
}