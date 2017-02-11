package algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/equality-in-a-array
 */
public class EqualizeTheArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numberCount = new int[101];
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            numberCount[in.nextInt()]++;
        }

        int sum = Arrays.stream(numberCount).sum();
        int max = Arrays.stream(numberCount).max().getAsInt();

        System.out.println(sum - max);
    }
}
