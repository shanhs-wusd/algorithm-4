package two;

import edu.princeton.cs.algs4.In;

import static two.A211Example.isSorted;

public class A212Selection {
    public static void sort(Comparable[] a) {
        // 将a[]按升序排列
        //数组长度
        int N = a.length;
        for (int i = 0;i<N;i++){
            //将a[i]和a[i+1..N]最小的元素进行交换
            //最小元素的索引
            int min = i;
            for (int j = i+1; j<N;j++){
                if (A211Example.less(a[j], a[min])) {
                    min = j;
                }
            }
            A211Example.exch(a, i, min);
        }
    }
    public static void main(String[] args) {
        // 从标准输入流读取字符串, 将他们排序并输出
        String[] a = In.readStrings();
        sort(a);
        assert isSorted(a);
        A211Example.show(a);
    }

}
