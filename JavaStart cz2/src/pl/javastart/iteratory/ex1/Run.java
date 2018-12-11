package pl.javastart.iteratory.ex1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
Napisz prosty program, w którym do mapy przypiszesz pięć opisowych wartości w postaci obiektów typu String,
które przechowywać będą informacje w formie "Imię Nazwisko - Wiek". Kluczami powinny być nazwiska tych osób.

Za pomocą iteratora i pętli while wyświetl wszystkie dostępne w mapie wartości. Powinny być one posortowane alfabetycznie
według nazwisk. Dane nie muszą być wczytywane od użytkownika, możesz je wprowadzić bezpośrednio w kodzie,
jednak nie mogą być one dodawane w kolejności alfabetycznej.
 */

public class Run {
    public static void main(String[] args) {
        Map<String, DataStore> map = new HashMap<>(); // NIE sortuje alfabetycznie po wartości klucza
        Map<String, String> treeMap = new TreeMap<>(); // sortuje alfabetycznie po wartości klucza

        /* użycie TreeMap zamiast HashMap jest możliwe w przypadku zdefiniowanego obiektu map */
        map.put("Koniarek", new DataStore("Marek", "45"));
        map.put("Warecki", new DataStore("Jarek", "85"));
        map.put("Mistera", new DataStore("Anna", "22"));
        map.put("Sulima", new DataStore("Artur", "54"));
        map.put("Araszewski", new DataStore("Zenon", "99"));
        map.put("Lewandowski", new DataStore("Leonid", "29"));

        /* użycie toString() jest koniecznie by zrzutować typ obiektowy na String */
        treeMap.put("Koniarek", new DataStore("Marek", "45").toString());
        treeMap.put("Warecki", new DataStore("Jarek", "85").toString());
        treeMap.put("Mistera", new DataStore("Anna", "22").toString());
        treeMap.put("Sulima", new DataStore("Artur", "54").toString());
        treeMap.put("Araszewski", new DataStore("Zenon", "99").toString());
        treeMap.put("Lewandowski", new DataStore("Leonid", "29").toString());

        /* source: https://www.geeksforgeeks.org/iterate-map-java/ */
        Iterator<Map.Entry<String, DataStore>> iterDataStore = map.entrySet().iterator();
        while (iterDataStore.hasNext()) {
            Map.Entry<String, DataStore> entry = iterDataStore.next();
            System.out.println("Klucz: " + entry.getKey() + " | " + entry.getValue());
        }

        System.out.println("<------------------->");

        /* source: https://javastart.pl/ */

        /*
        values(), która zwraca obiekt typu Collection, a interfejs ten posiada metodę iterator(), który będzie
        w tym przypadku sparametryzowany typem String.
         */
        Iterator<String> iterTreeDataStore = treeMap.values().iterator();
        while (iterTreeDataStore.hasNext()) {
            System.out.println(iterTreeDataStore.next()); // nie wyświetlam kluczy ale wartości przypisane do kluczy

            /* stąd nie widzę kolejności alfabetycznej
               imię: Marek, wiek: 45
               imię: Leonid, wiek: 29
               imię: Anna, wiek: 22
               imię: Artur, wiek: 54
               imię: Jarek, wiek: 85
             */
        }

    }
}
