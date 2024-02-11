package practica3.pkg1_bim2;

public class DoubleLinkedList {

    class Nodo {

        int data;
        Nodo previous;
        Nodo next;

        public Nodo(int d) {
            
            data = d;
            previous = null;
            next = null;
            
        }
        
    }

    Nodo head = null;
    Nodo tail = null;

    public void insert(int data) {
        
        Nodo nuevo = new Nodo(data);
        
        if (head == null) {
            
            head = tail = nuevo;
            head.previous = tail;
            tail.next = head;
            
        } else {
            
            tail.next = nuevo;
            nuevo.previous = tail;
            tail = nuevo;
            tail.next = head;
            head.previous = tail;
            
        }
    }
    
    public DoubleLinkedList eliminar(DoubleLinkedList list , int key){
    
        Nodo actual = list.head;
        Nodo prev = null;
        
        while(actual != null){
        
                if(actual.data == key){
                    
                    if(actual == head){
                    
                        head = head.next;
                        head.previous = null;
                    
                    }else{
                    
                        prev.next = actual.next;
                        actual.next.previous = actual.previous;
                        System.out.println("\n"+ key +" encontrado y eliminado");
                        return list;
                    }
                    
                }
                
            prev = actual;   
            actual = actual.next;
        }
        
        return list;
        
    } 

    public void print() {
        
        Nodo current = head;
        if (head == null) {
            System.out.println("Lista está vacía");
            return;
        }
        System.out.println("Nodes de doble linked: ");
        while (current != null) {
            if (current.next != head) {
                System.out.print(current.data + " ");
                current = current.next;
            } else {
                System.out.print(current.data + " ");
                return;
            }
        }
        System.out.println("\n");
    }
    
    public DoubleLinkedList eliminar2(DoubleLinkedList list , int key){
    
        Nodo currNodo = list.head;
        Nodo prev = null;
        
        if(currNodo != null && currNodo.data == key) {
            head = currNodo.next;
            head.previous = currNodo.previous;
            tail.next = head;
            currNodo.next = null;
            currNodo.previous = null;
            System.out.println("\n"+ key +" encontrado y eliminado");
            return list;
        }
        
        while(currNodo != null && currNodo.data != key) {
            prev = currNodo;
            currNodo = currNodo.next;
        }
        
        if(currNodo != null) {
            prev.next = currNodo.next;
            currNodo.next.previous = currNodo.previous;
            currNodo.next = null;
            currNodo.previous = null;
            
            if(currNodo.next == head) {
                tail = prev;
            }
            
            System.out.println("\n"+ key +" encontrado y eliminado");
        }
        
        if(currNodo == null) {
            System.out.println("\n"+ key +" no encontrado");
        }
        
        return list;
    
    }    
}