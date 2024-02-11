package evaluacionestructuradedatos;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class EvaluacionEstructuraDeDatos {
    
    public static void main(String[] args) {
        
        // Presentacion del Programa
        
        System.out.println("======================================== ");
        System.out.println("Programa que Encuesta a 'n' Estudiantes ");
        System.out.println("=========================================");
        
        // Creacion de objeto tipo Scanner
        
        Scanner lm = new Scanner(System.in);
        
        // Declaracion de Variables 
        
        int n;
        String cedula;
        String nombre;
        String answer;
        byte edad;
        byte asignature;
        
        //Ingreso de Datos 
        
        System.out.print("Digite el numero de estudiantes a los cuales desea encuestar: ");
        n = lm.nextInt();
        lm.nextLine();
        
        // Creacion de objeto tipo File
        
        try{
            
            File fileEncuesta = new File("C:\\Estructura de Datos Practicas\\EstructuraDeDatos\\EvaluacionEstructuraDeDatos\\Estudiantes.txt");
            
            if (fileEncuesta.createNewFile()){
                
            System.out.println("Archivo creado: " + fileEncuesta.getName());
            
            } else{
                
            System.err.println("El archivo ya existe! ");
            
            }
            
        }catch(Exception m){
        
            System.err.println("Error!... " + m.getMessage());
        
        }
        
        // Ciclo for para ingreso de Preguntas 
        
        for(int i = 0; i < n; i++){
                
                System.out.print("\nIngrese numero de cedula: ");
                cedula = lm.nextLine();
                
                System.out.print("Ingrese sus nombres y Apellidos: ");
                nombre = lm.nextLine();
                
                System.out.print("Cual es su edad?: ");
                edad = lm.nextByte();
                lm.nextLine();
                
                System.out.print("Ingrese el numero de asignaturas que esta cursando el presente periodo: ");
                asignature = lm.nextByte();
                lm.nextLine();
                
                System.out.print("Esta satisfecho con la carrera?: ");
                answer = lm.nextLine();
                
                
            // Ingreso de Datos en el Archivo

            try(FileWriter myWriter = new FileWriter("C:\\Estructura de Datos Practicas\\EstructuraDeDatos\\EvaluacionEstructuraDeDatos\\Estudiantes.txt",true)) {

                // Ciclo for para el controlar el numero de pregunntas 
                
                myWriter.write("\nDatos del "+(i+1)+" Estudiantes: \n");
                
                myWriter.write("\nCedula: " + cedula);
                myWriter.write("\nNombres y Apellidos: " + nombre);
                myWriter.write("\nCual es su edad?: " + edad);
                myWriter.write("\nIngrese el numero de asignaturas que esta cursando el presente periodo: " + asignature);
                myWriter.write("\nEsta satisfecho con la carrera?: " + answer + "\n");
                
                myWriter.close();

            }catch(IOException e){

                System.err.println("Error!... " + e.getMessage() );

            }
            
        }
            
        // Lectura de Datos del Archivo 

        try(FileReader myReader = new FileReader ("C:\\Estructura de Datos Practicas\\EstructuraDeDatos\\EvaluacionEstructuraDeDatos\\Estudiantes.txt")){

            // Declaracion de variable

            int x;

            // Ciclo para imprimir los datos del archivo 

            while ((x = myReader.read())!= -1){

                System.out.print((char)x);

            }

        }catch(IOException e){

            System.out.println("Error!... " + e.getMessage());

        }
    
    } 
    
    
    
}