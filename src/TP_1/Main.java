
package TP_1;

public class Main {


    public static void main(String[] args) {
        Persona persona = null;
        
        try {
            persona.esMayorEdad();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
