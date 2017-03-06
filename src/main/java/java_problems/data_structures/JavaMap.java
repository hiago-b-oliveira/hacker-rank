package java_problems.data_structures;

import java.util.HashMap;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/phone-book
 * Difficulty: Easy
 */

class JavaMap {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        HashMap<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();

            phoneBook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            Integer phone = phoneBook.get(s);
            if (phone != null) {
                System.out.printf("%s=%s\n", s, phone);
            } else {
                System.out.println("Not found");
            }
        }
    }
}

