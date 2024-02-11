package arbolesbinariosexpo;

public class Arbol {
    
    NodoArbol inicial;
    
    public Arbol(){
    
        inicial = null;
    
    }
    
    public void ingresar(int dato){
    
        if(inicial == null){
        
            inicial = new NodoArbol(dato);
        
        }else{
        
            inicial.insertar(dato);
        
        }
    
    }
    
    
}
