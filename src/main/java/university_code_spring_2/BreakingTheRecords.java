package university_code_spring_2;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/university-codesprint-2/challenges/breaking-best-and-worst-records
 * Difficulty: Easy
 */
public class BreakingTheRecords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for (int score_i = 0; score_i < n; score_i++) {
            score[score_i] = in.nextInt();
        }
        // your code goes here
        int max, min, nMax, nMin;
        max = min = score[0];
        nMax = nMin = 0;

        for (int i = 1; i < n; i++) {
            if (score[i] > max) {
                max = score[i];
                nMax++;
            }
            if (score[i] < min) {
                min = score[i];
                nMin++;
            }
        }

        System.out.printf("%d %d", nMax, nMin);
    }
}
