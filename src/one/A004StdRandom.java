package one;

import edu.princeton.cs.algs4.StdRandom;

public class A004StdRandom {
    /**
     * 随机返回【a，b】的随机数
     * @param a
     * @param b
     * @return
     */
    public static double uniform(double a, double b) {
        return a + StdRandom.uniform() * (b - a);
    }
    /**
     * 返回[0,N]之间的整数
     */
    public static int uniform(int N) {
        return (int) (StdRandom.uniform() * N);
    }
    /**
     * 随机返回[lo,hi]之间的int值
     */
    public static int uniform(int lo, int hi) {
        return StdRandom.uniform(hi - lo) + lo;
    }
    /**
     * 根据离散概率返回的int值(出现i的概率为a[i])
     */
    public static int discrete(double[] a) {
        double r = StdRandom.uniform();
        double sum  = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum >= r) return i;
        }
        return -1;
    }
    /**
     * 随机将double数组中的元素排序
     */
    public static void suffle(double[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int r = i + StdRandom.uniform(N - i);
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
}
