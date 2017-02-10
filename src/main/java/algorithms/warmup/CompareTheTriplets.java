package algorithms.warmup;

/**
 * https://www.hackerrank.com/challenges/compare-the-triplets
 */

import java.util.Scanner;

public class CompareTheTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] aliceTriplet = {in.nextInt(), in.nextInt(), in.nextInt()};
        int[] bobTriplet = {in.nextInt(), in.nextInt(), in.nextInt()};

        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < aliceTriplet.length; i++) {
            if (aliceTriplet[i] > bobTriplet[i]) {
                aliceScore++;
            } else if (bobTriplet[i] > aliceTriplet[i]) {
                bobScore++;
            }
        }

        System.out.printf("%d %d", aliceScore, bobScore);
    }
}
