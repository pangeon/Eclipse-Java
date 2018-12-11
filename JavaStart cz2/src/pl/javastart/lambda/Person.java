package pl.javastart.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Person {
    private String firstName;
    private String secondName;
    private int age;

    private int getAge() {
        return age;
    }
    private void setAge(int age) {
        this.age = age;
    }
    private Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Imię: " + firstName + "\nNazwisko: " + secondName + "\nWiek: " + age;
    }
    public static void main(String[] args) {
        List<Person> personsList = new ArrayList();
        personsList.add(new Person("Kamil", "Cecherz", 33));
        personsList.add(new Person("Agnieszka", "Lasota", 45));
        personsList.add(new Person("Radosław", "Ignasiak", 47));
        personsList.add(new Person("Aleksandra", "Bugajak", 37));
        personsList.add(new Person("Jakub", "Pacyniak", 41));
        personsList.add(new Person("Anna", "Just", 34));

        consumeList(personsList, p -> System.out.println(p));
        System.out.println(">>>");
        applyToList(personsList, p -> {
            p.setAge(p.getAge() + 1);
            return p;
        });
        consumeList(personsList, p -> System.out.println(p));
        System.out.println(">>>");
        filterByPredicate(personsList, p -> p.getAge() > 40);

        System.out.println("Generated number:");
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        generate(integerList, 10, () -> random.nextInt(1000));
        for(int i: integerList) {
            System.out.print(i + " ");
        }
    }
    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for(T t: list) {
            consumer.accept(t);
        }
    }
    private static <T> void applyToList(List<T> list, Function<T, T> function) {
        for(int i = 0; i < list.size(); i++) {
            list.set(i, function.apply(list.get(i)));
        }
    }
    private static <T> void filterByPredicate(List<T> list, Predicate<T> predicate) {
        for (T t:list) {
            if(predicate.test(t)) {
                System.out.println("This person is older than rest group.");
                System.out.println(t);
            }
        }
    }
    private static <T> void generate(List<T> list, int gen, Supplier<T> supplier) {
        for(int i = 0; i < gen; i++) {
            list.add(supplier.get());
        }
    }
}
