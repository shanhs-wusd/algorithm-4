package two;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class A211Example {
    public static void sort(Comparable[] a) {
        /**
         * 算法2.1~算法2.2~算法2.3~算法2.4~算法2.5或算法2.7
         */
    }

    /**
     * 对元素进行比较
     * @param v
     * @param w
     * @return
     */
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * 将元素交换位置
     * @param a
     * @param i
     * @param j
     */
    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * 打印
     * @param a
     */
    public static void show(Comparable[] a) {
        // 在单行中打印数组
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i] + " ");
        }
        StdOut.println();
    }

    /**
     * 验证算法是否有效
     * @param a
     * @return
     */
    public static boolean isSorted(Comparable[] a) {
        // 测试数组元素是否有序
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // 从标准输入流读取字符串, 将他们排序并输出
        String[] a = In.readStrings();
        sort(a);
        assert isSorted(a);
        A211Example.show(a);
    }
}
