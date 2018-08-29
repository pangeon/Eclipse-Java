import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.SuppressWarnings;

class Switch {
    
    @SuppressWarnings("fallthrough") /* ignoruje ostrzerzenia przy kompilacji -Xlint:fallthrough */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Wybierz liczbê od 1 do 4");
        try {
            int a = in.nextInt();
            switch(a) {
                case 1:
                System.out.println("Wybra³eœ 1");
                //break;
                case 2:
                System.out.println("Wybra³eœ 2");
                //break;
                case 3:
                System.out.println("Wybra³eœ 3");
                //break;
                case 4:
                System.out.println("Wybra³eœ 4");
                //break;
                default:
                System.out.println("Nie wybra³eœ poprawnej liczby !");
                //break;
            }
        } catch (InputMismatchException e) {
            System.out.println("B³¹d ! Musisz wybraæ liczbê ca³kowit¹ !");
            System.out.println("Wy³¹cznie typ: Integer");
        }
        in.close();

        /* javac -Xlint:fallthrough Switch.java 
           kompilator sprawdzi gdzie brakuje break
        */
    }
}

