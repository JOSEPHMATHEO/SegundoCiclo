package practica3_b2;

public class SinglyLinkedList {
    
    class Node{
    
        int data;
        Node next;
        
        Node(int d){
        
        data = d;
        next = null;
        
        }
        
    }
    
    Node head;
    
    public SinglyLinkedList insert(SinglyLinkedList list, int d){
    
        Node new_node = new Node(d);
        
        if(list.head == null){
        
            list.head = new_node;
            
        }else{
        
            Node last = list.head;
            
            while(last.next != null){
            
                last = last.next;
                
            }
            
            // Insertar al final de la lista
            
            last.next = new_node;
        
        }
    
        return list;
    }
    
    public SinglyLinkedList delete(SinglyLinkedList list, int key){
    
        Node currentNode = list.head;
        Node prev = null;
        
        if(currentNode != null && currentNode.data == key){
        
                list.head = currentNode.next;
                System.out.println(key + " found and deleted");
                
                return list;
                
        }
        
        while(currentNode != null && currentNode.data != key){
            
            prev = currentNode;
            currentNode = currentNode.next;
            
        }
        
        if(currentNode != null){
            
            prev.next = currentNode.next;
            System.out.println(key + " found and deleted");
        }
        
        if(currentNode == null){
            
            System.out.println(key + " not found");
            
        }
        
        return list;
        
    }
    
    public void print(SinglyLinkedList list){
    
        Node currentNode = list.head;
        
        System.out.println("LinkedLits:\n");
        
        byte i = 1;
        
        while(currentNode != null){
            
            System.out.println( i + ") " + currentNode.data + "");
            currentNode = currentNode.next;
            i++;
            
            
        }
        
    }
    
}
