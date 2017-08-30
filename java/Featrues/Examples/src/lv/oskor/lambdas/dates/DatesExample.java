package lv.oskor.lambdas.dates;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by Oleg Skorobogatov on 16.07.2017.
 */
public class DatesExample {
    public static void main(String[] args) {
        Instant i1 = Instant.now();
        System.out.print("ddddddddddddddd`");
        Instant i2 = Instant.now();


        System.out.println("IIII "+ Duration.between(i1, i2));

    }
}
