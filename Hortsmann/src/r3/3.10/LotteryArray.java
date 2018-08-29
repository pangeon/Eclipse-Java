import java.util.Arrays;

class LotteryArray {
    public static void main(String[] args) {
        final int NUM_MAX = 12;

        // Tworzenie tablicy tr�jk�tnej
        int[][] chances = new int[NUM_MAX + 1][];
        System.out.println("Tworzenie pustej tablicy tablic:");
        for(int n = 0; n <= NUM_MAX; n++) {
            chances[n] = new int[n+1]; 
            // chances[0] = new int[1];
            // chances[1] = new int[2];
            // ...
            // chances[12] = new int[13];
            System.out.println(Arrays.toString(chances[n]));
            
        }
        System.out.println("Ilo�� rz�d�w: " + chances.length); // rz�dy
         
        // Zape�nianie tablicy tr�jk�tnej
        System.out.println("D�ugo�� kolejnych wierszy: ");
        for(int n = 0; n < chances.length; n++) {
            for(int k = 0; k < chances[n].length; k++) {
                // Obliczenie wsp�czynnika dwumianowego n*(n�1)*(n�2)*�*(n�k+1)/(1*2*3*�*k).
                int lotteryChance = 1;
                for(int i = 1; i <= k; i++) {
                    lotteryChance = lotteryChance * (n-i+1) / i;
                }
                chances[n][k] = lotteryChance;       
            }
            System.out.print(chances[n].length + " ");
            if (n == chances.length-1) {
                System.out.println();
            }
        }
        System.out.println("Drukowanie warto�ci z tablicy tablic: ");
        // Drukowanie tablicy tr�jk�tnej
        for (int row[] : chances) {
            for (int chance : row) {
                System.out.printf("%4d", chance);
            }
            System.out.println();
        }
    }
}