package two;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Example {
    public static void sort(Comparable[] a) {
        /**
         * 对应排序代码
         */
    }

    public static boolean less(Comparable v, Comparable w) {
        // 等同于v<w
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        //临时对象
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a) {
        //测试数组元素主键是否有序
        //从1开始避免角标越界
        for (int i = 1; i < a.length; i++)
            //一反全反
            if (less(a[i], a[i - 1])) return false;
        return true;
    }

    public static void main(String[] args) {
        // 从标准输入读取字符串，将它们排序并输出
        String[] a = In.readStrings();
        sort(a);
        //必要的断言
        assert isSorted(a);
        show(a);
    }
}
