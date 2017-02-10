package algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/plus-minus
 */
public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double n = in.nextInt();
        int pc = 0, nc = 0, zc = 0, aux;

        for (int i = 0; i < n; i++) {
            aux = in.nextInt();
            if (aux > 0) {
                pc++;
            } else if (aux < 0) {
                nc++;
            } else {
                zc++;
            }
        }

        System.out.println(pc / n);
        System.out.println(nc / n);
        System.out.println(zc / n);
    }
}
