package algorithms.implementation;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sock-merchant
 */
public class StockMerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int countByColor[] = new int[101];
        for (int c_i = 0; c_i < n; c_i++) {
            countByColor[in.nextInt()]++;
        }

        OptionalInt sum = Arrays.stream(countByColor)
                .map(operand -> operand / 2)
                .reduce((left, right) -> left + right);

        System.out.println(sum.getAsInt());
    }
}
