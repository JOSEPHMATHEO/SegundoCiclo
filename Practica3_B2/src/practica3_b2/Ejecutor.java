package practica3_b2;

public class Ejecutor {
    
    public static void main(String[] args) {
        
        SinglyLinkedList list = new SinglyLinkedList();
        
        list = list.insert(list,3);
        list = list.insert(list,8);
        list = list.insert(list,1);
        
        System.out.println("--Lista--");
        list.print(list);
        
        System.out.println("\n--Eliminacion de un Numero en la Lista--\n");
        list = list.delete(list, 3);
        list = list.delete(list, 8);
        list = list.delete(list, 1);
        
        System.out.println("\n--Nueva Lista--");
        list.print(list);
        
    }
    
}
