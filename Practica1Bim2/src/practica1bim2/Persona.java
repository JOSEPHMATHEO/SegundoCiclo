package practica1bim2;

public class Persona {
    
    String nombre;
    int edad;
    
    public Persona(String n, int e){
    
        nombre = n;
        edad = e;
    
    }
    
    public void cambiarDatos(String newN, int newE){
        
        nombre = newN;
        edad = newE;
        
    }
    
    public void mostrarDatos(){
    
        System.out.printf("Nombre: %s\n"
                          + "Edad: %d\n",
                        nombre,
                        edad);
    
    }
    
    /*@Override
    public String toString() {
    
        String cadena = "";
    
    return cadena;
    }*/
}
