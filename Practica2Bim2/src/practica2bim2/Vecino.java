package practica2bim2;

/**
 * Users GitHub: Luis Morales - JosephMatheo
 *               Santiago Riofrio - santyago0
 */

public class Vecino {
    
    String cedula;
    String tipo;
    Vecino vecino;
    
    public Vecino(){
    
        cedula = "11045896234";
        tipo = "arriendo";
        vecino = null;
        
    }
    
    // Constructir que recibe parametos
    
    public Vecino(String s, String n){
    
        cedula = s;
        tipo = n;
        vecino = null;
    
    }
            
    public void modificarDatos(String a, String b){
    
        cedula = a;
        tipo = b;
        
    }        
    
    public void modificarVecino(Vecino v){
    
        vecino = v;
    
    }
            
    public void mostrarDatos(){
    
        System.out.printf("\nCedula: %s\n"
                + "Tipo de Casa: %s\n"
                + "Vecino: %s\n",
                cedula,
                tipo,
                vecino);
    
    }
    
}
