package pl.javastart.iteratory;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;
import static pl.javastart.buildsimple.Printer.println;

public class BeerTree {
    public static void main(String[] args) {
        Set<String> beers = new TreeSet<>();
        beers.add("Tyskie");
        beers.add("Książece");
        beers.add("Desperados");
        beers.add("EB");
        beers.add("Okocim");
        beers.add("Akademickie");

        Iterator<String> beerIter = beers.iterator();

        while (beerIter.hasNext()) {
            String beer = beerIter.next();
            println(beer);
        }

    }


}
