package paquete2;

public class aBB {
    
    public Node root;
    
    public void add(int value){
    
        root = addRecursive(root, value);
    
    }
    
    private Node addRecursive(Node current, int value){
    
        if(current == null){
        
            return new Node(value);
            
        }
        
        if(value < current.value){
        
            current.left = addRecursive(current.left, value);
            
        }else  if (value > current.value){
            
            current.right = addRecursive(current.right, value); 
        
        }else{
            
            // El valor ya existe
            
            return current;
        }
        
        return current; // Devuelve la raiz
        
    }
    
    public void delete(int value){
    
        root = deletedRecursive(root,value);
    
    }
    
    private Node deletedRecursive(Node current, int value){
    
        if(current == null){
        
            return null;
        }
        
        if (value == current.value){
        
            // Cuando el nodo es una hoja 
            
            if(current.left == null && current.right == null){
            
                return null;
            
            }
            
            // El nodo solo tenga un hijo 
            
            if(current.right == null){
            
                return current.left;
            
            }
            
            // El nodo solo tenga un hijo 
            
            if(current.left == null){
            
                return current.right;
            
            }
            
            int biggestValue = findBiggestValue(current.left);
            current.value = biggestValue;
            current.left = deletedRecursive(current.left,biggestValue);
            return current;
            
        }
        
        if(value < current.value){
        
            current.left = deletedRecursive(current.left,value);
            return current;
        
        }
        
        current.right = deletedRecursive(current.left, value);
        return current;
    
    }
    
    private int findBiggestValue(Node root){
    
        return root.right == null ? root.value: findBiggestValue(root.right);
    }
    
    public void inOrden(Node node){
    
        if(node != null){
        
            inOrden(node.left);
            System.out.print(" " + node.value);
            inOrden(node.right);
        
        }
    
    }
    
    public void preOrden(Node node){
    
        if(node != null){
            
            System.out.print(" " + node.value);
            inOrden(node.left);
            inOrden(node.right);
        
        }
    
    }
    
    public void posOrden(Node node){
    
        if(node != null){
        
            inOrden(node.left);
            inOrden(node.right);
            System.out.print(" " + node.value);
        
        }
    
    }
    
}
