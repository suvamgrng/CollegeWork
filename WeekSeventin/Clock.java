package WeekSeventin;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Clock {
    public static void main(String[] args) throws InterruptedException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        while(true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            // Step 1 - get current time
            LocalTime now = LocalTime.now();

            // Step 2 - format it
            String time = now.format(formatter);

            // Step 3 - print it
            System.out.println("\r" + time);

            // Step 4 - wait 1 second
            Thread.sleep(1000);

        }
    }
}
