import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.SuppressWarnings;

class Switch {
    
    @SuppressWarnings("fallthrough") /* ignoruje ostrzerzenia przy kompilacji -Xlint:fallthrough */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Wybierz liczb� od 1 do 4");
        try {
            int a = in.nextInt();
            switch(a) {
                case 1:
                System.out.println("Wybra�e� 1");
                //break;
                case 2:
                System.out.println("Wybra�e� 2");
                //break;
                case 3:
                System.out.println("Wybra�e� 3");
                //break;
                case 4:
                System.out.println("Wybra�e� 4");
                //break;
                default:
                System.out.println("Nie wybra�e� poprawnej liczby !");
                //break;
            }
        } catch (InputMismatchException e) {
            System.out.println("B��d ! Musisz wybra� liczb� ca�kowit� !");
            System.out.println("Wy��cznie typ: Integer");
        }
        in.close();

        /* javac -Xlint:fallthrough Switch.java 
           kompilator sprawdzi gdzie brakuje break
        */
    }
}

