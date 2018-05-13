package one;

/**
 * 递归
 * 1.递归总有一个最简单的情况--方法的第一条语句总是包含return的语句
 * 2.递归调用总是尝试解决一个更简单的问题，这样递归才可以收敛到最简单的情况。在下面的代码中，第四个参数和第三个参数的差值一直在减小
 * 3.递归调用的父问题和子问题不能有交集。
 * 好处：简洁丶优雅丶易懂
 */
public class A003Recursion {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }
    /**
     * @param key ：要查询的值
     * @param a ：数组
     * @param lo ：开始查找
     * @param hi ：结束查找
     * @return
     */
    public static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo)/2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi);
        else return mid;
    }
    /**
     * 违背任意一条都可能得出错误或者低效的结果
     */
}

