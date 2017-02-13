package java_advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Optional;
import java.util.StringTokenizer;

/**
 * https://www.hackerrank.com/challenges/java-lambda-expressions
 * Difficulty: Medium
 */
interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    // Write your code here

    public PerformOperation is_odd() {
        return n -> n % 2 != 0;
    }

    public PerformOperation is_prime() {
        return n -> {
            Optional<Integer> min = java.util.stream.Stream.iterate(n - 1, a -> a - 1)
                    .limit(n - 2)
                    .map(integer -> n % integer)
                    .min(Comparator.naturalOrder());
            return (!min.isPresent() || min.get() != 0);
        };
    }


    public PerformOperation is_palindrome() {
        return num -> {
            char[] ca = String.valueOf(num).toCharArray();
            return java.util.stream.IntStream.range(0, ca.length / 2).allMatch(i -> ca[i] == ca[ca.length - 1 - i]);
        };
    }
}


public class JavaLambdaExpressions {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.is_odd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.is_prime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.is_palindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}