package pl.javastart.lambda;

public class OwnInterfaceMain {

    public static void main(String[] args) {
        Integer num = 0;
        num = incrValue(
                incrValue(
                        incrValue(num, x -> x + 1),
                        x -> x + 1),
                x -> x + 1);
        System.out.println(num);

        int i = inc(inc(inc(0)));
        System.out.println(i);
    }
    private static <T> T incrValue(T t, Incremental<T> incremental) {
        return incremental.incr(t);
    }
    private static int inc(int start) {
        Integer num = start;
        num = incrValue(num, x -> x + 1);
        return num;
    }
}
