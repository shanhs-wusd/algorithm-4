package two;

import edu.princeton.cs.algs4.StdRandom;

/**
 *
 */
public class Insertion {
    public static void main(String[] args) {
        Integer[] a = new Integer[100];
        for (int i = 0; i < 100; i++) {
            int uniform = StdRandom.uniform(100);
            a[i] = uniform;
        }
        Double val = Double.valueOf(Example.maxVal(a).toString());
        sort(a, val);
    }

    public static void sort(Comparable[] a, Double val) {
        //外循环 开始, 结束, 迭代 做事 执行内循环
        //内循环 开始, 结束, 迭代 做事情
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && Example.less(a[j], a[j - 1]); j--) {
                Example.exch(a, j, j - 1);
                Example.show(a, val);
            }
        }
    }
}
