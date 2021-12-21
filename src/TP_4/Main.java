package TP_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = 0, cont = 0, contE = 0;
        int numeroAleatorio = (int) (Math.random() * 500);

        do {
            try {
                System.out.println("Introduce un número");
                n = leer.nextInt();

                if (numeroAleatorio > n) {
                    System.out.println("El número a adivinar es mayor");
                } else if (numeroAleatorio < n) {
                    System.out.println("El númerop a adivinar es menor");
                }
                cont++;
            } catch (InputMismatchException e) {
                System.out.println("Debe ser un número");
                contE++;
                leer.next();
            }
        } while (numeroAleatorio != n);
        
        System.out.println("El número era " + numeroAleatorio);
        System.out.println("Cantidad de veces que no se adivino " + cont);
        System.out.println("Cantidad de ERRORES " + contE);

    }

}
