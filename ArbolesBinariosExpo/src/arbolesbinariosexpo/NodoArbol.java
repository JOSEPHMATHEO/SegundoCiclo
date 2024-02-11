package arbolesbinariosexpo;

public class NodoArbol {
    
    int valor;
    NodoArbol nodoIzquierdo;
    NodoArbol nodoDerecho;
    
    public NodoArbol(int d){
    
        valor = d;
        nodoIzquierdo = null;
        nodoDerecho = null;
        
    }
    
    public void insertar(int dato){
    
        if(dato < valor){
        
            if(nodoIzquierdo == null){
            
                nodoIzquierdo = new NodoArbol(dato);
            
            }else{
            
                nodoIzquierdo.insertar(dato);
            
            }
        
        }else{
        
            if(nodoDerecho == null){
            
                nodoDerecho = new NodoArbol(dato);
                
            }else{
                
                nodoDerecho.insertar(dato);
                
            }
             
        }
    
    
    }
    
}
