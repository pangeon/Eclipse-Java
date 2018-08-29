public class Final {

    static final int y = 5;

    public static void main(String[] args) {
        final short x = 3;
        System.out.println(x);
        {
            int z = y + x;
            System.out.println(z);
        }
        int z = 5; // z zdefiniowane przed blokiem daje błąd
        System.out.println(z);
    }
}