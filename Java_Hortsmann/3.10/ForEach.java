import java.util.Arrays;

class ForEach {
    public static void main(String[] args) {
        int [] a = new int[3]; // trzy elementy od indeksach od zera
        int b[] = new int[2];
        String[] names = new String[4];
        boolean[] bool = new boolean[2];
        System.out.println("Pocz¹tek:");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(bool));

        int j = 0;
        for (int var : a) {
            System.out.println("a" + "["+j+"] = " + a[var]);
            j++;
            // blok if musi zostaæ wykonany po j++;
            if (j % 2 == 0) {
                a[var] = 1;
            }
        }
        int i = 0;
        while (i <= 1) {
            System.out.println("b" + "["+i+"] = " + b[i]);
            ++i;
        }
        for(int k = names.length-1; k >= 0; k--) {
            if (k % 2 <= 1) names[k] = ""; // warunek jest spe³niony zawsze
            System.out.println("names" + "["+k+"] = " + names[k]);
            if (names[k].isEmpty()) System.out.println("S¹ puste " + k); // pusty czyli "" nie null !!!
            
        }
        int l = 0;
        do {    
            System.out.println("bool" + "["+l+"] = " + bool[l]);
            l++;
        } while (l <= 1);
        System.out.println("Koniec:");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(bool));
        
    } 
    
}