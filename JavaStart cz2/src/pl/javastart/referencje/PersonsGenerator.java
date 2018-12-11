package pl.javastart.referencje;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class PersonsGenerator {
    public static void main(String[] args) {
        List persons = generator(10, Person::new);

        for(Object o: persons) {
            System.out.println(o);
        }
    }
    private static <T> List<T> generator(int amoutPersons, Supplier<T> supplier) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < amoutPersons; i++) {
            list.add(supplier.get());
        }
        return list;
    }
}
