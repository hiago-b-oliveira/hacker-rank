package algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/bon-appetit
 */
public class BonAppetit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int sum = 0, aux;

        for (int i = 0; i < n; i++) {
            aux = in.nextInt();
            sum += (i != k) ? aux : 0;
        }

        int expectedCharge = sum / 2;
        int charged = in.nextInt();

        if (charged == expectedCharge) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(charged - expectedCharge);
        }
    }
}
