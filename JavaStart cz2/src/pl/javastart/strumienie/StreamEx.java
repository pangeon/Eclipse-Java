package pl.javastart.strumienie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<String> sList = Stream.of("adam", "Radek", "agnieszka", "ALEKSANDRA", "Jakub");
        Stream<Integer> numStream = Stream.iterate(0, x -> x + 1);
        List<Integer> squareNumbers = numStream.map(x -> x*x).limit(100).collect(Collectors.toList());


        // Stream<Integer> stream = numbers.stream()
        // nie musimy deklarować strumienia jako osobnej zmiennej i możemy na nim operować "w locie".
        list = list.stream()
                            .filter(x -> x % 2 == 0)
                            .filter(x -> x > 5)
                            // lub .filter(x -> x%2 == 0 && x>5);
                            //.collect(Collectors.toList());
                            /**
                             * @see Collectors
                            Metoda collect() zwraca strumień w postaci kolekcji wybranego typu Collectora.
                            W klasie Collectors zdefiniowane są metody, zwracające obiekt zgodny z interfejsem Collector
                            Jeżeli chcemy zwrócić kolekcję konkretnego typu możemy posłużyć
                            się ogólniejszą metodą toCollection() i przekazać jej jako argument referencję na konstruktor
                             */
                            .collect(Collectors.toCollection(ArrayList::new));
        // forma konstrukcji for-each, pozwalająca wykonać wyrażenie lambda na każdym z elementów.
        list.forEach(System.out::println);

        sList.map(String::toUpperCase).peek(System.out::println).collect(Collectors.toList());
        squareNumbers.forEach(x -> System.out.print(x + " "));








    }
}
