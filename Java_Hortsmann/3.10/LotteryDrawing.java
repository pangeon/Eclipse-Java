import java.util.Arrays;
import java.util.Scanner;

class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ile liczb chcesz wylosowaæ ? ");
        int k = in.nextInt(); // 5

        System.out.println("Jaka jest najwiêksza liczba ? ");
        int n = in.nextInt(); // 49

        // Zape³nianie tablicy liczbami
        int[] numbers = new int[n]; // 49 (od zera do 48)
        // pusta tablica z 49 elementami
        for(int i = 0; i < numbers.length; i++) { // do 48 (i < 49)
            numbers[i] = i+1; // 0-1, 1-2, 2-3, 3-4 ... 48-49 (od 1 do 49) czyli do n
            // tablica z wartoœciami od 1 do 49
        }

        // Losowanie k liczb i zapisywanie ich w drugiej tablicy
        int[] result = new int[k]; // 5
        // pusta tablica z 5 elementami
        for(int i = 0; i < result.length; i++) { // od zera do 4 (i < 5)

            // Losowanie indeksu z zakresu od 0 do n-1.
            int r = (int) (Math.random() * n); // r = losowo(0.0 - 1.0)*49 
            // Pobieranie elementu z losowej lokalizacji
            result[i] = numbers[r]; // i - (0, 4); r - (0-48)

            // Przeniesienie ostatniego elementu do losowej lokalizacji
            numbers[r] = numbers[n - 1]; //r - (0-48) = n - (0-48)
            n--; 
        }
        // Wydruk zapisanej tablicy
        Arrays.sort(result);
        System.out.println("Postaw na nastêpuj¹ce liczby. Dziêki nim zdobêdziesz bogactwo!");
        for (int r : result) {
            System.out.print(r + " ");
        }
        System.out.println();
        in.close();
    }
}