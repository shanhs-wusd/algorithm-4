package two;

import edu.princeton.cs.algs4.In;

public class Insertion {
    public static void sort(Comparable[] a) {
        //将a[]按升序排序
        int N = a.length;
        //从1开始避免角标越界
        for (int i = 1; i < N; i++) {
            //a[i]依次和a[i-1],a[i-2]...a[0]进行比较
            //如果比前面的小就进行交换
            for (int j = i; j > 0 && Example.less(a[j], a[j - 1]); j--) {
                Example.exch(a, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        //从标准输入流获取字符串
        String[] a = In.readStrings();
        sort(a);
        //对于结果必须进行验证
        assert Example.isSorted(a);
        Example.show(a);
    }
}
