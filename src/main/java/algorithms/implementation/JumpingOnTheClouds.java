package algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds
 */
public class JumpingOnTheClouds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n + 1];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        c[n] = 1;

        int position = 0;
        int jumps = 0;

        while (position != n - 1) {
            position += (c[position + 2] == 0) ? 2 : 1;
            jumps++;
        }

        System.out.println(jumps);
    }
}
