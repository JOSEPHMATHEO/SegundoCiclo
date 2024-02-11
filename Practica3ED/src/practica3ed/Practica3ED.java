package practica3ed;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class Practica3ED {
    
    public static void main(String[] args) {
        
        // Conttrol de excepciones
        
        try{
            
            File file = new File("C:\\Estructura de Datos Practicas\\NewFilePracttice");
           
            if (file.createNewFile()){
                
                System.out.println("Archivo creado: " + file.getName());
                
            } else{
                
                System.out.println("el archivo ya existe");
            
            }
        
            } catch (IOException lm){
                
                System.err.print("Error " + lm.getMessage()+ "\n");
            
            }
        
        
        try(FileOutputStream arch = new FileOutputStream("C:\\Estructura de Datos Practicas\\NewFilePracttice",true)){
        
            String data = "Esto es un ejemplo de Streams con Bytes\n";
            byte b[] = data.getBytes();
            arch.write(b);
            arch.flush();
            arch.close();
            
            System.out.println("Se ha escrito el archivo");
        
        }catch(IOException e){
                
                System.out.println("Error de escritura" + e.getMessage());
            
        }
        
        try {
            
            FileInputStream archv = new FileInputStream("C:\\Estructura de Datos Practicas\\NewFilePracttice");
            
            int i;
            
            while((i = archv.read())!= -1){
                
              System.out.print((char)i);
                
            }
        }catch(IOException e){
                
            System.out.println("Error de escritura");
        
        }
        
    }
        
}