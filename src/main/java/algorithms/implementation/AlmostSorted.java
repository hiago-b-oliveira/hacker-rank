package algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/almost-sorted
 * Difficulty: Medium
 */
public class AlmostSorted {

    static int[] array;
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        array = new int[n];
        for (int A_i = 0; A_i < n; A_i++) {
            array[A_i] = in.nextInt();
        }

        int firstSwapped = -1;
        int lastSwapped = -1;
        int swapPair = -1;
        boolean swapping = false;

        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                if (firstSwapped == -1) {
                    firstSwapped = i;
                    swapping = true;
                }
                if (swapping) {
                    lastSwapped = i + 1;
                } else {
                    if (lastSwapped - firstSwapped > 1 || swapPair != -1) {
                        // There are more than one segment unsorted, so it's not possible
                        System.out.println("no");
                        return;
                    } else {
                        swapPair = i + 1;
                    }

                }
            } else {
                swapping = false;
            }
        }

        if (firstSwapped == -1) {
            // already sorted!
            System.out.println("yes");
            return;
        }

        if (swapPair != -1) {
            if (between(firstSwapped, swapPair - 1, swapPair + 1)
                    && between(swapPair, firstSwapped - 1, firstSwapped + 1)) {
                System.out.printf("yes\nswap %d %d", firstSwapped + 1, swapPair + 1);
                return;
            } else {
                System.out.println("no");
                return;
            }
        }

        // Check if segment fits in array
        if (!(firstSwapped == 0 || array[firstSwapped - 1] < array[lastSwapped])) {
            System.out.println("no");
            return;
        }
        if (!(lastSwapped == n - 1 || array[firstSwapped] < array[lastSwapped + 1])) {
            System.out.println("no");
            return;
        }

        if (firstSwapped == lastSwapped - 1) {
            // one swap is enough
            System.out.printf("yes\nswap %d %d", firstSwapped + 1, lastSwapped + 1);
            return;
        }

        System.out.printf("yes\nreverse %d %d", firstSwapped + 1, lastSwapped + 1);
    }

    public static boolean between(int indexTarget, int indexA, int indexB) {
        if (indexA > -1 && array[indexA] > array[indexTarget]) {
            return false;
        }
        if (indexB < n && array[indexTarget] > array[indexB]) {
            return false;
        }
        return true;
    }
}