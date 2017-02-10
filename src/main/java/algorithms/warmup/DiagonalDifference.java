package algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference
 */
public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int d1Sum = 0;
        int d2Sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int next = in.nextInt();
                if (i == j) {
                    d1Sum += next;
                }
                if (j == (n - 1) - i) {
                    d2Sum += next;
                }
            }
        }
        System.out.println(Math.abs(d1Sum - d2Sum));
    }
}
