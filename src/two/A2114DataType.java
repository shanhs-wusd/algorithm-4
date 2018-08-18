package two;

import edu.princeton.cs.algs4.Quick;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 本书的排序算法末班适用于任何实现了Comparable接口的数据类型
 * 可以直接用实现Comparable的类型的组数作为参数调用排序算法
 */
public class A2114DataType {
    private void quickSort(int N) {
        Double a[] = new Double[N];
        for (int i = 0;i<N;i++) {
            a[i] = StdRandom.uniform();
        }
        Quick.sort(a);
    }



































}
