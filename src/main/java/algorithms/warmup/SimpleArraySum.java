package algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/simple-array-sum
 */
public class SimpleArraySum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += in.nextInt();
        }

        System.out.println(sum);
    }
}
