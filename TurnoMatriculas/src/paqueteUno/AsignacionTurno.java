package paqueteUno;

public class AsignacionTurno {
    
    Nodo head = null;
    
    class Nodo {
        
    
        int ticket;
        String cedula;
        Nodo next; 

        // Constructor
        
        Nodo(int a, String s){
            
        
            ticket = a;
            cedula = s;
            next = null;
            
        }
        
    }
    
    public AsignacionTurno asignarTurno(AsignacionTurno turno, int numTick, String ci ){
    
        Nodo new_node = new Nodo(numTick, ci);
        
        if(turno.head == null){
        
            turno.head = new_node;
            
        }else{
        
            Nodo last = turno.head;
            
            while(last.next != null){
            
                last = last.next;
                
            }
            
            // Insertar al final de la lista
            
            last.next = new_node;
        
        }
    
        return turno;
        
    }
    
    public AsignacionTurno eliminarTurnoAtendido(AsignacionTurno turno){
    
        Nodo currentNode = turno.head;
        
        if(currentNode != null ){
        
                turno.head = currentNode.next;
                System.err.println("\nTurno atendedido exitosamente\n");
                
                return turno;
                
        }else{
            
            System.err.println("\nSala Vacia");
            
        }
        
        return turno;
        
    }
    
    public void presentarListaAlumnos(AsignacionTurno lista){
    
        Nodo currentNode = lista.head;
        
        int i = 1;
        
        if(currentNode == null){
        
            System.err.println("\nSala Vacia\n");
        
        }else{
            
            System.out.printf("\nLista de cedulas de alumnos por Atender: \n");
            
            while(currentNode != null){

                System.out.printf("(%d)"
                        + " %s\n",
                        i,
                        currentNode.cedula);

                currentNode = currentNode.next;
                i++;

            }
        
        }
        
    }
    
}
