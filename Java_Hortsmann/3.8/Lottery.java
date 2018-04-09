import java.util.Scanner;

class Lottery {
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

        int chance = 1;
        for (int i = 1; i <= k; i++) {
            chance = chance * (n-i + 1) / i;
        }
        double probability = (double) 1/chance;
        print("Twoje szanse to 1 do " + chance + ". Powodzenia.");
        printf("Prawdopodobieñstwo takiego zdarzenia wynosi: %5f", probability);
    }
}