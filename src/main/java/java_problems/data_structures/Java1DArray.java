package java_problems.data_structures;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-1d-array
 * Difficulty: Medium
 */
public class Java1DArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] a = new int[n];


            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            boolean isPossible = solve(0, n, m, a);
            System.out.println((isPossible) ? "YES" : "NO");
        }
    }

    private static boolean solve(int currentIndex, int n, int m, int[] a) {
        System.out.println(currentIndex);
        a[currentIndex] = 1; // visited

        if (currentIndex + 1 >= n || currentIndex + m >= n) {
            return true;
        }
        if (currentIndex - 1 > 0 && a[currentIndex - 1] == 0) {
            if (solve(currentIndex - 1, n, m, a)) {
                return true;
            }
        }
        if (a[currentIndex + 1] == 0) {
            if (solve(currentIndex + 1, n, m, a)) {
                return true;
            }
        }
        if (a[currentIndex + m] == 0) {
            if (solve(currentIndex + m, n, m, a)) {
                return true;
            }
        }
        return false;
    }
}