package two;

import edu.princeton.cs.algs4.In;

public class Selection {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            //从i+1开始比较
            for (int j = i + 1; j < N; j++) {
                if (Example.less(a[j], a[min])) min = j;
            }
            //N次交换
            Example.exch(a, i, min);
        }
    }

    public static void main(String[] args) {
        String[] a = In.readStrings();
        sort(a);
        assert Example.isSorted(a);
        Example.show(a);
    }
}
