class Operatory {
    public static strictfp void main(String[] args) {

        /* inkrementacja */

        long m = 1;
        byte n = 1;

        double v = 2 * ++m;
        float r = 2 * n++;
        System.out.println(v);
        System.out.println(r);
        System.out.println(n + m);

        /* bitowe */

        byte bajt = 0b1111; // 1111
        System.out.println(bajt);
        bajt >>= 2; // 1100
        byte bajt2 = 0b1111; // 1111
        int bajt3 = ~(0b0000); /// ??? https://pl.wikipedia.org/wiki/Kod_uzupe%C5%82nie%C5%84_do_dw%C3%B3ch 
        System.out.println(bajt3);
        System.out.println("Bajty");
        System.out.println("Bajt 1: " + "00" + Integer.toBinaryString(bajt)); // 1100
        System.out.println("Bajt 2: " + Integer.toBinaryString(bajt2)); // 1111
        System.out.println("Wykluczajace: " + Integer.toBinaryString(bajt ^ bajt2)); // 1100
        System.out.println("Alternatywa: " + Integer.toBinaryString(bajt | bajt2)); // 1111
        System.out.println("Negacja " + Integer.toBinaryString(bajt3)); // 11111111111111111111111111111111
        System.out.println("Suma " + "00" + Integer.toBinaryString(bajt & bajt2)); // 0011
    }
}