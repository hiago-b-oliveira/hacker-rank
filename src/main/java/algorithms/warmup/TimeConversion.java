package algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/time-conversion
 */
public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        Integer hour = Integer.valueOf(line.substring(0, 2));
        Integer minute = Integer.valueOf(line.substring(3, 5));
        Integer second = Integer.valueOf(line.substring(6, 8));

        String signal = line.substring(8, 10);

        if (signal.equals("PM")) {
            System.out.printf("%02d:%02d:%02d\n", (hour == 12) ? 12 : hour + 12, minute, second);
            return;
        }

        if (signal.equals("AM")) {
            System.out.printf("%02d:%02d:%02d\n", (hour == 12) ? 0 : hour, minute, second);
            return;
        }
    }
}
