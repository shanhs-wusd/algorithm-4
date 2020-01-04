package two;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

/**
 * 不断选择剩余元素中的最小值
 */
public class Selection {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{3, 4, 5, 6, 8, 7, 6};
        sort(arr);
        assert isSorted(arr);
        show(arr);
    }

    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (Example.less(a[j], a[minIndex])) minIndex = j;
            }
            exch(a, minIndex, i);
        }
    }

    private static void exch(Comparable[] arr, int i, int j) {
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static boolean less(Comparable w, Comparable v) {
        return w.compareTo(v) < 0;
    }

    public static void show(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
//            StdDraw.
        }
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(i, i - 1)) {
                return false;
            }
        }
        return true;
    }
}
