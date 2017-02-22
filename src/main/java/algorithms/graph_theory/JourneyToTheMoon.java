package algorithms.graph_theory;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/journey-to-the-moon/forum
 * Difficulty: Medium
 * Timed Out Test Case 11
 */
public class JourneyToTheMoon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nAstronauts = in.nextInt();
        int nPairs = in.nextInt();

        DisjointSet ds = new DisjointSet(nAstronauts);

        for (int i = 0; i < nPairs; i++) {
            ds.union(in.nextInt(), in.nextInt());
        }
        ArrayList<Integer> setsSizes = ds.getSetsSizes();

        // Calc permutations
        int result = 0;
        for (int i = 0; i < setsSizes.size() - 1; i++) {
            for (int j = i + 1; j < setsSizes.size(); j++) {
                result += setsSizes.get(i) * setsSizes.get(j);
            }
        }
        System.out.println(result);
    }
}

class DisjointSet {
    private int[] parent;
    private int[] dept;

    public DisjointSet(int n) {
        this.parent = new int[n];
        this.dept = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            dept[i] = 1;
        }
    }

    public int find(int i) {
        if (i == parent[i]) {
            return i;
        }
        int pi = find(parent[i]);
        parent[i] = pi; // cache
        return pi;
    }

    public void union(int i, int j) {
        int pi = find(i);
        int pj = find(j);
        if (pi == pj) {
            return;
        } else {
            parent[pj] = pi;
            dept[pi] += dept[pj];
        }
    }

    public ArrayList<Integer> getSetsSizes() {
        ArrayList<Integer> sizes = new ArrayList<>(parent.length);
        for (int i = 0; i < parent.length; i++) {
            if (i == parent[i]) {
                sizes.add(dept[i]);
            }
        }
        return sizes;
    }
}
