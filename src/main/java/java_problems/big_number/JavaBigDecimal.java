package java_problems.big_number;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-bigdecimal
 * Difficulty: Medium
 */
public class JavaBigDecimal {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();


        //Write your code here

        HashMap<String, BigDecimal> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            try {
                map.put(s[i], new BigDecimal(s[i]));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String aux;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (map.get(s[j]).compareTo(map.get(s[j + 1])) == -1) {
                    aux = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = aux;
                }
            }
        }

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
