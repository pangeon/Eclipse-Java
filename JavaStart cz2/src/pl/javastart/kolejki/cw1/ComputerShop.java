package pl.javastart.kolejki.cw1;

import java.util.PriorityQueue;
import java.util.Queue;

import static pl.javastart.buildsimple.Printer.println;
import static pl.javastart.buildsimple.Printer.printd;

public class ComputerShop {
    public static void main(String[] args) {

        printd("Aktualna lista klientów przy kasie.");

        Queue<Client> list = new PriorityQueue<>(

        );

        list.offer(new Client("Radek")); // Kupuje jako piąty
        list.offer(new Client("Kuba")); // Kupuje jako trzeci
        list.offer(new Client("Aleksandra")); // Kupuje pierwsza -> nickname.length() > 7 return 1
        list.offer(new Client("Agnieszka")); // Kupuje jako ostatnia
        list.offer(new Client("Ania")); // Kupuje jako czwarta
        list.offer(new Client("Adam")); // Kupuje jako drugi
        list.offer(new Client("Małgorzat")); // Kupuje jako szósta

        println(list.peek()); // obiekt klasy

        println(list.peek().getNick() + " została wybrana jako pierwsza");
        println(list.peek().getNickLength() + " znaków");

        println(list.poll().getNick() + " dokonała zakupu płyty CD.");
        println(list.poll().getNick() + " dokonał zakupu dysku SSD.");
        println(list.poll().getNick() + " dokonał zakupu monitora.");
        println(list.poll().getNick() + " dokonała zakupu tabletu.");
        println(list.poll().getNick() + " dokonał zakupu tuszu do drukarki.");
        println(list.poll().getNick() + " dokonała zakupu klawiatury i myszki.");
        println(list.poll().getNick() + " nic nie kupiła bo było za drogo.");

        // Radek, Kuba, Aleksandra, Agnieszka, Ania, Adam, Małgorzat
        // Radek, Kuba, Agnieszka, Ania, Adam, Małgorzat
        // Radek, Kuba, Agnieszka, Ania, Małgorzat
        // Radek, Agnieszka, Ania, Małgorzat
        // Radek, Agnieszka, Małgorzat
        // Agnieszka, Małgorzat
        // Agnieszka
        // Aleksandra, Adam, Kuba, Ania, Radek, Małgorzat, Agnieszka ??

        if(list.poll() == null) {
            printd("\nEkipa zakończyła zakupy.");
        }



    }
}
