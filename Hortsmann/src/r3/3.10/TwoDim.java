import java.util.Arrays;

class TwoDim {
    /**
     * Metoda potrzebna by posortowaæ wszystkie elementy tablic w tablicy dwuwymiarowej
     * samych tablic jako kolejnych elementów du¿ej tablicy nie sortuje
     */
    public static void sortTwoDim(double tab[][]) {
        for(int i = 0; i < tab.length; i++) {
            Arrays.sort(tab[i]);
        }
    }
    public static void main(String[] args) {
        int[] tab = {20, 10, 15, 5, 25, 30, 35, 50, 45, 40};
        String[] stringTab = {"Jacek", "Placek", "Wacek", "Agatka", "Józef", "Tatuœ Zosi", "As", "Ola", "Madzia", "Gacek"};
        double[][] doubleTab = {
            {3.4, 7.99, Math.PI},
            {Math.E, 6.606, 45.8},
            {0, 0.1, Math.PI*2}
        };

        System.out.println("Niesortowane:");
        System.out.println("tab = " + Arrays.toString(tab));
        System.out.println("stringTab = " + Arrays.toString(stringTab));
        System.out.println("doubleTab = " + Arrays.deepToString(doubleTab));

        // sortowanie QuickSort
        Arrays.sort(tab);
        Arrays.sort(stringTab);
        //Arrays.sort(doubleTab[0]);
        //Arrays.sort(doubleTab[1]);
        //Arrays.sort(doubleTab[2]);

        sortTwoDim(doubleTab);

        System.out.println("Posortowane:");
        System.out.println("tab = " + Arrays.toString(tab));
        System.out.println("stringTab = " + Arrays.toString(stringTab));
        System.out.println("doubleTab = " + Arrays.deepToString(doubleTab));

        int num = Arrays.binarySearch(stringTab, "Tadzik"); // sprawdza posortowan¹ tablice stringTab
        if(num >= 0) {
            System.out.println("stringTab [" + num + "] = " + stringTab[num]);
        } else {
            System.out.println("Nie ma takiej wartoœci w tablicy");
            Arrays.fill(stringTab, null);
        }
        System.out.println("Zresetowana tablica:");
        System.out.println(Arrays.toString(stringTab));

    }
}