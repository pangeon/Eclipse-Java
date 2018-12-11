package bed;

import java.util.ArrayList;
import java.util.List;

class Dziekanat {
    private Oceny oceny; // null
    private String przedmiot;

    Dziekanat(String wykladowca, String nazwaPrzedmiotu, int... czastkoweStopnie) {
        oceny = new Oceny(wykladowca, czastkoweStopnie);
        przedmiot = nazwaPrzedmiotu;
    }
    void wysw() {
        System.out.println("oceny: " + oceny + "przedmiot: " + przedmiot);
    }
    class Oceny {
        private List<Integer> czastkoweStopnie; // null
        private String wykladowca; // null

        Oceny(String wykladowca, int... args) {
            czastkoweStopnie = new ArrayList<>();
            for (int arg : args) {
                czastkoweStopnie.add(arg);
            }
            this.wykladowca = wykladowca;
        }
        private double liczSrednia() {
            int sumaStopni = 0;
            int i = 0;
            int iloscStopni = czastkoweStopnie.size();
            while (i < czastkoweStopnie.size()) {
                sumaStopni += czastkoweStopnie.get(i);
                i++;
            }
            return (double) sumaStopni/iloscStopni;

        }
        @Override
        public String toString() {
            return czastkoweStopnie + " wykładowca: " + wykladowca + "\nśrednia ocen: " + liczSrednia() + " ";
        }
    }



}
