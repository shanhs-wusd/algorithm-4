package two;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Shell {
    public static void main(String[] args) {
        int N = 10000;
        Double[] a = new Double[N];
        for (int i = 0; i < N; i++)
            a[i] = StdRandom.uniform();
        sort(a);
        for (int i = 0; i < a.length; i++)
            StdOut.println(a[i]);
    }
    public static void sort(Comparable[] a) {
        int h = 1;
        int N = a.length;
        while (h < N / 3) h = h * 3 + 1;
        while (h >= 1) {
            for (int i = 1; i < a.length; i++) {
                for (int j = i; j > 0 && Example.less(a[j], a[j - 1]); j--)
                    Example.exch(a, j - 1, j);
            }
            h /= 3;
        }
    }
}
