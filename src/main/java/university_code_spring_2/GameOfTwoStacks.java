package university_code_spring_2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/university-codesprint-2/challenges/game-of-two-stacks
 * Difficulty: Medium
 * Failed Test Cases: 1, 2, 7
 * Timed Out Test Cases: 8-13
 */
public class GameOfTwoStacks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt(); // number of games
        while (g-- > 0) {
            resolveGame(in);
        }
    }

    private static void resolveGame(Scanner in) {
        int na = in.nextInt();
        int nb = in.nextInt();
        BigInteger x = in.nextBigInteger();
        BigInteger[] a = readArray(na, in);
        BigInteger[] b = readArray(nb, in);

        ResponseHolder holder = new ResponseHolder();
        wtf(0, 0, a, b, BigInteger.ZERO, BigInteger.ZERO, x, holder);
        System.out.println(holder.score);
    }

    private static void wtf(int ia, int ib, BigInteger[] a, BigInteger[] b, BigInteger currentScore, BigInteger currentSum, BigInteger maxSum, ResponseHolder holder) {
        // System.out.printf(" = %d %d %d %d\n", ia, ib, currentScore, currentSum);
        if (currentSum.compareTo(maxSum) > 0) {
            holder.updateScore(currentScore.subtract(BigInteger.ONE));
            return;
        }
        if (ia == a.length && ib == b.length) {
            holder.isOptimal = true;
            holder.updateScore(currentScore);
            return;
        }
        if (!holder.isOptimal && ia < a.length && (ib == b.length || a[ia].compareTo(b[ib]) < 0)) {
            wtf(ia + 1, ib, a, b, currentScore.add(BigInteger.ONE), currentSum.add(a[ia]), maxSum, holder);
        }
        if (!holder.isOptimal && ib < b.length) {
            wtf(ia, ib + 1, a, b, currentScore.add(BigInteger.ONE), currentSum.add(b[ib]), maxSum, holder);
        }
    }

    private static BigInteger[] readArray(int n, Scanner in) {
        BigInteger[] a = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextBigInteger();
        }
        return a;
    }

    static class ResponseHolder {
        BigInteger score = BigInteger.ZERO;
        boolean isOptimal;

        public void updateScore(BigInteger newScore) {
            if (newScore.compareTo(this.score) > 0) {
                this.score = newScore;
            }
        }
    }
}
