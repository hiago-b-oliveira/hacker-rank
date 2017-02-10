package algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/a-very-big-sum
 */
public class AVeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        long sum = 0;

        for (int i = 0; i < size; i++) {
            sum += in.nextLong();
        }

        System.out.println(sum);
    }
}
