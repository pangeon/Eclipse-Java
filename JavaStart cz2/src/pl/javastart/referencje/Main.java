package pl.javastart.referencje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        print("Test", x -> System.out.println(x));
        print(generate(10), x -> System.err.println(x));
        print("Test", System.out::println);
        print(generate(10), System.err::println);

        String[] names = {"Adam", "Jacek", "Martyna", "Zenon", "Sabina", "Leonardo", "Bolesław"};
        Arrays.sort(names, Main::asc);

        printArr(new String[]{"Adam", "Jacek", "Martyna", "Zenon", "Sabina", "Leonardo", "Bolesław"}, x -> System.out.print(x + " "));
        System.out.println();

        System.out.println("\nPosortowana:");
        printArr(names, x -> System.out.print(x + " "));
        Arrays.sort(names, Main::desc);

        System.out.println();
        System.out.println("\nPosortowana odwrotnie:");
        printArr(names, x -> System.out.print(x + " "));


    }
    private static <T> void print(T o, Consumer<T> cons) {
        cons.accept(o);
    }
    private static <T> void printArr(T[] array, Consumer<T> cons) {
        for(T t: array) {
            cons.accept(t);
        }
    }
    private static int asc(String s, String o) {
        return s.compareTo(o);
    }
    private static int desc(String s, String o) {
        return o.compareTo(s);
    }
    private static List<Integer> generate(int initValue) {
        List<Integer> randomList = new ArrayList<>();
        int init = 0;

        while (init < initValue) {
            randomList.add(new Random().nextInt(initValue));
            init++;
        }
        return randomList;

    }
}
