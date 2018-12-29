package pl.javastart.daty;

import java.time.Duration;
import java.time.Instant;

public class TimeTester {
    public static void main(String[] args) {
        Instant i1 = Instant.now();
        for (int i = 1; i < 100000000; i++) {
            double temp = i*i/Math.pow(i, i);
        }
        Instant i2 = Instant.now();
        Duration duration = Duration.between(i1, i2);
        System.out.println("Time: " + duration.getNano()/1000000 + " sec");
        System.out.println("Time: " + duration.getSeconds() + " sec");
        System.out.println("Time: " + duration.getNano()/1000 + " ms");
        System.out.println("Time: " + duration.getNano() + " ns");
    }
}
