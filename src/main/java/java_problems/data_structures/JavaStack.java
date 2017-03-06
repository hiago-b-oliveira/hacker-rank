package java_problems.data_structures;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-stack
 * Difficulty: Medium
 */
class JavaStack {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();

            //Complete the code
            LinkedList<Character> stack = new LinkedList<>();
            boolean result = true;
            for (char c : input.toCharArray()) {
                if (c == '[' || c == '(' || c == '{') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty() || Math.abs(stack.pop() - c) > 2) {
                        result = false;
                        break;
                    }
                }
            }
            System.out.println(result && stack.isEmpty());
        }
    }
}
