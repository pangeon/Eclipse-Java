package pl.javastart.lambda.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
Napisz aplikację, w której z wykorzystaniem klasy Random i wyrażenia lambda wygenerujesz 10 losowych liczb (interfejs Supplier).
Wyświetl listę na ekranie również wykorzystując wyrażenia lambda (interfejs Consumer).

Następnie napisz metodę, która usunie z listy wszystkie liczby podzielne przez 2
(użyj iteratora i własnej metody wykorzystującej interfejs Predicate).

Ponownie wyświetl wynik na ekranie.
 */
public class GenNumber {
    public static void main(String[] args) {
        /* ustalam zasady podczas definiowania funkcji, predykat to taki x gdzie f(x) = x/2 należy do
        * zbioru liczb całkowitych parzystych xeC & (x/2 != 0) */
        List<Integer> list = deleteParity(generator(new ArrayList<>(), 10), x -> x % 2 == 0);

        /* konieczna jest pętla by wypisać wartości */
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print("["+ i +"] " + list.get(i) + ", ");
        }
        System.out.println();
        /* ustalam w jaki sposób wypisze wartości, które nie są zwracane */
        foreach(deleteParity(generator(new ArrayList<>(), 10), x -> x % 2 == 0), x -> System.out.print(x + " "));

        /* w przypadku wielu wywołań funkcji czytelność spada
        obiekty są tworzone podczas wywołania funkcji, po czym stają się zbędne zależy nam tylko na wyniku */
        System.out.println();
        foreach(funcGenerator(new ArrayList<>(), 10, () -> new Random().nextInt(10)), x -> System.out.print(x + " "));

    }
    public static List<Integer> generator(List<Integer> integerList, int range) {
        Random random = new Random();
        int i = 0;
        while (i < range) {
            integerList.add(random.nextInt(range));
            System.out.print("["+ i +"] " + integerList.get(i) + ", ");
            i++;
        }
        return integerList;
    }
    public static List<Integer> funcGenerator(List<Integer> integerList, int range, Supplier<Integer> supplier) {
        for(int i = 0; i < range; i++) {
            integerList.add(supplier.get());
        }
        return integerList;
    }
    public static <Integer> void foreach(List<Integer> integerList, Consumer<Integer> consumer) {
        for(Integer element: integerList) {
            consumer.accept(element);
        }
    }
    public static List<Integer> deleteParity(List<Integer> integerList, Predicate<Integer> predicate) {
        Iterator<Integer> iterator = integerList.iterator();

        while(iterator.hasNext()) {
            int number = iterator.next();
            if (predicate.test(number)) {
                iterator.remove();
            }
        }
        return integerList;
    }

}
