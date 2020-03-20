package cat20;

import edu.princeton.cs.algs4.StdRandom;

public class Merge {
    private static Comparable[] aux;

    public static void main(String[] args) {
        int N = 1000;
        Double[] a = new Double[N];
        for (int i = 0; i < N; i++)
            a[i] = StdRandom.uniform();
        sort(a);
    }

    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++)
            aux[i] = a[i];
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        int mid = lo + (hi - lo) / 2;
        merge(a, lo, mid);
        merge(a, mid + 1, hi);
    }

    private static void merge(Comparable[] a, int lo, int hi) {
        int mid = lo + (hi - lo) / 2;
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k < hi + 1; k++)
            aux[k] = a[k];
        for (int k = lo; k < hi + 1; k++) {
            if (i > mid) aux[k] = a[j++];
            else if (j > hi) aux[k] = a[i++];
            else if (Example.less(a[i], a[j])) aux[k] = a[i++];
            else aux[k] = a[j++];
        }
    }
}
