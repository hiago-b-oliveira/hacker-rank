package algorithms.strings;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/mars-exploration
 */
public class MarsExplorations {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int modifiedLetters = 0;

        char[] chars = s.toCharArray();
        char[] sosChars = {'S', 'O', 'S'};

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != sosChars[i % 3]) {
                modifiedLetters++;
            }
        }

        System.out.println(modifiedLetters);
    }
}
