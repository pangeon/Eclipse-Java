package pl.javastart.przetwarzaniekKolekcji;

/*
W załączniku znajduje się plik z tekstem lorem ipsum. Wczytaj wszystkie słowa osobno do listy słów,
a następnie wykorzystując strumienie:
         -usuń wszystkie przecinki i kropki doklejone do słów
         -wyświetl liczbę słów rozpoczynających się literą "s" oraz ile słów składa się z 5 znaków.

Podpowiedzi:
        -Napis można podzielić wywołując na nim metodę split(), np: "ala basia, kasa".split(" ")
        -Pierwszy znak Stringa można sprawdzić posługując się metodą charAt(0)
        -Do kolekcji można dodawać całe tablice obiektów przekształcając je wcześniej na listę za pomocą metody Arrays.asList(dowolnaTablica[])
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TextProcessor {
    public static void main(String[] args) {
        //read("text.txt");
        try {
            System.out.println("Etap 1:");
            getStringList("text.txt").forEach(x -> System.out.print(x + " "));
            System.out.println("\nEtap 2:");
            getStringList("text.txt")
                    .stream()
                    .map(x -> x.replaceAll(",", "").replaceAll("\\.", ""))
                    .collect(Collectors.toList())
                    .forEach(x -> System.out.print(x + " "));
            System.out.println("\nEtap 3:");
            long countS = getStringList("text.txt")
                    .stream()
                    .filter(x -> x.startsWith("s"))
                    .peek(x -> System.out.print(x + " "))
                    .count();
            System.out.println("\nEtap 4:");
            long countFiveLetter = getStringList("text.txt")
                    .stream()
                    .filter(x -> x.length() == 5)
                    .peek(x -> System.out.print(x + " "))
                    .count();
            System.out.println("\nEtap 5:");
            System.out.println("Liczba wyrazów na 's': " + countS);
            System.out.println("Liczba wyrazów z 5 literami: " + countFiveLetter);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void read(String fileName) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String textLine = bufferedReader.readLine();
            do {
                System.out.println(textLine);
                textLine = bufferedReader.readLine();
            } while(textLine != null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static List<String> getStringList(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        List<String> words = new ArrayList<>();
        String tmp;

        while((tmp = bufferedReader.readLine()) != null) {
            words.addAll(Arrays.asList(tmp.split(" ")));
        }
        return (ArrayList<String>) words;
    }

}
