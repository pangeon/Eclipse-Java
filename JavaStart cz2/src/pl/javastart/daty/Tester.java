package pl.javastart.daty;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tester {
    public static void main(String[] args) {
        Instant actualTime = Instant.now();
        Instant time1970mili = Instant.ofEpochMilli(900000000000l);
        Instant time1970sec = Instant.ofEpochSecond(1546093107);
        System.out.println("Aktualny czas: " + actualTime);
        System.out.println("Czas od początku 1970 roku: " + actualTime.getNano()  + " ns");
        System.out.println("Czas od początku 1970 roku: " + actualTime.getEpochSecond()  + " sec");
        System.out.println("Data od początku 1970 roku: " + time1970mili);
        System.out.println("Data od początku 1970 roku: " + time1970sec);

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDateTime nowDate = LocalDateTime.now();
        System.out.println(nowDate);
        System.out.println(nowDate.getYear());
        System.out.println(nowDate.getMonth());
        System.out.println(nowDate.getDayOfWeek());
        System.out.println(nowDate.getDayOfYear());

        LocalDateTime date2 = LocalDateTime.of(2018, 12, 31, 12, 30, 45);
        System.out.println(date2);



    }
}
