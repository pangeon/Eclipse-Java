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

        print("Ile liczba ma by� wylosowanych ? ");
        int k = in.nextInt();

        print("Jaka jest g�rna granica przedzia�u losowanych liczb ? ");
        int n = in.nextInt();

        /*
        * Obliczanie wsp�czynnika dwumianowego n*(n�1)*(n�2)*�*(n�k+1)/(1*2*3*�*k)
        */

        int chance = 1;
        for (int i = 1; i <= k; i++) {
            chance = chance * (n-i + 1) / i;
        }
        double probability = (double) 1/chance;
        print("Twoje szanse to 1 do " + chance + ". Powodzenia.");
        printf("Prawdopodobie�stwo takiego zdarzenia wynosi: %5f", probability);
    }
}