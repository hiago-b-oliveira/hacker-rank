package algorithms.DynamicProgramming;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/fibonacci-modified
 * Difficulty: Medium
 */
public class FibonacciModified {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger t0 = in.nextBigInteger();
        BigInteger t1 = in.nextBigInteger();
        int n = in.nextInt();

        BigInteger tn = null;

        for (int i = 2; i < n; i++) {
            tn = t0.add(t1.pow(2));
            t0 = t1;
            t1 = tn;
        }
        System.out.println(tn);
    }
}
