package pl.javastart.buildsimple;

public class Printer {
    public static void print(Object o) {
        System.out.print(o);
    }
    public static void print(String s) {
        System.out.print(s);
    }
    public static void println(Object o) {
        System.out.println(o);
    }
    public static void println(String s) {
        System.out.println(s);
    }
    public static void printt(Object o, String separator) {
        System.out.print(o);
        System.out.print(separator);
    }
    public static void printt(String s, String separator) {
        System.out.print(s);
        System.out.print(separator);
    }
    public static void printd(String o) {
        System.out.println(o);
        for(int i = 0; i < o.length(); i++) {
            System.out.print("*");
        }
        System.out.println("\n");
    }
    public static void err(Object o) {
        System.err.println(o);
    }
}
