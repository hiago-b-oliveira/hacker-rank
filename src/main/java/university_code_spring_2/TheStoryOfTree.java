package university_code_spring_2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/university-codesprint-2/challenges/the-story-of-a-tree
 * Difficulty: Medium
 * Timed Out Test Cases: 5-10
 */
public class TheStoryOfTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        while (q-- > 0) {
            resolveGame(in);
        }
    }

    private static void resolveGame(Scanner in) {
        int n = in.nextInt();
        Node[] nodes = new Node[n + 1];

        // build graph
        for (int i = 0; i < n - 1; i++) {
            Node u = getNode(in.nextInt(), nodes);
            Node v = getNode(in.nextInt(), nodes);
            u.children.add(v);
            v.children.add(u);
        }

        int g = in.nextInt(); //guesses
        int k = in.nextInt(); // minimum score

        // read guesses
        HashMap<Guess, Boolean> guessesMap = new HashMap<>(g);
        for (int i = 0; i < g; i++) {
            guessesMap.put(new Guess(in.nextInt(), in.nextInt()), true);
        }

        // Check how many guesses are true for each root
        int nWins = 0;
        for (int i = 1; i < n + 1; i++) {
            int hits = calcHits(nodes[i], guessesMap, k, 0, n);
            if (hits >= k) {
                nWins++;
            }
        }

        if (nWins != 0) {
            int mdc = BigInteger.valueOf(nWins).gcd(BigInteger.valueOf(n)).intValue();
            System.out.printf("%s/%s\n", nWins / mdc, n / mdc);
        } else {
            System.out.println("0/1");
        }
    }

    private static int calcHits(Node rootNode, HashMap<Guess, Boolean> guessesMap, int requiredHits, int currentHits, int remaningNodes) {
        if ((currentHits + remaningNodes < requiredHits)
                || (currentHits >= requiredHits)) {
            return currentHits;
        }

        rootNode.isVisited = true;
        int hits = 0;
        for (Node child : rootNode.children) {
            if (!child.isVisited) {
                if (guessesMap.getOrDefault(new Guess(rootNode.id, child.id), false)) {
                    hits++;
                }
                hits += calcHits(child, guessesMap, requiredHits, hits, remaningNodes--);
            }
        }
        rootNode.isVisited = false;
        return hits;
    }

    private static Node getNode(int id, Node[] nodes) {
        Node node = nodes[id];
        if (node == null) {
            node = new Node(id);
            nodes[id] = node;
        }
        return node;
    }
}

class Node {
    int id;
    boolean isVisited = false;
    List<Node> children = new ArrayList<>(1);

    public Node(int id) {
        this.id = id;
    }
}

class Guess {
    int u;
    int v;

    public Guess(int u, int v) {
        this.u = u;
        this.v = v;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guess guess = (Guess) o;

        if (u != guess.u) return false;
        return v == guess.v;
    }

    @Override
    public int hashCode() {
        int result = u;
        result = 31 * result + v;
        return result;
    }
}
