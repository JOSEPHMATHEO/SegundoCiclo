package practica2ed;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practica2ED {
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        System.out.println("Hello World!");
        
        try{
            
            File file = new File("C:\\Users\\UTPL\\Desktop\\algo\\estudiantes.txt");
           
            if (file.createNewFile()){
            System.out.println("Archivo creado: " + file.getName());
            } else{
            System.out.println("el archivo ya existe");
            }
        
            } catch (IOException e){
            System.out.println("error");
            
            }
    
    
        try(FileWriter myWriter = new FileWriter("C:\\Users\\UTPL\\Desktop\\algo\\estudiantes.txt",true)) {
            
            myWriter.write("\nEjemplo de escritura en un archivo usando Write");
            myWriter.append("\nAQUI se agrego una nueva linea");
            myWriter.close();
            
            System.out.println("El archivo a sido escrito");
            
        }catch(IOException e){
    
            System.out.println("Error de escritura");
            
        }
        
        //Leemos el archivo 
        
        System.out.println("Leemos el archivo\");
        
        try(FileReader myReader = new FileReader ("C:\\Users\\UTPL\\Desktop\\algo\\estudiantes.txt")){
            int i;
            while ((i = myReader.read())!= -1){
                
              System.out.print((char)i);
                
            }
            
        }catch(IOException e){
    
        System.out.println("Error de escritura");
    
        }
        
    }
    
}