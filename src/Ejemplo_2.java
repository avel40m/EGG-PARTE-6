
public class Ejemplo_2 {

    private static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println("El valor a finalizar el try es " + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("42");
            System.out.println("El valor a finalizar el catch " + valor);
        } finally {
            valor = valor + 1;
            System.out.println("El valor afinalizar el finally " + valor);
        }
        valor = valor + 1;
        System.out.println("El valor antes del return " + valor);
        return valor;
    }

    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.out.println("Exception en metodo()");
            e.printStackTrace();
        }
    }
}
