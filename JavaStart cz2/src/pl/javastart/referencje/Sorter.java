package pl.javastart.referencje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
Stwórz listę 5 imion w losowej kolejności. Korzystając z metody Collections.sort() oraz referencji do metody
String.compareToIgnoreCase() posortuj ją w porządku rosnącym, a następnie wyświetl wynik na ekranie.
 */

public class Sorter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("radek");
        list.add("Agnieszka");
        list.add("JAKUB");
        list.add("adam");
        list.add("Ola");

        Collections.sort(list);
        consume(list, System.out::println);
        System.out.println();
        Collections.sort(list, Sorter::compare);
        consume(list, System.out::println);

        /* Istnieje szybsza metoda, nie trzeba tworzyć osobnych metod:

        Collections.sort(list, String::compareToIgnoreCase);

        for(String name: names) {
			System.out.println(name);
		}
         */

    }
    private static <T> void consume(List<T> list, Consumer<T> consumer) {
        for(T o:list) {
            consumer.accept(o);
        }
    }
    private static int compare(String o, String s) {
        return o.compareToIgnoreCase(s);
    }


}
