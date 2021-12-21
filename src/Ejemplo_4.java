
public class Ejemplo_4 {

    public static int division() throws ArithmeticException {
        int division;

        division = 20 / 0;

        return division;
    }

    public static void main(String[] args) {
//        try {
//            System.out.println(division());
//        } catch (ArithmeticException e) {
//            System.out.println("Error: Division por 0");
//        }

        System.out.println(division());
    }
}
