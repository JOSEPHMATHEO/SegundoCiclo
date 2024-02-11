import paquete2.*;

public class Ejecutor {
    
    public static void main(String[] args) {
        
        aBB arbolito = new aBB();
        
        arbolito.add(49);
        arbolito.add(30);
        arbolito.add(60);
        arbolito.add(20);
        arbolito.add(35);
        arbolito.add(15);
        arbolito.add(33);
        arbolito.add(37);
        arbolito.add(31);                                                  
        arbolito.add(34);
        
        System.out.println("Arbol Binario de Busqueda 1 \n");
        
        System.out.println("---InOrden---");
        arbolito.inOrden(arbolito.root);
        
        System.out.println("\n\n---PreOrden---");
        arbolito.preOrden(arbolito.root);
        
        System.out.println("\n\n---PostOrden---");
        arbolito.posOrden(arbolito.root);
        System.out.println("");
        
        arbolito.delete(5);
        arbolito.delete(10);
        arbolito.delete(2);
        
        System.out.println("\nArbol Binario de Busqueda 2");
        System.out.println("\nArbol sin el nodo 5, 10, 2");
        
        System.out.println("\n---InOrden---");
        arbolito.inOrden(arbolito.root);
        
        System.out.println("\n\n---PreOrden---");
        arbolito.preOrden(arbolito.root);
        
        System.out.println("\n\n---PostOrden---");
        arbolito.posOrden(arbolito.root);
        System.out.println("");
        
    }
    
}
