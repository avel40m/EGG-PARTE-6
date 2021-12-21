
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Ejemplo_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            comprobarMail();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void comprobarMail() throws Exception{
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su correo");
        String mail = leer.next();
        
        if (mail.length() > 3) {
            System.out.println("El mail ingresado correctamente");
        } else {
            throw new Exception("El mail tiene que tener más de 3 caracter");
        }
    }
}
