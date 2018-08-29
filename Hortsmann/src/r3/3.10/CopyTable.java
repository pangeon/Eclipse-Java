import java.util.Arrays;

class CopyTable {
    public static void main(String[] args) {
        int[] dark_chocolate = new int[12];
        int[] white_chocolate = dark_chocolate;
        white_chocolate[5] = 12;
        dark_chocolate[6] = 7;
        
        System.out.println(Arrays.toString(dark_chocolate));
        System.out.println(Arrays.toString(white_chocolate));

        int[] copy_dark_chocolate = Arrays.copyOf(dark_chocolate, dark_chocolate.length);
        
        System.out.println(Arrays.toString(copy_dark_chocolate));

        // wzorcowe tablice nie s¹ równe kopiowanym
        if(copy_dark_chocolate == dark_chocolate) {
            System.out.println("Tak");
        } else {
            System.out.println("Nie");
        }
        if(dark_chocolate.equals(copy_dark_chocolate)) {
            System.out.println("Tak");
        } else {
            System.out.println("Nie");
        }

        if(dark_chocolate == white_chocolate) {
            System.out.println("Tak");
        } else {
            System.out.println("Nie");
        }
        if(dark_chocolate.equals(white_chocolate)) {
            System.out.println("Tak");
        } else {
            System.out.println("Nie");
        }

    }
}