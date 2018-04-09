import java.lang.ArithmeticException;

public class Variables {
    public static void main(String\u005B\u005D args) {
        int i = 500000000;
        long l = 10454;
        float f = 679.87f;
        double d = 7685465458.98867868d;
        short s = -5647;
        byte b = 127;
        boolean bu = true;


        System.out.println("Wartrosci zmiennych:");
        System.out.println("int i =" + i);
        System.out.println("long l = "+ l);
        System.out.println("float f = "+ f/0);
        System.out.println("double d = " + d/0);
        System.out.println("short s =" + s);
        System.out.println("byte b = " + b);
        System.out.println("boolean bu = " + bu);

        /* nie rzuca wyjątku przy liczbach zmiennoprzecinkowych */

        if (f/0 == Double.POSITIVE_INFINITY) {
            System.out.println("Przekroczyles wartosc dodatnia");
        } 
        if (-f/0 == Double.NEGATIVE_INFINITY) {
            System.out.println("Przekroczyles wartosc ujemna");
        }
        try {
            i /= 0;
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by O");
        } finally {
            System.out.println("To jest liczba: " + f/0);
        }
    }
}