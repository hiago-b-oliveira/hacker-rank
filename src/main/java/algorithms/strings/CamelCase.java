package algorithms.strings;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/camelcase
 */
public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        String[] split = s.split("[A-Z]");
        System.out.println(split.length);
    }
}
