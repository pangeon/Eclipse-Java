package pl.javastart.collections.ex1;

import java.util.*;

/**
Napisz program, który będzie symulował program typu "totolotek". Napisz klasę Lotto, która przechowuje listę. Powinna posiadać metody:

    generate() - wygeneruje do listy liczby od 1 do 49
    randomize() - wymiesza elementy na liście (pierwsze sześć liczb na liście to wynik losowania)
    checkResult(List<Integer> numbers) - sprawdza ile liczb z listy podanej jako argument pokrywa się z pierwszymi sześcioma elementami "losowania"

Wczytaj od użytkownika sześć liczb i przetestuj działanie aplikacji.
-------------------------------------------------------------------------------
Metody Collections:
 - binarySearch() - w zadanej (posortowanej) liście wyszukuje element podany jako drugi argument
 - copy() - pozwala skopiować wszystkie elementy jednej listy do innej
 - fill() - podmienia wszystkie elementy podanej listy obiektem przekazanym jako drugi argument
 - frequency() - zlicza ilość wystąpień w kolekcji zadanego obiektu
 - min() / max() - zwraca najmniejszą lub największą wartość w kolekcji (zgodnie z naturalnym porządkiem lub przekazanym komparatorem)
 - reverse() - odwraca kolejność elementów w liście
 - shuffle() - miesza elementy w liście
 - swap() - zamienia miejscami dwa elementy w liście

 */
public class Lotto {

    private List totolist = new LinkedList();

    List generate(int start, int end) {
        int i = start;
        while(i <= end) {
            totolist.add(i);
            i++;
        }
        System.out.println("Generate list:");
        printTotoList(totolist);

        return totolist;
    }
    List randomize() {
        Collections.shuffle(totolist);
        System.out.println("\nRandomize list:");
        printTotoList(totolist);
        printTotoList(totolist, 6);

        return totolist;
    }
    static void printTotoList(List list) {
        for(int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j) + " ");
        }
        System.out.println("\nList size: " + list.size());
    }
    static void printTotoList(List list, int numIndex) {
        System.out.println("\n" + numIndex + " initial elements of entire list.");
        for(int j = 0; j < numIndex; j++) {
            System.out.print(list.get(j) + " ");
        }

    }
    int checkResult(List<Integer> userList, int subStart, int subEnd) {
        List<Integer> lottoResult = totolist.subList(subStart, subEnd);

        System.out.println("\nResult of the draw:");
        for(Integer num: lottoResult) {
            System.out.print(num + " ");
        }
        System.out.println();

        int found = 0;
        for(int i = subStart; i < subEnd; i++) {
            if(lottoResult.contains(userList.get(i))) {
                found++;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        List<Integer> userList = new LinkedList<>();

        System.out.println("Draw 6 number:");
        try(Scanner in = new Scanner(System.in)) {
            int numbers = 6;
            while (numbers > 0) {
                System.out.println("Enter another number:");
                userList.add(in.nextInt());
                in.nextLine();
                numbers--;
            }
        }

        Lotto lotto = new Lotto();
        lotto.generate(1, 49);
        lotto.randomize();
        int found = lotto.checkResult(userList, 0, 6);
        System.out.println("Hit numbers: " + found);
    }
}
