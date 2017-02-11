package algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/circular-array-rotation
 */
public class CircularArrayRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        for (int a0 = 0; a0 < q; a0++) {
            int m = in.nextInt();

            int shiftedIndex = (m - k) % n;
            shiftedIndex = (shiftedIndex < 0) ? n + shiftedIndex : shiftedIndex;
            shiftedIndex = (shiftedIndex < 0) ? 0 : shiftedIndex;

            System.out.println(a[shiftedIndex]);
        }
    }
}
