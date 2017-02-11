package algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/repeated-string
 */
public class RepeatedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();

        long nReps = n / s.length();
        long rest = n % s.length();

        long aCount = 0, aCountSubstring = 0;

        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a') {
                aCount++;
                if (i < rest) {
                    aCountSubstring++;
                }
            }
        }

        System.out.println((aCount * nReps) + aCountSubstring);
    }
}
