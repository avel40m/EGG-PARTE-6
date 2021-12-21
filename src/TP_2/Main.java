package TP_2;

public class Main {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        
        try {
            for (int i = 0; i < 6; i++) {
                numeros[i]=2;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error dimension del arreglo " + e.getMessage());
        }
        
        
    }

}
