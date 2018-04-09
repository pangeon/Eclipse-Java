import java.util.Scanner;
import java.util.InputMismatchException;

class Switch2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Wybierz liczbê od 1 do 10");
        
   
        try {
            int x = in.nextInt();
            while(x >= 1 ) { // 1, 2, 3, 4, 5...
                    read_if:        
                    if(x % 2 == 0) { // 2, 4, 6, 8...
                        for (int i = 1; i >= 1; i++) {
                            x += i; 
                            if(x >= 30) {
                                System.out.println("Warunek C: " + x);
                                break read_if;
                            }  
                            System.out.println("Warunek A: " + x);
                        }
                    } else {
                        System.out.println("Warunek B: " + x);
                        break;
                    }
            }
        } catch (InputMismatchException e) {
            System.out.println("Wpisz dobre dane g³upku !");
        }
        in.close();
    }
}

