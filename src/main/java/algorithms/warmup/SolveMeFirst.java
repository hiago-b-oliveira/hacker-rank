package algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/solve-me-first
 */
public class SolveMeFirst {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }

    private static int solveMeFirst(int a, int b) {
        return a + b;
    }
}
