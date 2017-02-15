package java_problems.strings;


import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-regex
 * Difficulty: Medium
 */
class JavaRegex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}


//Write your code here
class MyRegex {
    private static final String group = "(([0-2][0-5]{2})|([0-1][0-9]{2})|([0-9]?[0-9]))";
    public String pattern = String.format("%s\\.%s\\.%s\\.%s", group, group, group, group);
}