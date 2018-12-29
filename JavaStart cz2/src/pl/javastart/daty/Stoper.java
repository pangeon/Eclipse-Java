package pl.javastart.daty;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Scanner;

public class Stoper {
    public static void main(String[] args) {
        try {
            stoper(stoperClicker());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (DateTimeException e) {
            System.out.println("Przekraczono dopuszczalny zakres - 86400");
        }
    }
    public static int stoper(int secondTime) throws InterruptedException {

        int hourTime = 0;
        int minuteTime = 0;
        int counter = secondTime;

        while(secondTime > 59) {
            secondTime = secondTime - 60;
            minuteTime++;
        }
        while (minuteTime > 59) {
            minuteTime = minuteTime - 60;
            hourTime++;
        }
        LocalTime timeStart = LocalTime.of(hourTime, minuteTime, secondTime);
        for (int i = 0; i < counter; i++) {
            System.out.println(timeStart);
            timeStart = timeStart.minusSeconds(1);
            Thread.sleep(1000);
        }
        return timeStart.getSecond();
    }
    public static int stoperClicker() {
        try(Scanner in = new Scanner(System.in)) {
            System.out.println("Start enter:");
            in.nextLine();
            Instant start = Instant.now();

            System.out.println("Stop enter:");
            in.nextLine();
            Instant stop = Instant.now();

            Duration duration = Duration.between(start, stop);
            System.out.println("Czas trwania akcji: " + duration.getSeconds() + " sec");
            return (int) duration.getSeconds();
        }
    }
}
