package algorithms.sorting;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/tutorial-intro
 */

public class IntroToTurorialChallenges {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            if (v == in.nextInt()) {
                System.out.println(i);
                return;
            }
        }
    }
}
