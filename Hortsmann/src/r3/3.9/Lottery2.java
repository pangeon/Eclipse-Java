import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

class Lottery2 {
    public static void print(Object o) {
        System.out.println(o);
    }
    public static void printf(String s, Object o) {
        System.out.printf(s, o);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        print("Ile liczba ma byæ wylosowanych ? ");
        int k = in.nextInt();

        print("Jaka jest górna granica przedzia³u losowanych liczb ? ");
        int n = in.nextInt();

        /*
        * Obliczanie wspó³czynnika dwumianowego n*(n–1)*(n–2)*…*(n–k+1)/(1*2*3*…*k)
        */

        //int chance = 1; odpowiednik 
        BigInteger chance = BigInteger.valueOf(1);

        for (int i = 1; i <= k; i++) {
            //chance = chance * (n-i + 1) / i; odpowiednik
            chance = chance.multiply(BigInteger.valueOf(n - i + 1).divide(BigInteger.valueOf(i)));
        }
        BigDecimal probability = new BigDecimal(chance);
        BigDecimal p = BigDecimal.valueOf(1);
        print("Twoje szanse to 1 do " + chance + ". Powodzenia.");
        // Podaje sposób zakr¹glenia i liczbê miejsc po przecinku
        printf("Prawdopodobieñstwo takiego zdarzenia wynosi: %2.25f", p.divide(probability, 25, RoundingMode.HALF_UP));
        in.close();
    }
}