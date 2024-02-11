package practica1bim2;

public class Practica1Bim2 {
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        Persona personaA;
        Persona personaB;
        
        personaA = new Persona("Ana",22);
        personaB = new Persona("Juan",22);
        
        System.out.print("personaA: " + personaA + "\n");
        System.out.print("personaB: " + personaB + "\n");
        
        Persona personaC;
        personaC = new Persona("Kevin",22);
        
        System.out.print("personaC: " + personaC + "\n");
        
        personaC = personaA;
        
        System.out.print("personaC: " + personaC + "\n");
        
        personaA.cambiarDatos("Luis Morales",21);
        personaA.mostrarDatos();
        
        
    }
    
}
