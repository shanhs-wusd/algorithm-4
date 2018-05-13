package one.ex;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class E15 {
    public static void main(String[] args) {
//        int[] a = new int[11];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = StdRandom.uniform(15);
//        }
//        histogram(a, 15);
        binomial(100, 50, 0.25);
    }

    public static int[] histogram(int[] a, int M) {
        int[] b = new int[M];
        for (int i = 0; i < M; i++) {
            b[i] = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    b[i]++;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            StdOut.print(b[i] + " ");
        }
        return b;
    }

    public static String exR1(int n) {
        if (n <= 0) return " ";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

    public static double binomial(int N, int k, double p) {
        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0.0;
        return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
    }
}
