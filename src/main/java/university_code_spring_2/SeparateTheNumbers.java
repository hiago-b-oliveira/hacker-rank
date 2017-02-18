package university_code_spring_2;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/university-codesprint-2/challenges/separate-the-numbers
 * Difficulty: Easy
 */
public class SeparateTheNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            // your code goes here
            checkBeautifulString(s);
        }
    }


    /**
     * Test case:
     * 2
     * 99999999991000000000010000000001
     * 10000000000000001000000000000001
     */
    private static void checkBeautifulString(String s) {
        char[] chars = s.toCharArray();
        int digits = 1;
        while (digits <= chars.length / 2) {
            long a0, an;
            boolean ok = true;

            int i = digits;
            an = a0 = Long.valueOf(s.substring(0, 0 + digits));
            while (i < chars.length) {
                an++;
                char[] segment = String.valueOf(an).toCharArray();
                if (!checkNextSegment(segment, i, chars)) {
                    ok = false;
                    break;
                }
                i += segment.length;
            }
            if (ok) {
                System.out.println("YES " + a0);
                return;
            }
            digits++;
        }
        System.out.println("NO");
    }

    private static boolean checkNextSegment(char[] expected, int startIndex, char[] chars) {
        for (int i = 0; i < expected.length; i++) {
            if ((startIndex + i) >= chars.length || expected[i] != chars[startIndex + i]) {
                return false;
            }
        }
        return true;
    }
}
