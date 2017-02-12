package algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/strange-advertising
 */
public class ViralAdvertising {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int currentReceivers = 5;
        int aux;

        for (int i = 0; i < n; i++) {
            aux = currentReceivers / 2;
            sum += aux;
            currentReceivers = aux * 3;
        }

        System.out.println(sum);
    }
}
