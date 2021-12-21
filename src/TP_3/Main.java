package TP_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DivisionNumero dn = new DivisionNumero();
        Scanner leer = new Scanner(System.in);
        
        try {
            System.out.println("Ingrese el numero 1");
            dn.setNumero1(leer.next());
            System.out.println("Ingrese el numero 2");
            dn.setNumero2(leer.next());
            
            int n1 = Integer.parseInt(dn.getNumero1());
            int n2 = Integer.parseInt(dn.getNumero2());
            
            double d = n1 / n2;
        } catch (InputMismatchException e) {
            System.out.println("No se ingreso valores correctos");
        }catch(NumberFormatException e){
            System.out.println("Error no son numeros enteros");
        }catch(ArithmeticException e){
            System.out.println("No se pudo hacer la division");
        }
        
        
    }
    
}
