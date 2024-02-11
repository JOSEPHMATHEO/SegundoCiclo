package practica3.pkg1_bim2;

public class Ejecutor {
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        DoubleLinkedList dList = new DoubleLinkedList();
        
        System.out.println("--Elemntos de la Lista--\n");
        dList.insert(5);
        dList.insert(2);
        dList.insert(3);
        dList.insert(14);
        dList.insert(1);
        
        dList.print();
        System.out.println("\n");
        
        dList.eliminar2( dList,5);
        dList.eliminar2( dList,2);
        dList.eliminar2( dList,3);
        dList.eliminar2( dList,14);
        dList.eliminar2( dList,1);
        
        System.out.println("\n--Elemntos de la Lista--\n");
        
        dList.print();
        System.out.println("");
        
    }
    
}
