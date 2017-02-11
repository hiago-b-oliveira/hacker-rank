package algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum
 */
public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long min = 1_000_000_000, max = 1, sum = 0, aux;

        for (int i = 0; i < 5; i++) {
            aux = in.nextInt();
            sum += aux;
            min = (aux < min) ? aux : min;
            max = (aux > max) ? aux : max;
        }

        System.out.printf("%d %d", (sum - max), (sum - min));
    }
}
