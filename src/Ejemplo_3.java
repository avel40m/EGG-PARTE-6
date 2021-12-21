public class Ejemplo_3 {
    private static int metodo(){
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println("Valor final del try " + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("W");
            System.out.println("Valor a finalizar el catch " + valor);
        }finally{
            valor = valor + 1;
            System.out.println("Valor a finalizar finally " + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return " + valor);
        return valor;
    }
    
    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.out.println("Exception en el metodo()");
            e.printStackTrace();
        }
}
}
