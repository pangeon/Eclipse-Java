import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        /* 3.7.1 */
        System.out.println("3.7.1");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jakie masz imiê i nazwisko ?");
        String firstName = scanner.next();
        String name = scanner.next();
        
        System.out.println("Ile masz lat ?");
        int age = scanner.nextInt();

        System.out.println("Witaj " + firstName + " " + name + ". " + "W przysz³ym roku bêdziesz mieæ " + (++age) + " lata.");

        /**
         * tworzenie pliku -jar
         * 
         * jar cfm Input.jar manifest.txt Input.class
           java -jar Input.jar
         */
    }
}