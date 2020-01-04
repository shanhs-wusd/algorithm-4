package two;

import edu.princeton.cs.algs4.StdDraw;

public class Example {
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a, Double maxIndex) {
        for (int i = 0; i < a.length; i++) {
            StdDraw.setXscale(-0.5, a.length + 0.5);
            StdDraw.setYscale(0.0, 2 * maxIndex);
            StdDraw.line(i, 0, i, Integer.valueOf(a[i].toString()));
        }
        StdDraw.clear();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        return true;
    }

    public static Comparable maxVal(Comparable[] a) {
        int maxIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (Example.less(a[maxIndex], i)) maxIndex = i;
        }
        return a[maxIndex];
    }
}
