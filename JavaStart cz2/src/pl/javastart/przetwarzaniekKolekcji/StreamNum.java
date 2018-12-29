package pl.javastart.przetwarzaniekKolekcji;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamNum {
    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.iterate(0, x -> x + 1);
        List<Integer> squareList = numStream.map(x -> x * x).limit(100).collect(Collectors.toList());
        Set<Integer> biggerThanFive = squareList.stream().filter(x -> x%10 == 0).map(x -> x/10)
                .collect(Collectors.toCollection(TreeSet<Integer>::new));

        System.out.println("List");
        squareList.forEach(x -> System.out.print(x + ";"));
        System.out.println("\nSet");

        //  strumień nie operuje na oryginalnych wartościach kolekcji, więc elementy listy podzielne przez 10
        //  nadal mają wartości takie jak 100, 400, ... a w zbiorze te wartości wynoszą 10, 40, ...
        biggerThanFive.forEach(x -> System.out.print(x + ";"));
    }
}
